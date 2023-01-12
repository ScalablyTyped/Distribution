package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Planned duration of the outage. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var duration: String
  
  /**
    * Provides an explanation of the current outage that can be displayed to an end customer
    */
  var explanation: String
  
  /**
    * Flag that indicates, if present and set to true, that the outage is only partial meaning that only a subset of normally available end points will be affected by the outage
    */
  var isPartial: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Date and time that the outage is scheduled to begin
    */
  var outageTime: String
}
object Duration {
  
  inline def apply(duration: String, explanation: String, outageTime: String): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], outageTime = outageTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setIsPartial(value: Boolean): Self = StObject.set(x, "isPartial", value.asInstanceOf[js.Any])
    
    inline def setIsPartialNull: Self = StObject.set(x, "isPartial", null)
    
    inline def setIsPartialUndefined: Self = StObject.set(x, "isPartial", js.undefined)
    
    inline def setOutageTime(value: String): Self = StObject.set(x, "outageTime", value.asInstanceOf[js.Any])
  }
}
