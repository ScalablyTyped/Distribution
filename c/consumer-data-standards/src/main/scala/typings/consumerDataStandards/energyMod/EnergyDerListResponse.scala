package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DerRecords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyDerListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DerRecords
  
  var links: LinksPaginated
  
  var meta: MetaPaginated
}
object EnergyDerListResponse {
  
  inline def apply(data: DerRecords, links: LinksPaginated, meta: MetaPaginated): EnergyDerListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyDerListResponse]
  }
  
  extension [Self <: EnergyDerListResponse](x: Self) {
    
    inline def setData(value: DerRecords): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: LinksPaginated): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: MetaPaginated): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
