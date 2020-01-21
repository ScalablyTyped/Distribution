package typings.awsSdkChunkedBlobReader

import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/chunked-blob-reader", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def blobReader(blob: Blob, onChunk: js.Function1[/* chunk */ Uint8Array, Unit]): js.Promise[Unit] = js.native
  def blobReader(blob: Blob, onChunk: js.Function1[/* chunk */ Uint8Array, Unit], chunkSize: Double): js.Promise[Unit] = js.native
}

