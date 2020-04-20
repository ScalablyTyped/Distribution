package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNextPage extends js.Object {
  var nextPage: Double
  var prevPage: Double
}

object AnonNextPage {
  @scala.inline
  def apply(nextPage: Double, prevPage: Double): AnonNextPage = {
    val __obj = js.Dynamic.literal(nextPage = nextPage.asInstanceOf[js.Any], prevPage = prevPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextPage]
  }
}

