package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatches extends js.Object {
  var matches: js.UndefOr[js.Array[String]] = js.undefined
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonMatches {
  @scala.inline
  def apply(matches: js.Array[String] = null, permissions: js.Array[String] = null): AnonMatches = {
    val __obj = js.Dynamic.literal()
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatches]
  }
}

