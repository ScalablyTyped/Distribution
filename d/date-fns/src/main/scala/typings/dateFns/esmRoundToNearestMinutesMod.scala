package typings.dateFns

import typings.dateFns.anon.NearestTo
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmRoundToNearestMinutesMod {
  
  object default {
    
    inline def apply(date: Double): Date = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    inline def apply(date: Double, options: NearestTo): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(date: Date): Date = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Date]
    inline def apply(date: Date, options: NearestTo): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/roundToNearestMinutes", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
