package typings.cypress.MochaNs.reportersNs.ProgressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReporterOptions extends js.Object {
  var close: js.UndefOr[String] = js.undefined
  var complete: js.UndefOr[String] = js.undefined
  var incomplete: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object ReporterOptions {
  @scala.inline
  def apply(
    close: String = null,
    complete: String = null,
    incomplete: String = null,
    open: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): ReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (incomplete != null) __obj.updateDynamic("incomplete")(incomplete)
    if (open != null) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[ReporterOptions]
  }
}

