package typings.chunkedDc.chunkedDc

import typings.std.IterableIterator
import typings.std.IteratorResult
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** chunker.ts **/
@js.native
trait Chunker extends IterableIterator[Uint8Array] {
  var hasNext: Boolean = js.native
  def next(): IteratorResult[Uint8Array, _] = js.native
}

