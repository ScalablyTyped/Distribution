package typings.dateIoDateFns

import typings.dateIoCore.iutilsMod.DateIOFormats
import typings.dateIoCore.iutilsMod.IUtils
import typings.dateIoDateFns.anon.Formats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildDateFnsUtilsMod {
  
  @JSImport("@date-io/date-fns/build/date-fns-utils", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DateFnsUtils {
    def this(param0: Formats) = this()
  }
  
  @js.native
  trait DateFnsUtils
    extends StObject
       with IUtils[js.Date] {
    
    @JSName("formats")
    var formats_DateFnsUtils: DateIOFormats[String] = js.native
    
    @JSName("locale")
    var locale_DateFnsUtils: js.UndefOr[Locale] = js.native
  }
  
  @js.native
  trait Locale
    extends StObject
       with typings.dateFns.Locale
}
