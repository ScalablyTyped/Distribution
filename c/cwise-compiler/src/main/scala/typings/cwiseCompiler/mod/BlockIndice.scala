package typings.cwiseCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockIndice extends ArgType {
  var blockIndices: Double
}

object BlockIndice {
  @scala.inline
  def apply(blockIndices: Double): BlockIndice = {
    val __obj = js.Dynamic.literal(blockIndices = blockIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockIndice]
  }
}

