package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAt extends js.Object {
  var at: js.UndefOr[Double] = js.undefined
  var next: String
}

object AnonAt {
  @scala.inline
  def apply(next: String, at: Int | Double = null): AnonAt = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAt]
  }
}

