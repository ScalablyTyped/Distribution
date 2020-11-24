package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinDomainInput extends js.Object {
  
  /**
    * List of IPv4 addresses, NetBIOS names, or host names of your domain server. If you need to specify the port number include it after the colon (“:”). For example, mydc.mydomain.com:389.
    */
  var DomainControllers: js.UndefOr[Hosts] = js.native
  
  /**
    * The name of the domain that you want the gateway to join.
    */
  var DomainName: typings.awsSdk.storagegatewayMod.DomainName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the gateway. Use the ListGateways operation to return a list of gateways for your account and AWS Region.
    */
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
  
  /**
    * The organizational unit (OU) is a container in an Active Directory that can hold users, groups, computers, and other OUs and this parameter specifies the OU that the gateway will join within the AD domain.
    */
  var OrganizationalUnit: js.UndefOr[typings.awsSdk.storagegatewayMod.OrganizationalUnit] = js.native
  
  /**
    * Sets the password of the user who has permission to add the gateway to the Active Directory domain.
    */
  var Password: DomainUserPassword = js.native
  
  /**
    * Specifies the time in seconds, in which the JoinDomain operation must complete. The default is 20 seconds.
    */
  var TimeoutInSeconds: js.UndefOr[typings.awsSdk.storagegatewayMod.TimeoutInSeconds] = js.native
  
  /**
    * Sets the user name of user who has permission to add the gateway to the Active Directory domain. The domain user account should be enabled to join computers to the domain. For example, you can use the domain administrator account or an account with delegated permissions to join computers to the domain.
    */
  var UserName: DomainUserName = js.native
}
object JoinDomainInput {
  
  @scala.inline
  def apply(
    DomainName: DomainName,
    GatewayARN: GatewayARN,
    Password: DomainUserPassword,
    UserName: DomainUserName
  ): JoinDomainInput = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinDomainInput]
  }
  
  @scala.inline
  implicit class JoinDomainInputOps[Self <: JoinDomainInput] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: DomainUserPassword): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: DomainUserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainControllersVarargs(value: Host*): Self = this.set("DomainControllers", js.Array(value :_*))
    
    @scala.inline
    def setDomainControllers(value: Hosts): Self = this.set("DomainControllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainControllers: Self = this.set("DomainControllers", js.undefined)
    
    @scala.inline
    def setOrganizationalUnit(value: OrganizationalUnit): Self = this.set("OrganizationalUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationalUnit: Self = this.set("OrganizationalUnit", js.undefined)
    
    @scala.inline
    def setTimeoutInSeconds(value: TimeoutInSeconds): Self = this.set("TimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutInSeconds: Self = this.set("TimeoutInSeconds", js.undefined)
  }
}
