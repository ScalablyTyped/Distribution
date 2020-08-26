package typings.betterScroll.anon

import typings.betterScroll.mod.BounceObjectOption
import typings.betterScroll.mod.DoubleClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.BsOption> */
@js.native
trait PartialBsOption extends js.Object {
  var HWCompositing: js.UndefOr[Boolean] = js.native
  var autoBlur: js.UndefOr[Boolean] = js.native
  var bindToWrapper: js.UndefOr[Boolean] = js.native
  var bounce: js.UndefOr[Boolean | BounceObjectOption] = js.native
  var bounceTime: js.UndefOr[Double] = js.native
  var click: js.UndefOr[Boolean] = js.native
  var dblclick: js.UndefOr[Boolean | DoubleClick] = js.native
  var deceleration: js.UndefOr[Double] = js.native
  var directionLockThreshold: js.UndefOr[Double] = js.native
  var disableMouse: js.UndefOr[Boolean] = js.native
  var disableTouch: js.UndefOr[Boolean] = js.native
  var eventPassthrough: js.UndefOr[String | Boolean] = js.native
  var flickLimitDistance: js.UndefOr[Double] = js.native
  var flickLimitTime: js.UndefOr[Double] = js.native
  var freeScroll: js.UndefOr[Boolean] = js.native
  var infinity: js.UndefOr[PartialInfinityOption | Boolean] = js.native
  var momentum: js.UndefOr[Boolean] = js.native
  var momentumLimitDistance: js.UndefOr[Double] = js.native
  var momentumLimitTime: js.UndefOr[Double] = js.native
  var mouseWheel: js.UndefOr[PartialMouseWheelOption | Boolean] = js.native
  var observeDOM: js.UndefOr[Boolean] = js.native
  var preventDefault: js.UndefOr[Boolean] = js.native
  var preventDefaultException: js.UndefOr[js.Object] = js.native
  var probeType: js.UndefOr[Double] = js.native
  var pullDownRefresh: js.UndefOr[PartialPullDownOption | Boolean] = js.native
  var pullUpLoad: js.UndefOr[PartialPullUpOption | Boolean] = js.native
  var resizePolling: js.UndefOr[Double] = js.native
  var scrollX: js.UndefOr[Boolean] = js.native
  var scrollY: js.UndefOr[Boolean] = js.native
  var scrollbar: js.UndefOr[PartialScrollBarOption | Boolean] = js.native
  var snap: js.UndefOr[PartialSlideOption | Boolean] = js.native
  var startX: js.UndefOr[Double] = js.native
  var startY: js.UndefOr[Double] = js.native
  var stopPropagation: js.UndefOr[Boolean] = js.native
  var swipeBounceTime: js.UndefOr[Double] = js.native
  var swipeTime: js.UndefOr[Double] = js.native
  var tap: js.UndefOr[Boolean] = js.native
  var useTransform: js.UndefOr[Boolean] = js.native
  var useTransition: js.UndefOr[Boolean] = js.native
  var wheel: js.UndefOr[PartialWheelOption | Boolean] = js.native
  var zoom: js.UndefOr[PartialZoomOption | Boolean] = js.native
}

