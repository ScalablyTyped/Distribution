package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGeoMatchSetResponse extends js.Object {
  
  /**
    * Information about the GeoMatchSet that you specified in the GetGeoMatchSet request. This includes the Type, which for a GeoMatchContraint is always Country, as well as the Value, which is the identifier for a specific country.
    */
  var GeoMatchSet: js.UndefOr[typings.awsSdk.wafMod.GeoMatchSet] = js.native
}
object GetGeoMatchSetResponse {
  
  @scala.inline
  def apply(): GetGeoMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGeoMatchSetResponse]
  }
  
  @scala.inline
  implicit class GetGeoMatchSetResponseOps[Self <: GetGeoMatchSetResponse] (val x: Self) extends AnyVal {
    
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
    def setGeoMatchSet(value: GeoMatchSet): Self = this.set("GeoMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoMatchSet: Self = this.set("GeoMatchSet", js.undefined)
  }
}
