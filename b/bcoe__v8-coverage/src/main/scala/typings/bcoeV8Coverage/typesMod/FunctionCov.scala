package typings.bcoeV8Coverage.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionCov extends js.Object {
  var functionName: String = js.native
  var isBlockCoverage: Boolean = js.native
  var ranges: js.Array[RangeCov] = js.native
}

object FunctionCov {
  @scala.inline
  def apply(functionName: String, isBlockCoverage: Boolean, ranges: js.Array[RangeCov]): FunctionCov = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], isBlockCoverage = isBlockCoverage.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCov]
  }
  @scala.inline
  implicit class FunctionCovOps[Self <: FunctionCov] (val x: Self) extends AnyVal {
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
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBlockCoverage(value: Boolean): Self = this.set("isBlockCoverage", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangesVarargs(value: RangeCov*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[RangeCov]): Self = this.set("ranges", value.asInstanceOf[js.Any])
  }
  
}

