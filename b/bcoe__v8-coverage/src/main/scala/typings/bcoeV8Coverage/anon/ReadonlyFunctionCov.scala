package typings.bcoeV8Coverage.anon

import typings.bcoeV8Coverage.typesMod.RangeCov
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.FunctionCov> */
@js.native
trait ReadonlyFunctionCov extends js.Object {
  val functionName: String = js.native
  val isBlockCoverage: Boolean = js.native
  val ranges: js.Array[RangeCov] = js.native
}

object ReadonlyFunctionCov {
  @scala.inline
  def apply(functionName: String, isBlockCoverage: Boolean, ranges: js.Array[RangeCov]): ReadonlyFunctionCov = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], isBlockCoverage = isBlockCoverage.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyFunctionCov]
  }
  @scala.inline
  implicit class ReadonlyFunctionCovOps[Self <: ReadonlyFunctionCov] (val x: Self) extends AnyVal {
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

