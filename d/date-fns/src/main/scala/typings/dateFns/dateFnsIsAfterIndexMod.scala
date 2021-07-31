package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsIsAfterIndexMod {
  
  object default {
    
    @scala.inline
    def apply(date: Double, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(date: Double, dateToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(date: Date, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(date: Date, dateToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/isAfter/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
