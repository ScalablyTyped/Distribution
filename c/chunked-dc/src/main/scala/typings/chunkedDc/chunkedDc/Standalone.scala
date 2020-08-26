package typings.chunkedDc.chunkedDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** main.ts **/
@js.native
trait Standalone extends js.Object {
  var Chunker: ChunkerStatic = js.native
  var Unchunker: UnchunkerStatic = js.native
}

object Standalone {
  @scala.inline
  def apply(Chunker: ChunkerStatic, Unchunker: UnchunkerStatic): Standalone = {
    val __obj = js.Dynamic.literal(Chunker = Chunker.asInstanceOf[js.Any], Unchunker = Unchunker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standalone]
  }
  @scala.inline
  implicit class StandaloneOps[Self <: Standalone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChunker(value: ChunkerStatic): Self = this.set("Chunker", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnchunker(value: UnchunkerStatic): Self = this.set("Unchunker", value.asInstanceOf[js.Any])
  }
  
}

