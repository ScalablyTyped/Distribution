package typings.cryptoHash

import typings.cryptoHash.cryptoHashStrings.buffer
import typings.cryptoHash.cryptoHashStrings.hex
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("crypto-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sha1(input: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha1(input: String, options: OptionBufferOutput): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def sha1(input: String, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha1(input: ArrayBuffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha1(input: ArrayBufferView): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha1(input: ArrayBufferView, options: OptionBufferOutput): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def sha1(input: ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha1(input: ArrayBuffer, options: OptionBufferOutput): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def sha1(input: ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def sha256(input: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha256(input: String, options: OptionBufferOutput): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def sha256(input: String, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha256(input: ArrayBuffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha256(input: ArrayBufferView): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha256(input: ArrayBufferView, options: OptionBufferOutput): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def sha256(input: ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha256(input: ArrayBuffer, options: OptionBufferOutput): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def sha256(input: ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def sha384(input: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha384(input: String, options: OptionBufferOutput): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def sha384(input: String, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha384(input: ArrayBuffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha384(input: ArrayBufferView): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha384(input: ArrayBufferView, options: OptionBufferOutput): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def sha384(input: ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha384(input: ArrayBuffer, options: OptionBufferOutput): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def sha384(input: ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha384")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def sha512(input: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha512(input: String, options: OptionBufferOutput): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def sha512(input: String, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha512(input: ArrayBuffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha512(input: ArrayBufferView): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def sha512(input: ArrayBufferView, options: OptionBufferOutput): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def sha512(input: ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def sha512(input: ArrayBuffer, options: OptionBufferOutput): js.Promise[ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArrayBuffer]]
  inline def sha512(input: ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
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
