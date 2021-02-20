package typings.clearbladejsServer.CbServer

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimerCreateOptions extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var frequency: js.UndefOr[Double] = js.native
  
  var repeats: js.UndefOr[Double] = js.native
  
  var service_name: js.UndefOr[String] = js.native
  
  var start_time: js.UndefOr[Date] = js.native
  
  var user_id: js.UndefOr[String] = js.native
  
  var user_token: js.UndefOr[String] = js.native
}
object TimerCreateOptions {
  
  @scala.inline
  def apply(): TimerCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimerCreateOptions]
  }
  
  @scala.inline
  implicit class TimerCreateOptionsMutableBuilder[Self <: TimerCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    @scala.inline
    def setRepeats(value: Double): Self = StObject.set(x, "repeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatsUndefined: Self = StObject.set(x, "repeats", js.undefined)
    
    @scala.inline
    def setService_name(value: String): Self = StObject.set(x, "service_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService_nameUndefined: Self = StObject.set(x, "service_name", js.undefined)
    
    @scala.inline
    def setStart_time(value: Date): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
    
    @scala.inline
    def setUser_token(value: String): Self = StObject.set(x, "user_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_tokenUndefined: Self = StObject.set(x, "user_token", js.undefined)
  }
}
