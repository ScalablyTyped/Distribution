package typings.consola.mod

import typings.node.utilMod.InspectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyReporterOptions extends BasicReporterOptions {
  var secondaryColor: js.UndefOr[String] = js.undefined
}

object FancyReporterOptions {
  @scala.inline
  def apply(dateFormat: String = null, formatOptions: InspectOptions = null, secondaryColor: String = null): FancyReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (formatOptions != null) __obj.updateDynamic("formatOptions")(formatOptions.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyReporterOptions]
  }
}

