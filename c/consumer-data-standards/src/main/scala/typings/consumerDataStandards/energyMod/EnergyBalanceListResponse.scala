package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkBalances
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyBalanceListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DictkBalances
  
  var links: First
  
  var meta: TotalPages
}
object EnergyBalanceListResponse {
  
  inline def apply(data: DictkBalances, links: First, meta: TotalPages): EnergyBalanceListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyBalanceListResponse]
  }
  
  extension [Self <: EnergyBalanceListResponse](x: Self) {
    
    inline def setData(value: DictkBalances): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
