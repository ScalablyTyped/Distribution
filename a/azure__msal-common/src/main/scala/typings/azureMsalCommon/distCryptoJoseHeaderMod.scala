package typings.azureMsalCommon

import typings.azureMsalCommon.distUtilsConstantsMod.JsonTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoJoseHeaderMod {
  
  @JSImport("@azure/msal-common/dist/crypto/JoseHeader", "JoseHeader")
  @js.native
  open class JoseHeader protected () extends StObject {
    def this(options: JoseHeaderOptions) = this()
    
    var alg: js.UndefOr[String] = js.native
    
    var kid: js.UndefOr[String] = js.native
    
    var typ: js.UndefOr[JsonTypes] = js.native
  }
  /* static members */
  object JoseHeader {
    
    @JSImport("@azure/msal-common/dist/crypto/JoseHeader", "JoseHeader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Builds SignedHttpRequest formatted JOSE Header from the
      * JOSE Header options provided or previously set on the object and returns
      * the stringified header object.
      * Throws if keyId or algorithm aren't provided since they are required for Access Token Binding.
      * @param shrHeaderOptions
      * @returns
      */
    inline def getShrHeaderString(shrHeaderOptions: JoseHeaderOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShrHeaderString")(shrHeaderOptions.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  trait JoseHeaderOptions extends StObject {
    
    var alg: js.UndefOr[String] = js.undefined
    
    var kid: js.UndefOr[String] = js.undefined
    
    var typ: js.UndefOr[JsonTypes] = js.undefined
  }
  object JoseHeaderOptions {
    
    inline def apply(): JoseHeaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JoseHeaderOptions]
    }
    
    extension [Self <: JoseHeaderOptions](x: Self) {
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
      
      inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
      
      inline def setTyp(value: JsonTypes): Self = StObject.set(x, "typ", value.asInstanceOf[js.Any])
      
      inline def setTypUndefined: Self = StObject.set(x, "typ", js.undefined)
    }
  }
}
