package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ADAPTIVE extends js.Object {
  var ADAPTIVE: chromeDashAppsLib.chromeDashAppsLibStrings.adaptive
  var ASYNCHRONOUS: chromeDashAppsLib.chromeDashAppsLibStrings.asynchronous
  var SYNCHRONOUS: chromeDashAppsLib.chromeDashAppsLibStrings.synchronous
}

object Anon_ADAPTIVE {
  @scala.inline
  def apply(
    ADAPTIVE: chromeDashAppsLib.chromeDashAppsLibStrings.adaptive,
    ASYNCHRONOUS: chromeDashAppsLib.chromeDashAppsLibStrings.asynchronous,
    SYNCHRONOUS: chromeDashAppsLib.chromeDashAppsLibStrings.synchronous
  ): Anon_ADAPTIVE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADAPTIVE")(ADAPTIVE)
    __obj.updateDynamic("ASYNCHRONOUS")(ASYNCHRONOUS)
    __obj.updateDynamic("SYNCHRONOUS")(SYNCHRONOUS)
    __obj.asInstanceOf[Anon_ADAPTIVE]
  }
}

