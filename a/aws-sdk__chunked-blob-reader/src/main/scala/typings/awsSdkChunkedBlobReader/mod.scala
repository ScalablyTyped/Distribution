package typings.awsSdkChunkedBlobReader

import typings.std.Blob
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/chunked-blob-reader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blobReader(blob: Blob, onChunk: js.Function1[/* chunk */ Uint8Array, Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blobReader")(blob.asInstanceOf[js.Any], onChunk.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def blobReader(blob: Blob, onChunk: js.Function1[/* chunk */ Uint8Array, Unit], chunkSize: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("blobReader")(blob.asInstanceOf[js.Any], onChunk.asInstanceOf[js.Any], chunkSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
