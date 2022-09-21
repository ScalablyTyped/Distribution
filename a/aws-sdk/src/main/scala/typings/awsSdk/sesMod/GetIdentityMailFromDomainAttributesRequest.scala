package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityMailFromDomainAttributesRequest extends StObject {
  
  /**
    * A list of one or more identities.
    */
  var Identities: IdentityList
}
object GetIdentityMailFromDomainAttributesRequest {
  
  inline def apply(Identities: IdentityList): GetIdentityMailFromDomainAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityMailFromDomainAttributesRequest]
  }
  
  extension [Self <: GetIdentityMailFromDomainAttributesRequest](x: Self) {
    
    inline def setIdentities(value: IdentityList): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "Identities", js.Array(value*))
  }
}
