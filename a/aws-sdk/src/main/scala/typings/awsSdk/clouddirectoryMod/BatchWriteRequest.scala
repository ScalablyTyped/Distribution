package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchWriteRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  
  /**
    * A list of operations that are part of the batch.
    */
  var Operations: BatchWriteOperationList = js.native
}
object BatchWriteRequest {
  
  @scala.inline
  def apply(DirectoryArn: Arn, Operations: BatchWriteOperationList): BatchWriteRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchWriteRequest]
  }
  
  @scala.inline
  implicit class BatchWriteRequestMutableBuilder[Self <: BatchWriteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: BatchWriteOperationList): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsVarargs(value: BatchWriteOperation*): Self = StObject.set(x, "Operations", js.Array(value :_*))
  }
}
