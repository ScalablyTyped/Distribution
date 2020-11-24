package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetPartitionResponse extends js.Object {
  
  /**
    * A list of the requested partitions.
    */
  var Partitions: js.UndefOr[PartitionList] = js.native
  
  /**
    * A list of the partition values in the request for which partitions were not returned.
    */
  var UnprocessedKeys: js.UndefOr[BatchGetPartitionValueList] = js.native
}
object BatchGetPartitionResponse {
  
  @scala.inline
  def apply(): BatchGetPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetPartitionResponse]
  }
  
  @scala.inline
  implicit class BatchGetPartitionResponseOps[Self <: BatchGetPartitionResponse] (val x: Self) extends AnyVal {
    
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
    def setPartitionsVarargs(value: Partition*): Self = this.set("Partitions", js.Array(value :_*))
    
    @scala.inline
    def setPartitions(value: PartitionList): Self = this.set("Partitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitions: Self = this.set("Partitions", js.undefined)
    
    @scala.inline
    def setUnprocessedKeysVarargs(value: PartitionValueList*): Self = this.set("UnprocessedKeys", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedKeys(value: BatchGetPartitionValueList): Self = this.set("UnprocessedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprocessedKeys: Self = this.set("UnprocessedKeys", js.undefined)
  }
}
