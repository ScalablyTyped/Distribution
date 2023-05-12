package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityVerificationAttributesResponse extends StObject {
  
  /**
    * A map of Identities to IdentityVerificationAttributes objects.
    */
  var VerificationAttributes: typings.awsSdk2Types.clientsSesMod.VerificationAttributes
}
object GetIdentityVerificationAttributesResponse {
  
  inline def apply(VerificationAttributes: VerificationAttributes): GetIdentityVerificationAttributesResponse = {
    val __obj = js.Dynamic.literal(VerificationAttributes = VerificationAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityVerificationAttributesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIdentityVerificationAttributesResponse] (val x: Self) extends AnyVal {
    
    inline def setVerificationAttributes(value: VerificationAttributes): Self = StObject.set(x, "VerificationAttributes", value.asInstanceOf[js.Any])
  }
}
