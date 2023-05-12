package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoUsageVoiceRoaming
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Cost amount of roaming voice calls
    */
  var amount: String
  
  /**
    * Total duration (hours, minutes, and seconds) of roaming voice calls. Not limited to 24hrs
    */
  var duration: String
  
  /**
    * Number of roaming voice calls
    */
  var number: Double
}
object TelcoUsageVoiceRoaming {
  
  inline def apply(amount: String, duration: String, number: Double): TelcoUsageVoiceRoaming = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoUsageVoiceRoaming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoUsageVoiceRoaming] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
