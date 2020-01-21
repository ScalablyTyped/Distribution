package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDescription extends js.Object {
  /**
    * The data format used for writing data to the destination.
    */
  var DestinationSchema: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.DestinationSchema] = js.native
  /**
    * Describes the Kinesis Data Firehose delivery stream that is configured as the destination where output is written.
    */
  var KinesisFirehoseOutputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.KinesisFirehoseOutputDescription] = js.native
  /**
    * Describes the Kinesis data stream that is configured as the destination where output is written.
    */
  var KinesisStreamsOutputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.KinesisStreamsOutputDescription] = js.native
  /**
    * Describes the Lambda function that is configured as the destination where output is written.
    */
  var LambdaOutputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.LambdaOutputDescription] = js.native
  /**
    * The name of the in-application stream that is configured as output.
    */
  var Name: js.UndefOr[InAppStreamName] = js.native
  /**
    * A unique identifier for the output configuration.
    */
  var OutputId: js.UndefOr[Id] = js.native
}

object OutputDescription {
  @scala.inline
  def apply(
    DestinationSchema: DestinationSchema = null,
    KinesisFirehoseOutputDescription: KinesisFirehoseOutputDescription = null,
    KinesisStreamsOutputDescription: KinesisStreamsOutputDescription = null,
    LambdaOutputDescription: LambdaOutputDescription = null,
    Name: InAppStreamName = null,
    OutputId: Id = null
  ): OutputDescription = {
    val __obj = js.Dynamic.literal()
    if (DestinationSchema != null) __obj.updateDynamic("DestinationSchema")(DestinationSchema.asInstanceOf[js.Any])
    if (KinesisFirehoseOutputDescription != null) __obj.updateDynamic("KinesisFirehoseOutputDescription")(KinesisFirehoseOutputDescription.asInstanceOf[js.Any])
    if (KinesisStreamsOutputDescription != null) __obj.updateDynamic("KinesisStreamsOutputDescription")(KinesisStreamsOutputDescription.asInstanceOf[js.Any])
    if (LambdaOutputDescription != null) __obj.updateDynamic("LambdaOutputDescription")(LambdaOutputDescription.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OutputId != null) __obj.updateDynamic("OutputId")(OutputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDescription]
  }
}

