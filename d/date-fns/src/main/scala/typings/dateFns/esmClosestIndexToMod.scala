package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmClosestIndexToMod {
  
  object default {
    
    inline def apply(dateToCompare: Double, datesArray: js.Array[Date | Double]): Double = (^.asInstanceOf[js.Dynamic].apply(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def apply(dateToCompare: Date, datesArray: js.Array[Date | Double]): Double = (^.asInstanceOf[js.Dynamic].apply(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("date-fns/esm/closestIndexTo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
