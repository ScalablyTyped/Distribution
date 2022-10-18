package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAvailabilityConfigurationRequest extends StObject {
  
  /**
    * An idempotent token that ensures that an API request is executed only once.
    */
  var ClientToken: js.UndefOr[IdempotencyClientToken] = js.undefined
  
  /**
    * The domain to which the provider applies.
    */
  var DomainName: typings.awsSdk.clientsWorkmailMod.DomainName
  
  /**
    * Exchange Web Services (EWS) availability provider definition. The request must contain exactly one provider definition, either EwsProvider or LambdaProvider.
    */
  var EwsProvider: js.UndefOr[EwsAvailabilityProvider] = js.undefined
  
  /**
    * Lambda availability provider definition. The request must contain exactly one provider definition, either EwsProvider or LambdaProvider.
    */
  var LambdaProvider: js.UndefOr[LambdaAvailabilityProvider] = js.undefined
  
  /**
    * The WorkMail organization for which the AvailabilityConfiguration will be created.
    */
  var OrganizationId: typings.awsSdk.clientsWorkmailMod.OrganizationId
}
object CreateAvailabilityConfigurationRequest {
  
  inline def apply(DomainName: DomainName, OrganizationId: OrganizationId): CreateAvailabilityConfigurationRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAvailabilityConfigurationRequest]
  }
  
  extension [Self <: CreateAvailabilityConfigurationRequest](x: Self) {
    
    inline def setClientToken(value: IdempotencyClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEwsProvider(value: EwsAvailabilityProvider): Self = StObject.set(x, "EwsProvider", value.asInstanceOf[js.Any])
    
    inline def setEwsProviderUndefined: Self = StObject.set(x, "EwsProvider", js.undefined)
    
    inline def setLambdaProvider(value: LambdaAvailabilityProvider): Self = StObject.set(x, "LambdaProvider", value.asInstanceOf[js.Any])
    
    inline def setLambdaProviderUndefined: Self = StObject.set(x, "LambdaProvider", js.undefined)
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
