package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsJointData extends StObject {
  
  /**
    * The collision of the joint
    */
  var collision: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The connected axis of the joint
    */
  var connectedAxis: js.UndefOr[Vector3] = js.undefined
  
  /**
    * The connected pivot of the joint
    */
  var connectedPivot: js.UndefOr[Vector3] = js.undefined
  
  /**
    * The main axis of the joint
    */
  var mainAxis: js.UndefOr[Vector3] = js.undefined
  
  /**
    * The main pivot of the joint
    */
  var mainPivot: js.UndefOr[Vector3] = js.undefined
  
  /**
    * Native Oimo/Cannon/Energy data
    */
  var nativeParams: js.UndefOr[Any] = js.undefined
}
object PhysicsJointData {
  
  inline def apply(): PhysicsJointData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsJointData]
  }
  
  extension [Self <: PhysicsJointData](x: Self) {
    
    inline def setCollision(value: Boolean): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    inline def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
    
    inline def setConnectedAxis(value: Vector3): Self = StObject.set(x, "connectedAxis", value.asInstanceOf[js.Any])
    
    inline def setConnectedAxisUndefined: Self = StObject.set(x, "connectedAxis", js.undefined)
    
    inline def setConnectedPivot(value: Vector3): Self = StObject.set(x, "connectedPivot", value.asInstanceOf[js.Any])
    
    inline def setConnectedPivotUndefined: Self = StObject.set(x, "connectedPivot", js.undefined)
    
    inline def setMainAxis(value: Vector3): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
    
    inline def setMainPivot(value: Vector3): Self = StObject.set(x, "mainPivot", value.asInstanceOf[js.Any])
    
    inline def setMainPivotUndefined: Self = StObject.set(x, "mainPivot", js.undefined)
    
    inline def setNativeParams(value: Any): Self = StObject.set(x, "nativeParams", value.asInstanceOf[js.Any])
    
    inline def setNativeParamsUndefined: Self = StObject.set(x, "nativeParams", js.undefined)
  }
}
