package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanOutput extends js.Object {
  
  /**
    * The capacity units consumed by the Scan operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Provisioned Throughput in the Amazon DynamoDB Developer Guide.
    */
  var ConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity] = js.native
  
  /**
    * The number of items in the response. If you set ScanFilter in the request, then Count is the number of items returned after the filter was applied, and ScannedCount is the number of matching items before the filter was applied. If you did not use a filter in the request, then Count is the same as ScannedCount.
    */
  var Count: js.UndefOr[Integer] = js.native
  
  /**
    * An array of item attributes that match the scan criteria. Each element in this array consists of an attribute name and the value for that attribute.
    */
  var Items: js.UndefOr[ItemList] = js.native
  
  /**
    * The primary key of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedKey is empty, then the "last page" of results has been processed and there is no more data to be retrieved. If LastEvaluatedKey is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedKey is empty.
    */
  var LastEvaluatedKey: js.UndefOr[Key] = js.native
  
  /**
    * The number of items evaluated, before any ScanFilter is applied. A high ScannedCount value with few, or no, Count results indicates an inefficient Scan operation. For more information, see Count and ScannedCount in the Amazon DynamoDB Developer Guide. If you did not use a filter in the request, then ScannedCount is the same as Count.
    */
  var ScannedCount: js.UndefOr[Integer] = js.native
}
object ScanOutput {
  
  @scala.inline
  def apply(): ScanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanOutput]
  }
  
  @scala.inline
  implicit class ScanOutputOps[Self <: ScanOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConsumedCapacity(value: ConsumedCapacity): Self = this.set("ConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumedCapacity: Self = this.set("ConsumedCapacity", js.undefined)
    
    @scala.inline
    def setCount(value: Integer): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: AttributeMap*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: ItemList): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("Items", js.undefined)
    
    @scala.inline
    def setLastEvaluatedKey(value: Key): Self = this.set("LastEvaluatedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastEvaluatedKey: Self = this.set("LastEvaluatedKey", js.undefined)
    
    @scala.inline
    def setScannedCount(value: Integer): Self = this.set("ScannedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScannedCount: Self = this.set("ScannedCount", js.undefined)
  }
}
