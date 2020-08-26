package typings.cwiseCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffsetArg extends ArgType {
  var array: Double = js.native
  var offset: js.Array[Double] = js.native
}

object OffsetArg {
  @scala.inline
  def apply(array: Double, offset: js.Array[Double]): OffsetArg = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetArg]
  }
  @scala.inline
  implicit class OffsetArgOps[Self <: OffsetArg] (val x: Self) extends AnyVal {
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
    def setArray(value: Double): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
  
}

