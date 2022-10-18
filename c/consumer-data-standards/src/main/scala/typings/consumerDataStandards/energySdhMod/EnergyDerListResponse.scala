package typings.consumerDataStandards.energySdhMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkDerRecords
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyDerListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DictkDerRecords
  
  var links: First
  
  var meta: TotalPages
}
object EnergyDerListResponse {
  
  inline def apply(data: DictkDerRecords, links: First, meta: TotalPages): EnergyDerListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyDerListResponse]
  }
  
  extension [Self <: EnergyDerListResponse](x: Self) {
    
    inline def setData(value: DictkDerRecords): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
