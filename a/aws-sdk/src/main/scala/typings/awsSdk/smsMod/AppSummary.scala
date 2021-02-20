package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppSummary extends StObject {
  
  /**
    * The unique ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.native
  
  /**
    * The creation time of the application.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the application.
    */
  var description: js.UndefOr[AppDescription] = js.native
  
  /**
    * The ID of the application.
    */
  var importedAppId: js.UndefOr[ImportedAppId] = js.native
  
  /**
    * The last modified time of the application.
    */
  var lastModified: js.UndefOr[Timestamp] = js.native
  
  /**
    * The timestamp of the application's most recent successful replication.
    */
  var latestReplicationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Status of the launch configuration.
    */
  var launchConfigurationStatus: js.UndefOr[AppLaunchConfigurationStatus] = js.native
  
  /**
    * Details about the latest launch of the application.
    */
  var launchDetails: js.UndefOr[LaunchDetails] = js.native
  
  /**
    * The launch status of the application.
    */
  var launchStatus: js.UndefOr[AppLaunchStatus] = js.native
  
  /**
    * A message related to the launch status of the application.
    */
  var launchStatusMessage: js.UndefOr[AppLaunchStatusMessage] = js.native
  
  /**
    * The name of the application.
    */
  var name: js.UndefOr[AppName] = js.native
  
  /**
    * Status of the replication configuration.
    */
  var replicationConfigurationStatus: js.UndefOr[AppReplicationConfigurationStatus] = js.native
  
  /**
    * The replication status of the application.
    */
  var replicationStatus: js.UndefOr[AppReplicationStatus] = js.native
  
  /**
    * A message related to the replication status of the application.
    */
  var replicationStatusMessage: js.UndefOr[AppReplicationStatusMessage] = js.native
  
  /**
    * The name of the service role in the customer's account used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  
  /**
    * Status of the application.
    */
  var status: js.UndefOr[AppStatus] = js.native
  
  /**
    * A message related to the status of the application
    */
  var statusMessage: js.UndefOr[AppStatusMessage] = js.native
  
  /**
    * The number of server groups present in the application.
    */
  var totalServerGroups: js.UndefOr[TotalServerGroups] = js.native
  
  /**
    * The number of servers present in the application.
    */
  var totalServers: js.UndefOr[TotalServers] = js.native
}
object AppSummary {
  
  @scala.inline
  def apply(): AppSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppSummary]
  }
  
  @scala.inline
  implicit class AppSummaryMutableBuilder[Self <: AppSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: AppDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setImportedAppId(value: ImportedAppId): Self = StObject.set(x, "importedAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedAppIdUndefined: Self = StObject.set(x, "importedAppId", js.undefined)
    
    @scala.inline
    def setLastModified(value: Timestamp): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setLatestReplicationTime(value: Timestamp): Self = StObject.set(x, "latestReplicationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestReplicationTimeUndefined: Self = StObject.set(x, "latestReplicationTime", js.undefined)
    
    @scala.inline
    def setLaunchConfigurationStatus(value: AppLaunchConfigurationStatus): Self = StObject.set(x, "launchConfigurationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchConfigurationStatusUndefined: Self = StObject.set(x, "launchConfigurationStatus", js.undefined)
    
    @scala.inline
    def setLaunchDetails(value: LaunchDetails): Self = StObject.set(x, "launchDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchDetailsUndefined: Self = StObject.set(x, "launchDetails", js.undefined)
    
    @scala.inline
    def setLaunchStatus(value: AppLaunchStatus): Self = StObject.set(x, "launchStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchStatusMessage(value: AppLaunchStatusMessage): Self = StObject.set(x, "launchStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchStatusMessageUndefined: Self = StObject.set(x, "launchStatusMessage", js.undefined)
    
    @scala.inline
    def setLaunchStatusUndefined: Self = StObject.set(x, "launchStatus", js.undefined)
    
    @scala.inline
    def setName(value: AppName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReplicationConfigurationStatus(value: AppReplicationConfigurationStatus): Self = StObject.set(x, "replicationConfigurationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationConfigurationStatusUndefined: Self = StObject.set(x, "replicationConfigurationStatus", js.undefined)
    
    @scala.inline
    def setReplicationStatus(value: AppReplicationStatus): Self = StObject.set(x, "replicationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationStatusMessage(value: AppReplicationStatusMessage): Self = StObject.set(x, "replicationStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationStatusMessageUndefined: Self = StObject.set(x, "replicationStatusMessage", js.undefined)
    
    @scala.inline
    def setReplicationStatusUndefined: Self = StObject.set(x, "replicationStatus", js.undefined)
    
    @scala.inline
    def setRoleName(value: RoleName): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
    @scala.inline
    def setStatus(value: AppStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: AppStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTotalServerGroups(value: TotalServerGroups): Self = StObject.set(x, "totalServerGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalServerGroupsUndefined: Self = StObject.set(x, "totalServerGroups", js.undefined)
    
    @scala.inline
    def setTotalServers(value: TotalServers): Self = StObject.set(x, "totalServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalServersUndefined: Self = StObject.set(x, "totalServers", js.undefined)
  }
}
