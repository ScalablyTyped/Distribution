package typings.awsSdkTokenProviders

import typings.awsSdkTypes.distTypesIdentityTokenIdentityMod.TokenIdentity
import typings.awsSdkTypes.distTypesIdentityTokenIdentityMod.TokenIdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromStaticMod {
  
  @JSImport("@aws-sdk/token-providers/dist-types/fromStatic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromStatic(param0: FromStaticInit): TokenIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStatic")(param0.asInstanceOf[js.Any]).asInstanceOf[TokenIdentityProvider]
  
  trait FromStaticInit extends StObject {
    
    var token: js.UndefOr[TokenIdentity] = js.undefined
  }
  object FromStaticInit {
    
    inline def apply(): FromStaticInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromStaticInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromStaticInit] (val x: Self) extends AnyVal {
      
      inline def setToken(value: TokenIdentity): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
