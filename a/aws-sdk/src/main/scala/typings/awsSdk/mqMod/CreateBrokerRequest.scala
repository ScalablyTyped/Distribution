package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBrokerRequest extends js.Object {
  
  /**
    * The authentication strategy used to secure the broker.
    */
  var AuthenticationStrategy: js.UndefOr[typings.awsSdk.mqMod.AuthenticationStrategy] = js.native
  
  /**
    * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[boolean] = js.native
  
  /**
    * Required. The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[string] = js.native
  
  /**
    * A list of information about the configuration.
    */
  var Configuration: js.UndefOr[ConfigurationId] = js.native
  
  /**
    * The unique ID that the requester receives for the created broker. Amazon MQ passes your ID with the API action. Note: We recommend using a Universally Unique Identifier (UUID) for the creatorRequestId. You may omit the creatorRequestId if your application doesn't require idempotency.
    */
  var CreatorRequestId: js.UndefOr[string] = js.native
  
  /**
    * Required. The deployment mode of the broker.
    */
  var DeploymentMode: js.UndefOr[typings.awsSdk.mqMod.DeploymentMode] = js.native
  
  /**
    * Encryption options for the broker.
    */
  var EncryptionOptions: js.UndefOr[typings.awsSdk.mqMod.EncryptionOptions] = js.native
  
  /**
    * Required. The type of broker engine. Note: Currently, Amazon MQ supports ACTIVEMQ and RABBITMQ.
    */
  var EngineType: js.UndefOr[typings.awsSdk.mqMod.EngineType] = js.native
  
  /**
    * Required. The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[string] = js.native
  
  /**
    * Required. The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.native
  
  /**
    * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
    */
  var LdapServerMetadata: js.UndefOr[LdapServerMetadataInput] = js.native
  
  /**
    * Enables Amazon CloudWatch logging for brokers.
    */
  var Logs: js.UndefOr[typings.awsSdk.mqMod.Logs] = js.native
  
  /**
    * The parameters that determine the WeeklyStartTime.
    */
  var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.native
  
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
    * The list of groups that define which subnets and IP ranges the broker can use from different Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment (ACTIVEMQ) requires two subnets. A CLUSTER_MULTI_AZ deployment (RABBITMQ) has no subnet requirements when deployed with public accessibility, deployment without public accessibility requires at least one subnet.
    */
  var SubnetIds: js.UndefOr[listOfString] = js.native
  
  /**
    * Create tags when creating the broker.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  
  /**
    * Required. The list of broker users (persons or applications) who can access queues and topics. For RabbitMQ brokers, one and only one administrative user is accepted and created when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ API calls directly to brokers or via the RabbitMQ Web Console. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Users: js.UndefOr[listOfUser] = js.native
}
object CreateBrokerRequest {
  
  @scala.inline
  def apply(): CreateBrokerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBrokerRequest]
  }
  
  @scala.inline
  implicit class CreateBrokerRequestOps[Self <: CreateBrokerRequest] (val x: Self) extends AnyVal {
    
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
    def setBrokerName(value: string): Self = this.set("BrokerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerName: Self = this.set("BrokerName", js.undefined)
    
    @scala.inline
    def setConfiguration(value: ConfigurationId): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    
    @scala.inline
    def setCreatorRequestId(value: string): Self = this.set("CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorRequestId: Self = this.set("CreatorRequestId", js.undefined)
    
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
    def setLdapServerMetadata(value: LdapServerMetadataInput): Self = this.set("LdapServerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLdapServerMetadata: Self = this.set("LdapServerMetadata", js.undefined)
    
    @scala.inline
    def setLogs(value: Logs): Self = this.set("Logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogs: Self = this.set("Logs", js.undefined)
    
    @scala.inline
    def setMaintenanceWindowStartTime(value: WeeklyStartTime): Self = this.set("MaintenanceWindowStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceWindowStartTime: Self = this.set("MaintenanceWindowStartTime", js.undefined)
    
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
    def setUsersVarargs(value: User*): Self = this.set("Users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: listOfUser): Self = this.set("Users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("Users", js.undefined)
  }
}
