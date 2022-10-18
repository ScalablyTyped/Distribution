package typings.awsSdkSsecMiddleware

import typings.awsSdkSsecMiddleware.anon.Instantiable
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import typings.awsSdkTypes.distTypesUtilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/ssec-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ssecMiddleware[Input /* <: js.Object */](hasUtf8DecoderBase64EncoderHashConstructorSsecProperties: SsecMiddlewareConfiguration[Input]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ssecMiddleware")(hasUtf8DecoderBase64EncoderHashConstructorSsecProperties.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait SsecMiddlewareConfiguration[Input /* <: js.Object */] extends StObject {
    
    def base64Encoder(input: js.typedarray.Uint8Array): String
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder
    
    var hashConstructor: Instantiable
    
    var ssecProperties: SsecPropertiesConfiguration[Input]
    
    def utf8Decoder(input: String): js.typedarray.Uint8Array
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder
  }
  object SsecMiddlewareConfiguration {
    
    inline def apply[Input /* <: js.Object */](
      base64Encoder: /* input */ js.typedarray.Uint8Array => String,
      hashConstructor: Instantiable,
      ssecProperties: SsecPropertiesConfiguration[Input],
      utf8Decoder: /* input */ String => js.typedarray.Uint8Array
    ): SsecMiddlewareConfiguration[Input] = {
      val __obj = js.Dynamic.literal(base64Encoder = js.Any.fromFunction1(base64Encoder), hashConstructor = hashConstructor.asInstanceOf[js.Any], ssecProperties = ssecProperties.asInstanceOf[js.Any], utf8Decoder = js.Any.fromFunction1(utf8Decoder))
      __obj.asInstanceOf[SsecMiddlewareConfiguration[Input]]
    }
    
    extension [Self <: SsecMiddlewareConfiguration[?], Input /* <: js.Object */](x: Self & SsecMiddlewareConfiguration[Input]) {
      
      inline def setBase64Encoder(value: /* input */ js.typedarray.Uint8Array => String): Self = StObject.set(x, "base64Encoder", js.Any.fromFunction1(value))
      
      inline def setHashConstructor(value: Instantiable): Self = StObject.set(x, "hashConstructor", value.asInstanceOf[js.Any])
      
      inline def setSsecProperties(value: SsecPropertiesConfiguration[Input]): Self = StObject.set(x, "ssecProperties", value.asInstanceOf[js.Any])
      
      inline def setUtf8Decoder(value: /* input */ String => js.typedarray.Uint8Array): Self = StObject.set(x, "utf8Decoder", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ sourceProperty in keyof Input ]:? {  targetProperty :string,   hashTargetProperty :string}}
    }}}
    */
  @js.native
  trait SsecPropertiesConfiguration[Input /* <: js.Object */] extends StObject
}
