package typings.betterScroll.mod

import typings.betterScroll.anon.PartialInfinityOption
import typings.betterScroll.anon.PartialMouseWheelOption
import typings.betterScroll.anon.PartialPullDownOption
import typings.betterScroll.anon.PartialPullUpOption
import typings.betterScroll.anon.PartialScrollBarOption
import typings.betterScroll.anon.PartialSlideOption
import typings.betterScroll.anon.PartialWheelOption
import typings.betterScroll.anon.PartialZoomOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BsOption extends js.Object {
  var HWCompositing: Boolean = js.native
  var autoBlur: Boolean = js.native
  var bindToWrapper: Boolean = js.native
  var bounce: Boolean | BounceObjectOption = js.native
  var bounceTime: Double = js.native
  var click: Boolean = js.native
  var dblclick: Boolean | DoubleClick = js.native
  var deceleration: Double = js.native
  var directionLockThreshold: Double = js.native
  var disableMouse: Boolean = js.native
  var disableTouch: Boolean = js.native
  var eventPassthrough: String | Boolean = js.native
  var flickLimitDistance: Double = js.native
  var flickLimitTime: Double = js.native
  var freeScroll: Boolean = js.native
  // https://ustbhuangyi.github.io/better-scroll/doc/zh-hans/options-advanced.html
  var infinity: PartialInfinityOption | Boolean = js.native
  var momentum: Boolean = js.native
  var momentumLimitDistance: Double = js.native
  var momentumLimitTime: Double = js.native
  // mouseWheel: {
  //  speed: 20,
  //  invert: false,
  //  easeTime: 300
  // }
  var mouseWheel: PartialMouseWheelOption | Boolean = js.native
  var observeDOM: Boolean = js.native
  var preventDefault: Boolean = js.native
  var preventDefaultException: js.Object = js.native
  var probeType: Double = js.native
  /**
    * for pull down and refresh
    * pullDownRefresh: {
    *   threshold: 50,
    *   stop: 20
    * }
    */
  var pullDownRefresh: PartialPullDownOption | Boolean = js.native
  /**
    * for pull up and load
    * pullUpLoad: {
    *   threshold: 50
    * }
    */
  var pullUpLoad: PartialPullUpOption | Boolean = js.native
  var resizePolling: Double = js.native
  var scrollX: Boolean = js.native
  var scrollY: Boolean = js.native
  /**
    * for scrollbar
    * scrollbar: {
    *   fade: true
    * }
    */
  var scrollbar: PartialScrollBarOption | Boolean = js.native
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
  var snap: PartialSlideOption | Boolean = js.native
  var startX: Double = js.native
  var startY: Double = js.native
  var stopPropagation: Boolean = js.native
  var swipeBounceTime: Double = js.native
  var swipeTime: Double = js.native
  var tap: Boolean = js.native
  var useTransform: Boolean = js.native
  var useTransition: Boolean = js.native
  /**
    * for picker
    * wheel: {
    *   selectedIndex: 0,
    *   rotate: 25,
    *   adjustTime: 400
    * }
    */
  var wheel: PartialWheelOption | Boolean = js.native
  // zoom: {
  //  start: 1,
  //  min: 1,
  //  max: 4
  // }
  var zoom: PartialZoomOption | Boolean = js.native
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
    infinity: PartialInfinityOption | Boolean,
    momentum: Boolean,
    momentumLimitDistance: Double,
    momentumLimitTime: Double,
    mouseWheel: PartialMouseWheelOption | Boolean,
    observeDOM: Boolean,
    preventDefault: Boolean,
    preventDefaultException: js.Object,
    probeType: Double,
    pullDownRefresh: PartialPullDownOption | Boolean,
    pullUpLoad: PartialPullUpOption | Boolean,
    resizePolling: Double,
    scrollX: Boolean,
    scrollY: Boolean,
    scrollbar: PartialScrollBarOption | Boolean,
    snap: PartialSlideOption | Boolean,
    startX: Double,
    startY: Double,
    stopPropagation: Boolean,
    swipeBounceTime: Double,
    swipeTime: Double,
    tap: Boolean,
    useTransform: Boolean,
    useTransition: Boolean,
    wheel: PartialWheelOption | Boolean,
    zoom: PartialZoomOption | Boolean
  ): BsOption = {
    val __obj = js.Dynamic.literal(HWCompositing = HWCompositing.asInstanceOf[js.Any], autoBlur = autoBlur.asInstanceOf[js.Any], bindToWrapper = bindToWrapper.asInstanceOf[js.Any], bounce = bounce.asInstanceOf[js.Any], bounceTime = bounceTime.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], deceleration = deceleration.asInstanceOf[js.Any], directionLockThreshold = directionLockThreshold.asInstanceOf[js.Any], disableMouse = disableMouse.asInstanceOf[js.Any], disableTouch = disableTouch.asInstanceOf[js.Any], eventPassthrough = eventPassthrough.asInstanceOf[js.Any], flickLimitDistance = flickLimitDistance.asInstanceOf[js.Any], flickLimitTime = flickLimitTime.asInstanceOf[js.Any], freeScroll = freeScroll.asInstanceOf[js.Any], infinity = infinity.asInstanceOf[js.Any], momentum = momentum.asInstanceOf[js.Any], momentumLimitDistance = momentumLimitDistance.asInstanceOf[js.Any], momentumLimitTime = momentumLimitTime.asInstanceOf[js.Any], mouseWheel = mouseWheel.asInstanceOf[js.Any], observeDOM = observeDOM.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], preventDefaultException = preventDefaultException.asInstanceOf[js.Any], probeType = probeType.asInstanceOf[js.Any], pullDownRefresh = pullDownRefresh.asInstanceOf[js.Any], pullUpLoad = pullUpLoad.asInstanceOf[js.Any], resizePolling = resizePolling.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], snap = snap.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], swipeBounceTime = swipeBounceTime.asInstanceOf[js.Any], swipeTime = swipeTime.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any], useTransform = useTransform.asInstanceOf[js.Any], useTransition = useTransition.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BsOption]
  }
  @scala.inline
  implicit class BsOptionOps[Self <: BsOption] (val x: Self) extends AnyVal {
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
    def setAutoBlur(value: Boolean): Self = this.set("autoBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def setBindToWrapper(value: Boolean): Self = this.set("bindToWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounce(value: Boolean | BounceObjectOption): Self = this.set("bounce", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounceTime(value: Double): Self = this.set("bounceTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setClick(value: Boolean): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: Boolean | DoubleClick): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeceleration(value: Double): Self = this.set("deceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionLockThreshold(value: Double): Self = this.set("directionLockThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableMouse(value: Boolean): Self = this.set("disableMouse", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableTouch(value: Boolean): Self = this.set("disableTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventPassthrough(value: String | Boolean): Self = this.set("eventPassthrough", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlickLimitDistance(value: Double): Self = this.set("flickLimitDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlickLimitTime(value: Double): Self = this.set("flickLimitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFreeScroll(value: Boolean): Self = this.set("freeScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfinity(value: PartialInfinityOption | Boolean): Self = this.set("infinity", value.asInstanceOf[js.Any])
    @scala.inline
    def setMomentum(value: Boolean): Self = this.set("momentum", value.asInstanceOf[js.Any])
    @scala.inline
    def setMomentumLimitDistance(value: Double): Self = this.set("momentumLimitDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setMomentumLimitTime(value: Double): Self = this.set("momentumLimitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseWheel(value: PartialMouseWheelOption | Boolean): Self = this.set("mouseWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setObserveDOM(value: Boolean): Self = this.set("observeDOM", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventDefaultException(value: js.Object): Self = this.set("preventDefaultException", value.asInstanceOf[js.Any])
    @scala.inline
    def setProbeType(value: Double): Self = this.set("probeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPullDownRefresh(value: PartialPullDownOption | Boolean): Self = this.set("pullDownRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setPullUpLoad(value: PartialPullUpOption | Boolean): Self = this.set("pullUpLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizePolling(value: Double): Self = this.set("resizePolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollX(value: Boolean): Self = this.set("scrollX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollY(value: Boolean): Self = this.set("scrollY", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollbar(value: PartialScrollBarOption | Boolean): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnap(value: PartialSlideOption | Boolean): Self = this.set("snap", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartY(value: Double): Self = this.set("startY", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeBounceTime(value: Double): Self = this.set("swipeBounceTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwipeTime(value: Double): Self = this.set("swipeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTap(value: Boolean): Self = this.set("tap", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseTransform(value: Boolean): Self = this.set("useTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseTransition(value: Boolean): Self = this.set("useTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def setWheel(value: PartialWheelOption | Boolean): Self = this.set("wheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: PartialZoomOption | Boolean): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
  
}

