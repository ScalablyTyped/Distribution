package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOriginRequestPolicyRequest extends js.Object {
  /**
    * An origin request policy configuration.
    */
  var OriginRequestPolicyConfig: typings.awsSdk.cloudfrontMod.OriginRequestPolicyConfig = js.native
}

object CreateOriginRequestPolicyRequest {
  @scala.inline
  def apply(OriginRequestPolicyConfig: OriginRequestPolicyConfig): CreateOriginRequestPolicyRequest = {
    val __obj = js.Dynamic.literal(OriginRequestPolicyConfig = OriginRequestPolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOriginRequestPolicyRequest]
  }
  @scala.inline
  implicit class CreateOriginRequestPolicyRequestOps[Self <: CreateOriginRequestPolicyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOriginRequestPolicyConfig(value: OriginRequestPolicyConfig): Self = this.set("OriginRequestPolicyConfig", value.asInstanceOf[js.Any])
  }
  
}

