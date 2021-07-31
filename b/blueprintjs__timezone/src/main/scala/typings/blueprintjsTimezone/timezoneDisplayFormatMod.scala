package typings.blueprintjsTimezone

import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.name
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezoneDisplayFormatMod {
  
  @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
    - typings.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
    - typings.blueprintjsTimezone.blueprintjsTimezoneStrings.name
    - typings.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
  */
  trait TimezoneDisplayFormat extends StObject
  object TimezoneDisplayFormat {
    
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /** Abbreviation format: `"HST"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat.ABBREVIATION")
    @js.native
    def ABBREVIATION: abbreviation = js.native
    @scala.inline
    def ABBREVIATION_=(x: abbreviation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABBREVIATION")(x.asInstanceOf[js.Any])
    
    /** Composite format: `"Pacific/Honolulu (HST) -10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat.COMPOSITE")
    @js.native
    def COMPOSITE: composite = js.native
    @scala.inline
    def COMPOSITE_=(x: composite): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPOSITE")(x.asInstanceOf[js.Any])
    
    /** Name format: `"Pacific/Honolulu"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat.NAME")
    @js.native
    def NAME: name = js.native
    @scala.inline
    def NAME_=(x: name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /** Offset format: `"-10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components/timezone-picker/timezoneDisplayFormat", "TimezoneDisplayFormat.OFFSET")
    @js.native
    def OFFSET: offset = js.native
    @scala.inline
    def OFFSET_=(x: offset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def formatTimezone(timezone: String, date: Date, displayFormat: TimezoneDisplayFormat): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimezone")(timezone.asInstanceOf[js.Any], date.asInstanceOf[js.Any], displayFormat.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
