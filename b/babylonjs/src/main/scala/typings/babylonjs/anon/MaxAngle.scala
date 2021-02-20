package typings.babylonjs.anon

import typings.babylonjs.BABYLON.AbstractMesh
import typings.babylonjs.BABYLON.Bone
import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxAngle extends StObject {
  
  var bendAxis: js.UndefOr[Vector3] = js.native
  
  var maxAngle: js.UndefOr[Double] = js.native
  
  var poleAngle: js.UndefOr[Double] = js.native
  
  var poleTargetBone: js.UndefOr[Bone] = js.native
  
  var poleTargetLocalOffset: js.UndefOr[Vector3] = js.native
  
  var poleTargetMesh: js.UndefOr[AbstractMesh] = js.native
  
  var slerpAmount: js.UndefOr[Double] = js.native
  
  var targetMesh: js.UndefOr[AbstractMesh] = js.native
}
object MaxAngle {
  
  @scala.inline
  def apply(): MaxAngle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxAngle]
  }
  
  @scala.inline
  implicit class MaxAngleMutableBuilder[Self <: MaxAngle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBendAxis(value: Vector3): Self = StObject.set(x, "bendAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBendAxisUndefined: Self = StObject.set(x, "bendAxis", js.undefined)
    
    @scala.inline
    def setMaxAngle(value: Double): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAngleUndefined: Self = StObject.set(x, "maxAngle", js.undefined)
    
    @scala.inline
    def setPoleAngle(value: Double): Self = StObject.set(x, "poleAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoleAngleUndefined: Self = StObject.set(x, "poleAngle", js.undefined)
    
    @scala.inline
    def setPoleTargetBone(value: Bone): Self = StObject.set(x, "poleTargetBone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoleTargetBoneUndefined: Self = StObject.set(x, "poleTargetBone", js.undefined)
    
    @scala.inline
    def setPoleTargetLocalOffset(value: Vector3): Self = StObject.set(x, "poleTargetLocalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoleTargetLocalOffsetUndefined: Self = StObject.set(x, "poleTargetLocalOffset", js.undefined)
    
    @scala.inline
    def setPoleTargetMesh(value: AbstractMesh): Self = StObject.set(x, "poleTargetMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoleTargetMeshUndefined: Self = StObject.set(x, "poleTargetMesh", js.undefined)
    
    @scala.inline
    def setSlerpAmount(value: Double): Self = StObject.set(x, "slerpAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlerpAmountUndefined: Self = StObject.set(x, "slerpAmount", js.undefined)
    
    @scala.inline
    def setTargetMesh(value: AbstractMesh): Self = StObject.set(x, "targetMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetMeshUndefined: Self = StObject.set(x, "targetMesh", js.undefined)
  }
}
