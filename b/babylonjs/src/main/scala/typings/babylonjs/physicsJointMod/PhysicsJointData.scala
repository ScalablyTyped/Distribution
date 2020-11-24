package typings.babylonjs.physicsJointMod

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsJointData extends js.Object {
  
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
  implicit class PhysicsJointDataOps[Self <: PhysicsJointData] (val x: Self) extends AnyVal {
    
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
    def setCollision(value: Boolean): Self = this.set("collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollision: Self = this.set("collision", js.undefined)
    
    @scala.inline
    def setConnectedAxis(value: Vector3): Self = this.set("connectedAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectedAxis: Self = this.set("connectedAxis", js.undefined)
    
    @scala.inline
    def setConnectedPivot(value: Vector3): Self = this.set("connectedPivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectedPivot: Self = this.set("connectedPivot", js.undefined)
    
    @scala.inline
    def setMainAxis(value: Vector3): Self = this.set("mainAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainAxis: Self = this.set("mainAxis", js.undefined)
    
    @scala.inline
    def setMainPivot(value: Vector3): Self = this.set("mainPivot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainPivot: Self = this.set("mainPivot", js.undefined)
    
    @scala.inline
    def setNativeParams(value: js.Any): Self = this.set("nativeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeParams: Self = this.set("nativeParams", js.undefined)
  }
}
