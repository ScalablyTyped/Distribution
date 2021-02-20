package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
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
  implicit class SpringJointDataMutableBuilder[Self <: SpringJointData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceApplicationCallback(value: () => Unit): Self = StObject.set(x, "forceApplicationCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
  }
}
