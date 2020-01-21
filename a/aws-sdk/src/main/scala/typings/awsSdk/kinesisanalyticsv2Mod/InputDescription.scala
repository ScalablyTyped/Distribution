package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDescription extends js.Object {
  /**
    * Returns the in-application stream names that are mapped to the stream source. 
    */
  var InAppStreamNames: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InAppStreamNames] = js.native
  /**
    * The input ID that is associated with the application input. This is the ID that Kinesis Data Analytics assigns to each input configuration that you add to your application. 
    */
  var InputId: js.UndefOr[Id] = js.native
  /**
    * Describes the configured parallelism (number of in-application streams mapped to the streaming source). 
    */
  var InputParallelism: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputParallelism] = js.native
  /**
    * The description of the preprocessor that executes on records in this input before the application's code is run. 
    */
  var InputProcessingConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputProcessingConfigurationDescription] = js.native
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. 
    */
  var InputSchema: js.UndefOr[SourceSchema] = js.native
  /**
    * The point at which the application is configured to read from the input stream.
    */
  var InputStartingPositionConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputStartingPositionConfiguration] = js.native
  /**
    * If a Kinesis Data Firehose delivery stream is configured as a streaming source, provides the delivery stream's ARN. 
    */
  var KinesisFirehoseInputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.KinesisFirehoseInputDescription] = js.native
  /**
    * If a Kinesis data stream is configured as a streaming source, provides the Kinesis data stream's Amazon Resource Name (ARN). 
    */
  var KinesisStreamsInputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.KinesisStreamsInputDescription] = js.native
  /**
    * The in-application name prefix.
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

