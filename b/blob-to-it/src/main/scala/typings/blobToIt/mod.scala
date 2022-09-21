package typings.blobToIt

import typings.std.AsyncIterable
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param {Blob} blob
    * @returns {AsyncIterable<Uint8Array>}
    */
  inline def apply(blob: Blob): AsyncIterable[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].apply(blob.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[js.typedarray.Uint8Array]]
  
  @JSImport("blob-to-it", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
