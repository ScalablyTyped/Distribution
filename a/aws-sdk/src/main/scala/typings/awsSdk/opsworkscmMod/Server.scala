package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends StObject {
  
  /**
    * Associate a public IP address with a server that you are launching. 
    */
  var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of automated backups to keep. 
    */
  var BackupRetentionCount: js.UndefOr[Integer] = js.native
  
  /**
    * The ARN of the CloudFormation stack that was used to create the server. 
    */
  var CloudFormationStackArn: js.UndefOr[String] = js.native
  
  /**
    * Time stamp of server creation. Example 2016-07-29T13:38:47.520Z 
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * An optional public endpoint of a server, such as https://aws.my-company.com. You cannot access the server by using the Endpoint value if the server has a CustomDomain specified.
    */
  var CustomDomain: js.UndefOr[typings.awsSdk.opsworkscmMod.CustomDomain] = js.native
  
  /**
    * Disables automated backups. The number of stored backups is dependent on the value of PreferredBackupCount. 
    */
  var DisableAutomatedBackup: js.UndefOr[Boolean] = js.native
  
  /**
    *  A DNS name that can be used to access the engine. Example: myserver-asdfghjkl.us-east-1.opsworks.io. You cannot access the server by using the Endpoint value if the server has a CustomDomain specified. 
    */
  var Endpoint: js.UndefOr[String] = js.native
  
  /**
    * The engine type of the server. Valid values in this release include ChefAutomate and Puppet. 
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * The response of a createServer() request returns the master credential to access the server in EngineAttributes. These credentials are not stored by AWS OpsWorks CM; they are returned only as part of the result of createServer().   Attributes returned in a createServer response for Chef     CHEF_AUTOMATE_PIVOTAL_KEY: A base64-encoded RSA private key that is generated by AWS OpsWorks for Chef Automate. This private key is required to access the Chef API.    CHEF_STARTER_KIT: A base64-encoded ZIP file. The ZIP file contains a Chef starter kit, which includes a README, a configuration file, and the required RSA private key. Save this file, unzip it, and then change to the directory where you've unzipped the file contents. From this directory, you can run Knife commands.    Attributes returned in a createServer response for Puppet     PUPPET_STARTER_KIT: A base64-encoded ZIP file. The ZIP file contains a Puppet starter kit, including a README and a required private key. Save this file, unzip it, and then change to the directory where you've unzipped the file contents.    PUPPET_ADMIN_PASSWORD: An administrator password that you can use to sign in to the Puppet Enterprise console after the server is online.  
    */
  var EngineAttributes: js.UndefOr[typings.awsSdk.opsworkscmMod.EngineAttributes] = js.native
  
  /**
    * The engine model of the server. Valid values in this release include Monolithic for Puppet and Single for Chef. 
    */
  var EngineModel: js.UndefOr[String] = js.native
  
  /**
    * The engine version of the server. For a Chef server, the valid value for EngineVersion is currently 2. For a Puppet server, the valid value is 2017. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The instance profile ARN of the server. 
    */
  var InstanceProfileArn: js.UndefOr[String] = js.native
  
  /**
    *  The instance type for the server, as specified in the CloudFormation stack. This might not be the same instance type that is shown in the EC2 console. 
    */
  var InstanceType: js.UndefOr[String] = js.native
  
  /**
    * The key pair associated with the server. 
    */
  var KeyPair: js.UndefOr[String] = js.native
  
  /**
    * The status of the most recent server maintenance run. Shows SUCCESS or FAILED. 
    */
  var MaintenanceStatus: js.UndefOr[typings.awsSdk.opsworkscmMod.MaintenanceStatus] = js.native
  
  /**
    * The preferred backup period specified for the server. 
    */
  var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.native
  
  /**
    * The preferred maintenance period specified for the server. 
    */
  var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.native
  
  /**
    *  The security group IDs for the server, as specified in the CloudFormation stack. These might not be the same security groups that are shown in the EC2 console. 
    */
  var SecurityGroupIds: js.UndefOr[Strings] = js.native
  
  /**
    * The ARN of the server. 
    */
  var ServerArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the server. 
    */
  var ServerName: js.UndefOr[String] = js.native
  
  /**
    * The service role ARN used to create the server. 
    */
  var ServiceRoleArn: js.UndefOr[String] = js.native
  
  /**
    *  The server's status. This field displays the states of actions in progress, such as creating, running, or backing up the server, as well as the server's health state. 
    */
  var Status: js.UndefOr[ServerStatus] = js.native
  
  /**
    *  Depending on the server status, this field has either a human-readable message (such as a create or backup error), or an escaped block of JSON (used for health check results). 
    */
  var StatusReason: js.UndefOr[String] = js.native
  
  /**
    *  The subnet IDs specified in a CreateServer request. 
    */
  var SubnetIds: js.UndefOr[Strings] = js.native
}
object Server {
  
  @scala.inline
  def apply(): Server = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Server]
  }
  
  @scala.inline
  implicit class ServerMutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatePublicIpAddress(value: Boolean): Self = StObject.set(x, "AssociatePublicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "AssociatePublicIpAddress", js.undefined)
    
    @scala.inline
    def setBackupRetentionCount(value: Integer): Self = StObject.set(x, "BackupRetentionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionCountUndefined: Self = StObject.set(x, "BackupRetentionCount", js.undefined)
    
    @scala.inline
    def setCloudFormationStackArn(value: String): Self = StObject.set(x, "CloudFormationStackArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFormationStackArnUndefined: Self = StObject.set(x, "CloudFormationStackArn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setCustomDomain(value: CustomDomain): Self = StObject.set(x, "CustomDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDomainUndefined: Self = StObject.set(x, "CustomDomain", js.undefined)
    
    @scala.inline
    def setDisableAutomatedBackup(value: Boolean): Self = StObject.set(x, "DisableAutomatedBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutomatedBackupUndefined: Self = StObject.set(x, "DisableAutomatedBackup", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineAttributes(value: EngineAttributes): Self = StObject.set(x, "EngineAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineAttributesUndefined: Self = StObject.set(x, "EngineAttributes", js.undefined)
    
    @scala.inline
    def setEngineAttributesVarargs(value: EngineAttribute*): Self = StObject.set(x, "EngineAttributes", js.Array(value :_*))
    
    @scala.inline
    def setEngineModel(value: String): Self = StObject.set(x, "EngineModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineModelUndefined: Self = StObject.set(x, "EngineModel", js.undefined)
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setInstanceProfileArn(value: String): Self = StObject.set(x, "InstanceProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceProfileArnUndefined: Self = StObject.set(x, "InstanceProfileArn", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setKeyPair(value: String): Self = StObject.set(x, "KeyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairUndefined: Self = StObject.set(x, "KeyPair", js.undefined)
    
    @scala.inline
    def setMaintenanceStatus(value: MaintenanceStatus): Self = StObject.set(x, "MaintenanceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceStatusUndefined: Self = StObject.set(x, "MaintenanceStatus", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: TimeWindowDefinition): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: TimeWindowDefinition): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: Strings): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setServerArn(value: String): Self = StObject.set(x, "ServerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerArnUndefined: Self = StObject.set(x, "ServerArn", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: String): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleArnUndefined: Self = StObject.set(x, "ServiceRoleArn", js.undefined)
    
    @scala.inline
    def setStatus(value: ServerStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: String): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubnetIds(value: Strings): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
  }
}
