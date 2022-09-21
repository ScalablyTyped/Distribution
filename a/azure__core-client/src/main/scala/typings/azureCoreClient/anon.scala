package typings.azureCoreClient

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Credential extends StObject {
    
    var credential: TokenCredential
    
    var credentialScopes: String | js.Array[String]
  }
  object Credential {
    
    inline def apply(credential: TokenCredential, credentialScopes: String | js.Array[String]): Credential = {
      val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialScopes = credentialScopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credential]
    }
    
    extension [Self <: Credential](x: Self) {
      
      inline def setCredential(value: TokenCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setCredentialScopes(value: String | js.Array[String]): Self = StObject.set(x, "credentialScopes", value.asInstanceOf[js.Any])
      
      inline def setCredentialScopesVarargs(value: String*): Self = StObject.set(x, "credentialScopes", js.Array(value*))
    }
  }
}
