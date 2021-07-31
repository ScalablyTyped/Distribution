package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBrokerResponse extends StObject {
  
  /**
    * The authentication strategy used to secure the broker.
    */
  var AuthenticationStrategy: js.UndefOr[typings.awsSdk.mqMod.AuthenticationStrategy] = js.undefined
  
  /**
    * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  var BrokerArn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.undefined
  
  /**
    * A list of information about allocated brokers.
    */
  var BrokerInstances: js.UndefOr[listOfBrokerInstance] = js.undefined
  
  /**
    * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[string] = js.undefined
  
  /**
    * The status of the broker.
    */
  var BrokerState: js.UndefOr[typings.awsSdk.mqMod.BrokerState] = js.undefined
  
  /**
    * The list of all revisions for the specified configuration.
    */
  var Configurations: js.UndefOr[typings.awsSdk.mqMod.Configurations] = js.undefined
  
  /**
    * The time when the broker was created.
    */
  var Created: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * Required. The deployment mode of the broker.
    */
  var DeploymentMode: js.UndefOr[typings.awsSdk.mqMod.DeploymentMode] = js.undefined
  
  /**
    * Encryption options for the broker.
    */
  var EncryptionOptions: js.UndefOr[typings.awsSdk.mqMod.EncryptionOptions] = js.undefined
  
  /**
    * Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
    */
  var EngineType: js.UndefOr[typings.awsSdk.mqMod.EngineType] = js.undefined
  
  /**
    * The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.undefined
  
  /**
    * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
    */
  var LdapServerMetadata: js.UndefOr[LdapServerMetadataOutput] = js.undefined
  
  /**
    * The list of information about logs currently enabled and pending to be deployed for the specified broker.
    */
  var Logs: js.UndefOr[LogsSummary] = js.undefined
  
  /**
    * The parameters that determine the WeeklyStartTime.
    */
  var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined
  
  /**
    * The authentication strategy that will be applied when the broker is rebooted.
    */
  var PendingAuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.undefined
  
  /**
    * The version of the broker engine to upgrade to. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var PendingEngineVersion: js.UndefOr[string] = js.undefined
  
  /**
    * The host instance type of the broker to upgrade to. For a list of supported instance types, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
    */
  var PendingHostInstanceType: js.UndefOr[string] = js.undefined
  
  /**
    * The metadata of the LDAP server that will be used to authenticate and authorize connections to the broker once it is rebooted.
    */
  var PendingLdapServerMetadata: js.UndefOr[LdapServerMetadataOutput] = js.undefined
  
  /**
    * The list of pending security groups to authorize connections to brokers.
    */
  var PendingSecurityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
    */
  var PubliclyAccessible: js.UndefOr[boolean] = js.undefined
  
  /**
    * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The broker's storage type.
    */
  var StorageType: js.UndefOr[BrokerStorageType] = js.undefined
  
  /**
    * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements when deployed with public accessibility, deployment without public accessibility requires at least one subnet.
    */
  var SubnetIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The list of all tags associated with this broker.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The list of all broker usernames for the specified broker.
    */
  var Users: js.UndefOr[listOfUserSummary] = js.undefined
}
object DescribeBrokerResponse {
  
