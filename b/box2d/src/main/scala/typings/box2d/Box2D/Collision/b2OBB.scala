package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Mat22
import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2OBB extends js.Object {
  /**
    * The rotation matrix.
    **/
  var R: b2Mat22 = js.native
  /**
    * The local centroid.
    **/
  var center: b2Vec2 = js.native
  /**
    * The half-widths.
    **/
  var extents: b2Vec2 = js.native
}

object b2OBB {
  @scala.inline
  def apply(R: b2Mat22, center: b2Vec2, extents: b2Vec2): b2OBB = {
    val __obj = js.Dynamic.literal(R = R.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2OBB]
  }
  @scala.inline
  implicit class b2OBBOps[Self <: b2OBB] (val x: Self) extends AnyVal {
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
    def setR(value: b2Mat22): Self = this.set("R", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenter(value: b2Vec2): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtents(value: b2Vec2): Self = this.set("extents", value.asInstanceOf[js.Any])
  }
  
}

