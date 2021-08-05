package typings.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionCredentials extends StObject {
  
  /**
    * The connection token.
    */
  var ConnectionToken: js.UndefOr[ParticipantToken] = js.undefined
  
  /**
    * The expiration of the token. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var Expiry: js.UndefOr[ISO8601Datetime] = js.undefined
}
object ConnectionCredentials {
  
  inline def apply(): ConnectionCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionCredentials]
  }
  
  extension [Self <: ConnectionCredentials](x: Self) {
    
    inline def setConnectionToken(value: ParticipantToken): Self = StObject.set(x, "ConnectionToken", value.asInstanceOf[js.Any])
    
    inline def setConnectionTokenUndefined: Self = StObject.set(x, "ConnectionToken", js.undefined)
    
    inline def setExpiry(value: ISO8601Datetime): Self = StObject.set(x, "Expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "Expiry", js.undefined)
  }
}
