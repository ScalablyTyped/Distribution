package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.PhoneNumber
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoServiceUsageListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: js.Array[PhoneNumber]
  
  var links: First
  
  var meta: TotalPages
}
object TelcoServiceUsageListResponse {
  
  inline def apply(data: js.Array[PhoneNumber], links: First, meta: TotalPages): TelcoServiceUsageListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoServiceUsageListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoServiceUsageListResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[PhoneNumber]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: PhoneNumber*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
