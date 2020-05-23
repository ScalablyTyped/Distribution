package typings.dateIoDateFns

import org.scalablytyped.runtime.TopLevel
import typings.dateIoCore.mod.DateIOFormats
import typings.dateIoCore.mod.IUtils
import typings.dateIoDateFns.anon.Formats
import typings.dateIoDateFns.dateIoDateFnsStrings.AM
import typings.dateIoDateFns.dateIoDateFnsStrings.PM
import typings.dateIoDateFns.dateIoDateFnsStrings.am_
import typings.dateIoDateFns.dateIoDateFnsStrings.pm_
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@date-io/date-fns/build/date-fns-utils", JSImport.Namespace)
@js.native
object dateFnsUtilsMod extends js.Object {
  @js.native
  trait DateFnsUtils extends IUtils[Date] {
    @JSName("formats")
    var formats_DateFnsUtils: DateIOFormats[String] = js.native
    @JSName("locale")
    var locale_DateFnsUtils: js.UndefOr[Locale] = js.native
    @JSName("getMeridiemText")
    def getMeridiemText_am(ampm: am_): AM | PM = js.native
    @JSName("getMeridiemText")
    def getMeridiemText_pm(ampm: pm_): AM | PM = js.native
  }
  
  @js.native
  trait Locale
    extends TopLevel[typings.dateFns.Locale]
  
  @js.native
  class default () extends DateFnsUtils {
    def this(hasLocaleFormats: Formats) = this()
  }
  
}

