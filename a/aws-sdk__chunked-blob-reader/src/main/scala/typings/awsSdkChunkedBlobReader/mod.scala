package typings.awsSdkChunkedBlobReader

import typings.std.Blob
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/chunked-blob-reader", "blobReader")
  @js.native
  def blobReader(blob: Blob, onChunk: js.Function1[/* chunk */ Uint8Array, Unit]): js.Promise[Unit] = js.native
  @JSImport("@aws-sdk/chunked-blob-reader", "blobReader")
  @js.native
  def blobReader(blob: Blob, onChunk: js.Function1[/* chunk */ Uint8Array, Unit], chunkSize: Double): js.Promise[Unit] = js.native
}
