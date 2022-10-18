package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.Vector3
import typings.babylonjs.BABYLON.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RibbonCloseArray extends StObject {
  
  var adjustFrame: js.UndefOr[Boolean] = js.undefined
  
  var backUVs: js.UndefOr[Vector4] = js.undefined
  
  var cap: js.UndefOr[Double] = js.undefined
  
  var closePath: js.UndefOr[Boolean] = js.undefined
  
  var closeShape: js.UndefOr[Boolean] = js.undefined
  
  var firstNormal: js.UndefOr[Vector3] = js.undefined
  
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  
  var instance: js.UndefOr[typings.babylonjs.BABYLON.Mesh] = js.undefined
  
  var invertUV: js.UndefOr[Boolean] = js.undefined
  
  var path: js.Array[Vector3]
  
  var ribbonCloseArray: js.UndefOr[Boolean] = js.undefined
  
  var ribbonClosePath: js.UndefOr[Boolean] = js.undefined
  
  var rotationFunction: js.UndefOr[Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]]] = js.undefined
  
  var scaleFunction: js.UndefOr[Nullable[js.Function2[/* i */ Double, /* distance */ Double, Double]]] = js.undefined
  
  var shape: js.Array[Vector3]
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  var updatable: js.UndefOr[Boolean] = js.undefined
}
object RibbonCloseArray {
  
  inline def apply(path: js.Array[Vector3], shape: js.Array[Vector3]): RibbonCloseArray = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonCloseArray]
  }
  
  extension [Self <: RibbonCloseArray](x: Self) {
    
    inline def setAdjustFrame(value: Boolean): Self = StObject.set(x, "adjustFrame", value.asInstanceOf[js.Any])
    
    inline def setAdjustFrameUndefined: Self = StObject.set(x, "adjustFrame", js.undefined)
    
    inline def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    inline def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    inline def setCap(value: Double): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    inline def setClosePath(value: Boolean): Self = StObject.set(x, "closePath", value.asInstanceOf[js.Any])
    
    inline def setClosePathUndefined: Self = StObject.set(x, "closePath", js.undefined)
    
    inline def setCloseShape(value: Boolean): Self = StObject.set(x, "closeShape", value.asInstanceOf[js.Any])
    
    inline def setCloseShapeUndefined: Self = StObject.set(x, "closeShape", js.undefined)
    
    inline def setFirstNormal(value: Vector3): Self = StObject.set(x, "firstNormal", value.asInstanceOf[js.Any])
    
    inline def setFirstNormalUndefined: Self = StObject.set(x, "firstNormal", js.undefined)
    
    inline def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    inline def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    inline def setInstance(value: typings.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setInvertUV(value: Boolean): Self = StObject.set(x, "invertUV", value.asInstanceOf[js.Any])
    
    inline def setInvertUVUndefined: Self = StObject.set(x, "invertUV", js.undefined)
    
    inline def setPath(value: js.Array[Vector3]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Vector3*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setRibbonCloseArray(value: Boolean): Self = StObject.set(x, "ribbonCloseArray", value.asInstanceOf[js.Any])
    
    inline def setRibbonCloseArrayUndefined: Self = StObject.set(x, "ribbonCloseArray", js.undefined)
    
    inline def setRibbonClosePath(value: Boolean): Self = StObject.set(x, "ribbonClosePath", value.asInstanceOf[js.Any])
    
    inline def setRibbonClosePathUndefined: Self = StObject.set(x, "ribbonClosePath", js.undefined)
    
    inline def setRotationFunction(value: (/* i */ Double, /* distance */ Double) => Double): Self = StObject.set(x, "rotationFunction", js.Any.fromFunction2(value))
    
    inline def setRotationFunctionNull: Self = StObject.set(x, "rotationFunction", null)
    
    inline def setRotationFunctionUndefined: Self = StObject.set(x, "rotationFunction", js.undefined)
    
    inline def setScaleFunction(value: (/* i */ Double, /* distance */ Double) => Double): Self = StObject.set(x, "scaleFunction", js.Any.fromFunction2(value))
    
    inline def setScaleFunctionNull: Self = StObject.set(x, "scaleFunction", null)
    
    inline def setScaleFunctionUndefined: Self = StObject.set(x, "scaleFunction", js.undefined)
    
    inline def setShape(value: js.Array[Vector3]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: Vector3*): Self = StObject.set(x, "shape", js.Array(value*))
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
