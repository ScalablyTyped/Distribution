package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2DistanceJointDef
  extends StObject
     with b2JointDef {
  
  /**
    * Initialize the bodies, anchors, and length using the world anchors.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchorA Anchor A.
    * @param anchorB Anchor B.
    **/
  def Initialize(bA: b2Body, bB: b2Body, anchorA: b2Vec2, anchorB: b2Vec2): Unit
  
  /**
    * The damping ratio. 0 = no damping, 1 = critical damping.
    **/
  var dampingRatio: Double
  
  /**
    * The mass-spring-damper frequency in Hertz.
    **/
  var frequencyHz: Double
  
  /**
    * The natural length between the anchor points.
    **/
  var length: Double
  
  /**
    * The local anchor point relative to body1's origin.
    **/
  var localAnchorA: b2Vec2
  
  /**
    * The local anchor point relative to body2's origin.
    **/
  var localAnchorB: b2Vec2
}
object b2DistanceJointDef {
  
  inline def apply(
    Initialize: (b2Body, b2Body, b2Vec2, b2Vec2) => Unit,
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    dampingRatio: Double,
    frequencyHz: Double,
    length: Double,
    localAnchorA: b2Vec2,
    localAnchorB: b2Vec2,
    `type`: Double,
    userData: js.Any
  ): b2DistanceJointDef = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction4(Initialize), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], dampingRatio = dampingRatio.asInstanceOf[js.Any], frequencyHz = frequencyHz.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2DistanceJointDef]
  }
  
  extension [Self <: b2DistanceJointDef](x: Self) {
    
    inline def setDampingRatio(value: Double): Self = StObject.set(x, "dampingRatio", value.asInstanceOf[js.Any])
    
    inline def setFrequencyHz(value: Double): Self = StObject.set(x, "frequencyHz", value.asInstanceOf[js.Any])
    
    inline def setInitialize(value: (b2Body, b2Body, b2Vec2, b2Vec2) => Unit): Self = StObject.set(x, "Initialize", js.Any.fromFunction4(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLocalAnchorA(value: b2Vec2): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    inline def setLocalAnchorB(value: b2Vec2): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
  }
}
