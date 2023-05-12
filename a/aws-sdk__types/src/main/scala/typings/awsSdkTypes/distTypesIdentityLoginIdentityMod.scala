package typings.awsSdkTypes

import typings.awsSdkTypes.distTypesIdentityIdentityMod.Identity
import typings.awsSdkTypes.distTypesIdentityIdentityMod.IdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIdentityLoginIdentityMod {
  
  trait LoginIdentity
    extends StObject
       with Identity {
    
    /**
      * Identity password
      */
    val password: String
    
    /**
      * Identity username
      */
    val username: String
  }
  object LoginIdentity {
    
    inline def apply(password: String, username: String): LoginIdentity = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginIdentity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoginIdentity] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  type LoginIdentityProvider = IdentityProvider[LoginIdentity]
}
