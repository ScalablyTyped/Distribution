package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestAvailabilityConfigurationRequest extends StObject {
  
  /**
    * The domain to which the provider applies. If this field is provided, a stored availability provider associated to this domain name will be tested.
    */
  var DomainName: js.UndefOr[typings.awsSdk.workmailMod.DomainName] = js.undefined
  
  var EwsProvider: js.UndefOr[EwsAvailabilityProvider] = js.undefined
  
  var LambdaProvider: js.UndefOr[LambdaAvailabilityProvider] = js.undefined
  
  /**
    * The Amazon WorkMail organization where the availability provider will be tested.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId
}
object TestAvailabilityConfigurationRequest {
  
  inline def apply(OrganizationId: OrganizationId): TestAvailabilityConfigurationRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAvailabilityConfigurationRequest]
  }
  
  extension [Self <: TestAvailabilityConfigurationRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setEwsProvider(value: EwsAvailabilityProvider): Self = StObject.set(x, "EwsProvider", value.asInstanceOf[js.Any])
    
    inline def setEwsProviderUndefined: Self = StObject.set(x, "EwsProvider", js.undefined)
    
    inline def setLambdaProvider(value: LambdaAvailabilityProvider): Self = StObject.set(x, "LambdaProvider", value.asInstanceOf[js.Any])
    
    inline def setLambdaProviderUndefined: Self = StObject.set(x, "LambdaProvider", js.undefined)
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
