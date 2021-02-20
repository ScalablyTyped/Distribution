package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachObjectRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  
  /**
    * The link name associated with the object that needs to be detached.
    */
  var LinkName: typings.awsSdk.clouddirectoryMod.LinkName = js.native
  
  /**
    * The parent reference from which the object with the specified link name is detached.
    */
  var ParentReference: ObjectReference = js.native
}
object DetachObjectRequest {
  
  @scala.inline
  def apply(DirectoryArn: Arn, LinkName: LinkName, ParentReference: ObjectReference): DetachObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachObjectRequest]
  }
  
  @scala.inline
  implicit class DetachObjectRequestMutableBuilder[Self <: DetachObjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentReference(value: ObjectReference): Self = StObject.set(x, "ParentReference", value.asInstanceOf[js.Any])
  }
}
