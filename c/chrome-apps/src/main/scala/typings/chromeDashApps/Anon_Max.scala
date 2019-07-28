package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.tls1
import typings.chromeDashApps.chromeDashAppsStrings.tls1DOT1
import typings.chromeDashApps.chromeDashAppsStrings.tls1DOT2
import typings.chromeDashApps.chromeDashAppsStrings.tls1DOT3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends js.Object {
  var max: js.UndefOr[tls1 | tls1DOT1 | tls1DOT2 | tls1DOT3] = js.undefined
  var min: js.UndefOr[tls1 | tls1DOT1 | tls1DOT2 | tls1DOT3] = js.undefined
}

object Anon_Max {
  @scala.inline
  def apply(
    max: tls1 | tls1DOT1 | tls1DOT2 | tls1DOT3 = null,
    min: tls1 | tls1DOT1 | tls1DOT2 | tls1DOT3 = null
  ): Anon_Max = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Max]
  }
}

