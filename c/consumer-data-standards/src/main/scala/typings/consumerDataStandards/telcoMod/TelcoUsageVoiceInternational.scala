package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoUsageVoiceInternational
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Cost amount of international voice calls
    */
  var amount: String
  
  /**
    * Total duration (hours, minutes, and seconds) of international voice calls. Not limited to 24hrs
    */
  var duration: String
  
  /**
    * Number of international voice calls
    */
  var number: Double
}
object TelcoUsageVoiceInternational {
  
  inline def apply(amount: String, duration: String, number: Double): TelcoUsageVoiceInternational = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoUsageVoiceInternational]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoUsageVoiceInternational] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