  @scala.inline
  def apply(): DescribeBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBrokerResponse]
  }
  
  @scala.inline
  implicit class DescribeBrokerResponseMutableBuilder[Self <: DescribeBrokerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "AuthenticationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationStrategyUndefined: Self = StObject.set(x, "AuthenticationStrategy", js.undefined)
    
    @scala.inline
    def setAutoMinorVersionUpgrade(value: boolean): Self = StObject.set(x, "AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMinorVersionUpgradeUndefined: Self = StObject.set(x, "AutoMinorVersionUpgrade", js.undefined)
    
    @scala.inline
    def setBrokerArn(value: string): Self = StObject.set(x, "BrokerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerArnUndefined: Self = StObject.set(x, "BrokerArn", js.undefined)
    
    @scala.inline
    def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerIdUndefined: Self = StObject.set(x, "BrokerId", js.undefined)
    
    @scala.inline
    def setBrokerInstances(value: listOfBrokerInstance): Self = StObject.set(x, "BrokerInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerInstancesUndefined: Self = StObject.set(x, "BrokerInstances", js.undefined)
    
    @scala.inline
    def setBrokerInstancesVarargs(value: BrokerInstance*): Self = StObject.set(x, "BrokerInstances", js.Array(value :_*))
    
    @scala.inline
    def setBrokerName(value: string): Self = StObject.set(x, "BrokerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerNameUndefined: Self = StObject.set(x, "BrokerName", js.undefined)
    
    @scala.inline
    def setBrokerState(value: BrokerState): Self = StObject.set(x, "BrokerState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokerStateUndefined: Self = StObject.set(x, "BrokerState", js.undefined)
    
    @scala.inline
    def setConfigurations(value: Configurations): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    @scala.inline
    def setCreated(value: timestampIso8601): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    @scala.inline
    def setDeploymentMode(value: DeploymentMode): Self = StObject.set(x, "DeploymentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentModeUndefined: Self = StObject.set(x, "DeploymentMode", js.undefined)
    
    @scala.inline
    def setEncryptionOptions(value: EncryptionOptions): Self = StObject.set(x, "EncryptionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionOptionsUndefined: Self = StObject.set(x, "EncryptionOptions", js.undefined)
    
    @scala.inline
    def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: string): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostInstanceTypeUndefined: Self = StObject.set(x, "HostInstanceType", js.undefined)
    
    @scala.inline
    def setLdapServerMetadata(value: LdapServerMetadataOutput): Self = StObject.set(x, "LdapServerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLdapServerMetadataUndefined: Self = StObject.set(x, "LdapServerMetadata", js.undefined)
    
    @scala.inline
    def setLogs(value: LogsSummary): Self = StObject.set(x, "Logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsUndefined: Self = StObject.set(x, "Logs", js.undefined)
    
    @scala.inline
    def setMaintenanceWindowStartTime(value: WeeklyStartTime): Self = StObject.set(x, "MaintenanceWindowStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceWindowStartTimeUndefined: Self = StObject.set(x, "MaintenanceWindowStartTime", js.undefined)
    
    @scala.inline
    def setPendingAuthenticationStrategy(value: AuthenticationStrategy): Self = StObject.set(x, "PendingAuthenticationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingAuthenticationStrategyUndefined: Self = StObject.set(x, "PendingAuthenticationStrategy", js.undefined)
    
    @scala.inline
    def setPendingEngineVersion(value: string): Self = StObject.set(x, "PendingEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingEngineVersionUndefined: Self = StObject.set(x, "PendingEngineVersion", js.undefined)
    
    @scala.inline
    def setPendingHostInstanceType(value: string): Self = StObject.set(x, "PendingHostInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingHostInstanceTypeUndefined: Self = StObject.set(x, "PendingHostInstanceType", js.undefined)
    
    @scala.inline
    def setPendingLdapServerMetadata(value: LdapServerMetadataOutput): Self = StObject.set(x, "PendingLdapServerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingLdapServerMetadataUndefined: Self = StObject.set(x, "PendingLdapServerMetadata", js.undefined)
    
    @scala.inline
    def setPendingSecurityGroups(value: listOfString): Self = StObject.set(x, "PendingSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingSecurityGroupsUndefined: Self = StObject.set(x, "PendingSecurityGroups", js.undefined)
    
    @scala.inline
    def setPendingSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "PendingSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setPubliclyAccessible(value: boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: listOfString): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setStorageType(value: BrokerStorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: listOfString): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: string*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setUsers(value: listOfUserSummary): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserSummary*): Self = StObject.set(x, "Users", js.Array(value :_*))
  }
}
