package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkTransactions
import typings.consumerDataStandards.anon.First
import typings.consumerDataStandards.anon.TotalPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyBillingListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DictkTransactions
  
  var links: First
  
  var meta: TotalPages
}
object EnergyBillingListResponse {
  
  inline def apply(data: DictkTransactions, links: First, meta: TotalPages): EnergyBillingListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyBillingListResponse]
  }
  
  extension [Self <: EnergyBillingListResponse](x: Self) {
    
    inline def setData(value: DictkTransactions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: First): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: TotalPages): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
