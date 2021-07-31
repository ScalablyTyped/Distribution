package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApplicationInputProcessingConfigurationRequest extends StObject {
  
  /**
    * The name of the application to which you want to add the input processing configuration.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The version of the application to which you want to add the input processing configuration. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  
  /**
    * The ID of the input configuration to add the input processing configuration to. You can get a list of the input IDs for an application using the DescribeApplication operation.
    */
  var InputId: Id
  
  /**
    * The InputProcessingConfiguration to add to the application.
    */
  var InputProcessingConfiguration: typings.awsSdk.kinesisanalyticsv2Mod.InputProcessingConfiguration
}
object AddApplicationInputProcessingConfigurationRequest {
  
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    InputId: Id,
    InputProcessingConfiguration: InputProcessingConfiguration
  ): AddApplicationInputProcessingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], InputId = InputId.asInstanceOf[js.Any], InputProcessingConfiguration = InputProcessingConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationInputProcessingConfigurationRequest]
  }
  
  @scala.inline
  implicit class AddApplicationInputProcessingConfigurationRequestMutableBuilder[Self <: AddApplicationInputProcessingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputId(value: Id): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputProcessingConfiguration(value: InputProcessingConfiguration): Self = StObject.set(x, "InputProcessingConfiguration", value.asInstanceOf[js.Any])
  }
}
