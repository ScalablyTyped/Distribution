package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDescription extends js.Object {
  /**
    * Returns the in-application stream names that are mapped to the stream source.
    */
  var InAppStreamNames: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InAppStreamNames] = js.native
  /**
    * Input ID associated with the application input. This is the ID that Amazon Kinesis Analytics assigns to each input configuration you add to your application. 
    */
  var InputId: js.UndefOr[Id] = js.native
  /**
    * Describes the configured parallelism (number of in-application streams mapped to the streaming source).
    */
  var InputParallelism: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InputParallelism] = js.native
  /**
    * The description of the preprocessor that executes on records in this input before the application's code is run.
    */
  var InputProcessingConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InputProcessingConfigurationDescription] = js.native
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. 
    */
  var InputSchema: js.UndefOr[SourceSchema] = js.native
  /**
    * Point at which the application is configured to read from the input stream.
    */
  var InputStartingPositionConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InputStartingPositionConfiguration] = js.native
  /**
    * If an Amazon Kinesis Firehose delivery stream is configured as a streaming source, provides the delivery stream's ARN and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
    */
  var KinesisFirehoseInputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisFirehoseInputDescription] = js.native
  /**
    * If an Amazon Kinesis stream is configured as streaming source, provides Amazon Kinesis stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf.
    */
  var KinesisStreamsInputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisStreamsInputDescription] = js.native
  /**
    * In-application name prefix.
    */
  var NamePrefix: js.UndefOr[InAppStreamName] = js.native
}

object InputDescription {
  @scala.inline
  def apply(
    InAppStreamNames: InAppStreamNames = null,
    InputId: Id = null,
    InputParallelism: InputParallelism = null,
    InputProcessingConfigurationDescription: InputProcessingConfigurationDescription = null,
    InputSchema: SourceSchema = null,
    InputStartingPositionConfiguration: InputStartingPositionConfiguration = null,
    KinesisFirehoseInputDescription: KinesisFirehoseInputDescription = null,
    KinesisStreamsInputDescription: KinesisStreamsInputDescription = null,
    NamePrefix: InAppStreamName = null
  ): InputDescription = {
    val __obj = js.Dynamic.literal()
    if (InAppStreamNames != null) __obj.updateDynamic("InAppStreamNames")(InAppStreamNames.asInstanceOf[js.Any])
    if (InputId != null) __obj.updateDynamic("InputId")(InputId.asInstanceOf[js.Any])
    if (InputParallelism != null) __obj.updateDynamic("InputParallelism")(InputParallelism.asInstanceOf[js.Any])
    if (InputProcessingConfigurationDescription != null) __obj.updateDynamic("InputProcessingConfigurationDescription")(InputProcessingConfigurationDescription.asInstanceOf[js.Any])
    if (InputSchema != null) __obj.updateDynamic("InputSchema")(InputSchema.asInstanceOf[js.Any])
    if (InputStartingPositionConfiguration != null) __obj.updateDynamic("InputStartingPositionConfiguration")(InputStartingPositionConfiguration.asInstanceOf[js.Any])
    if (KinesisFirehoseInputDescription != null) __obj.updateDynamic("KinesisFirehoseInputDescription")(KinesisFirehoseInputDescription.asInstanceOf[js.Any])
    if (KinesisStreamsInputDescription != null) __obj.updateDynamic("KinesisStreamsInputDescription")(KinesisStreamsInputDescription.asInstanceOf[js.Any])
    if (NamePrefix != null) __obj.updateDynamic("NamePrefix")(NamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputDescription]
  }
}

