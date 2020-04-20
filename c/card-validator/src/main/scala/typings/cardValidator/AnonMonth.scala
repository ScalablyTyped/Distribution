package typings.cardValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMonth extends js.Object {
  var month: String
  var year: String
}

object AnonMonth {
  @scala.inline
  def apply(month: String, year: String): AnonMonth = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMonth]
  }
}