object PartialBsOption {
  @scala.inline
  def apply(): PartialBsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBsOption]
  }
  @scala.inline
  implicit class PartialBsOptionOps[Self <: PartialBsOption] (val x: Self) extends AnyVal {
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
    def setHWCompositing(value: Boolean): Self = this.set("HWCompositing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHWCompositing: Self = this.set("HWCompositing", js.undefined)
    @scala.inline
    def setAutoBlur(value: Boolean): Self = this.set("autoBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoBlur: Self = this.set("autoBlur", js.undefined)
    @scala.inline
    def setBindToWrapper(value: Boolean): Self = this.set("bindToWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindToWrapper: Self = this.set("bindToWrapper", js.undefined)
    @scala.inline
    def setBounce(value: Boolean | BounceObjectOption): Self = this.set("bounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounce: Self = this.set("bounce", js.undefined)
    @scala.inline
    def setBounceTime(value: Double): Self = this.set("bounceTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounceTime: Self = this.set("bounceTime", js.undefined)
    @scala.inline
    def setClick(value: Boolean): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setDblclick(value: Boolean | DoubleClick): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDblclick: Self = this.set("dblclick", js.undefined)
    @scala.inline
    def setDeceleration(value: Double): Self = this.set("deceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeceleration: Self = this.set("deceleration", js.undefined)
    @scala.inline
    def setDirectionLockThreshold(value: Double): Self = this.set("directionLockThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionLockThreshold: Self = this.set("directionLockThreshold", js.undefined)
    @scala.inline
    def setDisableMouse(value: Boolean): Self = this.set("disableMouse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableMouse: Self = this.set("disableMouse", js.undefined)
    @scala.inline
    def setDisableTouch(value: Boolean): Self = this.set("disableTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTouch: Self = this.set("disableTouch", js.undefined)
    @scala.inline
    def setEventPassthrough(value: String | Boolean): Self = this.set("eventPassthrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventPassthrough: Self = this.set("eventPassthrough", js.undefined)
    @scala.inline
    def setFlickLimitDistance(value: Double): Self = this.set("flickLimitDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlickLimitDistance: Self = this.set("flickLimitDistance", js.undefined)
    @scala.inline
    def setFlickLimitTime(value: Double): Self = this.set("flickLimitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlickLimitTime: Self = this.set("flickLimitTime", js.undefined)
    @scala.inline
    def setFreeScroll(value: Boolean): Self = this.set("freeScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeScroll: Self = this.set("freeScroll", js.undefined)
    @scala.inline
    def setInfinity(value: PartialInfinityOption | Boolean): Self = this.set("infinity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfinity: Self = this.set("infinity", js.undefined)
    @scala.inline
    def setMomentum(value: Boolean): Self = this.set("momentum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMomentum: Self = this.set("momentum", js.undefined)
    @scala.inline
    def setMomentumLimitDistance(value: Double): Self = this.set("momentumLimitDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMomentumLimitDistance: Self = this.set("momentumLimitDistance", js.undefined)
    @scala.inline
    def setMomentumLimitTime(value: Double): Self = this.set("momentumLimitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMomentumLimitTime: Self = this.set("momentumLimitTime", js.undefined)
    @scala.inline
    def setMouseWheel(value: PartialMouseWheelOption | Boolean): Self = this.set("mouseWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseWheel: Self = this.set("mouseWheel", js.undefined)
    @scala.inline
    def setObserveDOM(value: Boolean): Self = this.set("observeDOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserveDOM: Self = this.set("observeDOM", js.undefined)
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    @scala.inline
    def setPreventDefaultException(value: js.Object): Self = this.set("preventDefaultException", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDefaultException: Self = this.set("preventDefaultException", js.undefined)
    @scala.inline
    def setProbeType(value: Double): Self = this.set("probeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProbeType: Self = this.set("probeType", js.undefined)
    @scala.inline
    def setPullDownRefresh(value: PartialPullDownOption | Boolean): Self = this.set("pullDownRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullDownRefresh: Self = this.set("pullDownRefresh", js.undefined)
    @scala.inline
    def setPullUpLoad(value: PartialPullUpOption | Boolean): Self = this.set("pullUpLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullUpLoad: Self = this.set("pullUpLoad", js.undefined)
    @scala.inline
    def setResizePolling(value: Double): Self = this.set("resizePolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizePolling: Self = this.set("resizePolling", js.undefined)
    @scala.inline
    def setScrollX(value: Boolean): Self = this.set("scrollX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollX: Self = this.set("scrollX", js.undefined)
    @scala.inline
    def setScrollY(value: Boolean): Self = this.set("scrollY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollY: Self = this.set("scrollY", js.undefined)
    @scala.inline
    def setScrollbar(value: PartialScrollBarOption | Boolean): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbar: Self = this.set("scrollbar", js.undefined)
    @scala.inline
    def setSnap(value: PartialSlideOption | Boolean): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnap: Self = this.set("snap", js.undefined)
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartX: Self = this.set("startX", js.undefined)
    @scala.inline
    def setStartY(value: Double): Self = this.set("startY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartY: Self = this.set("startY", js.undefined)
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
    @scala.inline
    def setSwipeBounceTime(value: Double): Self = this.set("swipeBounceTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeBounceTime: Self = this.set("swipeBounceTime", js.undefined)
    @scala.inline
    def setSwipeTime(value: Double): Self = this.set("swipeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeTime: Self = this.set("swipeTime", js.undefined)
    @scala.inline
    def setTap(value: Boolean): Self = this.set("tap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTap: Self = this.set("tap", js.undefined)
    @scala.inline
    def setUseTransform(value: Boolean): Self = this.set("useTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTransform: Self = this.set("useTransform", js.undefined)
    @scala.inline
    def setUseTransition(value: Boolean): Self = this.set("useTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTransition: Self = this.set("useTransition", js.undefined)
    @scala.inline
    def setWheel(value: PartialWheelOption | Boolean): Self = this.set("wheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWheel: Self = this.set("wheel", js.undefined)
    @scala.inline
    def setZoom(value: PartialZoomOption | Boolean): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

