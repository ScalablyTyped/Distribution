package typings.awsSdkAddGlacierChecksumHeadersUniversal

import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.utilMod.Decoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/add-glacier-checksum-headers-universal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): BuildMiddleware[_, _] = js.native
}
