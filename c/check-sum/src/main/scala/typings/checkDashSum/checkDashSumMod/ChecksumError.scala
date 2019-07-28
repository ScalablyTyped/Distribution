package typings.checkDashSum.checkDashSumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksumError extends js.Object {
  var actual: String
  var algorithm: String
  var expected: String
}

object ChecksumError {
  @scala.inline
  def apply(actual: String, algorithm: String, expected: String): ChecksumError = {
    val __obj = js.Dynamic.literal(actual = actual, algorithm = algorithm, expected = expected)
  
    __obj.asInstanceOf[ChecksumError]
  }
}

