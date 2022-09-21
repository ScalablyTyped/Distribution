package typings.bull.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EveryRepeatOptions
  extends StObject
     with RepeatOptions {
  
  /**
    * Repeat every millis (cron setting cannot be used together with this setting.)
    */
  var every: Double
}
object EveryRepeatOptions {
  
  inline def apply(every: Double): EveryRepeatOptions = {
    val __obj = js.Dynamic.literal(every = every.asInstanceOf[js.Any])
    __obj.asInstanceOf[EveryRepeatOptions]
  }
  
  extension [Self <: EveryRepeatOptions](x: Self) {
    
    inline def setEvery(value: Double): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
  }
}
