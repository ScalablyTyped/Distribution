package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBrokerResponse extends js.Object {
  
  /**
    * The authentication strategy used to secure the broker.
    */
  var AuthenticationStrategy: js.UndefOr[typings.awsSdk.mqMod.AuthenticationStrategy] = js.native
  
  /**
    * The new value of automatic upgrades to new minor version for brokers.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[boolean] = js.native
  
  /**
    * Required. The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.native
  
  /**
    * The ID of the updated configuration.
    */
  var Configuration: js.UndefOr[ConfigurationId] = js.native
  
  /**
    * The version of the broker engine to upgrade to. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[string] = js.native
  
  /**
    * The host instance type of the broker to upgrade to. For a list of supported instance types, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
    */
  var HostInstanceType: js.UndefOr[string] = js.native
  
  /**
    * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
    */
  var LdapServerMetadata: js.UndefOr[LdapServerMetadataOutput] = js.native
  
  /**
    * The list of information about logs to be enabled for the specified broker.
    */
  var Logs: js.UndefOr[typings.awsSdk.mqMod.Logs] = js.native
  
  /**
    * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.native
}
object UpdateBrokerResponse {
  
  @scala.inline
  def apply(): UpdateBrokerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBrokerResponse]
  }
  
  @scala.inline
  implicit class UpdateBrokerResponseOps[Self <: UpdateBrokerResponse] (val x: Self) extends AnyVal {
    
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
    def setBrokerId(value: string): Self = this.set("BrokerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerId: Self = this.set("BrokerId", js.undefined)
    
    @scala.inline
    def setConfiguration(value: ConfigurationId): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    
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
    def setLogs(value: Logs): Self = this.set("Logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogs: Self = this.set("Logs", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: string*): Self = this.set("SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: listOfString): Self = this.set("SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("SecurityGroups", js.undefined)
  }
}
