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
  
  inline def apply(): GeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocation]
  }
  
  extension [Self <: GeoLocation](x: Self) {
    
    inline def setLat(value: Double): Self = StObject.set(x, "Lat", value.asInstanceOf[js.Any])
    
    inline def setLatUndefined: Self = StObject.set(x, "Lat", js.undefined)
    
    inline def setLon(value: Double): Self = StObject.set(x, "Lon", value.asInstanceOf[js.Any])
    
    inline def setLonUndefined: Self = StObject.set(x, "Lon", js.undefined)
  }
}
