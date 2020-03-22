package typings.awsSdkApplyBodyChecksumMiddleware

import typings.awsSdkTypes.cryptoMod.StreamHasher
import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import typings.awsSdkTypes.utilMod.Encoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/apply-body-checksum-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def applyBodyChecksumMiddleware[StreamType](headerName: String, hashCtor: AnonInstantiable, encoder: Encoder): BuildMiddleware[_, _, StreamType] = js.native
  def applyBodyChecksumMiddleware[StreamType](
    headerName: String,
    hashCtor: AnonInstantiable,
    encoder: Encoder,
    streamHasher: StreamHasher[StreamType]
  ): BuildMiddleware[_, _, StreamType] = js.native
}

