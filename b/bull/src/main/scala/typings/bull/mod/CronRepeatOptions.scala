package typings.bull.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CronRepeatOptions
  extends StObject
     with RepeatOptions {
  
  /**
    * Cron pattern specifying when the job should execute
    */
  var cron: String
  
  /**
    * Start date when the repeat job should start repeating (only with cron).
    */
  var startDate: js.UndefOr[js.Date | String | Double] = js.undefined
}
object CronRepeatOptions {
  
  inline def apply(cron: String): CronRepeatOptions = {
    val __obj = js.Dynamic.literal(cron = cron.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronRepeatOptions]
  }
  
  extension [Self <: CronRepeatOptions](x: Self) {
    
    inline def setCron(value: String): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date | String | Double): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
