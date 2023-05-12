package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkAccounts
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBankingAccountListV2
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DictkAccounts
  
  var links: First
  
  var meta: TotalPages
}
object ResponseBankingAccountListV2 {
  
  inline def apply(data: DictkAccounts, links: First, meta: TotalPages): ResponseBankingAccountListV2 = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBankingAccountListV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseBankingAccountListV2] (val x: Self) extends AnyVal {
    
    inline def setData(value: DictkAccounts): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
