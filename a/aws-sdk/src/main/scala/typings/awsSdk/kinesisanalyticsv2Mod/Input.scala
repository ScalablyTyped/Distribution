package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Input extends js.Object {
  
  /**
    * Describes the number of in-application streams to create. 
    */
  var InputParallelism: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputParallelism] = js.native
  
  /**
    * The InputProcessingConfiguration for the input. An input processor transforms records as they are received from the stream, before the application's SQL code executes. Currently, the only input processing configuration available is InputLambdaProcessor. 
    */
  var InputProcessingConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputProcessingConfiguration] = js.native
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. Also used to describe the format of the reference data source.
    */
  var InputSchema: SourceSchema = js.native
  
  /**
    * If the streaming source is an Amazon Kinesis Data Firehose delivery stream, identifies the delivery stream's ARN.
    */
  var KinesisFirehoseInput: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.KinesisFirehoseInput] = js.native
  
  /**
    * If the streaming source is an Amazon Kinesis data stream, identifies the stream's Amazon Resource Name (ARN). 
    */
  var KinesisStreamsInput: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.KinesisStreamsInput] = js.native
  
  /**
    * The name prefix to use when creating an in-application stream. Suppose that you specify a prefix "MyInApplicationStream." Kinesis Data Analytics then creates one or more (as per the InputParallelism count you specified) in-application streams with the names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on. 
    */
  var NamePrefix: InAppStreamName = js.native
}
object Input {
  
  @scala.inline
  def apply(InputSchema: SourceSchema, NamePrefix: InAppStreamName): Input = {
    val __obj = js.Dynamic.literal(InputSchema = InputSchema.asInstanceOf[js.Any], NamePrefix = NamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
    
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
    def setInputSchema(value: SourceSchema): Self = this.set("InputSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefix(value: InAppStreamName): Self = this.set("NamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParallelism(value: InputParallelism): Self = this.set("InputParallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputParallelism: Self = this.set("InputParallelism", js.undefined)
    
    @scala.inline
    def setInputProcessingConfiguration(value: InputProcessingConfiguration): Self = this.set("InputProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProcessingConfiguration: Self = this.set("InputProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseInput(value: KinesisFirehoseInput): Self = this.set("KinesisFirehoseInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehoseInput: Self = this.set("KinesisFirehoseInput", js.undefined)
    
    @scala.inline
    def setKinesisStreamsInput(value: KinesisStreamsInput): Self = this.set("KinesisStreamsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStreamsInput: Self = this.set("KinesisStreamsInput", js.undefined)
  }
}
