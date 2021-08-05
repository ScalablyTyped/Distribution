package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmClosestToMod {
  
  object default {
    
    inline def apply(dateToCompare: Double, datesArray: js.Array[Date | Double]): Date = (^.asInstanceOf[js.Dynamic].apply(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def apply(dateToCompare: Date, datesArray: js.Array[Date | Double]): Date = (^.asInstanceOf[js.Dynamic].apply(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @JSImport("date-fns/esm/closestTo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
