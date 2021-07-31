package typings.awsSdkAddGlacierChecksumHeadersUniversal

import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.utilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/add-glacier-checksum-headers-universal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): BuildMiddleware[js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("addChecksumHeaders")(Sha256.asInstanceOf[js.Any], fromUtf8.asInstanceOf[js.Any])).asInstanceOf[BuildMiddleware[js.Any, js.Any]]
}
