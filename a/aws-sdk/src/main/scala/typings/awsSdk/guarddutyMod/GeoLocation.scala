package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoLocation extends js.Object {
  
  /**
    * The latitude information of the remote IP address.
    */
  var Lat: js.UndefOr[Double] = js.native
  
  /**
    * The longitude information of the remote IP address.
    */
  var Lon: js.UndefOr[Double] = js.native
}
object GeoLocation {
  
  @scala.inline
  def apply(): GeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocation]
  }
  
  @scala.inline
  implicit class GeoLocationOps[Self <: GeoLocation] (val x: Self) extends AnyVal {
    
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
    def setLat(value: Double): Self = this.set("Lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLat: Self = this.set("Lat", js.undefined)
    
    @scala.inline
    def setLon(value: Double): Self = this.set("Lon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLon: Self = this.set("Lon", js.undefined)
  }
}
