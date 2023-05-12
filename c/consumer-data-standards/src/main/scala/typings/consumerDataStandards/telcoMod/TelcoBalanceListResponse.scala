package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.BalancesArray
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoBalanceListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: BalancesArray
  
  var links: First
  
  var meta: TotalPages
}
object TelcoBalanceListResponse {
  
  inline def apply(data: BalancesArray, links: First, meta: TotalPages): TelcoBalanceListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoBalanceListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoBalanceListResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: BalancesArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
