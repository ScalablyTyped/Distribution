package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /**
    * Describes the data format when records are written to the destination. 
    */
  var DestinationSchema: typings.awsSdk.kinesisanalyticsv2Mod.DestinationSchema = js.native
  /**
    * Identifies an Amazon Kinesis Data Firehose delivery stream as the destination.
    */
  var KinesisFirehoseOutput: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.KinesisFirehoseOutput] = js.native
  /**
    * Identifies an Amazon Kinesis data stream as the destination.
    */
  var KinesisStreamsOutput: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.KinesisStreamsOutput] = js.native
  /**
    * Identifies an AWS Lambda function as the destination.
    */
  var LambdaOutput: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.LambdaOutput] = js.native
  /**
    * The name of the in-application stream.
    */
  var Name: InAppStreamName = js.native
}

object Output {
  @scala.inline
  def apply(
    DestinationSchema: DestinationSchema,
    Name: InAppStreamName,
    KinesisFirehoseOutput: KinesisFirehoseOutput = null,
    KinesisStreamsOutput: KinesisStreamsOutput = null,
    LambdaOutput: LambdaOutput = null
  ): Output = {
    val __obj = js.Dynamic.literal(DestinationSchema = DestinationSchema.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (KinesisFirehoseOutput != null) __obj.updateDynamic("KinesisFirehoseOutput")(KinesisFirehoseOutput.asInstanceOf[js.Any])
    if (KinesisStreamsOutput != null) __obj.updateDynamic("KinesisStreamsOutput")(KinesisStreamsOutput.asInstanceOf[js.Any])
    if (LambdaOutput != null) __obj.updateDynamic("LambdaOutput")(LambdaOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

