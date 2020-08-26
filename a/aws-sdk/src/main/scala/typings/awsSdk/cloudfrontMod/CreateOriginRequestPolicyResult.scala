package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOriginRequestPolicyResult extends js.Object {
  /**
    * The current version of the origin request policy.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * The fully qualified URI of the origin request policy just created.
    */
  var Location: js.UndefOr[String] = js.native
  /**
    * An origin request policy.
    */
  var OriginRequestPolicy: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginRequestPolicy] = js.native
}

object CreateOriginRequestPolicyResult {
  @scala.inline
  def apply(): CreateOriginRequestPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOriginRequestPolicyResult]
  }
  @scala.inline
  implicit class CreateOriginRequestPolicyResultOps[Self <: CreateOriginRequestPolicyResult] (val x: Self) extends AnyVal {
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    @scala.inline
    def setOriginRequestPolicy(value: OriginRequestPolicy): Self = this.set("OriginRequestPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginRequestPolicy: Self = this.set("OriginRequestPolicy", js.undefined)
  }
  
}

