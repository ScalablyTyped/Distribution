package typings.cypress

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bail extends js.Object {
  var bail: js.UndefOr[Boolean] = js.undefined
  var grep: js.UndefOr[RegExp] = js.undefined
  var reporter: js.UndefOr[String | ReporterConstructor] = js.undefined
  var reporterOptions: js.UndefOr[js.Any] = js.undefined
  var slow: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var ui: js.UndefOr[String] = js.undefined
}

object Anon_Bail {
  @scala.inline
  def apply(
    bail: js.UndefOr[Boolean] = js.undefined,
    grep: RegExp = null,
    reporter: String | ReporterConstructor = null,
    reporterOptions: js.Any = null,
    slow: Int | Double = null,
    timeout: Int | Double = null,
    ui: String = null
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

