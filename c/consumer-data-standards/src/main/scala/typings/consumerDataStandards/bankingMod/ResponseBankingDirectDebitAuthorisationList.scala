package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DirectDebitAuthorisations
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBankingDirectDebitAuthorisationList
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DirectDebitAuthorisations
  
  var links: First
  
  var meta: TotalPages
}
object ResponseBankingDirectDebitAuthorisationList {
  
  inline def apply(data: DirectDebitAuthorisations, links: First, meta: TotalPages): ResponseBankingDirectDebitAuthorisationList = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBankingDirectDebitAuthorisationList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseBankingDirectDebitAuthorisationList] (val x: Self) extends AnyVal {
    
    inline def setData(value: DirectDebitAuthorisations): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
