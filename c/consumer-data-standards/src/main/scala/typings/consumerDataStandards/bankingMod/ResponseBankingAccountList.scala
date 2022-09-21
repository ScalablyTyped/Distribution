package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Accounts
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBankingAccountList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Accounts
  
  var links: First
  
  var meta: TotalPages
}
object ResponseBankingAccountList {
  
  inline def apply(data: Accounts, links: First, meta: TotalPages): ResponseBankingAccountList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBankingAccountList]
  }
  
  extension [Self <: ResponseBankingAccountList](x: Self) {
    
    inline def setData(value: Accounts): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
