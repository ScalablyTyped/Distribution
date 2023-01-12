package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import typings.consumerDataStandards.anon.Transactions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBankingTransactionList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Transactions
  
  var links: First
  
  var meta: TotalPages
}
object ResponseBankingTransactionList {
  
  inline def apply(data: Transactions, links: First, meta: TotalPages): ResponseBankingTransactionList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBankingTransactionList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseBankingTransactionList] (val x: Self) extends AnyVal {
    
    inline def setData(value: Transactions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
