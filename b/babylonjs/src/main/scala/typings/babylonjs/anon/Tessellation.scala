package typings.babylonjs.anon

import typings.babylonjs.mathsMathDotvectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tessellation extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.undefined
  
  var diameter: js.UndefOr[Double] = js.undefined
  
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  var tessellation: js.UndefOr[Double] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
  
  var updatable: js.UndefOr[Boolean] = js.undefined
}
object Tessellation {
  
  inline def apply(): Tessellation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tessellation]
  }
  
  extension [Self <: Tessellation](x: Self) {
    
    inline def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    inline def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    inline def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    inline def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    inline def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    inline def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setTessellation(value: Double): Self = StObject.set(x, "tessellation", value.asInstanceOf[js.Any])
    
    inline def setTessellationUndefined: Self = StObject.set(x, "tessellation", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
