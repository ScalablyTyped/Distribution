package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: EnergyPlanDetail
  
  var links: LinksPaginated
  
  var meta: js.UndefOr[MetaPaginated | Null] = js.undefined
}
object EnergyPlanResponse {
  
  inline def apply(data: EnergyPlanDetail, links: LinksPaginated): EnergyPlanResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyPlanResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: EnergyPlanDetail): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: LinksPaginated): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: MetaPaginated): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaNull: Self = StObject.set(x, "meta", null)
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
