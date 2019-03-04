package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_At extends js.Object {
  var at: js.UndefOr[scala.Double] = js.undefined
  var next: java.lang.String
}

object Anon_At {
  @scala.inline
  def apply(next: java.lang.String, at: scala.Int | scala.Double = null): Anon_At = {
    val __obj = js.Dynamic.literal(next = next)
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_At]
  }
}

