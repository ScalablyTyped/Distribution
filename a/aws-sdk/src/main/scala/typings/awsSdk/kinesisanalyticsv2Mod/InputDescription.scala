package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): InputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDescription]
  }
  
  @scala.inline
  implicit class InputDescriptionOps[Self <: InputDescription] (val x: Self) extends AnyVal {
    
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
    def setInAppStreamNamesVarargs(value: InAppStreamName*): Self = this.set("InAppStreamNames", js.Array(value :_*))
    
    @scala.inline
    def setInAppStreamNames(value: InAppStreamNames): Self = this.set("InAppStreamNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInAppStreamNames: Self = this.set("InAppStreamNames", js.undefined)
    
    @scala.inline
    def setInputId(value: Id): Self = this.set("InputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputId: Self = this.set("InputId", js.undefined)
    
    @scala.inline
    def setInputParallelism(value: InputParallelism): Self = this.set("InputParallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputParallelism: Self = this.set("InputParallelism", js.undefined)
    
    @scala.inline
    def setInputProcessingConfigurationDescription(value: InputProcessingConfigurationDescription): Self = this.set("InputProcessingConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProcessingConfigurationDescription: Self = this.set("InputProcessingConfigurationDescription", js.undefined)
    
    @scala.inline
    def setInputSchema(value: SourceSchema): Self = this.set("InputSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSchema: Self = this.set("InputSchema", js.undefined)
    
    @scala.inline
    def setInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = this.set("InputStartingPositionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStartingPositionConfiguration: Self = this.set("InputStartingPositionConfiguration", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseInputDescription(value: KinesisFirehoseInputDescription): Self = this.set("KinesisFirehoseInputDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehoseInputDescription: Self = this.set("KinesisFirehoseInputDescription", js.undefined)
    
    @scala.inline
    def setKinesisStreamsInputDescription(value: KinesisStreamsInputDescription): Self = this.set("KinesisStreamsInputDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStreamsInputDescription: Self = this.set("KinesisStreamsInputDescription", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: InAppStreamName): Self = this.set("NamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("NamePrefix", js.undefined)
  }
}
