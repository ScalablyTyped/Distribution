package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSummary extends js.Object {
  /**
    * Unique ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * Time of creation of this application.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * Description of the application.
    */
  var description: js.UndefOr[AppDescription] = js.native
  /**
    * Timestamp of the application's creation.
    */
  var lastModified: js.UndefOr[Timestamp] = js.native
  /**
    * Timestamp of the application's most recent successful replication.
    */
  var latestReplicationTime: js.UndefOr[Timestamp] = js.native
  /**
    * Details about the latest launch of the application.
    */
  var launchDetails: js.UndefOr[LaunchDetails] = js.native
  /**
    * Launch status of the application.
    */
  var launchStatus: js.UndefOr[AppLaunchStatus] = js.native
  /**
    * A message related to the launch status of the application.
    */
  var launchStatusMessage: js.UndefOr[AppLaunchStatusMessage] = js.native
  /**
    * Name of the application.
    */
  var name: js.UndefOr[AppName] = js.native
  /**
    * Replication status of the application.
    */
  var replicationStatus: js.UndefOr[AppReplicationStatus] = js.native
  /**
    * A message related to the replication status of the application.
    */
  var replicationStatusMessage: js.UndefOr[AppReplicationStatusMessage] = js.native
  /**
    * Name of the service role in the customer's account used by AWS SMS.
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
    * Number of server groups present in the application.
    */
  var totalServerGroups: js.UndefOr[TotalServerGroups] = js.native
  /**
    * Number of servers present in the application.
    */
  var totalServers: js.UndefOr[TotalServers] = js.native
}

object AppSummary {
  @scala.inline
  def apply(
    appId: AppId = null,
    creationTime: Timestamp = null,
    description: AppDescription = null,
    lastModified: Timestamp = null,
    latestReplicationTime: Timestamp = null,
    launchDetails: LaunchDetails = null,
    launchStatus: AppLaunchStatus = null,
    launchStatusMessage: AppLaunchStatusMessage = null,
    name: AppName = null,
    replicationStatus: AppReplicationStatus = null,
    replicationStatusMessage: AppReplicationStatusMessage = null,
    roleName: RoleName = null,
    status: AppStatus = null,
    statusMessage: AppStatusMessage = null,
    totalServerGroups: Int | Double = null,
    totalServers: Int | Double = null
  ): AppSummary = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (latestReplicationTime != null) __obj.updateDynamic("latestReplicationTime")(latestReplicationTime.asInstanceOf[js.Any])
    if (launchDetails != null) __obj.updateDynamic("launchDetails")(launchDetails.asInstanceOf[js.Any])
    if (launchStatus != null) __obj.updateDynamic("launchStatus")(launchStatus.asInstanceOf[js.Any])
    if (launchStatusMessage != null) __obj.updateDynamic("launchStatusMessage")(launchStatusMessage.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (replicationStatus != null) __obj.updateDynamic("replicationStatus")(replicationStatus.asInstanceOf[js.Any])
    if (replicationStatusMessage != null) __obj.updateDynamic("replicationStatusMessage")(replicationStatusMessage.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (totalServerGroups != null) __obj.updateDynamic("totalServerGroups")(totalServerGroups.asInstanceOf[js.Any])
    if (totalServers != null) __obj.updateDynamic("totalServers")(totalServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSummary]
  }
}

