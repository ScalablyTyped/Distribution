package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.CardDebit
import typings.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPaymentScheduleResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: CardDebit
  
  var links: Self
  
  var meta: StringDictionary[Any]
}
object EnergyPaymentScheduleResponse {
  
  inline def apply(data: CardDebit, links: Self, meta: StringDictionary[Any]): EnergyPaymentScheduleResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPaymentScheduleResponse]
  }
  
  extension [Self <: EnergyPaymentScheduleResponse](x: Self) {
    
    inline def setData(value: CardDebit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: typings.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
