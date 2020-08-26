package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchWriteItemInput extends js.Object {
  /**
    * A map of one or more table names and, for each table, a list of operations to be performed (DeleteRequest or PutRequest). Each element in the map consists of the following:    DeleteRequest - Perform a DeleteItem operation on the specified item. The item to be deleted is identified by a Key subelement:    Key - A map of primary key attribute values that uniquely identify the item. Each entry in this map consists of an attribute name and an attribute value. For each primary key, you must provide all of the key attributes. For example, with a simple primary key, you only need to provide a value for the partition key. For a composite primary key, you must provide values for both the partition key and the sort key.      PutRequest - Perform a PutItem operation on the specified item. The item to be put is identified by an Item subelement:    Item - A map of attributes and their values. Each entry in this map consists of an attribute name and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty values are rejected with a ValidationException exception. If you specify any attributes that are part of an index key, then the data types for those attributes must match those of the schema in the table's attribute definition.    
    */
  var RequestItems: BatchWriteItemRequestMap = js.native
  var ReturnConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnConsumedCapacity] = js.native
  /**
    * Determines whether item collection metrics are returned. If set to SIZE, the response includes statistics about item collections, if any, that were modified during the operation are returned in the response. If set to NONE (the default), no statistics are returned.
    */
  var ReturnItemCollectionMetrics: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ReturnItemCollectionMetrics] = js.native
}

object BatchWriteItemInput {
  @scala.inline
  def apply(RequestItems: BatchWriteItemRequestMap): BatchWriteItemInput = {
    val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchWriteItemInput]
  }
  @scala.inline
  implicit class BatchWriteItemInputOps[Self <: BatchWriteItemInput] (val x: Self) extends AnyVal {
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
    def setRequestItems(value: BatchWriteItemRequestMap): Self = this.set("RequestItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnConsumedCapacity(value: ReturnConsumedCapacity): Self = this.set("ReturnConsumedCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnConsumedCapacity: Self = this.set("ReturnConsumedCapacity", js.undefined)
    @scala.inline
    def setReturnItemCollectionMetrics(value: ReturnItemCollectionMetrics): Self = this.set("ReturnItemCollectionMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnItemCollectionMetrics: Self = this.set("ReturnItemCollectionMetrics", js.undefined)
  }
  
}

