package typings.awsSdkTypes

import typings.awsSdkTypes.distTypesAuthMod.AuthScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AuthSchemes extends StObject {
    
    var authSchemes: js.UndefOr[js.Array[AuthScheme]] = js.undefined
  }
  object AuthSchemes {
    
    inline def apply(): AuthSchemes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthSchemes]
    }
    
    extension [Self <: AuthSchemes](x: Self) {
      
      inline def setAuthSchemes(value: js.Array[AuthScheme]): Self = StObject.set(x, "authSchemes", value.asInstanceOf[js.Any])
      
      inline def setAuthSchemesUndefined: Self = StObject.set(x, "authSchemes", js.undefined)
      
      inline def setAuthSchemesVarargs(value: AuthScheme*): Self = StObject.set(x, "authSchemes", js.Array(value*))
    }
  }
  
  trait ForceRefresh extends StObject {
    
    var forceRefresh: js.UndefOr[Boolean] = js.undefined
  }
  object ForceRefresh {
    
    inline def apply(): ForceRefresh = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForceRefresh]
    }
    
    extension [Self <: ForceRefresh](x: Self) {
      
      inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
    }
  }
}
