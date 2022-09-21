package typings.dateFns

import typings.dateFns.anon.NearestToRoundingMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsRoundToNearestMinutesIndexMod {
  
  object default {
    
    inline def apply(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    inline def apply(date: js.Date, options: NearestToRoundingMethod): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def apply(date: Double): js.Date = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    inline def apply(date: Double, options: NearestToRoundingMethod): js.Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    @JSImport("date-fns/roundToNearestMinutes/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
