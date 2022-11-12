package typings.awsSdkTokenProviders

import typings.awsSdkTypes.distTypesTokenMod.Token
import typings.awsSdkTypes.distTypesTokenMod.TokenProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromStaticMod {
  
  @JSImport("@aws-sdk/token-providers/dist-types/fromStatic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromStatic(param0: FromStaticInit): TokenProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStatic")(param0.asInstanceOf[js.Any]).asInstanceOf[TokenProvider]
  
  trait FromStaticInit extends StObject {
    
    var token: js.UndefOr[Token] = js.undefined
  }
  object FromStaticInit {
    
    inline def apply(): FromStaticInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromStaticInit]
    }
    
    extension [Self <: FromStaticInit](x: Self) {
      
      inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
}
