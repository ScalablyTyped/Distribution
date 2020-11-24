package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class AttachObjectRequestOps[Self <: AttachObjectRequest] (val x: Self) extends AnyVal {
    
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
    def setChildReference(value: ObjectReference): Self = this.set("ChildReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkName(value: LinkName): Self = this.set("LinkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentReference(value: ObjectReference): Self = this.set("ParentReference", value.asInstanceOf[js.Any])
  }
}
