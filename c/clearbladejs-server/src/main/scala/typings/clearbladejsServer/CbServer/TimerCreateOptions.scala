package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimerCreateOptions extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var frequency: js.UndefOr[Double] = js.undefined
  
  var repeats: js.UndefOr[Double] = js.undefined
  
  var service_name: js.UndefOr[String] = js.undefined
  
  var start_time: js.UndefOr[js.Date] = js.undefined
  
  var user_id: js.UndefOr[String] = js.undefined
  
  var user_token: js.UndefOr[String] = js.undefined
}
object TimerCreateOptions {
  
  inline def apply(): TimerCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimerCreateOptions]
  }
  
  extension [Self <: TimerCreateOptions](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setRepeats(value: Double): Self = StObject.set(x, "repeats", value.asInstanceOf[js.Any])
    
    inline def setRepeatsUndefined: Self = StObject.set(x, "repeats", js.undefined)
    
    inline def setService_name(value: String): Self = StObject.set(x, "service_name", value.asInstanceOf[js.Any])
    
    inline def setService_nameUndefined: Self = StObject.set(x, "service_name", js.undefined)
    
    inline def setStart_time(value: js.Date): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
    
    inline def setUser_token(value: String): Self = StObject.set(x, "user_token", value.asInstanceOf[js.Any])
    
    inline def setUser_tokenUndefined: Self = StObject.set(x, "user_token", js.undefined)
  }
}
