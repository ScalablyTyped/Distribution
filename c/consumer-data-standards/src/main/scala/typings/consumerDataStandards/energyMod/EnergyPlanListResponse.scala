package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.PlansArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: PlansArray
  
  var links: LinksPaginated
  
  var meta: MetaPaginated
}
object EnergyPlanListResponse {
  
  inline def apply(data: PlansArray, links: LinksPaginated, meta: MetaPaginated): EnergyPlanListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanListResponse]
  }
  
  extension [Self <: EnergyPlanListResponse](x: Self) {
    
    inline def setData(value: PlansArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: LinksPaginated): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: MetaPaginated): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
