package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetPartitionResponse extends StObject {
  
  /**
    * A list of the requested partitions.
    */
  var Partitions: js.UndefOr[PartitionList] = js.undefined
  
  /**
    * A list of the partition values in the request for which partitions were not returned.
    */
  var UnprocessedKeys: js.UndefOr[BatchGetPartitionValueList] = js.undefined
}
object BatchGetPartitionResponse {
  
  @scala.inline
  def apply(): BatchGetPartitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetPartitionResponse]
  }
  
  @scala.inline
  implicit class BatchGetPartitionResponseMutableBuilder[Self <: BatchGetPartitionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartitions(value: PartitionList): Self = StObject.set(x, "Partitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionsUndefined: Self = StObject.set(x, "Partitions", js.undefined)
    
    @scala.inline
    def setPartitionsVarargs(value: Partition*): Self = StObject.set(x, "Partitions", js.Array(value :_*))
    
    @scala.inline
    def setUnprocessedKeys(value: BatchGetPartitionValueList): Self = StObject.set(x, "UnprocessedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedKeysUndefined: Self = StObject.set(x, "UnprocessedKeys", js.undefined)
    
    @scala.inline
    def setUnprocessedKeysVarargs(value: PartitionValueList*): Self = StObject.set(x, "UnprocessedKeys", js.Array(value :_*))
  }
}
