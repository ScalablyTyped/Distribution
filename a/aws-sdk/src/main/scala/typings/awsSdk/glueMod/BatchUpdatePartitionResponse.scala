package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdatePartitionResponse extends js.Object {
  
  /**
    * The errors encountered when trying to update the requested partitions. A list of BatchUpdatePartitionFailureEntry objects.
    */
  var Errors: js.UndefOr[BatchUpdatePartitionFailureList] = js.native
}
object BatchUpdatePartitionResponse {
  
  @scala.inline
  def apply(): BatchUpdatePartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePartitionResponse]
  }
  
  @scala.inline
  implicit class BatchUpdatePartitionResponseOps[Self <: BatchUpdatePartitionResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: BatchUpdatePartitionFailureEntry*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: BatchUpdatePartitionFailureList): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
  }
}
