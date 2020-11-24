package typings.awsSdkMiddlewareSdkGlacier.configurationsMod

import typings.awsSdkMiddlewareSdkGlacier.anon.Sha256
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.httpMod.HttpRequest
import typings.awsSdkTypes.utilMod.Decoder
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedGlacierMiddlewareConfig extends js.Object {
  
  var apiVersion: String = js.native
  
  def bodyChecksumGenerator(request: HttpRequest, Options: Sha256): js.Promise[js.Tuple2[String, String]] = js.native
  
  var sha256: HashConstructor = js.native
  
  def utf8Decoder(input: String): Uint8Array = js.native
  @JSName("utf8Decoder")
  var utf8Decoder_Original: Decoder = js.native
}
