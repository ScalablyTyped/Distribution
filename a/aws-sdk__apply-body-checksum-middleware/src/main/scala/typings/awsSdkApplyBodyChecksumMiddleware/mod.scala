package typings.awsSdkApplyBodyChecksumMiddleware

import typings.awsSdkApplyBodyChecksumMiddleware.anon.Instantiable
import typings.awsSdkTypes.cryptoMod.StreamHasher
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.utilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/apply-body-checksum-middleware", "applyBodyChecksumMiddleware")
  @js.native
  def applyBodyChecksumMiddleware[StreamType](headerName: String, hashCtor: Instantiable, encoder: Encoder): BuildMiddleware[_, _] = js.native
  @JSImport("@aws-sdk/apply-body-checksum-middleware", "applyBodyChecksumMiddleware")
  @js.native
  def applyBodyChecksumMiddleware[StreamType](
    headerName: String,
    hashCtor: Instantiable,
    encoder: Encoder,
    streamHasher: StreamHasher[StreamType]
  ): BuildMiddleware[_, _] = js.native
}
