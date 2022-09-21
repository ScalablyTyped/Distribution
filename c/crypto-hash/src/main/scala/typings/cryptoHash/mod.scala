package typings.cryptoHash

import typings.cryptoHash.cryptoHashStrings.buffer
import typings.cryptoHash.cryptoHashStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("crypto-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sha1(input: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha1(input: String, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def sha1(input: String, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha1(input: js.typedarray.ArrayBuffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha1(input: js.typedarray.ArrayBufferView): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha1(input: js.typedarray.ArrayBufferView, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def sha1(input: js.typedarray.ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha1(input: js.typedarray.ArrayBuffer, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def sha1(input: js.typedarray.ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def sha256(input: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha256(input: String, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def sha256(input: String, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha256(input: js.typedarray.ArrayBuffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha256(input: js.typedarray.ArrayBufferView): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha256(input: js.typedarray.ArrayBufferView, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def sha256(input: js.typedarray.ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha256(input: js.typedarray.ArrayBuffer, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def sha256(input: js.typedarray.ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def sha384(input: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha384(input: String, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def sha384(input: String, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha384(input: js.typedarray.ArrayBuffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha384(input: js.typedarray.ArrayBufferView): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha384(input: js.typedarray.ArrayBufferView, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def sha384(input: js.typedarray.ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha384(input: js.typedarray.ArrayBuffer, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def sha384(input: js.typedarray.ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def sha512(input: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha512(input: String, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def sha512(input: String, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha512(input: js.typedarray.ArrayBuffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha512(input: js.typedarray.ArrayBufferView): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha512(input: js.typedarray.ArrayBufferView, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def sha512(input: js.typedarray.ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha512(input: js.typedarray.ArrayBuffer, options: OptionBufferOutput): js.Promise[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  inline def sha512(input: js.typedarray.ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait OptionBufferOutput extends StObject {
    
    var outputFormat: buffer
  }
  object OptionBufferOutput {
    
    inline def apply(): OptionBufferOutput = {
      val __obj = js.Dynamic.literal(outputFormat = "buffer")
      __obj.asInstanceOf[OptionBufferOutput]
    }
    
    extension [Self <: OptionBufferOutput](x: Self) {
      
      inline def setOutputFormat(value: buffer): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsHexOutput extends StObject {
    
    var outputFormat: js.UndefOr[hex] = js.undefined
  }
  object OptionsHexOutput {
    
    inline def apply(): OptionsHexOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsHexOutput]
    }
    
    extension [Self <: OptionsHexOutput](x: Self) {
      
      inline def setOutputFormat(value: hex): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    }
  }
}
