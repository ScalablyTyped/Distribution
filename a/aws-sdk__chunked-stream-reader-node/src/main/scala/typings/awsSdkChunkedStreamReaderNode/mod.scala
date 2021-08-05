package typings.awsSdkChunkedStreamReaderNode

import typings.node.streamMod.Readable
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/chunked-stream-reader-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def streamReader(stream: Readable, onChunk: js.Function1[/* chunk */ Uint8Array, Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamReader")(stream.asInstanceOf[js.Any], onChunk.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def streamReader(stream: Readable, onChunk: js.Function1[/* chunk */ Uint8Array, Unit], chunkSize: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamReader")(stream.asInstanceOf[js.Any], onChunk.asInstanceOf[js.Any], chunkSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
