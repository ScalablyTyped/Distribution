package typings.awsSdkClientDynamodbNode.typesProvisionedThroughputDescriptionMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedThroughputDescription extends js.Object {
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

object ProvisionedThroughputDescription {
  @scala.inline
  def apply(
    LastDecreaseDateTime: Date | String | Double = null,
    LastIncreaseDateTime: Date | String | Double = null,
    NumberOfDecreasesToday: js.UndefOr[Double] = js.undefined,
    ReadCapacityUnits: js.UndefOr[Double] = js.undefined,
    WriteCapacityUnits: js.UndefOr[Double] = js.undefined
  ): ProvisionedThroughputDescription = {
    val __obj = js.Dynamic.literal()
    if (LastDecreaseDateTime != null) __obj.updateDynamic("LastDecreaseDateTime")(LastDecreaseDateTime.asInstanceOf[js.Any])
    if (LastIncreaseDateTime != null) __obj.updateDynamic("LastIncreaseDateTime")(LastIncreaseDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfDecreasesToday)) __obj.updateDynamic("NumberOfDecreasesToday")(NumberOfDecreasesToday.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadCapacityUnits)) __obj.updateDynamic("ReadCapacityUnits")(ReadCapacityUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(WriteCapacityUnits)) __obj.updateDynamic("WriteCapacityUnits")(WriteCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedThroughputDescription]
  }
}

