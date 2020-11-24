package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpringJointData extends PhysicsJointData {
  
  /**
    * Damping of the spring
    */
  var damping: Double = js.native
  
  /** this callback will be called when applying the force to the impostors. */
  def forceApplicationCallback(): Unit = js.native
  
  /**
    * Length of the spring
    */
  var length: Double = js.native
  
  /**
    * Stiffness of the spring
    */
  var stiffness: Double = js.native
}
object SpringJointData {
  
  @scala.inline
  def apply(damping: Double, forceApplicationCallback: () => Unit, length: Double, stiffness: Double): SpringJointData = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], forceApplicationCallback = js.Any.fromFunction0(forceApplicationCallback), length = length.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringJointData]
  }
  
  @scala.inline
  implicit class SpringJointDataOps[Self <: SpringJointData] (val x: Self) extends AnyVal {
    
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
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceApplicationCallback(value: () => Unit): Self = this.set("forceApplicationCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
  }
}
