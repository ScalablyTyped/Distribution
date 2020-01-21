package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /**
    * Describes the data format when records are written to the destination. For more information, see Configuring Application Output.
    */
  var DestinationSchema: typings.awsSdk.kinesisanalyticsMod.DestinationSchema = js.native
  /**
    * Identifies an Amazon Kinesis Firehose delivery stream as the destination.
    */
  var KinesisFirehoseOutput: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisFirehoseOutput] = js.native
  /**
    * Identifies an Amazon Kinesis stream as the destination.
    */
  var KinesisStreamsOutput: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisStreamsOutput] = js.native
  /**
    * Identifies an AWS Lambda function as the destination.
    */
  var LambdaOutput: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.LambdaOutput] = js.native
  /**
    * Name of the in-application stream.
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

