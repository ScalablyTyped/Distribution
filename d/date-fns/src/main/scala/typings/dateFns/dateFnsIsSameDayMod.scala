package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsIsSameDayMod {
  
  object default {
    
    inline def apply(dateLeft: js.Date, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(dateLeft: js.Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(dateLeft: Double, dateRight: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def apply(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/isSameDay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
