package typings.bull.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatOptions extends StObject {
  
  /**
    * End date when the repeat job should stop repeating
    */
  var endDate: js.UndefOr[js.Date | String | Double] = js.undefined
  
  /**
    * Number of times the job should repeat at max.
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * Timezone
    */
  var tz: js.UndefOr[String] = js.undefined
}
object RepeatOptions {
  
  inline def apply(): RepeatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatOptions]
  }
  
  extension [Self <: RepeatOptions](x: Self) {
    
    inline def setEndDate(value: js.Date | String | Double): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setTz(value: String): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
    
    inline def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
  }
}
