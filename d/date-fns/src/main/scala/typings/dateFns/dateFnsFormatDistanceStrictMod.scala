package typings.dateFns

import typings.dateFns.anon.RoundingMethod
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsFormatDistanceStrictMod {
  
  object default {
    
    inline def apply(date: Double, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, baseDate: Double, options: RoundingMethod): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, baseDate: Date): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, baseDate: Date, options: RoundingMethod): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date, baseDate: Double, options: RoundingMethod): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date, baseDate: Date): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Date, baseDate: Date, options: RoundingMethod): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/formatDistanceStrict", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
