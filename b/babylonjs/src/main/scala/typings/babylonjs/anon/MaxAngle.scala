package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Bone
import typings.babylonjs.BABYLON.TransformNode
import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxAngle extends StObject {
  
  var bendAxis: js.UndefOr[Vector3] = js.undefined
  
  var maxAngle: js.UndefOr[Double] = js.undefined
  
  var poleAngle: js.UndefOr[Double] = js.undefined
  
  var poleTargetBone: js.UndefOr[Bone] = js.undefined
  
  var poleTargetLocalOffset: js.UndefOr[Vector3] = js.undefined
  
  var poleTargetMesh: js.UndefOr[TransformNode] = js.undefined
  
  var slerpAmount: js.UndefOr[Double] = js.undefined
  
  var targetMesh: js.UndefOr[TransformNode] = js.undefined
}
object MaxAngle {
  
  inline def apply(): MaxAngle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxAngle]
  }
  
  extension [Self <: MaxAngle](x: Self) {
    
    inline def setBendAxis(value: Vector3): Self = StObject.set(x, "bendAxis", value.asInstanceOf[js.Any])
    
    inline def setBendAxisUndefined: Self = StObject.set(x, "bendAxis", js.undefined)
    
    inline def setMaxAngle(value: Double): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
    
    inline def setMaxAngleUndefined: Self = StObject.set(x, "maxAngle", js.undefined)
    
    inline def setPoleAngle(value: Double): Self = StObject.set(x, "poleAngle", value.asInstanceOf[js.Any])
    
    inline def setPoleAngleUndefined: Self = StObject.set(x, "poleAngle", js.undefined)
    
    inline def setPoleTargetBone(value: Bone): Self = StObject.set(x, "poleTargetBone", value.asInstanceOf[js.Any])
    
    inline def setPoleTargetBoneUndefined: Self = StObject.set(x, "poleTargetBone", js.undefined)
    
    inline def setPoleTargetLocalOffset(value: Vector3): Self = StObject.set(x, "poleTargetLocalOffset", value.asInstanceOf[js.Any])
    
    inline def setPoleTargetLocalOffsetUndefined: Self = StObject.set(x, "poleTargetLocalOffset", js.undefined)
    
    inline def setPoleTargetMesh(value: TransformNode): Self = StObject.set(x, "poleTargetMesh", value.asInstanceOf[js.Any])
    
    inline def setPoleTargetMeshUndefined: Self = StObject.set(x, "poleTargetMesh", js.undefined)
    
    inline def setSlerpAmount(value: Double): Self = StObject.set(x, "slerpAmount", value.asInstanceOf[js.Any])
    
    inline def setSlerpAmountUndefined: Self = StObject.set(x, "slerpAmount", js.undefined)
    
    inline def setTargetMesh(value: TransformNode): Self = StObject.set(x, "targetMesh", value.asInstanceOf[js.Any])
    
    inline def setTargetMeshUndefined: Self = StObject.set(x, "targetMesh", js.undefined)
  }
}
