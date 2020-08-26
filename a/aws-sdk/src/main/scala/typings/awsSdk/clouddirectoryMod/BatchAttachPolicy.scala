package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachPolicy extends js.Object {
  /**
    * The reference that identifies the object to which the policy will be attached.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
  /**
    * The reference that is associated with the policy object.
    */
  var PolicyReference: ObjectReference = js.native
}

object BatchAttachPolicy {
  @scala.inline
  def apply(ObjectReference: ObjectReference, PolicyReference: ObjectReference): BatchAttachPolicy = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any], PolicyReference = PolicyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAttachPolicy]
  }
  @scala.inline
  implicit class BatchAttachPolicyOps[Self <: BatchAttachPolicy] (val x: Self) extends AnyVal {
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
    def setObjectReference(value: ObjectReference): Self = this.set("ObjectReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyReference(value: ObjectReference): Self = this.set("PolicyReference", value.asInstanceOf[js.Any])
  }
  
}

