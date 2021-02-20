package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputDescription extends StObject {
  
  /**
    * Data format used for writing data to the destination.
    */
  var DestinationSchema: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.DestinationSchema] = js.native
  
  /**
    * Describes the Amazon Kinesis Firehose delivery stream configured as the destination where output is written.
    */
  var KinesisFirehoseOutputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisFirehoseOutputDescription] = js.native
  
  /**
    * Describes Amazon Kinesis stream configured as the destination where output is written.
    */
  var KinesisStreamsOutputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.KinesisStreamsOutputDescription] = js.native
  
  /**
    * Describes the AWS Lambda function configured as the destination where output is written.
    */
  var LambdaOutputDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.LambdaOutputDescription] = js.native
  
  /**
    * Name of the in-application stream configured as output.
    */
  var Name: js.UndefOr[InAppStreamName] = js.native
  
  /**
    * A unique identifier for the output configuration.
    */
  var OutputId: js.UndefOr[Id] = js.native
}
object OutputDescription {
  
  @scala.inline
  def apply(): OutputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDescription]
  }
  
  @scala.inline
  implicit class OutputDescriptionMutableBuilder[Self <: OutputDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationSchema(value: DestinationSchema): Self = StObject.set(x, "DestinationSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationSchemaUndefined: Self = StObject.set(x, "DestinationSchema", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseOutputDescription(value: KinesisFirehoseOutputDescription): Self = StObject.set(x, "KinesisFirehoseOutputDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseOutputDescriptionUndefined: Self = StObject.set(x, "KinesisFirehoseOutputDescription", js.undefined)
    
    @scala.inline
    def setKinesisStreamsOutputDescription(value: KinesisStreamsOutputDescription): Self = StObject.set(x, "KinesisStreamsOutputDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamsOutputDescriptionUndefined: Self = StObject.set(x, "KinesisStreamsOutputDescription", js.undefined)
    
    @scala.inline
    def setLambdaOutputDescription(value: LambdaOutputDescription): Self = StObject.set(x, "LambdaOutputDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaOutputDescriptionUndefined: Self = StObject.set(x, "LambdaOutputDescription", js.undefined)
    
    @scala.inline
    def setName(value: InAppStreamName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOutputId(value: Id): Self = StObject.set(x, "OutputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputIdUndefined: Self = StObject.set(x, "OutputId", js.undefined)
  }
}
