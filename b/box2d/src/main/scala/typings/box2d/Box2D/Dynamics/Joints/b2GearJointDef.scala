package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2GearJointDef
  extends StObject
     with b2JointDef {
  
  /**
    * The first revolute/prismatic joint attached to the gear joint.
    **/
  var joint1: b2Joint
  
  /**
    * The second revolute/prismatic joint attached to the gear joint.
    **/
  var joint2: b2Joint
  
  /**
    * The gear ratio.
    **/
  var ratio: Double
}
object b2GearJointDef {
  
  inline def apply(
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    joint1: b2Joint,
    joint2: b2Joint,
    ratio: Double,
    `type`: Double,
    userData: Any
  ): b2GearJointDef = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], joint1 = joint1.asInstanceOf[js.Any], joint2 = joint2.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2GearJointDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: b2GearJointDef] (val x: Self) extends AnyVal {
    
    inline def setJoint1(value: b2Joint): Self = StObject.set(x, "joint1", value.asInstanceOf[js.Any])
    
    inline def setJoint2(value: b2Joint): Self = StObject.set(x, "joint2", value.asInstanceOf[js.Any])
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
  }
}
