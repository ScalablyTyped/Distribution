package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachFromIndexRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the directory the index and object exist in.
    */
  var DirectoryArn: Arn = js.native
  
  /**
    * A reference to the index object.
    */
  var IndexReference: ObjectReference = js.native
  
  /**
    * A reference to the object being detached from the index.
    */
  var TargetReference: ObjectReference = js.native
}
object DetachFromIndexRequest {
  
  @scala.inline
  def apply(DirectoryArn: Arn, IndexReference: ObjectReference, TargetReference: ObjectReference): DetachFromIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IndexReference = IndexReference.asInstanceOf[js.Any], TargetReference = TargetReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachFromIndexRequest]
  }
  
  @scala.inline
  implicit class DetachFromIndexRequestMutableBuilder[Self <: DetachFromIndexRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexReference(value: ObjectReference): Self = StObject.set(x, "IndexReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReference(value: ObjectReference): Self = StObject.set(x, "TargetReference", value.asInstanceOf[js.Any])
  }
}
