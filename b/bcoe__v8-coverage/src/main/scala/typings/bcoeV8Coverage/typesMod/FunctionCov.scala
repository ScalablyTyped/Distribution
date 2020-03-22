package typings.bcoeV8Coverage.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCov extends js.Object {
  var functionName: String
  var isBlockCoverage: Boolean
  var ranges: js.Array[RangeCov]
}

object FunctionCov {
  @scala.inline
  def apply(functionName: String, isBlockCoverage: Boolean, ranges: js.Array[RangeCov]): FunctionCov = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], isBlockCoverage = isBlockCoverage.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FunctionCov]
  }
}

