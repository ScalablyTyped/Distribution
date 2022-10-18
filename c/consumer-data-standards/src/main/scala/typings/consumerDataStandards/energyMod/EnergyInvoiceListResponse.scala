package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Invoices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyInvoiceListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var data: Invoices
  
  var links: LinksPaginated
  
  var meta: MetaPaginated
}
object EnergyInvoiceListResponse {
  
  inline def apply(data: Invoices, links: LinksPaginated, meta: MetaPaginated): EnergyInvoiceListResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyInvoiceListResponse]
  }
  
  extension [Self <: EnergyInvoiceListResponse](x: Self) {
    
    inline def setData(value: Invoices): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: LinksPaginated): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: MetaPaginated): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
