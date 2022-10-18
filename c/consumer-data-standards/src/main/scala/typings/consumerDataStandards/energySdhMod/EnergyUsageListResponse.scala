package typings.consumerDataStandards.energySdhMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkReads
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyUsageListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DictkReads
  
  var links: First
  
  var meta: TotalPages
}
object EnergyUsageListResponse {
  
  inline def apply(data: DictkReads, links: First, meta: TotalPages): EnergyUsageListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyUsageListResponse]
  }
  
  extension [Self <: EnergyUsageListResponse](x: Self) {
    
    inline def setData(value: DictkReads): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
