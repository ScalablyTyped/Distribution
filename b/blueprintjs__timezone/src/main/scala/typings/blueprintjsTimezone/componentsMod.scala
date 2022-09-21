package typings.blueprintjsTimezone

import typings.blueprintjsTimezone.anon.PartialTimezonePickerProp
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.abbreviation
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.composite
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.name
import typings.blueprintjsTimezone.blueprintjsTimezoneStrings.offset
import typings.blueprintjsTimezone.timezoneMetadataMod.ITimezoneMetadata
import typings.blueprintjsTimezone.timezonePickerMod.TimezonePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@blueprintjs/timezone/lib/esm/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object TimezoneDisplayFormat {
    
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezoneDisplayFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /** Abbreviation format: `"HST"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezoneDisplayFormat.ABBREVIATION")
    @js.native
    def ABBREVIATION: abbreviation = js.native
    inline def ABBREVIATION_=(x: abbreviation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABBREVIATION")(x.asInstanceOf[js.Any])
    
    /** Composite format: `"Pacific/Honolulu (HST) -10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezoneDisplayFormat.COMPOSITE")
    @js.native
    def COMPOSITE: composite = js.native
    inline def COMPOSITE_=(x: composite): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPOSITE")(x.asInstanceOf[js.Any])
    
    /** Name format: `"Pacific/Honolulu"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezoneDisplayFormat.NAME")
    @js.native
    def NAME: name = js.native
    inline def NAME_=(x: name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /** Offset format: `"-10:00"` */
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezoneDisplayFormat.OFFSET")
    @js.native
    def OFFSET: offset = js.native
    inline def OFFSET_=(x: offset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFSET")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezonePicker")
  @js.native
  open class TimezonePicker protected ()
    extends typings.blueprintjsTimezone.timezonePickerMod.TimezonePicker {
    def this(props: TimezonePickerProps) = this()
    def this(props: TimezonePickerProps, context: Any) = this()
  }
  /* static members */
  object TimezonePicker {
    
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezonePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezonePicker.defaultProps")
    @js.native
    def defaultProps: PartialTimezonePickerProp = js.native
    inline def defaultProps_=(x: PartialTimezonePickerProp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/timezone/lib/esm/components", "TimezonePicker.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def getTimezoneMetadata(timezone: String): ITimezoneMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezoneMetadata")(timezone.asInstanceOf[js.Any]).asInstanceOf[ITimezoneMetadata]
  inline def getTimezoneMetadata(timezone: String, date: js.Date): ITimezoneMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimezoneMetadata")(timezone.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[ITimezoneMetadata]
}
