package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2ContactPoint extends js.Object {
  
  /**
    * The combined friction coefficient.
    **/
  var friction: Double = js.native
  
  /**
    * The contact id identifies the features in contact.
    **/
  var id: b2ContactID = js.native
  
  /**
    * Points from shape1 to shape2.
    **/
  var normal: b2Vec2 = js.native
  
  /**
    * Position in world coordinates.
    **/
  var position: b2Vec2 = js.native
  
  /**
    * The combined restitution coefficient.
    **/
  var restitution: Double = js.native
  
  /**
    * The separation is negative when shapes are touching.
    **/
  var separation: Double = js.native
  
  /**
    * The first shape.
    **/
  var shape1: b2Shape = js.native
  
  /**
    * The second shape.
    **/
  var shape2: b2Shape = js.native
  
  /**
    * Velocity of point on body2 relative to point on body1 (pre-solver).
    **/
  var velocity: b2Vec2 = js.native
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
  implicit class b2ContactPointOps[Self <: b2ContactPoint] (val x: Self) extends AnyVal {
    
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
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: b2ContactID): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: b2Vec2): Self = this.set("normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: b2Vec2): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestitution(value: Double): Self = this.set("restitution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparation(value: Double): Self = this.set("separation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape1(value: b2Shape): Self = this.set("shape1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape2(value: b2Shape): Self = this.set("shape2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: b2Vec2): Self = this.set("velocity", value.asInstanceOf[js.Any])
  }
}
