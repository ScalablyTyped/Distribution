package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
