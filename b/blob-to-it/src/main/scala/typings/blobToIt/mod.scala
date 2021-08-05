package typings.blobToIt

import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param {Blob} blob
    * @returns {AsyncIterable<Uint8Array>}
    */
  inline def apply(blob: Blob): AsyncIterable[Uint8Array] = ^.asInstanceOf[js.Dynamic].apply(blob.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[Uint8Array]]
  
  @JSImport("blob-to-it/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
