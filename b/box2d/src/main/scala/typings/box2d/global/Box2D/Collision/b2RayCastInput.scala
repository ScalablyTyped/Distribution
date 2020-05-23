package typings.box2d.global.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2RayCastInput")
@js.native
/**
  * Creates a new ray cast input.
  * @param p1 Start point of the ray, default = null.
  * @param p2 End point of the ray, default = null.
  * @param maxFraction Truncate the ray to reach up to this fraction from p1 to p2.
  **/
class b2RayCastInput ()
  extends typings.box2d.Box2D.Collision.b2RayCastInput {
  def this(p1: b2Vec2) = this()
  def this(p1: b2Vec2, p2: b2Vec2) = this()
  def this(p1: b2Vec2, p2: b2Vec2, maxFraction: Double) = this()
  /**
    * Truncate the ray to reach up to this fraction from p1 to p2
    **/
  /* CompleteClass */
  override var maxFraction: Double = js.native
  /**
    * The start point of the ray.
    **/
  /* CompleteClass */
  override var p1: b2Vec2 = js.native
  /**
    * The end point of the ray.
    **/
  /* CompleteClass */
  override var p2: b2Vec2 = js.native
}

