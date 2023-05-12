package typings.cesiumEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClampToGround extends StObject {
  
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  
  var routeColor: js.UndefOr[String] = js.undefined
  
  var trackColor: js.UndefOr[String] = js.undefined
  
  var trackImage: js.UndefOr[String] = js.undefined
  
  var waypointImage: js.UndefOr[String] = js.undefined
}
object ClampToGround {
  
  inline def apply(): ClampToGround = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClampToGround]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClampToGround] (val x: Self) extends AnyVal {
    
    inline def setClampToGround(value: Boolean): Self = StObject.set(x, "clampToGround", value.asInstanceOf[js.Any])
    
    inline def setClampToGroundUndefined: Self = StObject.set(x, "clampToGround", js.undefined)
    
    inline def setRouteColor(value: String): Self = StObject.set(x, "routeColor", value.asInstanceOf[js.Any])
    
    inline def setRouteColorUndefined: Self = StObject.set(x, "routeColor", js.undefined)
    
    inline def setTrackColor(value: String): Self = StObject.set(x, "trackColor", value.asInstanceOf[js.Any])
    
    inline def setTrackColorUndefined: Self = StObject.set(x, "trackColor", js.undefined)
    
    inline def setTrackImage(value: String): Self = StObject.set(x, "trackImage", value.asInstanceOf[js.Any])
    
    inline def setTrackImageUndefined: Self = StObject.set(x, "trackImage", js.undefined)
    
    inline def setWaypointImage(value: String): Self = StObject.set(x, "waypointImage", value.asInstanceOf[js.Any])
    
    inline def setWaypointImageUndefined: Self = StObject.set(x, "waypointImage", js.undefined)
  }
}
