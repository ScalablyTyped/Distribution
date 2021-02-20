package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainConfigurationRequest extends StObject {
  
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
  implicit class UpdateDomainConfigurationRequestMutableBuilder[Self <: UpdateDomainConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerConfig(value: AuthorizerConfig): Self = StObject.set(x, "authorizerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerConfigUndefined: Self = StObject.set(x, "authorizerConfig", js.undefined)
    
    @scala.inline
    def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainConfigurationStatus(value: DomainConfigurationStatus): Self = StObject.set(x, "domainConfigurationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainConfigurationStatusUndefined: Self = StObject.set(x, "domainConfigurationStatus", js.undefined)
    
    @scala.inline
    def setRemoveAuthorizerConfig(value: RemoveAuthorizerConfig): Self = StObject.set(x, "removeAuthorizerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAuthorizerConfigUndefined: Self = StObject.set(x, "removeAuthorizerConfig", js.undefined)
  }
}
