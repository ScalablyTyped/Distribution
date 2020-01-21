package typings.blueprintjsTimezone

import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.name
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", JSImport.Namespace)
@js.native
object timezoneDisplayFormatMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
    - typings.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
    - typings.blueprintjsTimezone.blueprintjsTimezoneStrings.name
    - typings.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
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

