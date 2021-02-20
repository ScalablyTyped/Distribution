package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApplicationVpcConfigurationRequest extends StObject {
  
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  
  /**
    * The current application version ID. You can retrieve the application version ID using DescribeApplication.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  
  /**
    * The ID of the VPC configuration to delete.
    */
  var VpcConfigurationId: Id = js.native
}
object DeleteApplicationVpcConfigurationRequest {
  
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    VpcConfigurationId: Id
  ): DeleteApplicationVpcConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], VpcConfigurationId = VpcConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationVpcConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteApplicationVpcConfigurationRequestMutableBuilder[Self <: DeleteApplicationVpcConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationId(value: Id): Self = StObject.set(x, "VpcConfigurationId", value.asInstanceOf[js.Any])
  }
}
