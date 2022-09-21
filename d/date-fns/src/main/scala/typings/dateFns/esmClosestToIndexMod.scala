package typings.dateFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmClosestToIndexMod {
  
  object default {
    
    inline def apply(dateToCompare: js.Date, datesArray: js.Array[js.Date | Double]): js.UndefOr[js.Date] = (^.asInstanceOf[js.Dynamic].apply(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Date]]
    inline def apply(dateToCompare: Double, datesArray: js.Array[js.Date | Double]): js.UndefOr[js.Date] = (^.asInstanceOf[js.Dynamic].apply(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Date]]
    
    @JSImport("date-fns/esm/closestTo/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
