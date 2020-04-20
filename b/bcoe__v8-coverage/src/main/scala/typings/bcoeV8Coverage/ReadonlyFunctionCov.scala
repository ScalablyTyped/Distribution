package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.typesMod.RangeCov
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.FunctionCov> */
trait ReadonlyFunctionCov extends js.Object {
  val functionName: String
  val isBlockCoverage: Boolean
  val ranges: js.Array[RangeCov]
}

object ReadonlyFunctionCov {
  @scala.inline
  def apply(functionName: String, isBlockCoverage: Boolean, ranges: js.Array[RangeCov]): ReadonlyFunctionCov = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], isBlockCoverage = isBlockCoverage.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyFunctionCov]
  }
}

