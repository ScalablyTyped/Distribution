package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsSetMillisecondsIndexMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double, milliseconds: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def apply(date: Date, milliseconds: Double): Date = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/setMilliseconds/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
