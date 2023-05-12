package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Self
import typings.consumerDataStandards.anon.Services
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoBalanceResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Object containing account service usage summary
    */
  var data: Services
  
  var links: Self
  
  var meta: StringDictionary[Any]
}
object TelcoBalanceResponse {
  
  inline def apply(data: Services, links: Self, meta: StringDictionary[Any]): TelcoBalanceResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoBalanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoBalanceResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Services): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: typings.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
