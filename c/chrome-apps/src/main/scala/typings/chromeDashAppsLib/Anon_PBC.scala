package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PBC extends js.Object {
  var PBC: chromeDashAppsLib.chromeDashAppsLibStrings.PBC
  var PIN: chromeDashAppsLib.chromeDashAppsLibStrings.PIN
}

object Anon_PBC {
  @scala.inline
  def apply(
    PBC: chromeDashAppsLib.chromeDashAppsLibStrings.PBC,
    PIN: chromeDashAppsLib.chromeDashAppsLibStrings.PIN
  ): Anon_PBC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PBC")(PBC)
    __obj.updateDynamic("PIN")(PIN)
    __obj.asInstanceOf[Anon_PBC]
  }
}

