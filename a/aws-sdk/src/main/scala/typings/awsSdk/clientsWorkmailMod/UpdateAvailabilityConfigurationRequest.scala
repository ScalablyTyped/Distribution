package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAvailabilityConfigurationRequest extends StObject {
  
  /**
    * The domain to which the provider applies the availability configuration.
    */
  var DomainName: typings.awsSdk.clientsWorkmailMod.DomainName
  
  /**
    * The EWS availability provider definition. The request must contain exactly one provider definition, either EwsProvider or LambdaProvider. The previously stored provider will be overridden by the one provided.
    */
  var EwsProvider: js.UndefOr[EwsAvailabilityProvider] = js.undefined
  
  /**
    * The Lambda availability provider definition. The request must contain exactly one provider definition, either EwsProvider or LambdaProvider. The previously stored provider will be overridden by the one provided.
    */
  var LambdaProvider: js.UndefOr[LambdaAvailabilityProvider] = js.undefined
  
  /**
    * The WorkMail organization for which the AvailabilityConfiguration will be updated.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object UpdateAvailabilityConfigurationRequest {
  
  inline def apply(DomainName: DomainName, OrganizationId: OrganizationId): UpdateAvailabilityConfigurationRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAvailabilityConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAvailabilityConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEwsProvider(value: EwsAvailabilityProvider): Self = StObject.set(x, "EwsProvider", value.asInstanceOf[js.Any])
    
    inline def setEwsProviderUndefined: Self = StObject.set(x, "EwsProvider", js.undefined)
    
    inline def setLambdaProvider(value: LambdaAvailabilityProvider): Self = StObject.set(x, "LambdaProvider", value.asInstanceOf[js.Any])
    
    inline def setLambdaProviderUndefined: Self = StObject.set(x, "LambdaProvider", js.undefined)
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
