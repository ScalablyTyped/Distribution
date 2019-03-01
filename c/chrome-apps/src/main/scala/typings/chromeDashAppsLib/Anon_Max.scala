package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends js.Object {
  var max: js.UndefOr[
    chromeDashAppsLib.chromeDashAppsLibStrings.tls1 | chromeDashAppsLib.chromeDashAppsLibStrings.tls1DOT1 | chromeDashAppsLib.chromeDashAppsLibStrings.tls1DOT2 | chromeDashAppsLib.chromeDashAppsLibStrings.tls1DOT3
  ] = js.undefined
  var min: js.UndefOr[
    chromeDashAppsLib.chromeDashAppsLibStrings.tls1 | chromeDashAppsLib.chromeDashAppsLibStrings.tls1DOT1 | chromeDashAppsLib.chromeDashAppsLibStrings.tls1DOT2 | chromeDashAppsLib.chromeDashAppsLibStrings.tls1DOT3
  ] = js.undefined
}

object Anon_Max {
  @scala.inline
  def apply(
    max: chromeDashAppsLib.chromeDashAppsLibStrings.tls1 | chromeDashAppsLib.chromeDashAppsLibStrings.tls1DOT1 | chromeDashAppsLib.chromeDashAppsLibStrings.tls1DOT2 | chromeDashAppsLib.chromeDashAppsLibStrings.tls1DOT3 = null,
    min: chromeDashAppsLib.chromeDashAppsLibStrings.tls1 | chromeDashAppsLib.chromeDashAppsLibStrings.tls1DOT1 | chromeDashAppsLib.chromeDashAppsLibStrings.tls1DOT2 | chromeDashAppsLib.chromeDashAppsLibStrings.tls1DOT3 = null
  ): Anon_Max = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Max]
  }
}

