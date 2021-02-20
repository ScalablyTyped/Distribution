package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsJointData extends StObject {
  
  /**
    * The collision of the joint
    */
  var collision: js.UndefOr[Boolean] = js.native
  
  /**
    * The connected axis of the joint
    */
  var connectedAxis: js.UndefOr[Vector3] = js.native
  
  /**
    * The connected pivot of the joint
    */
  var connectedPivot: js.UndefOr[Vector3] = js.native
  
  /**
    * The main axis of the joint
    */
  var mainAxis: js.UndefOr[Vector3] = js.native
  
  /**
    * The main pivot of the joint
    */
  var mainPivot: js.UndefOr[Vector3] = js.native
  
  /**
    * Native Oimo/Cannon/Energy data
    */
  var nativeParams: js.UndefOr[js.Any] = js.native
}
object PhysicsJointData {
  
  @scala.inline
  def apply(): PhysicsJointData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicsJointData]
  }
  
  @scala.inline
  implicit class PhysicsJointDataMutableBuilder[Self <: PhysicsJointData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollision(value: Boolean): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
    
    @scala.inline
    def setConnectedAxis(value: Vector3): Self = StObject.set(x, "connectedAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedAxisUndefined: Self = StObject.set(x, "connectedAxis", js.undefined)
    
    @scala.inline
    def setConnectedPivot(value: Vector3): Self = StObject.set(x, "connectedPivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedPivotUndefined: Self = StObject.set(x, "connectedPivot", js.undefined)
    
    @scala.inline
    def setMainAxis(value: Vector3): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
    
    @scala.inline
    def setMainPivot(value: Vector3): Self = StObject.set(x, "mainPivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainPivotUndefined: Self = StObject.set(x, "mainPivot", js.undefined)
    
    @scala.inline
    def setNativeParams(value: js.Any): Self = StObject.set(x, "nativeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeParamsUndefined: Self = StObject.set(x, "nativeParams", js.undefined)
  }
}
