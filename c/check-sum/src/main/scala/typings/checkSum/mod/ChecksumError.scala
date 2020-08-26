package typings.checkSum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksumError extends js.Object {
  var actual: String = js.native
  var algorithm: String = js.native
  var expected: String = js.native
}

object ChecksumError {
  @scala.inline
  def apply(actual: String, algorithm: String, expected: String): ChecksumError = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], algorithm = algorithm.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksumError]
  }
  @scala.inline
  implicit class ChecksumErrorOps[Self <: ChecksumError] (val x: Self) extends AnyVal {
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
    def setActual(value: String): Self = this.set("actual", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpected(value: String): Self = this.set("expected", value.asInstanceOf[js.Any])
  }
  
}

