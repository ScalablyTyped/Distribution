package typings.babylonjs

import typings.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRCubeLayerInit
  extends StObject
     with XRLayerInit {
  
  var orientation: js.UndefOr[DOMPointReadOnly] = js.undefined
}
object XRCubeLayerInit {
  
  inline def apply(space: XRSpace, viewPixelHeight: Double, viewPixelWidth: Double): XRCubeLayerInit = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any], viewPixelHeight = viewPixelHeight.asInstanceOf[js.Any], viewPixelWidth = viewPixelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRCubeLayerInit]
  }
  
  extension [Self <: XRCubeLayerInit](x: Self) {
    
    inline def setOrientation(value: DOMPointReadOnly): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
