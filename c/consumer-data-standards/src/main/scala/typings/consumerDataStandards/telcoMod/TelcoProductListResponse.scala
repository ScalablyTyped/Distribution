package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkPlans
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoProductListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DictkPlans
  
  var links: First
  
  var meta: TotalPages
}
object TelcoProductListResponse {
  
  inline def apply(data: DictkPlans, links: First, meta: TotalPages): TelcoProductListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoProductListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoProductListResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: DictkPlans): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
