package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkConcessions
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoConcessionsResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DictkConcessions
  
  var links: First
  
  var meta: TotalPages
}
object TelcoConcessionsResponse {
  
  inline def apply(data: DictkConcessions, links: First, meta: TotalPages): TelcoConcessionsResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoConcessionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoConcessionsResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: DictkConcessions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
