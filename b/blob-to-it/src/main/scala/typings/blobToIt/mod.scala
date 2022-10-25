package typings.blobToIt

import typings.std.AsyncIterable
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blob-to-it", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(blob: Blob): AsyncIterable[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(blob.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
}
