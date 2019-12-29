package typings.atBlueprintjsTimezone

import typings.atBlueprintjsTimezone.atBlueprintjsTimezoneStrings.abbreviation
import typings.atBlueprintjsTimezone.atBlueprintjsTimezoneStrings.composite
import typings.atBlueprintjsTimezone.atBlueprintjsTimezoneStrings.name
import typings.atBlueprintjsTimezone.atBlueprintjsTimezoneStrings.offset
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", JSImport.Namespace)
@js.native
object libEsmComponentsTimezoneDashPickerTimezoneDisplayFormatMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atBlueprintjsTimezone.atBlueprintjsTimezoneStrings.offset
    - typings.atBlueprintjsTimezone.atBlueprintjsTimezoneStrings.abbreviation
    - typings.atBlueprintjsTimezone.atBlueprintjsTimezoneStrings.name
    - typings.atBlueprintjsTimezone.atBlueprintjsTimezoneStrings.composite
  */
  trait TimezoneDisplayFormat extends js.Object
  
  def formatTimezone(timezone: String, date: Date, displayFormat: TimezoneDisplayFormat): js.UndefOr[String] = js.native
  @js.native
  object TimezoneDisplayFormat extends js.Object {
    /** Abbreviation format: `"HST"` */
    var ABBREVIATION: abbreviation = js.native
    /** Composite format: `"Pacific/Honolulu (HST) -10:00"` */
    var COMPOSITE: composite = js.native
    /** Name format: `"Pacific/Honolulu"` */
    var NAME: name = js.native
    /** Offset format: `"-10:00"` */
    var OFFSET: offset = js.native
  }
  
}

