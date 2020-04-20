package typings.cwiseCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetArg extends ArgType {
  var array: Double
  var offset: js.Array[Double]
}

object OffsetArg {
  @scala.inline
  def apply(array: Double, offset: js.Array[Double]): OffsetArg = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetArg]
  }
}

