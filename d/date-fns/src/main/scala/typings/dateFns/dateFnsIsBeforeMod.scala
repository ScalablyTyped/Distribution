package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsIsBeforeMod {
  
  object default {
    
    inline def apply(date: js.Date, dateToCompare: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(date: js.Date, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(date: Double, dateToCompare: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(date: Double, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/isBefore", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
