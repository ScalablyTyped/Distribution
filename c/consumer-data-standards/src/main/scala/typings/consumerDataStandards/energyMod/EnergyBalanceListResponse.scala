package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DictkBalances
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyBalanceListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: DictkBalances
  
  var links: LinksPaginated
  
  var meta: MetaPaginated
}
object EnergyBalanceListResponse {
  
  inline def apply(data: DictkBalances, links: LinksPaginated, meta: MetaPaginated): EnergyBalanceListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyBalanceListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyBalanceListResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: DictkBalances): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: LinksPaginated): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: MetaPaginated): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
