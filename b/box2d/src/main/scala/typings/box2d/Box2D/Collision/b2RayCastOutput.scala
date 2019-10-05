package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2RayCastOutput")
@js.native
class b2RayCastOutput () extends js.Object {
  /**
  		* The fraction between p1 and p2 that the collision occurs at.
  		**/
  var fraction: Double = js.native
  /**
  		* The normal at the point of collision.
  		**/
  var normal: b2Vec2 = js.native
}

