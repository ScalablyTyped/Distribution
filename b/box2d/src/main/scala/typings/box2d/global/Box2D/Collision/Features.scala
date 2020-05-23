package typings.box2d.global.Box2D.Collision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.Features")
@js.native
class Features ()
  extends typings.box2d.Box2D.Collision.Features {
  /**
    * A value of 1 indicates that the reference edge is on shape2.
    **/
  /* CompleteClass */
  override var flip: Double = js.native
  /**
    * The edge most anti-parallel to the reference edge.
    **/
  /* CompleteClass */
  override var incidentEdge: Double = js.native
  /**
    * The vertex (0 or 1) on the incident edge that was clipped.
    **/
  /* CompleteClass */
  override var incidentVertex: Double = js.native
  /**
    * The edge that defines the outward contact normal.
    **/
  /* CompleteClass */
  override var referenceEdge: Double = js.native
}

