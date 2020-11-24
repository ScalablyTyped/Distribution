package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpGeoLocation extends js.Object {
  
  /**
    * The latitude coordinate of the location, rounded to four decimal places.
    */
  var lat: js.UndefOr[double] = js.native
  
  /**
    * The longitude coordinate of the location, rounded to four decimal places.
    */
  var lon: js.UndefOr[double] = js.native
}
object IpGeoLocation {
  
  @scala.inline
  def apply(): IpGeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpGeoLocation]
  }
  
  @scala.inline
  implicit class IpGeoLocationOps[Self <: IpGeoLocation] (val x: Self) extends AnyVal {
    
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
    def setLat(value: double): Self = this.set("lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    
    @scala.inline
    def setLon(value: double): Self = this.set("lon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLon: Self = this.set("lon", js.undefined)
  }
}
