package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttachment extends js.Object {
  /**
    * The ObjectIdentifier that is associated with PolicyAttachment.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
  /**
    * The ID of PolicyAttachment.
    */
  var PolicyId: js.UndefOr[ObjectIdentifier] = js.native
  /**
    * The type of policy that can be associated with PolicyAttachment.
    */
  var PolicyType: js.UndefOr[typings.awsSdk.clouddirectoryMod.PolicyType] = js.native
}

object PolicyAttachment {
  @scala.inline
  def apply(): PolicyAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAttachment]
  }
  @scala.inline
  implicit class PolicyAttachmentOps[Self <: PolicyAttachment] (val x: Self) extends AnyVal {
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
    def setObjectIdentifier(value: ObjectIdentifier): Self = this.set("ObjectIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIdentifier: Self = this.set("ObjectIdentifier", js.undefined)
    @scala.inline
    def setPolicyId(value: ObjectIdentifier): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyId: Self = this.set("PolicyId", js.undefined)
    @scala.inline
    def setPolicyType(value: PolicyType): Self = this.set("PolicyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyType: Self = this.set("PolicyType", js.undefined)
  }
  
}

