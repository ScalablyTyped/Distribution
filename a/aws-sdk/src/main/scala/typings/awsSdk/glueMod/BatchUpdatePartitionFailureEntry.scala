package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdatePartitionFailureEntry extends js.Object {
  
  /**
    * The details about the batch update partition error.
    */
  var ErrorDetail: js.UndefOr[typings.awsSdk.glueMod.ErrorDetail] = js.native
  
  /**
    * A list of values defining the partitions.
    */
  var PartitionValueList: js.UndefOr[BoundedPartitionValueList] = js.native
}
object BatchUpdatePartitionFailureEntry {
  
  @scala.inline
  def apply(): BatchUpdatePartitionFailureEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdatePartitionFailureEntry]
  }
  
  @scala.inline
  implicit class BatchUpdatePartitionFailureEntryOps[Self <: BatchUpdatePartitionFailureEntry] (val x: Self) extends AnyVal {
    
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
    def setPartitionValueListVarargs(value: ValueString*): Self = this.set("PartitionValueList", js.Array(value :_*))
    
    @scala.inline
    def setPartitionValueList(value: BoundedPartitionValueList): Self = this.set("PartitionValueList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionValueList: Self = this.set("PartitionValueList", js.undefined)
  }
}
