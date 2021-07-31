package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object closestIndexToIndexMod {
  
  object default {
    
    @scala.inline
    def apply(dateToCompare: Double, datesArray: js.Array[Date | Double]): Double = (^.asInstanceOf[js.Dynamic].apply(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def apply(dateToCompare: Date, datesArray: js.Array[Date | Double]): Double = (^.asInstanceOf[js.Dynamic].apply(dateToCompare.asInstanceOf[js.Any], datesArray.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("date-fns/closestIndexTo/index", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
