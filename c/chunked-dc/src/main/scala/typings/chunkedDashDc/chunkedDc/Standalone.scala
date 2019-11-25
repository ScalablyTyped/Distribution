package typings.chunkedDashDc.chunkedDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** main.ts **/
trait Standalone extends js.Object {
  var Chunker: ChunkerStatic
  var Unchunker: UnchunkerStatic
}

object Standalone {
  @scala.inline
  def apply(Chunker: ChunkerStatic, Unchunker: UnchunkerStatic): Standalone = {
    val __obj = js.Dynamic.literal(Chunker = Chunker.asInstanceOf[js.Any], Unchunker = Unchunker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Standalone]
  }
}

