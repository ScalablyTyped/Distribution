package typings.bounceJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BounceOptions[T] extends js.Object {
  var bounces: js.UndefOr[Double] = js.native
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String] = js.native
  var from: T = js.native
  var stiffness: js.UndefOr[Double] = js.native
  var to: T = js.native
}

object BounceOptions {
  @scala.inline
  def apply[T](from: T, to: T): BounceOptions[T] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceOptions[T]]
  }
  @scala.inline
  implicit class BounceOptionsOps[Self <: BounceOptions[_], T] (val x: Self with BounceOptions[T]) extends AnyVal {
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
    def setFrom(value: T): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: T): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounces(value: Double): Self = this.set("bounces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounces: Self = this.set("bounces", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStiffness: Self = this.set("stiffness", js.undefined)
  }
  
}

