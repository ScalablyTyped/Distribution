package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Capacity extends js.Object {
  /**
    * The total number of capacity units consumed on a table or an index.
    */
  var CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
  /**
    * The total number of read capacity units consumed on a table or an index.
    */
  var ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
  /**
    * The total number of write capacity units consumed on a table or an index.
    */
  var WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.native
}

object Capacity {
  @scala.inline
  def apply(
    CapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined,
    ReadCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined,
    WriteCapacityUnits: js.UndefOr[ConsumedCapacityUnits] = js.undefined
  ): Capacity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CapacityUnits)) __obj.updateDynamic("CapacityUnits")(CapacityUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadCapacityUnits)) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(WriteCapacityUnits)) __obj.updateDynamic("WriteCapacityUnits")(WriteCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capacity]
  }
}

