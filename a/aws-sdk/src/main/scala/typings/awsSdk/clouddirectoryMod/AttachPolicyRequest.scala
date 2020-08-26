package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where both objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The reference that identifies the object to which the policy will be attached.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
  /**
    * The reference that is associated with the policy object.
    */
  var PolicyReference: ObjectReference = js.native
}

object AttachPolicyRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, PolicyReference: ObjectReference): AttachPolicyRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], PolicyReference = PolicyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachPolicyRequest]
  }
  @scala.inline
  implicit class AttachPolicyRequestOps[Self <: AttachPolicyRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryArn(value: Arn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = this.set("ObjectReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyReference(value: ObjectReference): Self = this.set("PolicyReference", value.asInstanceOf[js.Any])
  }
  
}

