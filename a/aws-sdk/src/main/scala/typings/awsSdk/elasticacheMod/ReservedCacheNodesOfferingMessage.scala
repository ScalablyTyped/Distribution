package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedCacheNodesOfferingMessage extends js.Object {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of reserved cache node offerings. Each element in the list contains detailed information about one offering.
    */
  var ReservedCacheNodesOfferings: js.UndefOr[ReservedCacheNodesOfferingList] = js.native
}
object ReservedCacheNodesOfferingMessage {
  
  @scala.inline
  def apply(): ReservedCacheNodesOfferingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedCacheNodesOfferingMessage]
  }
  
  @scala.inline
  implicit class ReservedCacheNodesOfferingMessageOps[Self <: ReservedCacheNodesOfferingMessage] (val x: Self) extends AnyVal {
    
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
    def setReservedCacheNodesOfferingsVarargs(value: ReservedCacheNodesOffering*): Self = this.set("ReservedCacheNodesOfferings", js.Array(value :_*))
    
    @scala.inline
    def setReservedCacheNodesOfferings(value: ReservedCacheNodesOfferingList): Self = this.set("ReservedCacheNodesOfferings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedCacheNodesOfferings: Self = this.set("ReservedCacheNodesOfferings", js.undefined)
  }
}
