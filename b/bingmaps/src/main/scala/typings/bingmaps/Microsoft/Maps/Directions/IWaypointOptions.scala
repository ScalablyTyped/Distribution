package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWaypointOptions extends StObject {
  
  /** 
    * The address string of the waypoint. For example, the following strings are valid for this parameter: "Seattle", "1 Microsoft Way, Redmond, WA". Either the address or location property must be specified.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /** 
    * A boolean indicating whether the waypoint is a via point. A via point is a point along the route that is not a stop point. Set this property to
    * true if you just want the route to pass through this location. Default: false
    */
  var isViaPoint: js.UndefOr[Boolean] = js.undefined
  
  /** The location of the waypoint. Either the address or location property must be specified. */
  var location: js.UndefOr[Location] = js.undefined
}
object IWaypointOptions {
  
  inline def apply(): IWaypointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWaypointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWaypointOptions] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setIsViaPoint(value: Boolean): Self = StObject.set(x, "isViaPoint", value.asInstanceOf[js.Any])
    
    inline def setIsViaPointUndefined: Self = StObject.set(x, "isViaPoint", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
