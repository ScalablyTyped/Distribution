package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedNodeOfferingsMessage extends js.Object {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of ReservedNodeOffering objects.
    */
  var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.native
}
object ReservedNodeOfferingsMessage {
  
  @scala.inline
  def apply(): ReservedNodeOfferingsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNodeOfferingsMessage]
  }
  
  @scala.inline
  implicit class ReservedNodeOfferingsMessageOps[Self <: ReservedNodeOfferingsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setReservedNodeOfferingsVarargs(value: ReservedNodeOffering*): Self = this.set("ReservedNodeOfferings", js.Array(value :_*))
    
    @scala.inline
    def setReservedNodeOfferings(value: ReservedNodeOfferingList): Self = this.set("ReservedNodeOfferings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedNodeOfferings: Self = this.set("ReservedNodeOfferings", js.undefined)
  }
}
