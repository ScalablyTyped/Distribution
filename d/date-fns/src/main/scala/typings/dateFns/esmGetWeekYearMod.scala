package typings.dateFns

import typings.dateFns.anon.FirstWeekContainsDateLocaleWeekStartsOn
import typings.dateFns.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmGetWeekYearMod {
  
  object default {
    
    inline def apply(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def apply(date: js.Date, options: FirstWeekContainsDateLocaleWeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def apply(date: js.Date, options: `1`): Double = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def apply(date: Double): Double = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def apply(date: Double, options: FirstWeekContainsDateLocaleWeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def apply(date: Double, options: `1`): Double = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("date-fns/esm/getWeekYear", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
