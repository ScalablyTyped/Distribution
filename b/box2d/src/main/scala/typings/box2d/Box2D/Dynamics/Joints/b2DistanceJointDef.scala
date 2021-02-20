package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2DistanceJointDef extends b2JointDef {
  
  /**
    * Initialize the bodies, anchors, and length using the world anchors.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchorA Anchor A.
    * @param anchorB Anchor B.
    **/
  def Initialize(bA: b2Body, bB: b2Body, anchorA: b2Vec2, anchorB: b2Vec2): Unit = js.native
  
  /**
    * The damping ratio. 0 = no damping, 1 = critical damping.
    **/
  var dampingRatio: Double = js.native
  
  /**
    * The mass-spring-damper frequency in Hertz.
    **/
  var frequencyHz: Double = js.native
  
  /**
    * The natural length between the anchor points.
    **/
  var length: Double = js.native
  
  /**
    * The local anchor point relative to body1's origin.
    **/
  var localAnchorA: b2Vec2 = js.native
  
  /**
    * The local anchor point relative to body2's origin.
    **/
  var localAnchorB: b2Vec2 = js.native
}
object b2DistanceJointDef {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class b2DistanceJointDefMutableBuilder[Self <: b2DistanceJointDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDampingRatio(value: Double): Self = StObject.set(x, "dampingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyHz(value: Double): Self = StObject.set(x, "frequencyHz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialize(value: (b2Body, b2Body, b2Vec2, b2Vec2) => Unit): Self = StObject.set(x, "Initialize", js.Any.fromFunction4(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorA(value: b2Vec2): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorB(value: b2Vec2): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
  }
}
