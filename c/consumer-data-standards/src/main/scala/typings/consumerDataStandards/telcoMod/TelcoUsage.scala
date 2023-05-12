package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Mms
import typings.consumerDataStandards.anon.National
import typings.consumerDataStandards.anon.Roaming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoUsage
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
object TelcoUsage {
  
  inline def apply(): TelcoUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelcoUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoUsage] (val x: Self) extends AnyVal {
    
    inline def setData(value: Roaming): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMessaging(value: Mms): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
    
    inline def setMessagingUndefined: Self = StObject.set(x, "messaging", js.undefined)
    
    inline def setVoice(value: National): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
