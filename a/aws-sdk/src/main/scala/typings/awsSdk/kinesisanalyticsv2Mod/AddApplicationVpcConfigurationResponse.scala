package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApplicationVpcConfigurationResponse extends StObject {
  
  /**
    * The ARN of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application. 
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.undefined
  
  /**
    * The parameters of the new VPC configuration.
    */
  var VpcConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.VpcConfigurationDescription] = js.undefined
}
object AddApplicationVpcConfigurationResponse {
  
  @scala.inline
  def apply(): AddApplicationVpcConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationVpcConfigurationResponse]
  }
  
  @scala.inline
  implicit class AddApplicationVpcConfigurationResponseMutableBuilder[Self <: AddApplicationVpcConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationARNUndefined: Self = StObject.set(x, "ApplicationARN", js.undefined)
    
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionIdUndefined: Self = StObject.set(x, "ApplicationVersionId", js.undefined)
    
    @scala.inline
    def setVpcConfigurationDescription(value: VpcConfigurationDescription): Self = StObject.set(x, "VpcConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationDescriptionUndefined: Self = StObject.set(x, "VpcConfigurationDescription", js.undefined)
  }
}
