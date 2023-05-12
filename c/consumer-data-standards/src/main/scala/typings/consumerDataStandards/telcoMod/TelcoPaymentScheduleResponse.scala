package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkPaymentSchedules
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoPaymentScheduleResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DictkPaymentSchedules
  
  var links: First
  
  var meta: TotalPages
}
object TelcoPaymentScheduleResponse {
  
  inline def apply(data: DictkPaymentSchedules, links: First, meta: TotalPages): TelcoPaymentScheduleResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoPaymentScheduleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoPaymentScheduleResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: DictkPaymentSchedules): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
