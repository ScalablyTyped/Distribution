package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdatePartitionRequestEntry extends js.Object {
  
  /**
    * The structure used to update a partition.
    */
  var PartitionInput: typings.awsSdk.glueMod.PartitionInput = js.native
  
  /**
    * A list of values defining the partitions.
    */
  var PartitionValueList: BoundedPartitionValueList = js.native
}
object BatchUpdatePartitionRequestEntry {
  
  @scala.inline
  def apply(PartitionInput: PartitionInput, PartitionValueList: BoundedPartitionValueList): BatchUpdatePartitionRequestEntry = {
    val __obj = js.Dynamic.literal(PartitionInput = PartitionInput.asInstanceOf[js.Any], PartitionValueList = PartitionValueList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdatePartitionRequestEntry]
  }
  
  @scala.inline
  implicit class BatchUpdatePartitionRequestEntryOps[Self <: BatchUpdatePartitionRequestEntry] (val x: Self) extends AnyVal {
    
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
    def setPartitionInput(value: PartitionInput): Self = this.set("PartitionInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionValueListVarargs(value: ValueString*): Self = this.set("PartitionValueList", js.Array(value :_*))
    
    @scala.inline
    def setPartitionValueList(value: BoundedPartitionValueList): Self = this.set("PartitionValueList", value.asInstanceOf[js.Any])
  }
}
