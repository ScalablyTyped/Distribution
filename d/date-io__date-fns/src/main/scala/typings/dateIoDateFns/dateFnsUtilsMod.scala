package typings.dateIoDateFns

import typings.dateIoCore.mod.DateIOFormats
import typings.dateIoCore.mod.IUtils
import typings.dateIoDateFns.anon.Formats
import typings.dateIoDateFns.dateIoDateFnsStrings.AM
import typings.dateIoDateFns.dateIoDateFnsStrings.PM
import typings.dateIoDateFns.dateIoDateFnsStrings.am_
import typings.dateIoDateFns.dateIoDateFnsStrings.pm_
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsUtilsMod {
  
  @JSImport("@date-io/date-fns/build/date-fns-utils", JSImport.Default)
  @js.native
  class default () extends DateFnsUtils {
    def this(hasLocaleFormats: Formats) = this()
  }
  
  @js.native
  trait DateFnsUtils extends IUtils[Date] {
    
    @JSName("formats")
    var formats_DateFnsUtils: DateIOFormats[String] = js.native
    
    @JSName("getMeridiemText")
    def getMeridiemText_am(ampm: am_): AM | PM = js.native
    @JSName("getMeridiemText")
    def getMeridiemText_pm(ampm: pm_): AM | PM = js.native
    
    @JSName("locale")
    var locale_DateFnsUtils: js.UndefOr[Locale] = js.native
  }
  
  @js.native
  trait Locale
    extends typings.dateFns.Locale
}
