package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailabilityConfiguration extends StObject {
  
  /**
    * The date and time at which the availability configuration was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time at which the availability configuration was last modified.
    */
  var DateModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Displays the domain to which the provider applies.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsWorkmailMod.DomainName] = js.undefined
  
  /**
    * If ProviderType is EWS, then this field contains RedactedEwsAvailabilityProvider. Otherwise, it is not required.
    */
  var EwsProvider: js.UndefOr[RedactedEwsAvailabilityProvider] = js.undefined
  
  /**
    * If ProviderType is LAMBDA then this field contains LambdaAvailabilityProvider. Otherwise, it is not required.
    */
  var LambdaProvider: js.UndefOr[LambdaAvailabilityProvider] = js.undefined
  
  /**
    * Displays the provider type that applies to this domain.
    */
  var ProviderType: js.UndefOr[AvailabilityProviderType] = js.undefined
}
object AvailabilityConfiguration {
  
  inline def apply(): AvailabilityConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityConfiguration]
  }
  
  extension [Self <: AvailabilityConfiguration](x: Self) {
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    inline def setDateModified(value: js.Date): Self = StObject.set(x, "DateModified", value.asInstanceOf[js.Any])
    
    inline def setDateModifiedUndefined: Self = StObject.set(x, "DateModified", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setEwsProvider(value: RedactedEwsAvailabilityProvider): Self = StObject.set(x, "EwsProvider", value.asInstanceOf[js.Any])
    
    inline def setEwsProviderUndefined: Self = StObject.set(x, "EwsProvider", js.undefined)
    
    inline def setLambdaProvider(value: LambdaAvailabilityProvider): Self = StObject.set(x, "LambdaProvider", value.asInstanceOf[js.Any])
    
    inline def setLambdaProviderUndefined: Self = StObject.set(x, "LambdaProvider", js.undefined)
    
    inline def setProviderType(value: AvailabilityProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
  }
}
