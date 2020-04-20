package typings.checkSum.mod

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
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], algorithm = algorithm.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksumError]
  }
}

