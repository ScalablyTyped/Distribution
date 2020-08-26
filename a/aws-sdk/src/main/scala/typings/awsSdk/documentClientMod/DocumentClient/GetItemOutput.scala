package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetItemOutput extends js.Object {
  /**
    * The capacity units consumed by the GetItem operation. The data returned includes the total provisioned throughput consumed, along with statistics for the table and any indexes involved in the operation. ConsumedCapacity is only returned if the ReturnConsumedCapacity parameter was specified. For more information, see Read/Write Capacity Mode in the Amazon DynamoDB Developer Guide.
    */
  var ConsumedCapacity: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity] = js.native
  /**
    * A map of attribute names to AttributeValue objects, as specified by ProjectionExpression.
    */
  var Item: js.UndefOr[AttributeMap] = js.native
}

object GetItemOutput {
  @scala.inline
  def apply(): GetItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetItemOutput]
  }
  @scala.inline
  implicit class GetItemOutputOps[Self <: GetItemOutput] (val x: Self) extends AnyVal {
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
    def setItem(value: AttributeMap): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
  
}

