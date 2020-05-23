package typings.box2d.global.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2DistanceOutput")
@js.native
class b2DistanceOutput ()
  extends typings.box2d.Box2D.Collision.b2DistanceOutput {
  /**
    *  Calculated distance.
    **/
  /* CompleteClass */
  override var distance: Double = js.native
  /**
    * Number of gjk iterations used in calculation.
    **/
  /* CompleteClass */
  override var iterations: Double = js.native
  /**
    * Closest point on shape A.
    **/
  /* CompleteClass */
  override var pointA: b2Vec2 = js.native
  /**
    * Closest point on shape B.
    **/
  /* CompleteClass */
  override var pointB: b2Vec2 = js.native
}

