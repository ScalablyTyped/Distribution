package typings.atBlueprintjsTimezone.libEsmComponentsTimezoneDashPickerTimezoneMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimezoneMetadata extends js.Object {
  var abbreviation: js.UndefOr[String] = js.undefined
  var offset: Double
  var offsetAsString: String
  var population: js.UndefOr[Double] = js.undefined
  var timezone: String
}

object ITimezoneMetadata {
  @scala.inline
  def apply(
    offset: Double,
    offsetAsString: String,
    timezone: String,
    abbreviation: String = null,
    population: Int | Double = null
  ): ITimezoneMetadata = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], offsetAsString = offsetAsString.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    if (abbreviation != null) __obj.updateDynamic("abbreviation")(abbreviation.asInstanceOf[js.Any])
    if (population != null) __obj.updateDynamic("population")(population.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimezoneMetadata]
  }
}

