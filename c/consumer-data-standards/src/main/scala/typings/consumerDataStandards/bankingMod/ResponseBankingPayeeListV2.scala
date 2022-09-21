package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.Payees
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBankingPayeeListV2
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Payees
  
  var links: First
  
  var meta: TotalPages
}
object ResponseBankingPayeeListV2 {
  
  inline def apply(data: Payees, links: First, meta: TotalPages): ResponseBankingPayeeListV2 = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBankingPayeeListV2]
  }
  
  extension [Self <: ResponseBankingPayeeListV2](x: Self) {
    
    inline def setData(value: Payees): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
