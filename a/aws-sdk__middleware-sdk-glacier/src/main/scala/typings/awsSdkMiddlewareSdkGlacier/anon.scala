package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Sha256 extends StObject {
    
    var sha256: HashConstructor
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
  }
  object Sha256 {
    
    inline def apply(sha256: HashConstructor, utf8Decoder: /* input */ String => js.typedarray.Uint8Array): Sha256 = {
      val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
      __obj.asInstanceOf[Sha256]
    }
    
    extension [Self <: Sha256](x: Self) {
      
      inline def setSha256(value: HashConstructor): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
    }
  }
}
