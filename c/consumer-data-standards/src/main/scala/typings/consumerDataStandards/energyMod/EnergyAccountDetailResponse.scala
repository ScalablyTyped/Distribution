package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Plans
import typings.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyAccountDetailResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Plans
  
  var links: Self
  
  var meta: StringDictionary[Any]
}
object EnergyAccountDetailResponse {
  
  inline def apply(data: Plans, links: Self, meta: StringDictionary[Any]): EnergyAccountDetailResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyAccountDetailResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyAccountDetailResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Plans): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: typings.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
