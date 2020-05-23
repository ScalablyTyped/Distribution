package typings.cardValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait validExpirationDate extends valid {
  var month: String | Null
  var year: String | Null
}

object validExpirationDate {
  @scala.inline
  def apply(isPotentiallyValid: Boolean, isValid: Boolean, month: String = null, year: String = null): validExpirationDate = {
    val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[validExpirationDate]
  }
}

