package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Summary of data usage
    */
  var data: js.UndefOr[Roaming] = js.undefined
  
  /**
    * Summary of messaging. Required if messaging services is included in the product plan
    */
  var messaging: js.UndefOr[Mms] = js.undefined
  
  /**
    * Summary of voice calls. Required if voice calls are included in product plan
    */
  var voice: js.UndefOr[National] = js.undefined
}
object Data {
  
  inline def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: Roaming): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMessaging(value: Mms): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
    
    inline def setMessagingUndefined: Self = StObject.set(x, "messaging", js.undefined)
    
    inline def setVoice(value: National): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
