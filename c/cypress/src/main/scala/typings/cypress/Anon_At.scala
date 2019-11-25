package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_At extends js.Object {
  var at: js.UndefOr[Double] = js.undefined
  var next: String
}

object Anon_At {
  @scala.inline
  def apply(next: String, at: Int | Double = null): Anon_At = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_At]
  }
}

