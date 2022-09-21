package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPricesRequest extends StObject {
  
  /**
    * For an initial request for a list of prices, omit this element. If the number of prices that are not yet complete is greater than the value that you specified for MaxItems, you can use Marker to return additional prices. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.  Used only for all TLDs. If you specify a TLD, don't specify a Marker.
    */
  var Marker: js.UndefOr[PageMarker] = js.undefined
  
  /**
    * Number of Prices to be returned. Used only for all TLDs. If you specify a TLD, don't specify a MaxItems.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  
  /**
    * The TLD for which you want to receive the pricing information. For example. .net. If a Tld value is not provided, a list of prices for all TLDs supported by Route 53 is returned.
    */
  var Tld: js.UndefOr[TldName] = js.undefined
}
object ListPricesRequest {
  
  inline def apply(): ListPricesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPricesRequest]
  }
  
  extension [Self <: ListPricesRequest](x: Self) {
    
    inline def setMarker(value: PageMarker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setTld(value: TldName): Self = StObject.set(x, "Tld", value.asInstanceOf[js.Any])
    
    inline def setTldUndefined: Self = StObject.set(x, "Tld", js.undefined)
  }
}
