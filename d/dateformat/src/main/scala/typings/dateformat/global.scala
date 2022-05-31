package typings.dateformat

import typings.dateformat.mod.DateFormatI18n
import typings.dateformat.mod.DateFormatMasks
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object dateFormat {
    
    /**
      * dateFormat()
      *
      * Accepts a date, a mask, or a date and a mask.
      * Returns a formatted version of the given date.
      * The date defaults to the current date/time.
      * The mask defaults to dateFormat.masks.default.
      *
      * https://github.com/felixge/node-dateformat/blob/master/lib/dateformat.js#L18
      */
    inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
    inline def apply(date: String): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(date: String, mask: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: String, mask: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: String, mask: String, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: String, mask: String, utc: Unit, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: String, mask: Unit, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: String, mask: Unit, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: String, mask: Unit, utc: Unit, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(date: Double, mask: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, mask: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, mask: String, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, mask: String, utc: Unit, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, mask: Unit, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, mask: Unit, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, mask: Unit, utc: Unit, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Unit, mask: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Unit, mask: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Unit, mask: String, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Unit, mask: String, utc: Unit, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Unit, mask: Unit, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Unit, mask: Unit, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Unit, mask: Unit, utc: Unit, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(date: Date, mask: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date, mask: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date, mask: String, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date, mask: String, utc: Unit, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date, mask: Unit, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date, mask: Unit, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date, mask: Unit, utc: Unit, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(mask: String, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(mask: String, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(mask: Unit, utc: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(mask: Unit, utc: Boolean, gmt: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(mask.asInstanceOf[js.Any], utc.asInstanceOf[js.Any], gmt.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("dateFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("dateFormat.i18n")
    @js.native
    def i18n: DateFormatI18n = js.native
    inline def i18n_=(x: DateFormatI18n): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18n")(x.asInstanceOf[js.Any])
    
    @JSGlobal("dateFormat.masks")
    @js.native
    val masks: DateFormatMasks = js.native
  }
}
