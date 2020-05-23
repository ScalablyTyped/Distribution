package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Mat22
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2OBB extends js.Object {
  /**
    * The rotation matrix.
    **/
  var R: b2Mat22
  /**
    * The local centroid.
    **/
  var center: b2Vec2
  /**
    * The half-widths.
    **/
  var extents: b2Vec2
}

object b2OBB {
  @scala.inline
  def apply(R: b2Mat22, center: b2Vec2, extents: b2Vec2): b2OBB = {
    val __obj = js.Dynamic.literal(R = R.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2OBB]
  }
}

