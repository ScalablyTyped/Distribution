package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2PulleyJointDef extends b2JointDef {
  
  /**
    * Initialize the bodies, anchors, and length using the world anchors.
    * @param bA Body A.
    * @param bB Body B.
    * @param gaA Ground anchor A.
    * @param gaB Ground anchor B.
    * @param anchorA Anchor A.
    * @param anchorB Anchor B.
    **/
  def Initialize(bA: b2Body, bB: b2Body, gaA: b2Vec2, gaB: b2Vec2, anchorA: b2Vec2, anchorB: b2Vec2): Unit = js.native
  
  /**
    * The first ground anchor in world coordinates. This point never moves.
    **/
  var groundAnchorA: b2Vec2 = js.native
  
  /**
    * The second ground anchor in world coordinates. This point never moves.
    **/
  var groundAnchorB: b2Vec2 = js.native
  
  /**
    * The a reference length for the segment attached to bodyA.
    **/
  var lengthA: Double = js.native
  
  /**
    * The a reference length for the segment attached to bodyB.
    **/
  var lengthB: Double = js.native
  
  /**
    * The local anchor point relative to body1's origin.
    **/
  var localAnchorA: b2Vec2 = js.native
  
  /**
    * The local anchor point relative to body2's origin.
    **/
  var localAnchorB: b2Vec2 = js.native
  
  /**
    * The maximum length of the segment attached to bodyA.
    **/
  var maxLengthA: Double = js.native
  
  /**
    * The maximum length of the segment attached to bodyB.
    **/
  var maxLengthB: Double = js.native
  
  /**
    * The pulley ratio, used to simulate a block-and-tackle.
    **/
  var ratio: Double = js.native
}
object b2PulleyJointDef {
  
  @scala.inline
  def apply(
    Initialize: (b2Body, b2Body, b2Vec2, b2Vec2, b2Vec2, b2Vec2) => Unit,
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    groundAnchorA: b2Vec2,
    groundAnchorB: b2Vec2,
    lengthA: Double,
    lengthB: Double,
    localAnchorA: b2Vec2,
    localAnchorB: b2Vec2,
    maxLengthA: Double,
    maxLengthB: Double,
    ratio: Double,
    `type`: Double,
    userData: js.Any
  ): b2PulleyJointDef = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction6(Initialize), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], groundAnchorA = groundAnchorA.asInstanceOf[js.Any], groundAnchorB = groundAnchorB.asInstanceOf[js.Any], lengthA = lengthA.asInstanceOf[js.Any], lengthB = lengthB.asInstanceOf[js.Any], localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], maxLengthA = maxLengthA.asInstanceOf[js.Any], maxLengthB = maxLengthB.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2PulleyJointDef]
  }
  
  @scala.inline
  implicit class b2PulleyJointDefMutableBuilder[Self <: b2PulleyJointDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroundAnchorA(value: b2Vec2): Self = StObject.set(x, "groundAnchorA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundAnchorB(value: b2Vec2): Self = StObject.set(x, "groundAnchorB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialize(value: (b2Body, b2Body, b2Vec2, b2Vec2, b2Vec2, b2Vec2) => Unit): Self = StObject.set(x, "Initialize", js.Any.fromFunction6(value))
    
    @scala.inline
    def setLengthA(value: Double): Self = StObject.set(x, "lengthA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthB(value: Double): Self = StObject.set(x, "lengthB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorA(value: b2Vec2): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAnchorB(value: b2Vec2): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthA(value: Double): Self = StObject.set(x, "maxLengthA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthB(value: Double): Self = StObject.set(x, "maxLengthB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
  }
}
