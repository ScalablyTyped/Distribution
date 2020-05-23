package typings.consola.mod

import typings.node.utilMod.InspectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicReporterOptions extends js.Object {
  var dateFormat: js.UndefOr[String] = js.undefined
  var formatOptions: js.UndefOr[InspectOptions] = js.undefined
}

object BasicReporterOptions {
  @scala.inline
  def apply(dateFormat: String = null, formatOptions: InspectOptions = null): BasicReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (formatOptions != null) __obj.updateDynamic("formatOptions")(formatOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicReporterOptions]
  }
}

