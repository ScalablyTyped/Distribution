package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Matches extends js.Object {
  var matches: js.UndefOr[js.Array[String]] = js.undefined
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Matches {
  @scala.inline
  def apply(matches: js.Array[String] = null, permissions: js.Array[String] = null): Anon_Matches = {
    val __obj = js.Dynamic.literal()
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Matches]
  }
}

