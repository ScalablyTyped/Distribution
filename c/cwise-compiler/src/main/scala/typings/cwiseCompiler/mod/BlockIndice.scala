package typings.cwiseCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockIndice extends ArgType {
  var blockIndices: Double = js.native
}

object BlockIndice {
  @scala.inline
  def apply(blockIndices: Double): BlockIndice = {
    val __obj = js.Dynamic.literal(blockIndices = blockIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockIndice]
  }
  @scala.inline
  implicit class BlockIndiceOps[Self <: BlockIndice] (val x: Self) extends AnyVal {
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
    def setBlockIndices(value: Double): Self = this.set("blockIndices", value.asInstanceOf[js.Any])
  }
  
}

