package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainConfigurationRequest extends js.Object {
  
  /**
    * An object that specifies the authorization service for a domain.
    */
  var authorizerConfig: js.UndefOr[AuthorizerConfig] = js.native
  
  /**
    * The name of the domain configuration to be updated.
    */
  var domainConfigurationName: ReservedDomainConfigurationName = js.native
  
  /**
    * The status to which the domain configuration should be updated.
    */
  var domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus] = js.native
  
  /**
    * Removes the authorization configuration from a domain.
    */
  var removeAuthorizerConfig: js.UndefOr[RemoveAuthorizerConfig] = js.native
}
object UpdateDomainConfigurationRequest {
  
  @scala.inline
  def apply(domainConfigurationName: ReservedDomainConfigurationName): UpdateDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateDomainConfigurationRequestOps[Self <: UpdateDomainConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = this.set("domainConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerConfig(value: AuthorizerConfig): Self = this.set("authorizerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerConfig: Self = this.set("authorizerConfig", js.undefined)
    
    @scala.inline
    def setDomainConfigurationStatus(value: DomainConfigurationStatus): Self = this.set("domainConfigurationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainConfigurationStatus: Self = this.set("domainConfigurationStatus", js.undefined)
    
    @scala.inline
    def setRemoveAuthorizerConfig(value: RemoveAuthorizerConfig): Self = this.set("removeAuthorizerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveAuthorizerConfig: Self = this.set("removeAuthorizerConfig", js.undefined)
  }
}
