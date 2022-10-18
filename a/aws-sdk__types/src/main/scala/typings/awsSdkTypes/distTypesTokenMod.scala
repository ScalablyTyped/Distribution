package typings.awsSdkTypes

import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTokenMod {
  
  trait Token extends StObject {
    
    /**
      * A {Date} when these token will no longer be accepted.
      * When expiration is not defined, the token is assumed to be permanent.
      */
    val expiration: js.UndefOr[js.Date] = js.undefined
    
    /**
      *The literal token string
      */
    val token: String
  }
  object Token {
    
    inline def apply(token: String): Token = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setExpiration(value: js.Date): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  type TokenProvider = Provider[Token]
}
