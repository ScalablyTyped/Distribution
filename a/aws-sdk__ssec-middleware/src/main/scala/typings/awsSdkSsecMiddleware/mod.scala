package typings.awsSdkSsecMiddleware

import org.scalablytyped.runtime.TopLevel
import typings.awsSdkSsecMiddleware.anon.Instantiable
import typings.awsSdkTypes.utilMod.Decoder
import typings.awsSdkTypes.utilMod.Encoder
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/ssec-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def ssecMiddleware[Input /* <: js.Object */](hasUtf8DecoderBase64EncoderHashConstructorSsecProperties: SsecMiddlewareConfiguration[Input]): js.Any = js.native
  
  @js.native
  trait SsecMiddlewareConfiguration[Input /* <: js.Object */] extends js.Object {
    
    def base64Encoder(input: Uint8Array): String = js.native
    @JSName("base64Encoder")
    var base64Encoder_Original: Encoder = js.native
    
    var hashConstructor: Instantiable = js.native
    
    var ssecProperties: SsecPropertiesConfiguration[Input] = js.native
    
    def utf8Decoder(input: String): Uint8Array = js.native
    @JSName("utf8Decoder")
    var utf8Decoder_Original: Decoder = js.native
  }
  
  type SsecPropertiesConfiguration[Input /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ sourceProperty in keyof Input ]:? {  targetProperty :string,   hashTargetProperty :string}}
    */ typings.awsSdkSsecMiddleware.awsSdkSsecMiddlewareStrings.SsecPropertiesConfiguration with TopLevel[js.Any]
}
