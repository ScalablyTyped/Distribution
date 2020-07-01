package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisConfiguration extends js.Object {
  /**
    * Enables QLDB to publish multiple data records in a single Kinesis Data Streams record. To learn more, see KPL Key Concepts in the Amazon Kinesis Data Streams Developer Guide.
    */
  var AggregationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Kinesis data stream resource.
    */
  var StreamArn: Arn = js.native
}

object KinesisConfiguration {
  @scala.inline
  def apply(StreamArn: Arn, AggregationEnabled: js.UndefOr[Boolean] = js.undefined): KinesisConfiguration = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any])
    if (!js.isUndefined(AggregationEnabled)) __obj.updateDynamic("AggregationEnabled")(AggregationEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisConfiguration]
  }
}

