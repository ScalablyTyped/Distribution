package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApplicationRequest extends StObject {
  
  /**
    * Describes application configuration updates.
    */
  var ApplicationConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationConfigurationUpdate] = js.native
  
  /**
    * The name of the application to update.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  
  /**
    * Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch logging options with this action. To add a new CloudWatch logging option, use AddApplicationCloudWatchLoggingOption.
    */
  var CloudWatchLoggingOptionUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionUpdates] = js.native
  
  /**
    * The current application version ID. You can retrieve the application version ID using DescribeApplication.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  
  /**
    * Describes updates to the application's starting parameters.
    */
  var RunConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.RunConfigurationUpdate] = js.native
  
  /**
    * Describes updates to the service execution role.
    */
  var ServiceExecutionRoleUpdate: js.UndefOr[RoleARN] = js.native
}
object UpdateApplicationRequest {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  @scala.inline
  implicit class UpdateApplicationRequestMutableBuilder[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationConfigurationUpdate(value: ApplicationConfigurationUpdate): Self = StObject.set(x, "ApplicationConfigurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationConfigurationUpdateUndefined: Self = StObject.set(x, "ApplicationConfigurationUpdate", js.undefined)
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionUpdates(value: CloudWatchLoggingOptionUpdates): Self = StObject.set(x, "CloudWatchLoggingOptionUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchLoggingOptionUpdatesUndefined: Self = StObject.set(x, "CloudWatchLoggingOptionUpdates", js.undefined)
    
    @scala.inline
    def setCloudWatchLoggingOptionUpdatesVarargs(value: CloudWatchLoggingOptionUpdate*): Self = StObject.set(x, "CloudWatchLoggingOptionUpdates", js.Array(value :_*))
    
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunConfigurationUpdate(value: RunConfigurationUpdate): Self = StObject.set(x, "RunConfigurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunConfigurationUpdateUndefined: Self = StObject.set(x, "RunConfigurationUpdate", js.undefined)
    
    @scala.inline
    def setServiceExecutionRoleUpdate(value: RoleARN): Self = StObject.set(x, "ServiceExecutionRoleUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceExecutionRoleUpdateUndefined: Self = StObject.set(x, "ServiceExecutionRoleUpdate", js.undefined)
  }
}
