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
    val __obj = js.Dynamic.literal(HWCompositing = HWCompositing, autoBlur = autoBlur, bindToWrapper = bindToWrapper, bounce = bounce.asInstanceOf[js.Any], bounceTime = bounceTime, click = click, dblclick = dblclick.asInstanceOf[js.Any], deceleration = deceleration, directionLockThreshold = directionLockThreshold, disableMouse = disableMouse, disableTouch = disableTouch, eventPassthrough = eventPassthrough.asInstanceOf[js.Any], flickLimitDistance = flickLimitDistance, flickLimitTime = flickLimitTime, freeScroll = freeScroll, infinity = infinity.asInstanceOf[js.Any], momentum = momentum, momentumLimitDistance = momentumLimitDistance, momentumLimitTime = momentumLimitTime, mouseWheel = mouseWheel.asInstanceOf[js.Any], observeDOM = observeDOM, preventDefault = preventDefault, preventDefaultException = preventDefaultException, probeType = probeType, pullDownRefresh = pullDownRefresh.asInstanceOf[js.Any], pullUpLoad = pullUpLoad.asInstanceOf[js.Any], resizePolling = resizePolling, scrollX = scrollX, scrollY = scrollY, scrollbar = scrollbar.asInstanceOf[js.Any], snap = snap.asInstanceOf[js.Any], startX = startX, startY = startY, stopPropagation = stopPropagation, swipeBounceTime = swipeBounceTime, swipeTime = swipeTime, tap = tap, useTransform = useTransform, useTransition = useTransition, wheel = wheel.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BsOption]
  }
}

