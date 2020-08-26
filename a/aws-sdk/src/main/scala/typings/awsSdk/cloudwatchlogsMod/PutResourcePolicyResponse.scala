package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutResourcePolicyResponse extends js.Object {
  /**
    * The new policy.
    */
  var resourcePolicy: js.UndefOr[ResourcePolicy] = js.native
}

object PutResourcePolicyResponse {
  @scala.inline
  def apply(): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
  @scala.inline
  implicit class PutResourcePolicyResponseOps[Self <: PutResourcePolicyResponse] (val x: Self) extends AnyVal {
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
    def setResourcePolicy(value: ResourcePolicy): Self = this.set("resourcePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourcePolicy: Self = this.set("resourcePolicy", js.undefined)
  }
  
}

