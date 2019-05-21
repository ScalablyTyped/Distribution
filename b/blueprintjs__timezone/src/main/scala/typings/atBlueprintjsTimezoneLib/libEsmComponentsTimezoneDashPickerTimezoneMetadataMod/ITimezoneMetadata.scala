package typings
package atBlueprintjsTimezoneLib.libEsmComponentsTimezoneDashPickerTimezoneMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimezoneMetadata extends js.Object {
  var abbreviation: js.UndefOr[java.lang.String] = js.undefined
  var offset: scala.Double
  var offsetAsString: java.lang.String
  var population: js.UndefOr[scala.Double] = js.undefined
  var timezone: java.lang.String
}

object ITimezoneMetadata {
  @scala.inline
  def apply(
    offset: scala.Double,
    offsetAsString: java.lang.String,
    timezone: java.lang.String,
    abbreviation: java.lang.String = null,
    population: scala.Int | scala.Double = null
  ): ITimezoneMetadata = {
    val __obj = js.Dynamic.literal(offset = offset, offsetAsString = offsetAsString, timezone = timezone)
    if (abbreviation != null) __obj.updateDynamic("abbreviation")(abbreviation)
    if (population != null) __obj.updateDynamic("population")(population.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimezoneMetadata]
  }
}

