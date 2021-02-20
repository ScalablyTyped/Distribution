package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.mathVectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadiusFunction extends StObject {
  
  var arc: js.UndefOr[Double] = js.native
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var cap: js.UndefOr[Double] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var instance: js.UndefOr[typings.babylonjs.meshMod.Mesh] = js.native
  
  var invertUV: js.UndefOr[Boolean] = js.native
  
  var path: js.Array[Vector3] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var radiusFunction: js.UndefOr[js.Function2[/* i */ Double, /* distance */ Double, Double]] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var tessellation: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
}
object RadiusFunction {
  
  @scala.inline
  def apply(path: js.Array[Vector3]): RadiusFunction = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiusFunction]
  }
  
  @scala.inline
  implicit class RadiusFunctionMutableBuilder[Self <: RadiusFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArc(value: Double): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    @scala.inline
    def setCap(value: Double): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    @scala.inline
    def setInstance(value: typings.babylonjs.meshMod.Mesh): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setInvertUV(value: Boolean): Self = StObject.set(x, "invertUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUVUndefined: Self = StObject.set(x, "invertUV", js.undefined)
    
    @scala.inline
    def setPath(value: js.Array[Vector3]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Vector3*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusFunction(value: (/* i */ Double, /* distance */ Double) => Double): Self = StObject.set(x, "radiusFunction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRadiusFunctionUndefined: Self = StObject.set(x, "radiusFunction", js.undefined)
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    @scala.inline
    def setTessellation(value: Double): Self = StObject.set(x, "tessellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTessellationUndefined: Self = StObject.set(x, "tessellation", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
