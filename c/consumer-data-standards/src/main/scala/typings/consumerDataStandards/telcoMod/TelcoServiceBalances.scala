package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkInternational
import typings.consumerDataStandards.anon.PlanType
import typings.consumerDataStandards.anon.Sms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoServiceBalances
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Summary of data balances
    */
  var data: js.UndefOr[PlanType] = js.undefined
  
  /**
    * Summary of messaging. Required if messaging services is included in the product plan
    */
  var messaging: js.UndefOr[Sms] = js.undefined
  
  /**
    * Summary of voice balances. Required if voice calls are included in product plan
    */
  var voice: js.UndefOr[DictkInternational] = js.undefined
}
object TelcoServiceBalances {
  
  inline def apply(): TelcoServiceBalances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelcoServiceBalances]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoServiceBalances] (val x: Self) extends AnyVal {
    
    inline def setData(value: PlanType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMessaging(value: Sms): Self = StObject.set(x, "messaging", value.asInstanceOf[js.Any])
    
    inline def setMessagingUndefined: Self = StObject.set(x, "messaging", js.undefined)
    
    inline def setVoice(value: DictkInternational): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
