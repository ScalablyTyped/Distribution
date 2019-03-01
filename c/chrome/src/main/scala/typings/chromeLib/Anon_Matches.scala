package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Matches extends js.Object {
  var matches: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Matches {
  @scala.inline
  def apply(matches: js.Array[java.lang.String] = null, permissions: js.Array[java.lang.String] = null): Anon_Matches = {
    val __obj = js.Dynamic.literal()
    if (matches != null) __obj.updateDynamic("matches")(matches)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[Anon_Matches]
  }
}

