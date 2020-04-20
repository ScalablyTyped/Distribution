package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachObjectRequest extends js.Object {
  /**
    * The child object reference to be attached to the object.
    */
  var ChildReference: ObjectReference = js.native
  /**
    * Amazon Resource Name (ARN) that is associated with the Directory where both objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The link name with which the child object is attached to the parent.
    */
  var LinkName: typings.awsSdk.clouddirectoryMod.LinkName = js.native
  /**
    * The parent object reference.
    */
  var ParentReference: ObjectReference = js.native
}

object AttachObjectRequest {
  @scala.inline
  def apply(
    ChildReference: ObjectReference,
    DirectoryArn: Arn,
    LinkName: LinkName,
    ParentReference: ObjectReference
  ): AttachObjectRequest = {
    val __obj = js.Dynamic.literal(ChildReference = ChildReference.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachObjectRequest]
  }
}

