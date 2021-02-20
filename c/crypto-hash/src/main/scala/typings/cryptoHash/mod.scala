package typings.cryptoHash

import typings.cryptoHash.cryptoHashStrings.buffer
import typings.cryptoHash.cryptoHashStrings.hex
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("crypto-hash", "sha1")
  @js.native
  def sha1(input: String): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha1")
  @js.native
  def sha1(input: String, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  @JSImport("crypto-hash", "sha1")
  @js.native
  def sha1(input: String, options: OptionsHexOutput): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha1")
  @js.native
  def sha1(input: ArrayBuffer): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha1")
  @js.native
  def sha1(input: ArrayBufferView): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha1")
  @js.native
  def sha1(input: ArrayBufferView, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  @JSImport("crypto-hash", "sha1")
  @js.native
  def sha1(input: ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha1")
  @js.native
  def sha1(input: ArrayBuffer, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  @JSImport("crypto-hash", "sha1")
  @js.native
  def sha1(input: ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = js.native
  
  @JSImport("crypto-hash", "sha256")
  @js.native
  def sha256(input: String): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha256")
  @js.native
  def sha256(input: String, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  @JSImport("crypto-hash", "sha256")
  @js.native
  def sha256(input: String, options: OptionsHexOutput): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha256")
  @js.native
  def sha256(input: ArrayBuffer): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha256")
  @js.native
  def sha256(input: ArrayBufferView): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha256")
  @js.native
  def sha256(input: ArrayBufferView, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  @JSImport("crypto-hash", "sha256")
  @js.native
  def sha256(input: ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha256")
  @js.native
  def sha256(input: ArrayBuffer, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  @JSImport("crypto-hash", "sha256")
  @js.native
  def sha256(input: ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = js.native
  
  @JSImport("crypto-hash", "sha384")
  @js.native
  def sha384(input: String): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha384")
  @js.native
  def sha384(input: String, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  @JSImport("crypto-hash", "sha384")
  @js.native
  def sha384(input: String, options: OptionsHexOutput): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha384")
  @js.native
  def sha384(input: ArrayBuffer): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha384")
  @js.native
  def sha384(input: ArrayBufferView): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha384")
  @js.native
  def sha384(input: ArrayBufferView, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  @JSImport("crypto-hash", "sha384")
  @js.native
  def sha384(input: ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha384")
  @js.native
  def sha384(input: ArrayBuffer, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  @JSImport("crypto-hash", "sha384")
  @js.native
  def sha384(input: ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = js.native
  
  @JSImport("crypto-hash", "sha512")
  @js.native
  def sha512(input: String): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha512")
  @js.native
  def sha512(input: String, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  @JSImport("crypto-hash", "sha512")
  @js.native
  def sha512(input: String, options: OptionsHexOutput): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha512")
  @js.native
  def sha512(input: ArrayBuffer): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha512")
  @js.native
  def sha512(input: ArrayBufferView): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha512")
  @js.native
  def sha512(input: ArrayBufferView, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  @JSImport("crypto-hash", "sha512")
  @js.native
  def sha512(input: ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = js.native
  @JSImport("crypto-hash", "sha512")
  @js.native
  def sha512(input: ArrayBuffer, options: OptionBufferOutput): js.Promise[ArrayBuffer] = js.native
  @JSImport("crypto-hash", "sha512")
  @js.native
  def sha512(input: ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = js.native
  
  @js.native
  trait OptionBufferOutput extends StObject {
    
    var outputFormat: buffer = js.native
  }
  object OptionBufferOutput {
    
    @scala.inline
    def apply(outputFormat: buffer): OptionBufferOutput = {
      val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionBufferOutput]
    }
    
    @scala.inline
    implicit class OptionBufferOutputMutableBuilder[Self <: OptionBufferOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutputFormat(value: buffer): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionsHexOutput extends StObject {
    
    var outputFormat: js.UndefOr[hex] = js.native
  }
  object OptionsHexOutput {
    
    @scala.inline
    def apply(): OptionsHexOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsHexOutput]
    }
    
    @scala.inline
    implicit class OptionsHexOutputMutableBuilder[Self <: OptionsHexOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutputFormat(value: hex): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    }
  }
}
