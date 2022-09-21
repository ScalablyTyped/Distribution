package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object differenceInDaysIndexMod {
  
  object default {
    
    inline def apply(dateLeft: js.Date, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def apply(dateLeft: js.Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def apply(dateLeft: Double, dateRight: js.Date): Double = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def apply(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("date-fns/differenceInDays/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
