package typings.awsSdkSsecMiddleware

import org.scalablytyped.runtime.TopLevel
import typings.awsSdkSsecMiddleware.anon.Instantiable
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/ssec-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ssecMiddleware[Input /* <: js.Object */](hasUtf8DecoderBase64EncoderHashConstructorSsecProperties: SsecMiddlewareConfiguration[Input]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ssecMiddleware")(hasUtf8DecoderBase64EncoderHashConstructorSsecProperties.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait SsecMiddlewareConfiguration[Input /* <: js.Object */] extends StObject {
    
    def base64Encoder(input: Uint8Array): String
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder
    
    var hashConstructor: Instantiable
    
    var ssecProperties: SsecPropertiesConfiguration[Input]
    
    def utf8Decoder(input: String): Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
  }
  object SsecMiddlewareConfiguration {
    
    @scala.inline
    def apply[Input /* <: js.Object */](
      base64Encoder: /* input */ Uint8Array => String,
      hashConstructor: Instantiable,
      ssecProperties: SsecPropertiesConfiguration[Input],
      utf8Decoder: /* input */ String => Uint8Array
    ): SsecMiddlewareConfiguration[Input] = {
      val __obj = js.Dynamic.literal(base64Encoder = js.Any.fromFunction1(base64Encoder), hashConstructor = hashConstructor.asInstanceOf[js.Any], ssecProperties = ssecProperties.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
      __obj.asInstanceOf[SsecMiddlewareConfiguration[Input]]
    }
    
    @scala.inline
    implicit class SsecMiddlewareConfigurationMutableBuilder[Self <: SsecMiddlewareConfiguration[?], Input /* <: js.Object */] (val x: Self & SsecMiddlewareConfiguration[Input]) extends AnyVal {
      
      @scala.inline
      def setBase64Encoder(value: /* input */ Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHashConstructor(value: Instantiable): Self = StObject.set(x, "hashConstructor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsecProperties(value: SsecPropertiesConfiguration[Input]): Self = StObject.set(x, "ssecProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtf8Decoder(value: /* input */ String => Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
    }
  }
  
  type SsecPropertiesConfiguration[Input /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ sourceProperty in keyof Input ]:? {  targetProperty :string,   hashTargetProperty :string}}
    */ typings.awsSdkSsecMiddleware.awsSdkSsecMiddlewareStrings.SsecPropertiesConfiguration & TopLevel[js.Any]
}
