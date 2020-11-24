package typings.blobToIt

import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blob-to-it/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * @param {Blob} blob
    * @returns {AsyncIterable<Uint8Array>}
    */
  def apply(blob: Blob): AsyncIterable[Uint8Array] = js.native
}
