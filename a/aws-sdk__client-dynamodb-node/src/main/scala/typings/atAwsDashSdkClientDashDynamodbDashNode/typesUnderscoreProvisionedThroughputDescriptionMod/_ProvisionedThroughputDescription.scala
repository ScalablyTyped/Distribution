package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreProvisionedThroughputDescriptionMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ProvisionedThroughputDescription extends js.Object {
  /**
    * <p>The date and time of the last provisioned throughput decrease for this table.</p>
    */
  var LastDecreaseDateTime: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>The date and time of the last provisioned throughput increase for this table.</p>
    */
  var LastIncreaseDateTime: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>The number of provisioned throughput decreases for this table during this UTC calendar day. For current maximums on provisioned throughput decreases, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var NumberOfDecreasesToday: js.UndefOr[Double] = js.undefined
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. Eventually consistent reads require less effort than strongly consistent reads, so a setting of 50 <code>ReadCapacityUnits</code> per second provides 100 eventually consistent <code>ReadCapacityUnits</code> per second.</p>
    */
  var ReadCapacityUnits: js.UndefOr[Double] = js.undefined
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
    */
  var WriteCapacityUnits: js.UndefOr[Double] = js.undefined
}

object _ProvisionedThroughputDescription {
  @scala.inline
  def apply(
    LastDecreaseDateTime: Date | String | Double = null,
    LastIncreaseDateTime: Date | String | Double = null,
    NumberOfDecreasesToday: Int | Double = null,
    ReadCapacityUnits: Int | Double = null,
    WriteCapacityUnits: Int | Double = null
  ): _ProvisionedThroughputDescription = {
    val __obj = js.Dynamic.literal()
    if (LastDecreaseDateTime != null) __obj.updateDynamic("LastDecreaseDateTime")(LastDecreaseDateTime.asInstanceOf[js.Any])
    if (LastIncreaseDateTime != null) __obj.updateDynamic("LastIncreaseDateTime")(LastIncreaseDateTime.asInstanceOf[js.Any])
    if (NumberOfDecreasesToday != null) __obj.updateDynamic("NumberOfDecreasesToday")(NumberOfDecreasesToday.asInstanceOf[js.Any])
    if (ReadCapacityUnits != null) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits.asInstanceOf[js.Any])
    if (WriteCapacityUnits != null) __obj.updateDynamic("WriteCapacityUnits")(WriteCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ProvisionedThroughputDescription]
  }
}

