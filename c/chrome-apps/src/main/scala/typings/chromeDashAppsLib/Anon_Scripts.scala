package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scripts extends js.Object {
  var scripts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Scripts {
  @scala.inline
  def apply(scripts: js.Array[java.lang.String] = null): Anon_Scripts = {
    val __obj = js.Dynamic.literal()
    if (scripts != null) __obj.updateDynamic("scripts")(scripts)
    __obj.asInstanceOf[Anon_Scripts]
  }
}

