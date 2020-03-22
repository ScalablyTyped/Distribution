package typings.betterScroll

import typings.betterScroll.mod.BounceObjectOption
import typings.betterScroll.mod.DoubleClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.BsOption> */
trait PartialBsOption extends js.Object {
  var HWCompositing: js.UndefOr[Boolean] = js.undefined
  var autoBlur: js.UndefOr[Boolean] = js.undefined
  var bindToWrapper: js.UndefOr[Boolean] = js.undefined
  var bounce: js.UndefOr[Boolean | BounceObjectOption] = js.undefined
  var bounceTime: js.UndefOr[Double] = js.undefined
  var click: js.UndefOr[Boolean] = js.undefined
  var dblclick: js.UndefOr[Boolean | DoubleClick] = js.undefined
  var deceleration: js.UndefOr[Double] = js.undefined
  var directionLockThreshold: js.UndefOr[Double] = js.undefined
  var disableMouse: js.UndefOr[Boolean] = js.undefined
  var disableTouch: js.UndefOr[Boolean] = js.undefined
  var eventPassthrough: js.UndefOr[String | Boolean] = js.undefined
  var flickLimitDistance: js.UndefOr[Double] = js.undefined
  var flickLimitTime: js.UndefOr[Double] = js.undefined
  var freeScroll: js.UndefOr[Boolean] = js.undefined
  var infinity: js.UndefOr[PartialInfinityOption | Boolean] = js.undefined
  var momentum: js.UndefOr[Boolean] = js.undefined
  var momentumLimitDistance: js.UndefOr[Double] = js.undefined
  var momentumLimitTime: js.UndefOr[Double] = js.undefined
  var mouseWheel: js.UndefOr[PartialMouseWheelOption | Boolean] = js.undefined
  var observeDOM: js.UndefOr[Boolean] = js.undefined
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  var preventDefaultException: js.UndefOr[js.Object] = js.undefined
  var probeType: js.UndefOr[Double] = js.undefined
  var pullDownRefresh: js.UndefOr[PartialPullDownOption | Boolean] = js.undefined
  var pullUpLoad: js.UndefOr[PartialPullUpOption | Boolean] = js.undefined
  var resizePolling: js.UndefOr[Double] = js.undefined
  var scrollX: js.UndefOr[Boolean] = js.undefined
  var scrollY: js.UndefOr[Boolean] = js.undefined
  var scrollbar: js.UndefOr[PartialScrollBarOption | Boolean] = js.undefined
  var snap: js.UndefOr[PartialSlideOption | Boolean] = js.undefined
  var startX: js.UndefOr[Double] = js.undefined
  var startY: js.UndefOr[Double] = js.undefined
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
  var swipeBounceTime: js.UndefOr[Double] = js.undefined
  var swipeTime: js.UndefOr[Double] = js.undefined
  var tap: js.UndefOr[Boolean] = js.undefined
  var useTransform: js.UndefOr[Boolean] = js.undefined
  var useTransition: js.UndefOr[Boolean] = js.undefined
  var wheel: js.UndefOr[PartialWheelOption | Boolean] = js.undefined
  var zoom: js.UndefOr[PartialZoomOption | Boolean] = js.undefined
}

