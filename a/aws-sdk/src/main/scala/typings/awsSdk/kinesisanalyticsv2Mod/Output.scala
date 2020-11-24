package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends js.Object {
  
  /**
    * Describes the data format when records are written to the destination. 
    */
  var DestinationSchema: typings.awsSdk.kinesisanalyticsv2Mod.DestinationSchema = js.native
  
  /**
    * Identifies a Kinesis Data Firehose delivery stream as the destination.
    */
  var KinesisFirehoseOutput: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.KinesisFirehoseOutput] = js.native
  
  /**
    * Identifies a Kinesis data stream as the destination.
    */
  var KinesisStreamsOutput: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.KinesisStreamsOutput] = js.native
  
  /**
    * Identifies an AWS Lambda function as the destination.
    */
  var LambdaOutput: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.LambdaOutput] = js.native
  
  /**
    * The name of the in-application stream.
    */
  var Name: InAppStreamName = js.native
}
object Output {
  
  @scala.inline
  def apply(DestinationSchema: DestinationSchema, Name: InAppStreamName): Output = {
    val __obj = js.Dynamic.literal(DestinationSchema = DestinationSchema.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    
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
    def setDestinationSchema(value: DestinationSchema): Self = this.set("DestinationSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: InAppStreamName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseOutput(value: KinesisFirehoseOutput): Self = this.set("KinesisFirehoseOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehoseOutput: Self = this.set("KinesisFirehoseOutput", js.undefined)
    
    @scala.inline
    def setKinesisStreamsOutput(value: KinesisStreamsOutput): Self = this.set("KinesisStreamsOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStreamsOutput: Self = this.set("KinesisStreamsOutput", js.undefined)
    
    @scala.inline
    def setLambdaOutput(value: LambdaOutput): Self = this.set("LambdaOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaOutput: Self = this.set("LambdaOutput", js.undefined)
  }
}
