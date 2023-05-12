package typings.awsSdkTypes

import typings.awsSdkTypes.distTypesIdentityIdentityMod.Identity
import typings.awsSdkTypes.distTypesIdentityIdentityMod.IdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIdentityTokenIdentityMod {
  
  trait TokenIdentity
    extends StObject
       with Identity {
    
    /**
      * The literal token string
      */
    val token: String
  }
  object TokenIdentity {
    
    inline def apply(token: String): TokenIdentity = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenIdentity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenIdentity] (val x: Self) extends AnyVal {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  type TokenIdentityProvider = IdentityProvider[TokenIdentity]
}
