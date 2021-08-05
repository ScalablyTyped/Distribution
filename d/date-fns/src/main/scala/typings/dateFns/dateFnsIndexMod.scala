package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDate
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsIndexMod {
  
  object default {
    
    inline def apply(date: Double, format: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, format: String, options: FirstWeekContainsDate): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date, format: String): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date, format: String, options: FirstWeekContainsDate): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/format/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
