package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpGeoLocation extends StObject {
  
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
  implicit class IpGeoLocationMutableBuilder[Self <: IpGeoLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    @scala.inline
    def setLon(value: double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLonUndefined: Self = StObject.set(x, "lon", js.undefined)
  }
}
