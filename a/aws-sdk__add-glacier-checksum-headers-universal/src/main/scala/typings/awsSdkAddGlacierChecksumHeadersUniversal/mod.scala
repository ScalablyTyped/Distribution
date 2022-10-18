package typings.awsSdkAddGlacierChecksumHeadersUniversal

import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildMiddleware
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/add-glacier-checksum-headers-universal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): BuildMiddleware[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("addChecksumHeaders")(Sha256.asInstanceOf[js.Any], fromUtf8.asInstanceOf[js.Any])).asInstanceOf[BuildMiddleware[Any, Any]]
}
