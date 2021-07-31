package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApplicationVpcConfigurationRequest extends StObject {
  
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The version of the application to which you want to add the VPC configuration. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
    */
  var CurrentApplicationVersionId: ApplicationVersionId
  
  /**
    * Description of the VPC to add to the application.
    */
  var VpcConfiguration: typings.awsSdk.kinesisanalyticsv2Mod.VpcConfiguration
}
object AddApplicationVpcConfigurationRequest {
  
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    VpcConfiguration: VpcConfiguration
  ): AddApplicationVpcConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], VpcConfiguration = VpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationVpcConfigurationRequest]
  }
  
  @scala.inline
  implicit class AddApplicationVpcConfigurationRequestMutableBuilder[Self <: AddApplicationVpcConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
  }
}
