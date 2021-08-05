package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDifferenceInWeeksIndexMod {
  
  object default {
    
    inline def apply(dateLeft: Double, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def apply(dateLeft: Double, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def apply(dateLeft: Date, dateRight: Double): Double = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def apply(dateLeft: Date, dateRight: Date): Double = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("date-fns/esm/differenceInWeeks/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
