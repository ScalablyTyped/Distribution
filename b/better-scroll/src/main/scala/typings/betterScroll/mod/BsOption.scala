package typings.betterScroll.mod

import typings.betterScroll.anon.PartialInfinityOption
import typings.betterScroll.anon.PartialMouseWheelOption
import typings.betterScroll.anon.PartialPullDownOption
import typings.betterScroll.anon.PartialPullUpOption
import typings.betterScroll.anon.PartialScrollBarOption
import typings.betterScroll.anon.PartialSlideOption
import typings.betterScroll.anon.PartialWheelOption
import typings.betterScroll.anon.PartialZoomOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BsOption extends StObject {
  
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
  var infinity: PartialInfinityOption | Boolean
  
  var momentum: Boolean
  
  var momentumLimitDistance: Double
  
  var momentumLimitTime: Double
  
  // mouseWheel: {
  //  speed: 20,
  //  invert: false,
  //  easeTime: 300
  // }
  var mouseWheel: PartialMouseWheelOption | Boolean
  
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
  var pullDownRefresh: PartialPullDownOption | Boolean
  
  /**
    * for pull up and load
    * pullUpLoad: {
    *   threshold: 50
    * }
    */
  var pullUpLoad: PartialPullUpOption | Boolean
  
  var resizePolling: Double
  
  var scrollX: Boolean
  
  var scrollY: Boolean
  
  /**
    * for scrollbar
    * scrollbar: {
    *   fade: true
    * }
    */
  var scrollbar: PartialScrollBarOption | Boolean
  
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
  var snap: PartialSlideOption | Boolean
  
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
  var wheel: PartialWheelOption | Boolean
  
  // zoom: {
  //  start: 1,
  //  min: 1,
  //  max: 4
  // }
  var zoom: PartialZoomOption | Boolean
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
  implicit class BsOptionMutableBuilder[Self <: BsOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoBlur(value: Boolean): Self = StObject.set(x, "autoBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindToWrapper(value: Boolean): Self = StObject.set(x, "bindToWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounce(value: Boolean | BounceObjectOption): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceTime(value: Double): Self = StObject.set(x, "bounceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: Boolean | DoubleClick): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeceleration(value: Double): Self = StObject.set(x, "deceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionLockThreshold(value: Double): Self = StObject.set(x, "directionLockThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMouse(value: Boolean): Self = StObject.set(x, "disableMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTouch(value: Boolean): Self = StObject.set(x, "disableTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPassthrough(value: String | Boolean): Self = StObject.set(x, "eventPassthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlickLimitDistance(value: Double): Self = StObject.set(x, "flickLimitDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlickLimitTime(value: Double): Self = StObject.set(x, "flickLimitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeScroll(value: Boolean): Self = StObject.set(x, "freeScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHWCompositing(value: Boolean): Self = StObject.set(x, "HWCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinity(value: PartialInfinityOption | Boolean): Self = StObject.set(x, "infinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMomentum(value: Boolean): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMomentumLimitDistance(value: Double): Self = StObject.set(x, "momentumLimitDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMomentumLimitTime(value: Double): Self = StObject.set(x, "momentumLimitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheel(value: PartialMouseWheelOption | Boolean): Self = StObject.set(x, "mouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveDOM(value: Boolean): Self = StObject.set(x, "observeDOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefaultException(value: js.Object): Self = StObject.set(x, "preventDefaultException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbeType(value: Double): Self = StObject.set(x, "probeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullDownRefresh(value: PartialPullDownOption | Boolean): Self = StObject.set(x, "pullDownRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullUpLoad(value: PartialPullUpOption | Boolean): Self = StObject.set(x, "pullUpLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizePolling(value: Double): Self = StObject.set(x, "resizePolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollX(value: Boolean): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollY(value: Boolean): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbar(value: PartialScrollBarOption | Boolean): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnap(value: PartialSlideOption | Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeBounceTime(value: Double): Self = StObject.set(x, "swipeBounceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeTime(value: Double): Self = StObject.set(x, "swipeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTap(value: Boolean): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTransform(value: Boolean): Self = StObject.set(x, "useTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTransition(value: Boolean): Self = StObject.set(x, "useTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheel(value: PartialWheelOption | Boolean): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: PartialZoomOption | Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
