package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.PhoneNumber
import typings.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoServiceUsageResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: PhoneNumber
  
  var links: Self
  
  var meta: StringDictionary[Any]
}
object TelcoServiceUsageResponse {
  
  inline def apply(data: PhoneNumber, links: Self, meta: StringDictionary[Any]): TelcoServiceUsageResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoServiceUsageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoServiceUsageResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: PhoneNumber): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: typings.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
