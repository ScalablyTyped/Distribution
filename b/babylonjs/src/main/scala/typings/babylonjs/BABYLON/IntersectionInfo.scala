package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionInfo extends js.Object {
  
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
  implicit class IntersectionInfoOps[Self <: IntersectionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceId(value: Double): Self = this.set("faceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMeshId(value: Double): Self = this.set("subMeshId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBu(value: Nullable[Double]): Self = this.set("bu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuNull: Self = this.set("bu", null)
    
    @scala.inline
    def setBv(value: Nullable[Double]): Self = this.set("bv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBvNull: Self = this.set("bv", null)
  }
}
