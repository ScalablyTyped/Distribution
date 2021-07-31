package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  /**
    * Describes the data format when records are written to the destination. For more information, see Configuring Application Output.
    */
  var DestinationSchema: typings.awsSdk.kinesisanalyticsMod.DestinationSchema
  
  /**
    * Identifies an Amazon Kinesis Firehose delivery stream as the destination.
    */
  var KinesisFirehoseOutput: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisFirehoseOutput] = js.undefined
  
  /**
    * Identifies an Amazon Kinesis stream as the destination.
    */
  var KinesisStreamsOutput: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisStreamsOutput] = js.undefined
  
  /**
    * Identifies an AWS Lambda function as the destination.
    */
  var LambdaOutput: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.LambdaOutput] = js.undefined
  
  /**
    * Name of the in-application stream.
    */
  var Name: InAppStreamName
}
object Output {
  
  @scala.inline
  def apply(DestinationSchema: DestinationSchema, Name: InAppStreamName): Output = {
    val __obj = js.Dynamic.literal(DestinationSchema = DestinationSchema.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationSchema(value: DestinationSchema): Self = StObject.set(x, "DestinationSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseOutput(value: KinesisFirehoseOutput): Self = StObject.set(x, "KinesisFirehoseOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseOutputUndefined: Self = StObject.set(x, "KinesisFirehoseOutput", js.undefined)
    
    @scala.inline
    def setKinesisStreamsOutput(value: KinesisStreamsOutput): Self = StObject.set(x, "KinesisStreamsOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamsOutputUndefined: Self = StObject.set(x, "KinesisStreamsOutput", js.undefined)
    
    @scala.inline
    def setLambdaOutput(value: LambdaOutput): Self = StObject.set(x, "LambdaOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaOutputUndefined: Self = StObject.set(x, "LambdaOutput", js.undefined)
    
    @scala.inline
    def setName(value: InAppStreamName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
