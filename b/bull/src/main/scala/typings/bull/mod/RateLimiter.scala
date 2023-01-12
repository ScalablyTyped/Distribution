package typings.bull.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateLimiter extends StObject {
  
  /** When jobs get rate limited, they stay in the waiting queue and are not moved to the delayed queue */
  var bounceBack: js.UndefOr[Boolean] = js.undefined
  
  /** Per duration in milliseconds */
  var duration: Double
  
  /** Groups jobs with the specified key from the data object passed to the Queue#add ex. "network.handle" */
  var groupKey: js.UndefOr[String] = js.undefined
  
  /** Max numbers of jobs processed */
  var max: Double
}
object RateLimiter {
  
  inline def apply(duration: Double, max: Double): RateLimiter = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimiter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RateLimiter] (val x: Self) extends AnyVal {
    
    inline def setBounceBack(value: Boolean): Self = StObject.set(x, "bounceBack", value.asInstanceOf[js.Any])
    
    inline def setBounceBackUndefined: Self = StObject.set(x, "bounceBack", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setGroupKey(value: String): Self = StObject.set(x, "groupKey", value.asInstanceOf[js.Any])
    
    inline def setGroupKeyUndefined: Self = StObject.set(x, "groupKey", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
