package typings.dateIoDateFns

import typings.dateIoDateFns.dateFnsUtilsMod.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormats extends js.Object {
  var formats: js.UndefOr[PartialDateIOFormatsstrin] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
}

object AnonFormats {
  @scala.inline
  def apply(formats: PartialDateIOFormatsstrin = null, locale: Locale = null): AnonFormats = {
    val __obj = js.Dynamic.literal()
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormats]
  }
}

