package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityVerificationAttributesRequest extends StObject {
  
  /**
    * A list of identities.
    */
  var Identities: IdentityList
}
object GetIdentityVerificationAttributesRequest {
  
  inline def apply(Identities: IdentityList): GetIdentityVerificationAttributesRequest = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityVerificationAttributesRequest]
  }
  
  extension [Self <: GetIdentityVerificationAttributesRequest](x: Self) {
    
    inline def setIdentities(value: IdentityList): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "Identities", js.Array(value :_*))
  }
}
