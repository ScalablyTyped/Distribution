package typings.box2d.global.Box2D.Collision

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2ContactPoint")
@js.native
class b2ContactPoint ()
  extends typings.box2d.Box2D.Collision.b2ContactPoint {
  /**
    * The combined friction coefficient.
    **/
  /* CompleteClass */
  override var friction: Double = js.native
  /**
    * The contact id identifies the features in contact.
    **/
  /* CompleteClass */
  override var id: typings.box2d.Box2D.Collision.b2ContactID = js.native
  /**
    * Points from shape1 to shape2.
    **/
  /* CompleteClass */
  override var normal: b2Vec2 = js.native
  /**
    * Position in world coordinates.
    **/
  /* CompleteClass */
  override var position: b2Vec2 = js.native
  /**
    * The combined restitution coefficient.
    **/
  /* CompleteClass */
  override var restitution: Double = js.native
  /**
    * The separation is negative when shapes are touching.
    **/
  /* CompleteClass */
  override var separation: Double = js.native
  /**
    * The first shape.
    **/
  /* CompleteClass */
  override var shape1: b2Shape = js.native
  /**
    * The second shape.
    **/
  /* CompleteClass */
  override var shape2: b2Shape = js.native
  /**
    * Velocity of point on body2 relative to point on body1 (pre-solver).
    **/
  /* CompleteClass */
  override var velocity: b2Vec2 = js.native
}

