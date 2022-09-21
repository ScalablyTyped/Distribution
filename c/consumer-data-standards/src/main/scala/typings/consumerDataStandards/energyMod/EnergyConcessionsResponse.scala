package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Concessions
import typings.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyConcessionsResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Concessions
  
  var links: Self
  
  var meta: StringDictionary[Any]
}
object EnergyConcessionsResponse {
  
  inline def apply(data: Concessions, links: Self, meta: StringDictionary[Any]): EnergyConcessionsResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyConcessionsResponse]
  }
  
  extension [Self <: EnergyConcessionsResponse](x: Self) {
    
    inline def setData(value: Concessions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: typings.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
