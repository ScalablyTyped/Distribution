package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bail extends js.Object {
  var bail: js.UndefOr[scala.Boolean] = js.undefined
  var grep: js.UndefOr[stdLib.RegExp] = js.undefined
  var reporter: js.UndefOr[java.lang.String | ReporterConstructor] = js.undefined
  var reporterOptions: js.UndefOr[js.Any] = js.undefined
  var slow: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var ui: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Bail {
  @scala.inline
  def apply(
    bail: js.UndefOr[scala.Boolean] = js.undefined,
    grep: stdLib.RegExp = null,
    reporter: java.lang.String | ReporterConstructor = null,
    reporterOptions: js.Any = null,
    slow: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    ui: java.lang.String = null
  ): Anon_Bail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail)
    if (grep != null) __obj.updateDynamic("grep")(grep)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (reporterOptions != null) __obj.updateDynamic("reporterOptions")(reporterOptions)
    if (slow != null) __obj.updateDynamic("slow")(slow.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[Anon_Bail]
  }
}