object PartialBsOption {
  @scala.inline
  def apply(
    HWCompositing: js.UndefOr[Boolean] = js.undefined,
    autoBlur: js.UndefOr[Boolean] = js.undefined,
    bindToWrapper: js.UndefOr[Boolean] = js.undefined,
    bounce: Boolean | BounceObjectOption = null,
    bounceTime: Int | Double = null,
    click: js.UndefOr[Boolean] = js.undefined,
    dblclick: Boolean | DoubleClick = null,
    deceleration: Int | Double = null,
    directionLockThreshold: Int | Double = null,
    disableMouse: js.UndefOr[Boolean] = js.undefined,
    disableTouch: js.UndefOr[Boolean] = js.undefined,
    eventPassthrough: String | Boolean = null,
    flickLimitDistance: Int | Double = null,
    flickLimitTime: Int | Double = null,
    freeScroll: js.UndefOr[Boolean] = js.undefined,
    infinity: PartialInfinityOption | Boolean = null,
    momentum: js.UndefOr[Boolean] = js.undefined,
    momentumLimitDistance: Int | Double = null,
    momentumLimitTime: Int | Double = null,
    mouseWheel: PartialMouseWheelOption | Boolean = null,
    observeDOM: js.UndefOr[Boolean] = js.undefined,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    preventDefaultException: js.Object = null,
    probeType: Int | Double = null,
    pullDownRefresh: PartialPullDownOption | Boolean = null,
    pullUpLoad: PartialPullUpOption | Boolean = null,
    resizePolling: Int | Double = null,
    scrollX: js.UndefOr[Boolean] = js.undefined,
    scrollY: js.UndefOr[Boolean] = js.undefined,
    scrollbar: PartialScrollBarOption | Boolean = null,
    snap: PartialSlideOption | Boolean = null,
    startX: Int | Double = null,
    startY: Int | Double = null,
    stopPropagation: js.UndefOr[Boolean] = js.undefined,
    swipeBounceTime: Int | Double = null,
    swipeTime: Int | Double = null,
    tap: js.UndefOr[Boolean] = js.undefined,
    useTransform: js.UndefOr[Boolean] = js.undefined,
    useTransition: js.UndefOr[Boolean] = js.undefined,
    wheel: PartialWheelOption | Boolean = null,
    zoom: PartialZoomOption | Boolean = null
  ): PartialBsOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(HWCompositing)) __obj.updateDynamic("HWCompositing")(HWCompositing.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBlur)) __obj.updateDynamic("autoBlur")(autoBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(bindToWrapper)) __obj.updateDynamic("bindToWrapper")(bindToWrapper.asInstanceOf[js.Any])
    if (bounce != null) __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    if (bounceTime != null) __obj.updateDynamic("bounceTime")(bounceTime.asInstanceOf[js.Any])
    if (!js.isUndefined(click)) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (dblclick != null) __obj.updateDynamic("dblclick")(dblclick.asInstanceOf[js.Any])
    if (deceleration != null) __obj.updateDynamic("deceleration")(deceleration.asInstanceOf[js.Any])
    if (directionLockThreshold != null) __obj.updateDynamic("directionLockThreshold")(directionLockThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMouse)) __obj.updateDynamic("disableMouse")(disableMouse.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouch)) __obj.updateDynamic("disableTouch")(disableTouch.asInstanceOf[js.Any])
    if (eventPassthrough != null) __obj.updateDynamic("eventPassthrough")(eventPassthrough.asInstanceOf[js.Any])
    if (flickLimitDistance != null) __obj.updateDynamic("flickLimitDistance")(flickLimitDistance.asInstanceOf[js.Any])
    if (flickLimitTime != null) __obj.updateDynamic("flickLimitTime")(flickLimitTime.asInstanceOf[js.Any])
    if (!js.isUndefined(freeScroll)) __obj.updateDynamic("freeScroll")(freeScroll.asInstanceOf[js.Any])
    if (infinity != null) __obj.updateDynamic("infinity")(infinity.asInstanceOf[js.Any])
    if (!js.isUndefined(momentum)) __obj.updateDynamic("momentum")(momentum.asInstanceOf[js.Any])
    if (momentumLimitDistance != null) __obj.updateDynamic("momentumLimitDistance")(momentumLimitDistance.asInstanceOf[js.Any])
    if (momentumLimitTime != null) __obj.updateDynamic("momentumLimitTime")(momentumLimitTime.asInstanceOf[js.Any])
    if (mouseWheel != null) __obj.updateDynamic("mouseWheel")(mouseWheel.asInstanceOf[js.Any])
    if (!js.isUndefined(observeDOM)) __obj.updateDynamic("observeDOM")(observeDOM.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (preventDefaultException != null) __obj.updateDynamic("preventDefaultException")(preventDefaultException.asInstanceOf[js.Any])
    if (probeType != null) __obj.updateDynamic("probeType")(probeType.asInstanceOf[js.Any])
    if (pullDownRefresh != null) __obj.updateDynamic("pullDownRefresh")(pullDownRefresh.asInstanceOf[js.Any])
    if (pullUpLoad != null) __obj.updateDynamic("pullUpLoad")(pullUpLoad.asInstanceOf[js.Any])
    if (resizePolling != null) __obj.updateDynamic("resizePolling")(resizePolling.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollX)) __obj.updateDynamic("scrollX")(scrollX.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollY)) __obj.updateDynamic("scrollY")(scrollY.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (snap != null) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (startX != null) __obj.updateDynamic("startX")(startX.asInstanceOf[js.Any])
    if (startY != null) __obj.updateDynamic("startY")(startY.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation.asInstanceOf[js.Any])
    if (swipeBounceTime != null) __obj.updateDynamic("swipeBounceTime")(swipeBounceTime.asInstanceOf[js.Any])
    if (swipeTime != null) __obj.updateDynamic("swipeTime")(swipeTime.asInstanceOf[js.Any])
    if (!js.isUndefined(tap)) __obj.updateDynamic("tap")(tap.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransform)) __obj.updateDynamic("useTransform")(useTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransition)) __obj.updateDynamic("useTransition")(useTransition.asInstanceOf[js.Any])
    if (wheel != null) __obj.updateDynamic("wheel")(wheel.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBsOption]
  }
}

