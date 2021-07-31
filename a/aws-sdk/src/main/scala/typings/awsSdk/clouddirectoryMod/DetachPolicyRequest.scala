package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where both objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn
  
  /**
    * Reference that identifies the object whose policy object will be detached.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference
  
  /**
    * Reference that identifies the policy object.
    */
  var PolicyReference: ObjectReference
}
object DetachPolicyRequest {
  
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, PolicyReference: ObjectReference): DetachPolicyRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], PolicyReference = PolicyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachPolicyRequest]
  }
  
  @scala.inline
  implicit class DetachPolicyRequestMutableBuilder[Self <: DetachPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyReference(value: ObjectReference): Self = StObject.set(x, "PolicyReference", value.asInstanceOf[js.Any])
  }
}
