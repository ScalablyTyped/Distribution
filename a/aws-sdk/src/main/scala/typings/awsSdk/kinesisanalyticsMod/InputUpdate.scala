package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputUpdate extends js.Object {
  /**
    * Input ID of the application input to be updated.
    */
  var InputId: Id = js.native
  /**
    * Describes the parallelism updates (the number in-application streams Amazon Kinesis Analytics creates for the specific streaming source).
    */
  var InputParallelismUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InputParallelismUpdate] = js.native
  /**
    * Describes updates for an input processing configuration.
    */
  var InputProcessingConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InputProcessingConfigurationUpdate] = js.native
  /**
    * Describes the data format on the streaming source, and how record elements on the streaming source map to columns of the in-application stream that is created.
    */
  var InputSchemaUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InputSchemaUpdate] = js.native
  /**
    * If an Amazon Kinesis Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN and IAM role ARN.
    */
  var KinesisFirehoseInputUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisFirehoseInputUpdate] = js.native
  /**
    * If an Amazon Kinesis stream is the streaming source to be updated, provides an updated stream Amazon Resource Name (ARN) and IAM role ARN.
    */
  var KinesisStreamsInputUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisStreamsInputUpdate] = js.native
  /**
    * Name prefix for in-application streams that Amazon Kinesis Analytics creates for the specific streaming source.
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

