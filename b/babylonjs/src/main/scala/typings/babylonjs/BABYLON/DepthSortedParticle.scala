package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthSortedParticle extends js.Object {
  
  /**
    * Particle index
    */
  var idx: Double = js.native
  
  /**
    * Index of the particle in the "indices" array
    */
  var ind: Double = js.native
  
  /**
    * Length of the particle shape in the "indices" array
    */
  var indicesLength: Double = js.native
  
  /**
    * Material index when used with MultiMaterials
    */
  var materialIndex: Double = js.native
  
  /**
    * Squared distance from the particle to the camera
    */
  var sqDistance: Double = js.native
}
object DepthSortedParticle {
  
  @scala.inline
  def apply(idx: Double, ind: Double, indicesLength: Double, materialIndex: Double, sqDistance: Double): DepthSortedParticle = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], ind = ind.asInstanceOf[js.Any], indicesLength = indicesLength.asInstanceOf[js.Any], materialIndex = materialIndex.asInstanceOf[js.Any], sqDistance = sqDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthSortedParticle]
  }
  
  @scala.inline
  implicit class DepthSortedParticleOps[Self <: DepthSortedParticle] (val x: Self) extends AnyVal {
    
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
    def setIdx(value: Double): Self = this.set("idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInd(value: Double): Self = this.set("ind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesLength(value: Double): Self = this.set("indicesLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialIndex(value: Double): Self = this.set("materialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqDistance(value: Double): Self = this.set("sqDistance", value.asInstanceOf[js.Any])
  }
}
