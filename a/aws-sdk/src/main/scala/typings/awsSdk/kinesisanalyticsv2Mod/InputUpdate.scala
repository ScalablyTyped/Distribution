package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputUpdate extends js.Object {
  /**
    * The input ID of the application input to be updated.
    */
  var InputId: Id = js.native
  /**
    * Describes the parallelism updates (the number of in-application streams Kinesis Data Analytics creates for the specific streaming source).
    */
  var InputParallelismUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputParallelismUpdate] = js.native
  /**
    * Describes updates to an InputProcessingConfiguration.
    */
  var InputProcessingConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputProcessingConfigurationUpdate] = js.native
  /**
    * Describes the data format on the streaming source, and how record elements on the streaming source map to columns of the in-application stream that is created.
    */
  var InputSchemaUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputSchemaUpdate] = js.native
  /**
    * If a Kinesis Data Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN.
    */
  var KinesisFirehoseInputUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.KinesisFirehoseInputUpdate] = js.native
  /**
    * If a Kinesis data stream is the streaming source to be updated, provides an updated stream Amazon Resource Name (ARN).
    */
  var KinesisStreamsInputUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.KinesisStreamsInputUpdate] = js.native
  /**
    * The name prefix for in-application streams that Kinesis Data Analytics creates for the specific streaming source.
    */
  var NamePrefixUpdate: js.UndefOr[InAppStreamName] = js.native
}

object InputUpdate {
  @scala.inline
  def apply(
    InputId: Id,
    InputParallelismUpdate: InputParallelismUpdate = null,
    InputProcessingConfigurationUpdate: InputProcessingConfigurationUpdate = null,
    InputSchemaUpdate: InputSchemaUpdate = null,
    KinesisFirehoseInputUpdate: KinesisFirehoseInputUpdate = null,
    KinesisStreamsInputUpdate: KinesisStreamsInputUpdate = null,
    NamePrefixUpdate: InAppStreamName = null
  ): InputUpdate = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    if (InputParallelismUpdate != null) __obj.updateDynamic("InputParallelismUpdate")(InputParallelismUpdate.asInstanceOf[js.Any])
    if (InputProcessingConfigurationUpdate != null) __obj.updateDynamic("InputProcessingConfigurationUpdate")(InputProcessingConfigurationUpdate.asInstanceOf[js.Any])
    if (InputSchemaUpdate != null) __obj.updateDynamic("InputSchemaUpdate")(InputSchemaUpdate.asInstanceOf[js.Any])
    if (KinesisFirehoseInputUpdate != null) __obj.updateDynamic("KinesisFirehoseInputUpdate")(KinesisFirehoseInputUpdate.asInstanceOf[js.Any])
    if (KinesisStreamsInputUpdate != null) __obj.updateDynamic("KinesisStreamsInputUpdate")(KinesisStreamsInputUpdate.asInstanceOf[js.Any])
    if (NamePrefixUpdate != null) __obj.updateDynamic("NamePrefixUpdate")(NamePrefixUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputUpdate]
  }
}

