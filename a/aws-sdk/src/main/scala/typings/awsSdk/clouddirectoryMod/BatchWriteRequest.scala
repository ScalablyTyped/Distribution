package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchWriteRequest extends js.Object {
  
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
  implicit class BatchWriteRequestOps[Self <: BatchWriteRequest] (val x: Self) extends AnyVal {
    
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
    def setOperationsVarargs(value: BatchWriteOperation*): Self = this.set("Operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: BatchWriteOperationList): Self = this.set("Operations", value.asInstanceOf[js.Any])
  }
}
