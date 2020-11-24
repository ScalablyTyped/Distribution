package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionError extends js.Object {
  
  /**
    * The details about the partition error.
    */
  var ErrorDetail: js.UndefOr[typings.awsSdk.glueMod.ErrorDetail] = js.native
  
  /**
    * The values that define the partition.
    */
  var PartitionValues: js.UndefOr[ValueStringList] = js.native
}
object PartitionError {
  
  @scala.inline
  def apply(): PartitionError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionError]
  }
  
  @scala.inline
  implicit class PartitionErrorOps[Self <: PartitionError] (val x: Self) extends AnyVal {
    
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
    def setErrorDetail(value: ErrorDetail): Self = this.set("ErrorDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetail: Self = this.set("ErrorDetail", js.undefined)
    
    @scala.inline
    def setPartitionValuesVarargs(value: ValueString*): Self = this.set("PartitionValues", js.Array(value :_*))
    
    @scala.inline
    def setPartitionValues(value: ValueStringList): Self = this.set("PartitionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionValues: Self = this.set("PartitionValues", js.undefined)
  }
}
