package typings
package betterDashScrollLib.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BsOption extends js.Object {
  var HWCompositing: scala.Boolean
  var autoBlur: scala.Boolean
  var bindToWrapper: scala.Boolean
  var bounce: scala.Boolean | BounceObjectOption
  var bounceTime: scala.Double
  var click: scala.Boolean
  var dblclick: scala.Boolean | DoubleClick
  var deceleration: scala.Double
  var directionLockThreshold: scala.Double
  var disableMouse: scala.Boolean
  var disableTouch: scala.Boolean
  var eventPassthrough: java.lang.String | scala.Boolean
  var flickLimitDistance: scala.Double
  var flickLimitTime: scala.Double
  var freeScroll: scala.Boolean
  // https://ustbhuangyi.github.io/better-scroll/doc/zh-hans/options-advanced.html
  var infinity: stdLib.Partial[InfinityOption] | scala.Boolean
  var momentum: scala.Boolean
  var momentumLimitDistance: scala.Double
  var momentumLimitTime: scala.Double
  // mouseWheel: {
  //  speed: 20,
  //  invert: false,
  //  easeTime: 300
  // }
  var mouseWheel: stdLib.Partial[MouseWheelOption] | scala.Boolean
  var observeDOM: scala.Boolean
  var preventDefault: scala.Boolean
  var preventDefaultException: js.Object
  var probeType: scala.Double
  /**
    * for pull down and refresh
    * pullDownRefresh: {
    *   threshold: 50,
    *   stop: 20
    * }
    */
  var pullDownRefresh: stdLib.Partial[PullDownOption] | scala.Boolean
  /**
    * for pull up and load
    * pullUpLoad: {
    *   threshold: 50
    * }
    */
  var pullUpLoad: stdLib.Partial[PullUpOption] | scala.Boolean
  var resizePolling: scala.Double
  var scrollX: scala.Boolean
  var scrollY: scala.Boolean
  /**
    * for scrollbar
    * scrollbar: {
    *   fade: true
    * }
    */
  var scrollbar: stdLib.Partial[ScrollBarOption] | scala.Boolean
  /**
    * for slide
    * snap: {
    *   loop: boolean,
    *   el: domEl,
    *   threshold: 0.1,
    *   stepX: 100,
    *   stepY: 100,
    *   listenFlick: true
    * }
    */
  var snap: stdLib.Partial[SlideOption] | scala.Boolean
  var startX: scala.Double
  var startY: scala.Double
  var stopPropagation: scala.Boolean
  var swipeBounceTime: scala.Double
  var swipeTime: scala.Double
  var tap: scala.Boolean
  var useTransform: scala.Boolean
  var useTransition: scala.Boolean
  /**
    * for picker
    * wheel: {
    *   selectedIndex: 0,
    *   rotate: 25,
    *   adjustTime: 400
    * }
    */
  var wheel: stdLib.Partial[WheelOption] | scala.Boolean
  // zoom: {
  //  start: 1,
  //  min: 1,
  //  max: 4
  // }
  var zoom: stdLib.Partial[ZoomOption] | scala.Boolean
}

object BsOption {
  @scala.inline
  def apply(
    HWCompositing: scala.Boolean,
    autoBlur: scala.Boolean,
    bindToWrapper: scala.Boolean,
    bounce: scala.Boolean | BounceObjectOption,
    bounceTime: scala.Double,
    click: scala.Boolean,
    dblclick: scala.Boolean | DoubleClick,
    deceleration: scala.Double,
    directionLockThreshold: scala.Double,
    disableMouse: scala.Boolean,
    disableTouch: scala.Boolean,
    eventPassthrough: java.lang.String | scala.Boolean,
    flickLimitDistance: scala.Double,
    flickLimitTime: scala.Double,
    freeScroll: scala.Boolean,
    infinity: stdLib.Partial[InfinityOption] | scala.Boolean,
    momentum: scala.Boolean,
    momentumLimitDistance: scala.Double,
    momentumLimitTime: scala.Double,
    mouseWheel: stdLib.Partial[MouseWheelOption] | scala.Boolean,
    observeDOM: scala.Boolean,
    preventDefault: scala.Boolean,
    preventDefaultException: js.Object,
    probeType: scala.Double,
    pullDownRefresh: stdLib.Partial[PullDownOption] | scala.Boolean,
    pullUpLoad: stdLib.Partial[PullUpOption] | scala.Boolean,
    resizePolling: scala.Double,
    scrollX: scala.Boolean,
    scrollY: scala.Boolean,
    scrollbar: stdLib.Partial[ScrollBarOption] | scala.Boolean,
    snap: stdLib.Partial[SlideOption] | scala.Boolean,
    startX: scala.Double,
    startY: scala.Double,
    stopPropagation: scala.Boolean,
    swipeBounceTime: scala.Double,
    swipeTime: scala.Double,
    tap: scala.Boolean,
    useTransform: scala.Boolean,
    useTransition: scala.Boolean,
    wheel: stdLib.Partial[WheelOption] | scala.Boolean,
    zoom: stdLib.Partial[ZoomOption] | scala.Boolean
  ): BsOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HWCompositing")(HWCompositing)
    __obj.updateDynamic("autoBlur")(autoBlur)
    __obj.updateDynamic("bindToWrapper")(bindToWrapper)
    __obj.updateDynamic("bounce")(bounce.asInstanceOf[js.Any])
    __obj.updateDynamic("bounceTime")(bounceTime)
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("dblclick")(dblclick.asInstanceOf[js.Any])
    __obj.updateDynamic("deceleration")(deceleration)
    __obj.updateDynamic("directionLockThreshold")(directionLockThreshold)
    __obj.updateDynamic("disableMouse")(disableMouse)
    __obj.updateDynamic("disableTouch")(disableTouch)
    __obj.updateDynamic("eventPassthrough")(eventPassthrough.asInstanceOf[js.Any])
    __obj.updateDynamic("flickLimitDistance")(flickLimitDistance)
    __obj.updateDynamic("flickLimitTime")(flickLimitTime)
    __obj.updateDynamic("freeScroll")(freeScroll)
    __obj.updateDynamic("infinity")(infinity.asInstanceOf[js.Any])
    __obj.updateDynamic("momentum")(momentum)
    __obj.updateDynamic("momentumLimitDistance")(momentumLimitDistance)
    __obj.updateDynamic("momentumLimitTime")(momentumLimitTime)
    __obj.updateDynamic("mouseWheel")(mouseWheel.asInstanceOf[js.Any])
    __obj.updateDynamic("observeDOM")(observeDOM)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("preventDefaultException")(preventDefaultException)
    __obj.updateDynamic("probeType")(probeType)
    __obj.updateDynamic("pullDownRefresh")(pullDownRefresh.asInstanceOf[js.Any])
    __obj.updateDynamic("pullUpLoad")(pullUpLoad.asInstanceOf[js.Any])
    __obj.updateDynamic("resizePolling")(resizePolling)
    __obj.updateDynamic("scrollX")(scrollX)
    __obj.updateDynamic("scrollY")(scrollY)
    __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    __obj.updateDynamic("startX")(startX)
    __obj.updateDynamic("startY")(startY)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("swipeBounceTime")(swipeBounceTime)
    __obj.updateDynamic("swipeTime")(swipeTime)
    __obj.updateDynamic("tap")(tap)
    __obj.updateDynamic("useTransform")(useTransform)
    __obj.updateDynamic("useTransition")(useTransition)
    __obj.updateDynamic("wheel")(wheel.asInstanceOf[js.Any])
    __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BsOption]
  }
}

