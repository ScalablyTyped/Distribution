package typings.box2d.global.Box2D.Collision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2SimplexCache")
@js.native
class b2SimplexCache ()
  extends typings.box2d.Box2D.Collision.b2SimplexCache {
  /**
    * Number in cache.
    **/
  /* CompleteClass */
  override var count: Double = js.native
  /**
    * Vertices on shape a.
    **/
  /* CompleteClass */
  override var indexA: js.Array[Double] = js.native
  /**
    * Vertices on shape b.
    **/
  /* CompleteClass */
  override var indexB: js.Array[Double] = js.native
  /**
    * Length or area.
    **/
  /* CompleteClass */
  override var metric: Double = js.native
}

