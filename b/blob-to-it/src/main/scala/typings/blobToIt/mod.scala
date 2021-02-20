package typings.blobToIt

import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param {Blob} blob
    * @returns {AsyncIterable<Uint8Array>}
    */
  @JSImport("blob-to-it/dist", JSImport.Namespace)
  @js.native
  def apply(blob: Blob): AsyncIterable[Uint8Array] = js.native
}
