package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalId extends StObject {
  
  /**
    * The identifier issued to this resource by an external identity provider.
    */
  var Id: ExternalIdIdentifier
  
  /**
    * The issuer for an external identifier.
    */
  var Issuer: ExternalIdIssuer
}
object ExternalId {
  
  inline def apply(Id: ExternalIdIdentifier, Issuer: ExternalIdIssuer): ExternalId = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Issuer = Issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalId]
  }
  
  extension [Self <: ExternalId](x: Self) {
    
    inline def setId(value: ExternalIdIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: ExternalIdIssuer): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
  }
}
