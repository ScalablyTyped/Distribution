package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrontUVs extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var diameter: js.UndefOr[Double] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var tessellation: js.UndefOr[Double] = js.native
  
  var thickness: js.UndefOr[Double] = js.native
}
object FrontUVs {
  
  @scala.inline
  def apply(): FrontUVs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrontUVs]
  }
  
  @scala.inline
  implicit class FrontUVsMutableBuilder[Self <: FrontUVs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    @scala.inline
    def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    @scala.inline
    def setTessellation(value: Double): Self = StObject.set(x, "tessellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTessellationUndefined: Self = StObject.set(x, "tessellation", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
  }
}
