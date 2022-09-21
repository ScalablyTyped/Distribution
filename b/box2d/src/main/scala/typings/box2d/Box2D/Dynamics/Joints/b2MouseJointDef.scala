package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2MouseJointDef
  extends StObject
     with b2JointDef {
  
  /**
    * The damping ratio. 0 = no damping, 1 = critical damping.
    **/
  var dampingRatio: Double
  
  /**
    * The response speed.
    **/
  var frequencyHz: Double
  
  /**
    * The maximum constraint force that can be exerted to move the candidate body.
    **/
  var maxForce: Double
}
object b2MouseJointDef {
  
  inline def apply(
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    dampingRatio: Double,
    frequencyHz: Double,
    maxForce: Double,
    `type`: Double,
    userData: Any
  ): b2MouseJointDef = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], dampingRatio = dampingRatio.asInstanceOf[js.Any], frequencyHz = frequencyHz.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2MouseJointDef]
  }
  
  extension [Self <: b2MouseJointDef](x: Self) {
    
    inline def setDampingRatio(value: Double): Self = StObject.set(x, "dampingRatio", value.asInstanceOf[js.Any])
    
    inline def setFrequencyHz(value: Double): Self = StObject.set(x, "frequencyHz", value.asInstanceOf[js.Any])
    
    inline def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
  }
}
