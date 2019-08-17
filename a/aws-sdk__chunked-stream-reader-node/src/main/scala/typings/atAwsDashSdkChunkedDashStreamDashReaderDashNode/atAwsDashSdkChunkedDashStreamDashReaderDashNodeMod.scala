package typings.atAwsDashSdkChunkedDashStreamDashReaderDashNode

import typings.node.streamMod.Readable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/chunked-stream-reader-node", JSImport.Namespace)
@js.native
object atAwsDashSdkChunkedDashStreamDashReaderDashNodeMod extends js.Object {
  def streamReader(stream: Readable, onChunk: js.Function1[/* chunk */ Uint8Array, Unit]): js.Promise[Unit] = js.native
  def streamReader(stream: Readable, onChunk: js.Function1[/* chunk */ Uint8Array, Unit], chunkSize: Double): js.Promise[Unit] = js.native
}

