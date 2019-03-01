package typings
package checkDashSumLib.checkDashSumMod.checksumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksumError extends js.Object {
  var actual: java.lang.String
  var algorithm: java.lang.String
  var expected: java.lang.String
}

object ChecksumError {
  @scala.inline
  def apply(actual: java.lang.String, algorithm: java.lang.String, expected: java.lang.String): ChecksumError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actual")(actual)
    __obj.updateDynamic("algorithm")(algorithm)
    __obj.updateDynamic("expected")(expected)
    __obj.asInstanceOf[ChecksumError]
  }
}

