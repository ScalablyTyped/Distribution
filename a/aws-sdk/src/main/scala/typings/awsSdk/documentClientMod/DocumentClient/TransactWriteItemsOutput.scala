package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactWriteItemsOutput extends js.Object {
  
  /**
    * The capacity units consumed by the entire TransactWriteItems operation. The values of the list are ordered according to the ordering of the TransactItems request parameter. 
    */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.native
  
  /**
    * A list of tables that were processed by TransactWriteItems and, for each table, information about any item collections that were affected by individual UpdateItem, PutItem, or DeleteItem operations. 
    */
  var ItemCollectionMetrics: js.UndefOr[ItemCollectionMetricsPerTable] = js.native
}
object TransactWriteItemsOutput {
  
  @scala.inline
  def apply(): TransactWriteItemsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactWriteItemsOutput]
  }
  
  @scala.inline
  implicit class TransactWriteItemsOutputOps[Self <: TransactWriteItemsOutput] (val x: Self) extends AnyVal {
    
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
    def setConsumedCapacityVarargs(value: ConsumedCapacity*): Self = this.set("ConsumedCapacity", js.Array(value :_*))
    
    @scala.inline
    def setConsumedCapacity(value: ConsumedCapacityMultiple): Self = this.set("ConsumedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumedCapacity: Self = this.set("ConsumedCapacity", js.undefined)
    
    @scala.inline
    def setItemCollectionMetrics(value: ItemCollectionMetricsPerTable): Self = this.set("ItemCollectionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCollectionMetrics: Self = this.set("ItemCollectionMetrics", js.undefined)
  }
}
