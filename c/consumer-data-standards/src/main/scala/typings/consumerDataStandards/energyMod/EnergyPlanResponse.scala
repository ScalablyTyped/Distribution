package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.BrandName
import typings.consumerDataStandards.anon.Self
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyPlanResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: BrandName
  
  var links: Self
  
  var meta: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object EnergyPlanResponse {
  
  inline def apply(data: BrandName, links: Self): EnergyPlanResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyPlanResponse]
  }
  
  extension [Self <: EnergyPlanResponse](x: Self) {
    
    inline def setData(value: BrandName): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: typings.consumerDataStandards.anon.Self): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
