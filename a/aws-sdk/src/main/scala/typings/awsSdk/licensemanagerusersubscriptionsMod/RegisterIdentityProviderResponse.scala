package typings.awsSdk.licensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterIdentityProviderResponse extends StObject {
  
  /**
    * Metadata that describes the results of an identity provider operation.
    */
  var IdentityProviderSummary: typings.awsSdk.licensemanagerusersubscriptionsMod.IdentityProviderSummary
}
object RegisterIdentityProviderResponse {
  
  inline def apply(IdentityProviderSummary: IdentityProviderSummary): RegisterIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(IdentityProviderSummary = IdentityProviderSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterIdentityProviderResponse]
  }
  
  extension [Self <: RegisterIdentityProviderResponse](x: Self) {
    
    inline def setIdentityProviderSummary(value: IdentityProviderSummary): Self = StObject.set(x, "IdentityProviderSummary", value.asInstanceOf[js.Any])
  }
}
