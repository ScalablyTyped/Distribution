package typings.babylonjs.anon

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.boneMod.Bone
import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BendAxis extends js.Object {
  
  var bendAxis: js.UndefOr[Vector3] = js.native
  
  var maxAngle: js.UndefOr[Double] = js.native
  
  var poleAngle: js.UndefOr[Double] = js.native
  
  var poleTargetBone: js.UndefOr[Bone] = js.native
  
  var poleTargetLocalOffset: js.UndefOr[Vector3] = js.native
  
  var poleTargetMesh: js.UndefOr[AbstractMesh] = js.native
  
  var slerpAmount: js.UndefOr[Double] = js.native
  
  var targetMesh: js.UndefOr[AbstractMesh] = js.native
}
object BendAxis {
  
  @scala.inline
  def apply(): BendAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BendAxis]
  }
  
  @scala.inline
  implicit class BendAxisOps[Self <: BendAxis] (val x: Self) extends AnyVal {
    
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
    def setBendAxis(value: Vector3): Self = this.set("bendAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBendAxis: Self = this.set("bendAxis", js.undefined)
    
    @scala.inline
    def setMaxAngle(value: Double): Self = this.set("maxAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAngle: Self = this.set("maxAngle", js.undefined)
    
    @scala.inline
    def setPoleAngle(value: Double): Self = this.set("poleAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoleAngle: Self = this.set("poleAngle", js.undefined)
    
    @scala.inline
    def setPoleTargetBone(value: Bone): Self = this.set("poleTargetBone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoleTargetBone: Self = this.set("poleTargetBone", js.undefined)
    
    @scala.inline
    def setPoleTargetLocalOffset(value: Vector3): Self = this.set("poleTargetLocalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoleTargetLocalOffset: Self = this.set("poleTargetLocalOffset", js.undefined)
    
    @scala.inline
    def setPoleTargetMesh(value: AbstractMesh): Self = this.set("poleTargetMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoleTargetMesh: Self = this.set("poleTargetMesh", js.undefined)
    
    @scala.inline
    def setSlerpAmount(value: Double): Self = this.set("slerpAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlerpAmount: Self = this.set("slerpAmount", js.undefined)
    
    @scala.inline
    def setTargetMesh(value: AbstractMesh): Self = this.set("targetMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetMesh: Self = this.set("targetMesh", js.undefined)
  }
}
