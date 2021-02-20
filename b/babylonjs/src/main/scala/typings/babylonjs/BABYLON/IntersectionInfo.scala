package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionInfo extends StObject {
  
  var bu: Nullable[Double] = js.native
  
  var bv: Nullable[Double] = js.native
  
  var distance: Double = js.native
  
  var faceId: Double = js.native
  
  var subMeshId: Double = js.native
}
object IntersectionInfo {
  
  @scala.inline
  def apply(distance: Double, faceId: Double, subMeshId: Double): IntersectionInfo = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], faceId = faceId.asInstanceOf[js.Any], subMeshId = subMeshId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionInfo]
  }
  
  @scala.inline
  implicit class IntersectionInfoMutableBuilder[Self <: IntersectionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBu(value: Nullable[Double]): Self = StObject.set(x, "bu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuNull: Self = StObject.set(x, "bu", null)
    
    @scala.inline
    def setBv(value: Nullable[Double]): Self = StObject.set(x, "bv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBvNull: Self = StObject.set(x, "bv", null)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceId(value: Double): Self = StObject.set(x, "faceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMeshId(value: Double): Self = StObject.set(x, "subMeshId", value.asInstanceOf[js.Any])
  }
}
