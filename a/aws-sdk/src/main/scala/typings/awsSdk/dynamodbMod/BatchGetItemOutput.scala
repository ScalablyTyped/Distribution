package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetItemOutput extends js.Object {
  /**
    * The read capacity units consumed by the entire BatchGetItem operation. Each element consists of:    TableName - The table that consumed the provisioned throughput.    CapacityUnits - The total number of capacity units consumed.  
    */
  var ConsumedCapacity: js.UndefOr[ConsumedCapacityMultiple] = js.native
  /**
    * A map of table name to a list of items. Each object in Responses consists of a table name, along with a map of attribute data consisting of the data type and attribute value.
    */
  var Responses: js.UndefOr[BatchGetResponseMap] = js.native
  /**
    * A map of tables and their respective keys that were not processed with the current response. The UnprocessedKeys value is in the same form as RequestItems, so the value can be provided directly to a subsequent BatchGetItem operation. For more information, see RequestItems in the Request Parameters section. Each element consists of:    Keys - An array of primary key attribute values that define specific items in the table.    ProjectionExpression - One or more attributes to be retrieved from the table or index. By default, all attributes are returned. If a requested attribute is not found, it does not appear in the result.    ConsistentRead - The consistency of a read operation. If set to true, then a strongly consistent read is used; otherwise, an eventually consistent read is used.   If there are no unprocessed keys remaining, the response contains an empty UnprocessedKeys map.
    */
  var UnprocessedKeys: js.UndefOr[BatchGetRequestMap] = js.native
}

object BatchGetItemOutput {
  @scala.inline
  def apply(): BatchGetItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetItemOutput]
  }
  @scala.inline
  implicit class BatchGetItemOutputOps[Self <: BatchGetItemOutput] (val x: Self) extends AnyVal {
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
    def setResponses(value: BatchGetResponseMap): Self = this.set("Responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("Responses", js.undefined)
    @scala.inline
    def setUnprocessedKeys(value: BatchGetRequestMap): Self = this.set("UnprocessedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedKeys: Self = this.set("UnprocessedKeys", js.undefined)
  }
  
}

