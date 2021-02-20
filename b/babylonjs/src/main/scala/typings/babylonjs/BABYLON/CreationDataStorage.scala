package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreationDataStorage extends StObject {
  
  var arc: Double = js.native
  
  var cap: Double = js.native
  
  var closeArray: js.UndefOr[Boolean] = js.native
  
  var closePath: js.UndefOr[Boolean] = js.native
  
  var dashSize: Double = js.native
  
  var gapSize: Double = js.native
  
  var idx: js.Array[Double] = js.native
  
  var path3D: Path3D = js.native
  
  var pathArray: js.Array[js.Array[Vector3]] = js.native
  
  var radius: Double = js.native
  
  var tessellation: Double = js.native
}
object CreationDataStorage {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CreationDataStorageMutableBuilder[Self <: CreationDataStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArc(value: Double): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCap(value: Double): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseArray(value: Boolean): Self = StObject.set(x, "closeArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseArrayUndefined: Self = StObject.set(x, "closeArray", js.undefined)
    
    @scala.inline
    def setClosePath(value: Boolean): Self = StObject.set(x, "closePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosePathUndefined: Self = StObject.set(x, "closePath", js.undefined)
    
    @scala.inline
    def setDashSize(value: Double): Self = StObject.set(x, "dashSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdx(value: js.Array[Double]): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdxVarargs(value: Double*): Self = StObject.set(x, "idx", js.Array(value :_*))
    
    @scala.inline
    def setPath3D(value: Path3D): Self = StObject.set(x, "path3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathArray(value: js.Array[js.Array[Vector3]]): Self = StObject.set(x, "pathArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathArrayVarargs(value: js.Array[Vector3]*): Self = StObject.set(x, "pathArray", js.Array(value :_*))
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTessellation(value: Double): Self = StObject.set(x, "tessellation", value.asInstanceOf[js.Any])
  }
}
