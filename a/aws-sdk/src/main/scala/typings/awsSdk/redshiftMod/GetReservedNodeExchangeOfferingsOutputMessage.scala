package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReservedNodeExchangeOfferingsOutputMessage extends StObject {
  
  /**
    * An optional parameter that specifies the starting point for returning a set of response records. When the results of a GetReservedNodeExchangeOfferings request exceed the value specified in MaxRecords, Amazon Redshift returns a value in the marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * Returns an array of ReservedNodeOffering objects.
    */
  var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined
}
object GetReservedNodeExchangeOfferingsOutputMessage {
  
  @scala.inline
  def apply(): GetReservedNodeExchangeOfferingsOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReservedNodeExchangeOfferingsOutputMessage]
  }
  
  @scala.inline
  implicit class GetReservedNodeExchangeOfferingsOutputMessageMutableBuilder[Self <: GetReservedNodeExchangeOfferingsOutputMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setReservedNodeOfferings(value: ReservedNodeOfferingList): Self = StObject.set(x, "ReservedNodeOfferings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNodeOfferingsUndefined: Self = StObject.set(x, "ReservedNodeOfferings", js.undefined)
    
    @scala.inline
    def setReservedNodeOfferingsVarargs(value: ReservedNodeOffering*): Self = StObject.set(x, "ReservedNodeOfferings", js.Array(value :_*))
  }
}
