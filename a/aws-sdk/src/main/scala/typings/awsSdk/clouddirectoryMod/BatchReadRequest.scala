package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchReadRequest extends StObject {
  
  /**
    * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory. For more information, see arns.
    */
  var DirectoryArn: Arn = js.native
  
  /**
    * A list of operations that are part of the batch.
    */
  var Operations: BatchReadOperationList = js.native
}
object BatchReadRequest {
  
  @scala.inline
  def apply(DirectoryArn: Arn, Operations: BatchReadOperationList): BatchReadRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchReadRequest]
  }
  
  @scala.inline
  implicit class BatchReadRequestMutableBuilder[Self <: BatchReadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsistencyLevel(value: ConsistencyLevel): Self = StObject.set(x, "ConsistencyLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistencyLevelUndefined: Self = StObject.set(x, "ConsistencyLevel", js.undefined)
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: BatchReadOperationList): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsVarargs(value: BatchReadOperation*): Self = StObject.set(x, "Operations", js.Array(value :_*))
  }
}
