package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BULK extends js.Object {
  var BULK: chromeDashAppsLib.chromeDashAppsLibStrings.bulk
  var CONTROL: chromeDashAppsLib.chromeDashAppsLibStrings.control
  var INTERRUPT: chromeDashAppsLib.chromeDashAppsLibStrings.interrupt
  var ISOCHRONOUS: chromeDashAppsLib.chromeDashAppsLibStrings.isochronous
}

object Anon_BULK {
  @scala.inline
  def apply(
    BULK: chromeDashAppsLib.chromeDashAppsLibStrings.bulk,
    CONTROL: chromeDashAppsLib.chromeDashAppsLibStrings.control,
    INTERRUPT: chromeDashAppsLib.chromeDashAppsLibStrings.interrupt,
    ISOCHRONOUS: chromeDashAppsLib.chromeDashAppsLibStrings.isochronous
  ): Anon_BULK = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BULK")(BULK)
    __obj.updateDynamic("CONTROL")(CONTROL)
    __obj.updateDynamic("INTERRUPT")(INTERRUPT)
    __obj.updateDynamic("ISOCHRONOUS")(ISOCHRONOUS)
    __obj.asInstanceOf[Anon_BULK]
  }
}

