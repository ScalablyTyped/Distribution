package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputUpdate extends StObject {
  
  /**
    * Describes the data format when records are written to the destination. For more information, see Configuring Application Output.
    */
  var DestinationSchemaUpdate: js.UndefOr[DestinationSchema] = js.undefined
  
  /**
    * Describes an Amazon Kinesis Firehose delivery stream as the destination for the output.
    */
  var KinesisFirehoseOutputUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisFirehoseOutputUpdate] = js.undefined
  
  /**
    * Describes an Amazon Kinesis stream as the destination for the output.
    */
  var KinesisStreamsOutputUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisStreamsOutputUpdate] = js.undefined
  
  /**
    * Describes an AWS Lambda function as the destination for the output.
    */
  var LambdaOutputUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.LambdaOutputUpdate] = js.undefined
  
  /**
    * If you want to specify a different in-application stream for this output configuration, use this field to specify the new in-application stream name.
    */
  var NameUpdate: js.UndefOr[InAppStreamName] = js.undefined
  
  /**
    * Identifies the specific output configuration that you want to update.
    */
  var OutputId: Id
}
object OutputUpdate {
  
  @scala.inline
  def apply(OutputId: Id): OutputUpdate = {
    val __obj = js.Dynamic.literal(OutputId = OutputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputUpdate]
  }
  
  @scala.inline
  implicit class OutputUpdateMutableBuilder[Self <: OutputUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationSchemaUpdate(value: DestinationSchema): Self = StObject.set(x, "DestinationSchemaUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSchemaUpdateUndefined: Self = StObject.set(x, "DestinationSchemaUpdate", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseOutputUpdate(value: KinesisFirehoseOutputUpdate): Self = StObject.set(x, "KinesisFirehoseOutputUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseOutputUpdateUndefined: Self = StObject.set(x, "KinesisFirehoseOutputUpdate", js.undefined)
    
    @scala.inline
    def setKinesisStreamsOutputUpdate(value: KinesisStreamsOutputUpdate): Self = StObject.set(x, "KinesisStreamsOutputUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamsOutputUpdateUndefined: Self = StObject.set(x, "KinesisStreamsOutputUpdate", js.undefined)
    
    @scala.inline
    def setLambdaOutputUpdate(value: LambdaOutputUpdate): Self = StObject.set(x, "LambdaOutputUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaOutputUpdateUndefined: Self = StObject.set(x, "LambdaOutputUpdate", js.undefined)
    
    @scala.inline
    def setNameUpdate(value: InAppStreamName): Self = StObject.set(x, "NameUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUpdateUndefined: Self = StObject.set(x, "NameUpdate", js.undefined)
    
    @scala.inline
    def setOutputId(value: Id): Self = StObject.set(x, "OutputId", value.asInstanceOf[js.Any])
  }
}
