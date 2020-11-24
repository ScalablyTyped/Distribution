package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsImpostorJoint extends js.Object {
  
  /** Defines the impostor that is connected to the main impostor using this joint */
  var connectedImpostor: PhysicsImpostor = js.native
  
  /** Defines the joint itself */
  var joint: PhysicsJoint = js.native
  
  /** Defines the main impostor to which the joint is linked */
  var mainImpostor: PhysicsImpostor = js.native
}
object PhysicsImpostorJoint {
  
  @scala.inline
  def apply(connectedImpostor: PhysicsImpostor, joint: PhysicsJoint, mainImpostor: PhysicsImpostor): PhysicsImpostorJoint = {
    val __obj = js.Dynamic.literal(connectedImpostor = connectedImpostor.asInstanceOf[js.Any], joint = joint.asInstanceOf[js.Any], mainImpostor = mainImpostor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsImpostorJoint]
  }
  
  @scala.inline
  implicit class PhysicsImpostorJointOps[Self <: PhysicsImpostorJoint] (val x: Self) extends AnyVal {
    
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
    def setConnectedImpostor(value: PhysicsImpostor): Self = this.set("connectedImpostor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoint(value: PhysicsJoint): Self = this.set("joint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainImpostor(value: PhysicsImpostor): Self = this.set("mainImpostor", value.asInstanceOf[js.Any])
  }
}
