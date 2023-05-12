package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.Cartesian3
import typings.cesiumEngine.mod.OrthographicFrustum
import typings.cesiumEngine.mod.PerspectiveFrustum
import typings.cesiumEngine.mod.Quaternion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Orientation extends StObject {
  
  var frustum: PerspectiveFrustum | OrthographicFrustum
  
  var orientation: Quaternion
  
  var origin: Cartesian3
}
object Orientation {
  
  inline def apply(frustum: PerspectiveFrustum | OrthographicFrustum, orientation: Quaternion, origin: Cartesian3): Orientation = {
    val __obj = js.Dynamic.literal(frustum = frustum.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Orientation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Orientation] (val x: Self) extends AnyVal {
    
    inline def setFrustum(value: PerspectiveFrustum | OrthographicFrustum): Self = StObject.set(x, "frustum", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Quaternion): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Cartesian3): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
