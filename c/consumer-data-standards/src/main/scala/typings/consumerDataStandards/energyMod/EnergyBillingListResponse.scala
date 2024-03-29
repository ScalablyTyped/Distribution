package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.TransactionsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyBillingListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: TransactionsArray
  
  var links: LinksPaginated
  
  var meta: MetaPaginated
}
object EnergyBillingListResponse {
  
  inline def apply(data: TransactionsArray, links: LinksPaginated, meta: MetaPaginated): EnergyBillingListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyBillingListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyBillingListResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: TransactionsArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: LinksPaginated): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: MetaPaginated): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
