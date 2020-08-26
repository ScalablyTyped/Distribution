package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBrokerResponse extends js.Object {
  /**
    * The authentication strategy used to secure the broker.
    */
  var AuthenticationStrategy: js.UndefOr[typings.awsSdk.mqMod.AuthenticationStrategy] = js.native
  /**
    * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  var BrokerArn: js.UndefOr[string] = js.native
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.native
  /**
    * A list of information about allocated brokers.
    */
  var BrokerInstances: js.UndefOr[listOfBrokerInstance] = js.native
  /**
    * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[string] = js.native
  /**
    * The status of the broker.
    */
  var BrokerState: js.UndefOr[typings.awsSdk.mqMod.BrokerState] = js.native
  /**
    * The list of all revisions for the specified configuration.
    */
  var Configurations: js.UndefOr[typings.awsSdk.mqMod.Configurations] = js.native
  /**
    * The time when the broker was created.
    */
  var Created: js.UndefOr[timestampIso8601] = js.native
  /**
    * Required. The deployment mode of the broker.
    */
  var DeploymentMode: js.UndefOr[typings.awsSdk.mqMod.DeploymentMode] = js.native
  /**
    * Encryption options for the broker.
    */
  var EncryptionOptions: js.UndefOr[typings.awsSdk.mqMod.EncryptionOptions] = js.native
  /**
    * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
    */
  var EngineType: js.UndefOr[typings.awsSdk.mqMod.EngineType] = js.native
  /**
    * The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[string] = js.native
  /**
    * The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.native
  /**
    * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
    */
  var LdapServerMetadata: js.UndefOr[LdapServerMetadataOutput] = js.native
  /**
    * The list of information about logs currently enabled and pending to be deployed for the specified broker.
    */
  var Logs: js.UndefOr[LogsSummary] = js.native
  /**
    * The parameters that determine the WeeklyStartTime.
    */
  var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.native
  /**
    * The authentication strategy that will be applied when the broker is rebooted.
    */
  var PendingAuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.native
  /**
    * The version of the broker engine to upgrade to. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var PendingEngineVersion: js.UndefOr[string] = js.native
  /**
    * The host instance type of the broker to upgrade to. For a list of supported instance types, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
    */
  var PendingHostInstanceType: js.UndefOr[string] = js.native
  /**
    * The metadata of the LDAP server that will be used to authenticate and authorize connections to the broker once it is rebooted.
    */
  var PendingLdapServerMetadata: js.UndefOr[LdapServerMetadataOutput] = js.native
  /**
    * The list of pending security groups to authorize connections to brokers.
    */
  var PendingSecurityGroups: js.UndefOr[listOfString] = js.native
  /**
    * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
    */
  var PubliclyAccessible: js.UndefOr[boolean] = js.native
  /**
    * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.native
  /**
    * The broker's storage type.
    */
  var StorageType: js.UndefOr[BrokerStorageType] = js.native
  /**
    * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
    */
  var SubnetIds: js.UndefOr[listOfString] = js.native
  /**
    * The list of all tags associated with this broker.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  /**
    * The list of all ActiveMQ usernames for the specified broker.
    */
  var Users: js.UndefOr[listOfUserSummary] = js.native
}

object DescribeBrokerResponse {
  @scala.inline
  def apply(): DescribeBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBrokerResponse]
  }
  @scala.inline
  implicit class DescribeBrokerResponseOps[Self <: DescribeBrokerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthenticationStrategy(value: AuthenticationStrategy): Self = this.set("AuthenticationStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationStrategy: Self = this.set("AuthenticationStrategy", js.undefined)
    @scala.inline
    def setAutoMinorVersionUpgrade(value: boolean): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    @scala.inline
    def setBrokerArn(value: string): Self = this.set("BrokerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrokerArn: Self = this.set("BrokerArn", js.undefined)
    @scala.inline
    def setBrokerId(value: string): Self = this.set("BrokerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrokerId: Self = this.set("BrokerId", js.undefined)
    @scala.inline
    def setBrokerInstancesVarargs(value: BrokerInstance*): Self = this.set("BrokerInstances", js.Array(value :_*))
    @scala.inline
    def setBrokerInstances(value: listOfBrokerInstance): Self = this.set("BrokerInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrokerInstances: Self = this.set("BrokerInstances", js.undefined)
    @scala.inline
    def setBrokerName(value: string): Self = this.set("BrokerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrokerName: Self = this.set("BrokerName", js.undefined)
    @scala.inline
    def setBrokerState(value: BrokerState): Self = this.set("BrokerState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrokerState: Self = this.set("BrokerState", js.undefined)
    @scala.inline
    def setConfigurations(value: Configurations): Self = this.set("Configurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurations: Self = this.set("Configurations", js.undefined)
    @scala.inline
    def setCreated(value: timestampIso8601): Self = this.set("Created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("Created", js.undefined)
    @scala.inline
    def setDeploymentMode(value: DeploymentMode): Self = this.set("DeploymentMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeploymentMode: Self = this.set("DeploymentMode", js.undefined)
    @scala.inline
    def setEncryptionOptions(value: EncryptionOptions): Self = this.set("EncryptionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionOptions: Self = this.set("EncryptionOptions", js.undefined)
    @scala.inline
    def setEngineType(value: EngineType): Self = this.set("EngineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineType: Self = this.set("EngineType", js.undefined)
    @scala.inline
    def setEngineVersion(value: string): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setHostInstanceType(value: string): Self = this.set("HostInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostInstanceType: Self = this.set("HostInstanceType", js.undefined)
    @scala.inline
    def setLdapServerMetadata(value: LdapServerMetadataOutput): Self = this.set("LdapServerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLdapServerMetadata: Self = this.set("LdapServerMetadata", js.undefined)
    @scala.inline
    def setLogs(value: LogsSummary): Self = this.set("Logs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogs: Self = this.set("Logs", js.undefined)
    @scala.inline
    def setMaintenanceWindowStartTime(value: WeeklyStartTime): Self = this.set("MaintenanceWindowStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenanceWindowStartTime: Self = this.set("MaintenanceWindowStartTime", js.undefined)
    @scala.inline
    def setPendingAuthenticationStrategy(value: AuthenticationStrategy): Self = this.set("PendingAuthenticationStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingAuthenticationStrategy: Self = this.set("PendingAuthenticationStrategy", js.undefined)
    @scala.inline
    def setPendingEngineVersion(value: string): Self = this.set("PendingEngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingEngineVersion: Self = this.set("PendingEngineVersion", js.undefined)
    @scala.inline
    def setPendingHostInstanceType(value: string): Self = this.set("PendingHostInstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingHostInstanceType: Self = this.set("PendingHostInstanceType", js.undefined)
    @scala.inline
    def setPendingLdapServerMetadata(value: LdapServerMetadataOutput): Self = this.set("PendingLdapServerMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingLdapServerMetadata: Self = this.set("PendingLdapServerMetadata", js.undefined)
    @scala.inline
    def setPendingSecurityGroupsVarargs(value: string*): Self = this.set("PendingSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setPendingSecurityGroups(value: listOfString): Self = this.set("PendingSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingSecurityGroups: Self = this.set("PendingSecurityGroups", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: boolean): Self = this.set("PubliclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("PubliclyAccessible", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: string*): Self = this.set("SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: listOfString): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
    @scala.inline
    def setStorageType(value: BrokerStorageType): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: string*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: listOfString): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    @scala.inline
    def setTags(value: mapOfString): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setUsersVarargs(value: UserSummary*): Self = this.set("Users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: listOfUserSummary): Self = this.set("Users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("Users", js.undefined)
  }
  
}

