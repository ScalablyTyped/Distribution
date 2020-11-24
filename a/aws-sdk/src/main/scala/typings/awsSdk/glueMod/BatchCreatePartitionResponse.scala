package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreatePartitionResponse extends js.Object {
  
  /**
    * The errors encountered when trying to create the requested partitions.
    */
  var Errors: js.UndefOr[PartitionErrors] = js.native
}
object BatchCreatePartitionResponse {
  
  @scala.inline
  def apply(): BatchCreatePartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreatePartitionResponse]
  }
  
  @scala.inline
  implicit class BatchCreatePartitionResponseOps[Self <: BatchCreatePartitionResponse] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: PartitionError*): Self = this.set("Errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: PartitionErrors): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
  }
}
