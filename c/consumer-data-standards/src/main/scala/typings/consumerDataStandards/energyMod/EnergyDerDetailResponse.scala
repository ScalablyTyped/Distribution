package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyDerDetailResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: EnergyDerRecord
  
  var links: Links
  
  var meta: Meta
}
object EnergyDerDetailResponse {
  
  inline def apply(data: EnergyDerRecord, links: Links, meta: Meta): EnergyDerDetailResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyDerDetailResponse]
  }
  
  extension [Self <: EnergyDerDetailResponse](x: Self) {
    
    inline def setData(value: EnergyDerRecord): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
