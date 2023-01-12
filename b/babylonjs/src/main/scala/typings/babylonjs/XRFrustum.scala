package typings.babylonjs

import typings.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRFrustum extends StObject {
  
  var farDistance: Double
  
  var fieldOfView: XRFieldOfView
  
  var orientation: DOMPointReadOnly
  
  var position: DOMPointReadOnly
}
object XRFrustum {
  
  inline def apply(
    farDistance: Double,
    fieldOfView: XRFieldOfView,
    orientation: DOMPointReadOnly,
    position: DOMPointReadOnly
  ): XRFrustum = {
    val __obj = js.Dynamic.literal(farDistance = farDistance.asInstanceOf[js.Any], fieldOfView = fieldOfView.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRFrustum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRFrustum] (val x: Self) extends AnyVal {
    
    inline def setFarDistance(value: Double): Self = StObject.set(x, "farDistance", value.asInstanceOf[js.Any])
    
    inline def setFieldOfView(value: XRFieldOfView): Self = StObject.set(x, "fieldOfView", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: DOMPointReadOnly): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: DOMPointReadOnly): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
