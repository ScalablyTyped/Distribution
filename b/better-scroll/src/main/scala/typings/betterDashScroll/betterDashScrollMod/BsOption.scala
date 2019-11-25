package typings.betterDashScroll.betterDashScrollMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BsOption extends js.Object {
  var HWCompositing: Boolean
  var autoBlur: Boolean
  var bindToWrapper: Boolean
  var bounce: Boolean | BounceObjectOption
  var bounceTime: Double
  var click: Boolean
  var dblclick: Boolean | DoubleClick
  var deceleration: Double
  var directionLockThreshold: Double
  var disableMouse: Boolean
  var disableTouch: Boolean
  var eventPassthrough: String | Boolean
  var flickLimitDistance: Double
  var flickLimitTime: Double
  var freeScroll: Boolean
  // https://ustbhuangyi.github.io/better-scroll/doc/zh-hans/options-advanced.html
  var infinity: Partial[InfinityOption] | Boolean
  var momentum: Boolean
  var momentumLimitDistance: Double
  var momentumLimitTime: Double
  // mouseWheel: {
  //  speed: 20,
  //  invert: false,
  //  easeTime: 300
  // }
  var mouseWheel: Partial[MouseWheelOption] | Boolean
  var observeDOM: Boolean
  var preventDefault: Boolean
  var preventDefaultException: js.Object
  var probeType: Double
  /**
    * for pull down and refresh
    * pullDownRefresh: {
    *   threshold: 50,
    *   stop: 20
    * }
    */
  var pullDownRefresh: Partial[PullDownOption] | Boolean
  /**
    * for pull up and load
    * pullUpLoad: {
    *   threshold: 50
    * }
    */
  var pullUpLoad: Partial[PullUpOption] | Boolean
  var resizePolling: Double
  var scrollX: Boolean
  var scrollY: Boolean
  /**
    * for scrollbar
    * scrollbar: {
    *   fade: true
    * }
    */
  var scrollbar: Partial[ScrollBarOption] | Boolean
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
  var snap: Partial[SlideOption] | Boolean
  var startX: Double
  var startY: Double
  var stopPropagation: Boolean
  var swipeBounceTime: Double
  var swipeTime: Double
  var tap: Boolean
  var useTransform: Boolean
  var useTransition: Boolean
  /**
    * for picker
    * wheel: {
    *   selectedIndex: 0,
    *   rotate: 25,
    *   adjustTime: 400
    * }
    */
  var wheel: Partial[WheelOption] | Boolean
  // zoom: {
  //  start: 1,
  //  min: 1,
  //  max: 4
  // }
  var zoom: Partial[ZoomOption] | Boolean
}

object BsOption {
  @scala.inline
  def apply(
    HWCompositing: Boolean,
    autoBlur: Boolean,
    bindToWrapper: Boolean,
    bounce: Boolean | BounceObjectOption,
    bounceTime: Double,
    click: Boolean,
    dblclick: Boolean | DoubleClick,
    deceleration: Double,
    directionLockThreshold: Double,
    disableMouse: Boolean,
    disableTouch: Boolean,
    eventPassthrough: String | Boolean,
    flickLimitDistance: Double,
    flickLimitTime: Double,
    freeScroll: Boolean,
    infinity: Partial[InfinityOption] | Boolean,
    momentum: Boolean,
    momentumLimitDistance: Double,
    momentumLimitTime: Double,
    mouseWheel: Partial[MouseWheelOption] | Boolean,
    observeDOM: Boolean,
    preventDefault: Boolean,
    preventDefaultException: js.Object,
    probeType: Double,
    pullDownRefresh: Partial[PullDownOption] | Boolean,
    pullUpLoad: Partial[PullUpOption] | Boolean,
    resizePolling: Double,
    scrollX: Boolean,
    scrollY: Boolean,
    scrollbar: Partial[ScrollBarOption] | Boolean,
    snap: Partial[SlideOption] | Boolean,
    startX: Double,
    startY: Double,
    stopPropagation: Boolean,
    swipeBounceTime: Double,
    swipeTime: Double,
    tap: Boolean,
    useTransform: Boolean,
    useTransition: Boolean,
    wheel: Partial[WheelOption] | Boolean,
    zoom: Partial[ZoomOption] | Boolean
  ): BsOption = {
    val __obj = js.Dynamic.literal(HWCompositing = HWCompositing.asInstanceOf[js.Any], autoBlur = autoBlur.asInstanceOf[js.Any], bindToWrapper = bindToWrapper.asInstanceOf[js.Any], bounce = bounce.asInstanceOf[js.Any], bounceTime = bounceTime.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], deceleration = deceleration.asInstanceOf[js.Any], directionLockThreshold = directionLockThreshold.asInstanceOf[js.Any], disableMouse = disableMouse.asInstanceOf[js.Any], disableTouch = disableTouch.asInstanceOf[js.Any], eventPassthrough = eventPassthrough.asInstanceOf[js.Any], flickLimitDistance = flickLimitDistance.asInstanceOf[js.Any], flickLimitTime = flickLimitTime.asInstanceOf[js.Any], freeScroll = freeScroll.asInstanceOf[js.Any], infinity = infinity.asInstanceOf[js.Any], momentum = momentum.asInstanceOf[js.Any], momentumLimitDistance = momentumLimitDistance.asInstanceOf[js.Any], momentumLimitTime = momentumLimitTime.asInstanceOf[js.Any], mouseWheel = mouseWheel.asInstanceOf[js.Any], observeDOM = observeDOM.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], preventDefaultException = preventDefaultException.asInstanceOf[js.Any], probeType = probeType.asInstanceOf[js.Any], pullDownRefresh = pullDownRefresh.asInstanceOf[js.Any], pullUpLoad = pullUpLoad.asInstanceOf[js.Any], resizePolling = resizePolling.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], snap = snap.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], swipeBounceTime = swipeBounceTime.asInstanceOf[js.Any], swipeTime = swipeTime.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any], useTransform = useTransform.asInstanceOf[js.Any], useTransition = useTransition.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BsOption]
  }
}

