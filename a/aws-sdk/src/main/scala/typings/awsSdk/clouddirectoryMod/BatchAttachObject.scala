package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachObject extends js.Object {
  /**
    * The child object reference that is to be attached to the object.
    */
  var ChildReference: ObjectReference = js.native
  /**
    * The name of the link.
    */
  var LinkName: typings.awsSdk.clouddirectoryMod.LinkName = js.native
  /**
    * The parent object reference.
    */
  var ParentReference: ObjectReference = js.native
}

object BatchAttachObject {
  @scala.inline
  def apply(ChildReference: ObjectReference, LinkName: LinkName, ParentReference: ObjectReference): BatchAttachObject = {
    val __obj = js.Dynamic.literal(ChildReference = ChildReference.asInstanceOf[js.Any], LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchAttachObject]
  }
}

