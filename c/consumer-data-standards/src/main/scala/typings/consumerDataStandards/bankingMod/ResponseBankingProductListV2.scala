package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.Products
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseBankingProductListV2
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Products
  
  var links: First
  
  var meta: TotalPages
}
object ResponseBankingProductListV2 {
  
  inline def apply(data: Products, links: First, meta: TotalPages): ResponseBankingProductListV2 = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseBankingProductListV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseBankingProductListV2] (val x: Self) extends AnyVal {
    
    inline def setData(value: Products): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
