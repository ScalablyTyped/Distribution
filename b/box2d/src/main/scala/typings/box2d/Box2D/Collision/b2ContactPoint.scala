package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2ContactPoint extends StObject {
  
  /**
    * The combined friction coefficient.
    **/
  var friction: Double
  
  /**
    * The contact id identifies the features in contact.
    **/
  var id: b2ContactID
  
  /**
    * Points from shape1 to shape2.
    **/
  var normal: b2Vec2
  
  /**
    * Position in world coordinates.
    **/
  var position: b2Vec2
  
  /**
    * The combined restitution coefficient.
    **/
  var restitution: Double
  
  /**
    * The separation is negative when shapes are touching.
    **/
  var separation: Double
  
  /**
    * The first shape.
    **/
  var shape1: b2Shape
  
  /**
    * The second shape.
    **/
  var shape2: b2Shape
  
  /**
    * Velocity of point on body2 relative to point on body1 (pre-solver).
    **/
  var velocity: b2Vec2
}
object b2ContactPoint {
  
  @scala.inline
  def apply(
    friction: Double,
    id: b2ContactID,
    normal: b2Vec2,
    position: b2Vec2,
    restitution: Double,
    separation: Double,
    shape1: b2Shape,
    shape2: b2Shape,
    velocity: b2Vec2
  ): b2ContactPoint = {
    val __obj = js.Dynamic.literal(friction = friction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], restitution = restitution.asInstanceOf[js.Any], separation = separation.asInstanceOf[js.Any], shape1 = shape1.asInstanceOf[js.Any], shape2 = shape2.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ContactPoint]
  }
  
  @scala.inline
  implicit class b2ContactPointMutableBuilder[Self <: b2ContactPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: b2ContactID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: b2Vec2): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: b2Vec2): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparation(value: Double): Self = StObject.set(x, "separation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape1(value: b2Shape): Self = StObject.set(x, "shape1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape2(value: b2Shape): Self = StObject.set(x, "shape2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: b2Vec2): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
