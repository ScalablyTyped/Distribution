package typings.dateFns

import typings.dateFns.anon.AddSuffix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatDistanceIndexMod {
  
  object default {
    
    inline def apply(date: js.Date, baseDate: js.Date): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: js.Date, baseDate: js.Date, options: AddSuffix): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: js.Date, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: js.Date, baseDate: Double, options: AddSuffix): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, baseDate: js.Date): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, baseDate: js.Date, options: AddSuffix): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, baseDate: Double): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, baseDate: Double, options: AddSuffix): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], baseDate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/formatDistance/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
