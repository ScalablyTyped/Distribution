package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntersectionInfo extends StObject {
  
  var bu: Nullable[Double]
  
  var bv: Nullable[Double]
  
  var distance: Double
  
  var faceId: Double
  
  var subMeshId: Double
}
object IntersectionInfo {
  
  inline def apply(distance: Double, faceId: Double, subMeshId: Double): IntersectionInfo = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any], subMeshId = subMeshId.asInstanceOf[js.Any], bu = null, bv = null)
    __obj.asInstanceOf[IntersectionInfo]
  }
  
  extension [Self <: IntersectionInfo](x: Self) {
    
    inline def setBu(value: Nullable[Double]): Self = StObject.set(x, "bu", value.asInstanceOf[js.Any])
    
    inline def setBuNull: Self = StObject.set(x, "bu", null)
    
    inline def setBv(value: Nullable[Double]): Self = StObject.set(x, "bv", value.asInstanceOf[js.Any])
    
    inline def setBvNull: Self = StObject.set(x, "bv", null)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setFaceId(value: Double): Self = StObject.set(x, "faceId", value.asInstanceOf[js.Any])
    
    inline def setSubMeshId(value: Double): Self = StObject.set(x, "subMeshId", value.asInstanceOf[js.Any])
  }
}
