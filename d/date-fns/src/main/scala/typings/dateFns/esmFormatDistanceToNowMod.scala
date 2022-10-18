package typings.dateFns

import typings.dateFns.anon.AddSuffix
import typings.dateFns.anon.IncludeSeconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFormatDistanceToNowMod {
  
  object default {
    
    inline def apply(date: js.Date): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(date: js.Date, options: AddSuffix): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: js.Date, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double): String = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(date: Double, options: AddSuffix): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(date: Double, options: IncludeSeconds): String = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("date-fns/esm/formatDistanceToNow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
