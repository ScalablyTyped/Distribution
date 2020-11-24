package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocoderResult extends js.Object {
  
  var address: String = js.native
  
  var addressComponents: AddressComponent = js.native
  
  var business: String = js.native
  
  var point: Point = js.native
  
  var surroundingPoi: js.Array[LocalResultPoi] = js.native
}
object GeocoderResult {
  
  @scala.inline
  def apply(
    address: String,
    addressComponents: AddressComponent,
    business: String,
    point: Point,
    surroundingPoi: js.Array[LocalResultPoi]
  ): GeocoderResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressComponents = addressComponents.asInstanceOf[js.Any], business = business.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], surroundingPoi = surroundingPoi.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResult]
  }
  
  @scala.inline
  implicit class GeocoderResultOps[Self <: GeocoderResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressComponents(value: AddressComponent): Self = this.set("addressComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusiness(value: String): Self = this.set("business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundingPoiVarargs(value: LocalResultPoi*): Self = this.set("surroundingPoi", js.Array(value :_*))
    
    @scala.inline
    def setSurroundingPoi(value: js.Array[LocalResultPoi]): Self = this.set("surroundingPoi", value.asInstanceOf[js.Any])
  }
}
