package typings.atBlueprintjsTimezone

import typings.atBlueprintjsTimezone.atBlueprintjsTimezoneStrings.abbreviation
import typings.atBlueprintjsTimezone.atBlueprintjsTimezoneStrings.composite
import typings.atBlueprintjsTimezone.atBlueprintjsTimezoneStrings.name
import typings.atBlueprintjsTimezone.atBlueprintjsTimezoneStrings.offset
import typings.atBlueprintjsTimezone.libEsmComponentsTimezoneDashPickerTimezoneMetadataMod.ITimezoneMetadata
import typings.atBlueprintjsTimezone.libEsmComponentsTimezoneDashPickerTimezonePickerMod.ITimezonePickerProps
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/timezone/lib/esm/components", JSImport.Namespace)
@js.native
object libEsmComponentsMod extends js.Object {
  @js.native
  class TimezonePicker protected ()
    extends typings.atBlueprintjsTimezone.libEsmComponentsTimezoneDashPickerTimezonePickerMod.TimezonePicker {
    def this(props: ITimezonePickerProps) = this()
    def this(props: ITimezonePickerProps, context: js.Any) = this()
  }
  
  def getTimezoneMetadata(timezone: String): ITimezoneMetadata = js.native
  def getTimezoneMetadata(timezone: String, date: Date): ITimezoneMetadata = js.native
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
  
  /* static members */
  @js.native
  object TimezonePicker extends js.Object {
    var defaultProps: Partial[ITimezonePickerProps] = js.native
    var displayName: String = js.native
  }
  
}

