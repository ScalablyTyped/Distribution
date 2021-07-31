package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsIsThisWeekMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double): Boolean = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def apply(date: Double, options: typings.dateFns.anon.Locale): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(date: Date): Boolean = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def apply(date: Date, options: typings.dateFns.anon.Locale): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/isThisWeek", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
