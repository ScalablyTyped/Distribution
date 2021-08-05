package typings.base32Encode

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(buffer: ArrayBuffer, variant: Variant): String = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(buffer: ArrayBuffer, variant: Variant, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], variant.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("base32-encode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var padding: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPadding(value: Boolean): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.base32Encode.base32EncodeStrings.RFC3548
    - typings.base32Encode.base32EncodeStrings.RFC4648
    - typings.base32Encode.base32EncodeStrings.`RFC4648-HEX`
    - typings.base32Encode.base32EncodeStrings.Crockford
  */
  trait Variant extends StObject
  object Variant {
    
    inline def Crockford: typings.base32Encode.base32EncodeStrings.Crockford = "Crockford".asInstanceOf[typings.base32Encode.base32EncodeStrings.Crockford]
    
    inline def RFC3548: typings.base32Encode.base32EncodeStrings.RFC3548 = "RFC3548".asInstanceOf[typings.base32Encode.base32EncodeStrings.RFC3548]
    
    inline def RFC4648: typings.base32Encode.base32EncodeStrings.RFC4648 = "RFC4648".asInstanceOf[typings.base32Encode.base32EncodeStrings.RFC4648]
    
    inline def `RFC4648-HEX`: typings.base32Encode.base32EncodeStrings.`RFC4648-HEX` = "RFC4648-HEX".asInstanceOf[typings.base32Encode.base32EncodeStrings.`RFC4648-HEX`]
  }
}
