package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmIsBeforeMod {
  
  object default {
    
    inline def apply(date: Double, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(date: Double, dateToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(date: Date, dateToCompare: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(date: Date, dateToCompare: Date): Boolean = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], dateToCompare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/esm/isBefore", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
