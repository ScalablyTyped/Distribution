package typings.box2d.Box2D.Dynamics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2FilterData extends js.Object {
  /**
    * The collision category bits. Normally you would just set one bit.
    **/
  var categoryBits: Double = js.native
  /**
    * Collision groups allow a certain group of objects to never collide (negative) or always collide (positive). Zero means no collision group. Non-zero group filtering always wins against the mask bits.
    **/
  var groupIndex: Double = js.native
  /**
    * The collision mask bits. This states the categories that this shape would accept for collision.
    **/
  var maskBits: Double = js.native
  /**
    * Creates a copy of the filter data.
    * @return Copy of this filter data.
    **/
  def Copy(): b2FilterData = js.native
}

object b2FilterData {
  @scala.inline
  def apply(Copy: () => b2FilterData, categoryBits: Double, groupIndex: Double, maskBits: Double): b2FilterData = {
    val __obj = js.Dynamic.literal(Copy = js.Any.fromFunction0(Copy), categoryBits = categoryBits.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], maskBits = maskBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FilterData]
  }
  @scala.inline
  implicit class b2FilterDataOps[Self <: b2FilterData] (val x: Self) extends AnyVal {
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
    def setCopy(value: () => b2FilterData): Self = this.set("Copy", js.Any.fromFunction0(value))
    @scala.inline
    def setCategoryBits(value: Double): Self = this.set("categoryBits", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupIndex(value: Double): Self = this.set("groupIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaskBits(value: Double): Self = this.set("maskBits", value.asInstanceOf[js.Any])
  }
  
}

