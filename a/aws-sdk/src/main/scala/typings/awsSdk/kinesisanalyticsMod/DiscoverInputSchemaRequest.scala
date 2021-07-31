package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoverInputSchemaRequest extends StObject {
  
  /**
    * The InputProcessingConfiguration to use to preprocess the records before discovering the schema of the records.
    */
  var InputProcessingConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InputProcessingConfiguration] = js.undefined
  
  /**
    * Point at which you want Amazon Kinesis Analytics to start reading records from the specified streaming source discovery purposes.
    */
  var InputStartingPositionConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.InputStartingPositionConfiguration] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the streaming source.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ResourceARN] = js.undefined
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to access the stream on your behalf.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.RoleARN] = js.undefined
  
  /**
    * Specify this parameter to discover a schema from data in an Amazon S3 object.
    */
  var S3Configuration: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.S3Configuration] = js.undefined
}
object DiscoverInputSchemaRequest {
  
  @scala.inline
  def apply(): DiscoverInputSchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverInputSchemaRequest]
  }
  
  @scala.inline
  implicit class DiscoverInputSchemaRequestMutableBuilder[Self <: DiscoverInputSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputProcessingConfiguration(value: InputProcessingConfiguration): Self = StObject.set(x, "InputProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputProcessingConfigurationUndefined: Self = StObject.set(x, "InputProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = StObject.set(x, "InputStartingPositionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStartingPositionConfigurationUndefined: Self = StObject.set(x, "InputStartingPositionConfiguration", js.undefined)
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    @scala.inline
    def setS3Configuration(value: S3Configuration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ConfigurationUndefined: Self = StObject.set(x, "S3Configuration", js.undefined)
  }
}
