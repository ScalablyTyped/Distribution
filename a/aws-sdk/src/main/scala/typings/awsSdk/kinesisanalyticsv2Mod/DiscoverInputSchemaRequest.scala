package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverInputSchemaRequest extends StObject {
  
  /**
    * The InputProcessingConfiguration to use to preprocess the records before discovering the schema of the records.
    */
  var InputProcessingConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputProcessingConfiguration] = js.native
  
  /**
    * The point at which you want Kinesis Data Analytics to start reading records from the specified streaming source discovery purposes.
    */
  var InputStartingPositionConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.InputStartingPositionConfiguration] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the streaming source.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ResourceARN] = js.native
  
  /**
    * Specify this parameter to discover a schema from data in an Amazon S3 object.
    */
  var S3Configuration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.S3Configuration] = js.native
  
  /**
    * The ARN of the role that is used to access the streaming source.
    */
  var ServiceExecutionRole: RoleARN = js.native
}
object DiscoverInputSchemaRequest {
  
  @scala.inline
  def apply(ServiceExecutionRole: RoleARN): DiscoverInputSchemaRequest = {
    val __obj = js.Dynamic.literal(ServiceExecutionRole = ServiceExecutionRole.asInstanceOf[js.Any])
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
    def setS3Configuration(value: S3Configuration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ConfigurationUndefined: Self = StObject.set(x, "S3Configuration", js.undefined)
    
    @scala.inline
    def setServiceExecutionRole(value: RoleARN): Self = StObject.set(x, "ServiceExecutionRole", value.asInstanceOf[js.Any])
  }
}
