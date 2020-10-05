package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAnimationOptions extends js.Object {
  var animateRotate: js.UndefOr[Boolean] = js.native
  var animateScale: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[Easing] = js.native
  var onComplete: js.UndefOr[js.Function1[/* chart */ js.Any, Unit]] = js.native
  var onProgress: js.UndefOr[js.Function1[/* chart */ js.Any, Unit]] = js.native
}

object ChartAnimationOptions {
  @scala.inline
  def apply(): ChartAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnimationOptions]
  }
  @scala.inline
  implicit class ChartAnimationOptionsOps[Self <: ChartAnimationOptions] (val x: Self) extends AnyVal {
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
    def setAnimateRotate(value: Boolean): Self = this.set("animateRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateRotate: Self = this.set("animateRotate", js.undefined)
    @scala.inline
    def setAnimateScale(value: Boolean): Self = this.set("animateScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateScale: Self = this.set("animateScale", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: Easing): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setOnComplete(value: /* chart */ js.Any => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnProgress(value: /* chart */ js.Any => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
  }
  
}

