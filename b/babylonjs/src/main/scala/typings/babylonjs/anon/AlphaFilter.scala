package typings.babylonjs.anon

import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.meshesGroundMeshMod.GroundMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlphaFilter extends StObject {
  
  var alphaFilter: js.UndefOr[Double] = js.undefined
  
  var colorFilter: js.UndefOr[Color3] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var onReady: js.UndefOr[js.Function1[/* mesh */ GroundMesh, Unit]] = js.undefined
  
  var subdivisions: js.UndefOr[Double] = js.undefined
  
  var updatable: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object AlphaFilter {
  
  inline def apply(): AlphaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlphaFilter]
  }
  
  extension [Self <: AlphaFilter](x: Self) {
    
    inline def setAlphaFilter(value: Double): Self = StObject.set(x, "alphaFilter", value.asInstanceOf[js.Any])
    
    inline def setAlphaFilterUndefined: Self = StObject.set(x, "alphaFilter", js.undefined)
    
    inline def setColorFilter(value: Color3): Self = StObject.set(x, "colorFilter", value.asInstanceOf[js.Any])
    
    inline def setColorFilterUndefined: Self = StObject.set(x, "colorFilter", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setOnReady(value: /* mesh */ GroundMesh => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
