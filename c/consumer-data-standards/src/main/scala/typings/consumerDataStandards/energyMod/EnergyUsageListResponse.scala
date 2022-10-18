package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Reads
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyUsageListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Reads
  
  var links: LinksPaginated
  
  var meta: MetaPaginated
}
object EnergyUsageListResponse {
  
  inline def apply(data: Reads, links: LinksPaginated, meta: MetaPaginated): EnergyUsageListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyUsageListResponse]
  }
  
  extension [Self <: EnergyUsageListResponse](x: Self) {
    
    inline def setData(value: Reads): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: LinksPaginated): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: MetaPaginated): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
