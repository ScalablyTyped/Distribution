package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoUsageMessagingSms
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Cost amount of SMS messages. Including premium SMS services
    */
  var amount: String
  
  /**
    * Number of international SMS messages sent. Including premium SMS services
    */
  var international: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of national SMS messages sent. Including premium SMS services
    */
  var national: Double
  
  /**
    * Number of roaming SMS messages sent. Including premium SMS services
    */
  var roaming: js.UndefOr[Double | Null] = js.undefined
}
object TelcoUsageMessagingSms {
  
  inline def apply(amount: String, national: Double): TelcoUsageMessagingSms = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], national = national.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoUsageMessagingSms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoUsageMessagingSms] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setInternational(value: Double): Self = StObject.set(x, "international", value.asInstanceOf[js.Any])
    
    inline def setInternationalNull: Self = StObject.set(x, "international", null)
    
    inline def setInternationalUndefined: Self = StObject.set(x, "international", js.undefined)
    
    inline def setNational(value: Double): Self = StObject.set(x, "national", value.asInstanceOf[js.Any])
    
    inline def setRoaming(value: Double): Self = StObject.set(x, "roaming", value.asInstanceOf[js.Any])
    
    inline def setRoamingNull: Self = StObject.set(x, "roaming", null)
    
    inline def setRoamingUndefined: Self = StObject.set(x, "roaming", js.undefined)
  }
}
