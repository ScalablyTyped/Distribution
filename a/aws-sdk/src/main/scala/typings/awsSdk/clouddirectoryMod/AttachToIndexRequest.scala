package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachToIndexRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the directory where the object and index exist.
    */
  var DirectoryArn: Arn
  
  /**
    * A reference to the index that you are attaching the object to.
    */
  var IndexReference: ObjectReference
  
  /**
    * A reference to the object that you are attaching to the index.
    */
  var TargetReference: ObjectReference
}
object AttachToIndexRequest {
  
  @scala.inline
  def apply(DirectoryArn: Arn, IndexReference: ObjectReference, TargetReference: ObjectReference): AttachToIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IndexReference = IndexReference.asInstanceOf[js.Any], TargetReference = TargetReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachToIndexRequest]
  }
  
  @scala.inline
  implicit class AttachToIndexRequestMutableBuilder[Self <: AttachToIndexRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexReference(value: ObjectReference): Self = StObject.set(x, "IndexReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReference(value: ObjectReference): Self = StObject.set(x, "TargetReference", value.asInstanceOf[js.Any])
  }
}
