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
    AccountMaxReadCapacityUnits: Int | scala.Double = null,
    AccountMaxWriteCapacityUnits: Int | scala.Double = null,
    TableMaxReadCapacityUnits: Int | scala.Double = null,
    TableMaxWriteCapacityUnits: Int | scala.Double = null
  ): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal()
    if (AccountMaxReadCapacityUnits != null) __obj.updateDynamic("AccountMaxReadCapacityUnits")(AccountMaxReadCapacityUnits.asInstanceOf[js.Any])
    if (AccountMaxWriteCapacityUnits != null) __obj.updateDynamic("AccountMaxWriteCapacityUnits")(AccountMaxWriteCapacityUnits.asInstanceOf[js.Any])
    if (TableMaxReadCapacityUnits != null) __obj.updateDynamic("TableMaxReadCapacityUnits")(TableMaxReadCapacityUnits.asInstanceOf[js.Any])
    if (TableMaxWriteCapacityUnits != null) __obj.updateDynamic("TableMaxWriteCapacityUnits")(TableMaxWriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
}

