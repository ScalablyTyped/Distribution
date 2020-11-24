package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(InputId: Id): InputUpdate = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputUpdate]
  }
  
  @scala.inline
  implicit class InputUpdateOps[Self <: InputUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputId(value: Id): Self = this.set("InputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParallelismUpdate(value: InputParallelismUpdate): Self = this.set("InputParallelismUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputParallelismUpdate: Self = this.set("InputParallelismUpdate", js.undefined)
    
    @scala.inline
    def setInputProcessingConfigurationUpdate(value: InputProcessingConfigurationUpdate): Self = this.set("InputProcessingConfigurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProcessingConfigurationUpdate: Self = this.set("InputProcessingConfigurationUpdate", js.undefined)
    
    @scala.inline
    def setInputSchemaUpdate(value: InputSchemaUpdate): Self = this.set("InputSchemaUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSchemaUpdate: Self = this.set("InputSchemaUpdate", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseInputUpdate(value: KinesisFirehoseInputUpdate): Self = this.set("KinesisFirehoseInputUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehoseInputUpdate: Self = this.set("KinesisFirehoseInputUpdate", js.undefined)
    
    @scala.inline
    def setKinesisStreamsInputUpdate(value: KinesisStreamsInputUpdate): Self = this.set("KinesisStreamsInputUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStreamsInputUpdate: Self = this.set("KinesisStreamsInputUpdate", js.undefined)
    
    @scala.inline
    def setNamePrefixUpdate(value: InAppStreamName): Self = this.set("NamePrefixUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefixUpdate: Self = this.set("NamePrefixUpdate", js.undefined)
  }
}
