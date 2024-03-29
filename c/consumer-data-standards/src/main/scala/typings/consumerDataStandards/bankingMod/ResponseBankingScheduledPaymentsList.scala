package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.ScheduledPayments
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBankingScheduledPaymentsList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: ScheduledPayments
  
  var links: First
  
  var meta: TotalPages
}
object ResponseBankingScheduledPaymentsList {
  
  inline def apply(data: ScheduledPayments, links: First, meta: TotalPages): ResponseBankingScheduledPaymentsList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBankingScheduledPaymentsList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseBankingScheduledPaymentsList] (val x: Self) extends AnyVal {
    
    inline def setData(value: ScheduledPayments): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
