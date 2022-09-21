package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmClosestIndexToMod {
  
  object default {
    
    inline def apply(dateToCompare: js.Date, datesArray: js.Array[js.Date | Double]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].apply(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
    inline def apply(dateToCompare: Double, datesArray: js.Array[js.Date | Double]): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].apply(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
    
    @JSImport("date-fns/esm/closestIndexTo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
