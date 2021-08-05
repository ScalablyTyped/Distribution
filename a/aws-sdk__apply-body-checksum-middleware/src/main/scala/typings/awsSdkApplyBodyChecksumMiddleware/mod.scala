package typings.awsSdkApplyBodyChecksumMiddleware

import typings.awsSdkApplyBodyChecksumMiddleware.anon.Instantiable
import typings.awsSdkTypes.cryptoMod.StreamHasher
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/apply-body-checksum-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyBodyChecksumMiddleware[StreamType](headerName: String, hashCtor: Instantiable, encoder: Encoder): BuildMiddleware[js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBodyChecksumMiddleware")(headerName.asInstanceOf[js.Any], hashCtor.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any])).asInstanceOf[BuildMiddleware[js.Any, js.Any]]
  inline def applyBodyChecksumMiddleware[StreamType](
    headerName: String,
    hashCtor: Instantiable,
    encoder: Encoder,
    streamHasher: StreamHasher[StreamType]
  ): BuildMiddleware[js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBodyChecksumMiddleware")(headerName.asInstanceOf[js.Any], hashCtor.asInstanceOf[js.Any], encoder.asInstanceOf[js.Any], streamHasher.asInstanceOf[js.Any])).asInstanceOf[BuildMiddleware[js.Any, js.Any]]
}
