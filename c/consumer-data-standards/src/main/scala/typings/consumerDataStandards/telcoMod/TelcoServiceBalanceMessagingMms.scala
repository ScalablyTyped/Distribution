package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoServiceBalanceMessagingMms
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Amount value of MMS messages remaining. Required unless planType is UNSUPPORTED or UNMETERED
    */
  var amount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An overview of plan limits. Required unless planType is UNSUPPORTED
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of international MMS messages remaining. Required unless planType is UNSUPPORTED or UNMETERED
    */
  var international: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of national MMS messages remaining. Required unless planType is UNSUPPORTED or UNMETERED
    */
  var national: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of roaming MMS messages remaining. Required unless planType is UNSUPPORTED or UNMETERED
    */
  var roaming: js.UndefOr[Double | Null] = js.undefined
}
object TelcoServiceBalanceMessagingMms {
  
  inline def apply(): TelcoServiceBalanceMessagingMms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelcoServiceBalanceMessagingMms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoServiceBalanceMessagingMms] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInternational(value: Double): Self = StObject.set(x, "international", value.asInstanceOf[js.Any])
    
    inline def setInternationalNull: Self = StObject.set(x, "international", null)
    
    inline def setInternationalUndefined: Self = StObject.set(x, "international", js.undefined)
    
    inline def setNational(value: Double): Self = StObject.set(x, "national", value.asInstanceOf[js.Any])
    
    inline def setNationalNull: Self = StObject.set(x, "national", null)
    
    inline def setNationalUndefined: Self = StObject.set(x, "national", js.undefined)
    
    inline def setRoaming(value: Double): Self = StObject.set(x, "roaming", value.asInstanceOf[js.Any])
    
    inline def setRoamingNull: Self = StObject.set(x, "roaming", null)
    
    inline def setRoamingUndefined: Self = StObject.set(x, "roaming", js.undefined)
  }
}
