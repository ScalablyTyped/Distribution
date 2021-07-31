package typings.dateFns

import typings.dateFns.anon.WeekStartsOn
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmGetWeekOfMonthMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double): Double = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def apply(date: Double, options: typings.dateFns.anon.Locale): Double = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def apply(date: Double, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def apply(date: Date): Double = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def apply(date: Date, options: typings.dateFns.anon.Locale): Double = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def apply(date: Date, options: WeekStartsOn): Double = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("date-fns/esm/getWeekOfMonth", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
