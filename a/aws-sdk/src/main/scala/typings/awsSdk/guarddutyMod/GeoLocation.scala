package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoLocation extends StObject {
  
  /**
    * The latitude information of the remote IP address.
    */
  var Lat: js.UndefOr[Double] = js.undefined
  
  /**
    * The longitude information of the remote IP address.
    */
  var Lon: js.UndefOr[Double] = js.undefined
}
object GeoLocation {
  
  @scala.inline
  def apply(): GeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocation]
  }
  
  @scala.inline
  implicit class GeoLocationMutableBuilder[Self <: GeoLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "Lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatUndefined: Self = StObject.set(x, "Lat", js.undefined)
    
    @scala.inline
    def setLon(value: Double): Self = StObject.set(x, "Lon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLonUndefined: Self = StObject.set(x, "Lon", js.undefined)
  }
}
