package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPSCoordinates extends js.Object {
  
  /**
    * The latitude coordinate of the location.
    */
  var Latitude: double = js.native
  
  /**
    * The longitude coordinate of the location.
    */
  var Longitude: double = js.native
}
object GPSCoordinates {
  
  @scala.inline
  def apply(Latitude: double, Longitude: double): GPSCoordinates = {
    val __obj = js.Dynamic.literal(Latitude = Latitude.asInstanceOf[js.Any], Longitude = Longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSCoordinates]
  }
  
  @scala.inline
  implicit class GPSCoordinatesOps[Self <: GPSCoordinates] (val x: Self) extends AnyVal {
    
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
    def setLatitude(value: double): Self = this.set("Latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: double): Self = this.set("Longitude", value.asInstanceOf[js.Any])
  }
}
