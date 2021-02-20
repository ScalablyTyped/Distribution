package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2FrictionJointDef extends b2JointDef {
  
  /**
    * Initialize the bodies, anchors, axis, and reference angle using the world anchor and world axis.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchor World anchor.
    **/
  def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2): Unit = js.native
  
  /**
    * The local anchor point relative to body1's origin.
    **/
  var localAnchorA: b2Vec2 = js.native
  
  /**
    * The local anchor point relative to body2's origin.
    **/
  var localAnchorB: b2Vec2 = js.native
  
  /**
    * The maximum force in N.
    **/
  var maxForce: Double = js.native
  
  /**
    * The maximum friction torque in N-m.
    **/
  var maxTorque: Double = js.native
}
object b2FrictionJointDef {
  
  @scala.inline
  def apply(
    Initialize: (b2Body, b2Body, b2Vec2) => Unit,
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    localAnchorA: b2Vec2,
    localAnchorB: b2Vec2,
    maxForce: Double,
    maxTorque: Double,
    `type`: Double,
    userData: js.Any
  ): b2FrictionJointDef = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction3(Initialize), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], maxTorque = maxTorque.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FrictionJointDef]
  }
  
  @scala.inline
  implicit class b2FrictionJointDefMutableBuilder[Self <: b2FrictionJointDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialize(value: (b2Body, b2Body, b2Vec2) => Unit): Self = StObject.set(x, "Initialize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLocalAnchorA(value: b2Vec2): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorB(value: b2Vec2): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxForce(value: Double): Self = StObject.set(x, "maxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTorque(value: Double): Self = StObject.set(x, "maxTorque", value.asInstanceOf[js.Any])
  }
}
