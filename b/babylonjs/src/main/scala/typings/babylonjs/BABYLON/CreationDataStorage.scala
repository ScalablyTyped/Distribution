package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreationDataStorage extends StObject {
  
  var arc: Double
  
  var cap: Double
  
  var closeArray: js.UndefOr[Boolean] = js.undefined
  
  var closePath: js.UndefOr[Boolean] = js.undefined
  
  var dashSize: Double
  
  var gapSize: Double
  
  var idx: js.Array[Double]
  
  var path3D: Path3D
  
  var pathArray: js.Array[js.Array[Vector3]]
  
  var radius: Double
  
  var tessellation: Double
}
object CreationDataStorage {
  
  inline def apply(
    arc: Double,
    cap: Double,
    dashSize: Double,
    gapSize: Double,
    idx: js.Array[Double],
    path3D: Path3D,
    pathArray: js.Array[js.Array[Vector3]],
    radius: Double,
    tessellation: Double
  ): CreationDataStorage = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], cap = cap.asInstanceOf[js.Any], dashSize = dashSize.asInstanceOf[js.Any], gapSize = gapSize.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], path3D = path3D.asInstanceOf[js.Any], pathArray = pathArray.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tessellation = tessellation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationDataStorage]
  }
  
  extension [Self <: CreationDataStorage](x: Self) {
    
    inline def setArc(value: Double): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    inline def setCap(value: Double): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setCloseArray(value: Boolean): Self = StObject.set(x, "closeArray", value.asInstanceOf[js.Any])
    
    inline def setCloseArrayUndefined: Self = StObject.set(x, "closeArray", js.undefined)
    
    inline def setClosePath(value: Boolean): Self = StObject.set(x, "closePath", value.asInstanceOf[js.Any])
    
    inline def setClosePathUndefined: Self = StObject.set(x, "closePath", js.undefined)
    
    inline def setDashSize(value: Double): Self = StObject.set(x, "dashSize", value.asInstanceOf[js.Any])
    
    inline def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
    
    inline def setIdx(value: js.Array[Double]): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setIdxVarargs(value: Double*): Self = StObject.set(x, "idx", js.Array(value*))
    
    inline def setPath3D(value: Path3D): Self = StObject.set(x, "path3D", value.asInstanceOf[js.Any])
    
    inline def setPathArray(value: js.Array[js.Array[Vector3]]): Self = StObject.set(x, "pathArray", value.asInstanceOf[js.Any])
    
    inline def setPathArrayVarargs(value: js.Array[Vector3]*): Self = StObject.set(x, "pathArray", js.Array(value*))
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setTessellation(value: Double): Self = StObject.set(x, "tessellation", value.asInstanceOf[js.Any])
  }
}
