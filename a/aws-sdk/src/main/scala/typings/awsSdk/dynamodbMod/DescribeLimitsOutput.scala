package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLimitsOutput extends js.Object {
  /**
    * The maximum total read capacity units that your account allows you to provision across all of your tables in this Region.
    */
  var AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The maximum total write capacity units that your account allows you to provision across all of your tables in this Region.
    */
  var AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The maximum read capacity units that your account allows you to provision for a new table that you are creating in this Region, including the read capacity units provisioned for its global secondary indexes (GSIs).
    */
  var TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * The maximum write capacity units that your account allows you to provision for a new table that you are creating in this Region, including the write capacity units provisioned for its global secondary indexes (GSIs).
    */
  var TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}

object DescribeLimitsOutput {
  @scala.inline
  def apply(
    AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  ): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AccountMaxReadCapacityUnits)) __obj.updateDynamic("AccountMaxReadCapacityUnits")(AccountMaxReadCapacityUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AccountMaxWriteCapacityUnits)) __obj.updateDynamic("AccountMaxWriteCapacityUnits")(AccountMaxWriteCapacityUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TableMaxReadCapacityUnits)) __obj.updateDynamic("TableMaxReadCapacityUnits")(TableMaxReadCapacityUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TableMaxWriteCapacityUnits)) __obj.updateDynamic("TableMaxWriteCapacityUnits")(TableMaxWriteCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
}

