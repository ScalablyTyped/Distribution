package typings.betterScroll

import typings.betterScroll.mod.BounceObjectOption
import typings.betterScroll.mod.DoubleClick
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fn extends StObject {
    
    def fn(t: Double): Double
    
    var style: String
  }
  object Fn {
    
    inline def apply(fn: Double => Double, style: String): Fn = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fn]
    }
    
    extension [Self <: Fn](x: Self) {
      
      inline def setFn(value: Double => Double): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.BsOption> */
  trait PartialBsOption extends StObject {
    
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
    
    inline def apply(): PartialBsOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBsOption]
    }
    
    extension [Self <: PartialBsOption](x: Self) {
      
      inline def setAutoBlur(value: Boolean): Self = StObject.set(x, "autoBlur", value.asInstanceOf[js.Any])
      
      inline def setAutoBlurUndefined: Self = StObject.set(x, "autoBlur", js.undefined)
      
      inline def setBindToWrapper(value: Boolean): Self = StObject.set(x, "bindToWrapper", value.asInstanceOf[js.Any])
      
      inline def setBindToWrapperUndefined: Self = StObject.set(x, "bindToWrapper", js.undefined)
      
      inline def setBounce(value: Boolean | BounceObjectOption): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      inline def setBounceTime(value: Double): Self = StObject.set(x, "bounceTime", value.asInstanceOf[js.Any])
      
      inline def setBounceTimeUndefined: Self = StObject.set(x, "bounceTime", js.undefined)
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setDblclick(value: Boolean | DoubleClick): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      inline def setDblclickUndefined: Self = StObject.set(x, "dblclick", js.undefined)
      
      inline def setDeceleration(value: Double): Self = StObject.set(x, "deceleration", value.asInstanceOf[js.Any])
      
      inline def setDecelerationUndefined: Self = StObject.set(x, "deceleration", js.undefined)
      
      inline def setDirectionLockThreshold(value: Double): Self = StObject.set(x, "directionLockThreshold", value.asInstanceOf[js.Any])
      
      inline def setDirectionLockThresholdUndefined: Self = StObject.set(x, "directionLockThreshold", js.undefined)
      
      inline def setDisableMouse(value: Boolean): Self = StObject.set(x, "disableMouse", value.asInstanceOf[js.Any])
      
      inline def setDisableMouseUndefined: Self = StObject.set(x, "disableMouse", js.undefined)
      
      inline def setDisableTouch(value: Boolean): Self = StObject.set(x, "disableTouch", value.asInstanceOf[js.Any])
      
      inline def setDisableTouchUndefined: Self = StObject.set(x, "disableTouch", js.undefined)
      
      inline def setEventPassthrough(value: String | Boolean): Self = StObject.set(x, "eventPassthrough", value.asInstanceOf[js.Any])
      
      inline def setEventPassthroughUndefined: Self = StObject.set(x, "eventPassthrough", js.undefined)
      
      inline def setFlickLimitDistance(value: Double): Self = StObject.set(x, "flickLimitDistance", value.asInstanceOf[js.Any])
      
      inline def setFlickLimitDistanceUndefined: Self = StObject.set(x, "flickLimitDistance", js.undefined)
      
      inline def setFlickLimitTime(value: Double): Self = StObject.set(x, "flickLimitTime", value.asInstanceOf[js.Any])
      
      inline def setFlickLimitTimeUndefined: Self = StObject.set(x, "flickLimitTime", js.undefined)
      
      inline def setFreeScroll(value: Boolean): Self = StObject.set(x, "freeScroll", value.asInstanceOf[js.Any])
      
      inline def setFreeScrollUndefined: Self = StObject.set(x, "freeScroll", js.undefined)
      
      inline def setHWCompositing(value: Boolean): Self = StObject.set(x, "HWCompositing", value.asInstanceOf[js.Any])
      
      inline def setHWCompositingUndefined: Self = StObject.set(x, "HWCompositing", js.undefined)
      
      inline def setInfinity(value: PartialInfinityOption | Boolean): Self = StObject.set(x, "infinity", value.asInstanceOf[js.Any])
      
      inline def setInfinityUndefined: Self = StObject.set(x, "infinity", js.undefined)
      
      inline def setMomentum(value: Boolean): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
      
      inline def setMomentumLimitDistance(value: Double): Self = StObject.set(x, "momentumLimitDistance", value.asInstanceOf[js.Any])
      
      inline def setMomentumLimitDistanceUndefined: Self = StObject.set(x, "momentumLimitDistance", js.undefined)
      
      inline def setMomentumLimitTime(value: Double): Self = StObject.set(x, "momentumLimitTime", value.asInstanceOf[js.Any])
      
      inline def setMomentumLimitTimeUndefined: Self = StObject.set(x, "momentumLimitTime", js.undefined)
      
      inline def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
      
      inline def setMouseWheel(value: PartialMouseWheelOption | Boolean): Self = StObject.set(x, "mouseWheel", value.asInstanceOf[js.Any])
      
      inline def setMouseWheelUndefined: Self = StObject.set(x, "mouseWheel", js.undefined)
      
      inline def setObserveDOM(value: Boolean): Self = StObject.set(x, "observeDOM", value.asInstanceOf[js.Any])
      
      inline def setObserveDOMUndefined: Self = StObject.set(x, "observeDOM", js.undefined)
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultException(value: js.Object): Self = StObject.set(x, "preventDefaultException", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultExceptionUndefined: Self = StObject.set(x, "preventDefaultException", js.undefined)
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setProbeType(value: Double): Self = StObject.set(x, "probeType", value.asInstanceOf[js.Any])
      
      inline def setProbeTypeUndefined: Self = StObject.set(x, "probeType", js.undefined)
      
      inline def setPullDownRefresh(value: PartialPullDownOption | Boolean): Self = StObject.set(x, "pullDownRefresh", value.asInstanceOf[js.Any])
      
      inline def setPullDownRefreshUndefined: Self = StObject.set(x, "pullDownRefresh", js.undefined)
      
      inline def setPullUpLoad(value: PartialPullUpOption | Boolean): Self = StObject.set(x, "pullUpLoad", value.asInstanceOf[js.Any])
      
      inline def setPullUpLoadUndefined: Self = StObject.set(x, "pullUpLoad", js.undefined)
      
      inline def setResizePolling(value: Double): Self = StObject.set(x, "resizePolling", value.asInstanceOf[js.Any])
      
      inline def setResizePollingUndefined: Self = StObject.set(x, "resizePolling", js.undefined)
      
      inline def setScrollX(value: Boolean): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
      
      inline def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
      
      inline def setScrollY(value: Boolean): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
      
      inline def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
      
      inline def setScrollbar(value: PartialScrollBarOption | Boolean): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      inline def setSnap(value: PartialSlideOption | Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      inline def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      inline def setStartXUndefined: Self = StObject.set(x, "startX", js.undefined)
      
      inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
      
      inline def setStartYUndefined: Self = StObject.set(x, "startY", js.undefined)
      
      inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      inline def setSwipeBounceTime(value: Double): Self = StObject.set(x, "swipeBounceTime", value.asInstanceOf[js.Any])
      
      inline def setSwipeBounceTimeUndefined: Self = StObject.set(x, "swipeBounceTime", js.undefined)
      
      inline def setSwipeTime(value: Double): Self = StObject.set(x, "swipeTime", value.asInstanceOf[js.Any])
      
      inline def setSwipeTimeUndefined: Self = StObject.set(x, "swipeTime", js.undefined)
      
      inline def setTap(value: Boolean): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
      
      inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
      
      inline def setUseTransform(value: Boolean): Self = StObject.set(x, "useTransform", value.asInstanceOf[js.Any])
      
      inline def setUseTransformUndefined: Self = StObject.set(x, "useTransform", js.undefined)
      
      inline def setUseTransition(value: Boolean): Self = StObject.set(x, "useTransition", value.asInstanceOf[js.Any])
      
      inline def setUseTransitionUndefined: Self = StObject.set(x, "useTransition", js.undefined)
      
      inline def setWheel(value: PartialWheelOption | Boolean): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
      
      inline def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
      
      inline def setZoom(value: PartialZoomOption | Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.InfinityOption> */
  trait PartialInfinityOption extends StObject {
    
    var createTombstone: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var fetch: js.UndefOr[js.Function1[/* count */ Double, Unit]] = js.undefined
    
    var render: js.UndefOr[js.Function2[/* item */ Any, /* div */ Element, Element]] = js.undefined
  }
  object PartialInfinityOption {
    
    inline def apply(): PartialInfinityOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInfinityOption]
    }
    
    extension [Self <: PartialInfinityOption](x: Self) {
      
      inline def setCreateTombstone(value: () => Element): Self = StObject.set(x, "createTombstone", js.Any.fromFunction0(value))
      
      inline def setCreateTombstoneUndefined: Self = StObject.set(x, "createTombstone", js.undefined)
      
      inline def setFetch(value: /* count */ Double => Unit): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setRender(value: (/* item */ Any, /* div */ Element) => Element): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.MouseWheelOption> */
  trait PartialMouseWheelOption extends StObject {
    
    var easeTime: js.UndefOr[Double] = js.undefined
    
    var invert: js.UndefOr[Boolean] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object PartialMouseWheelOption {
    
    inline def apply(): PartialMouseWheelOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMouseWheelOption]
    }
    
    extension [Self <: PartialMouseWheelOption](x: Self) {
      
      inline def setEaseTime(value: Double): Self = StObject.set(x, "easeTime", value.asInstanceOf[js.Any])
      
      inline def setEaseTimeUndefined: Self = StObject.set(x, "easeTime", js.undefined)
      
      inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.PullDownOption> */
  trait PartialPullDownOption extends StObject {
    
    var stop: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object PartialPullDownOption {
    
    inline def apply(): PartialPullDownOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPullDownOption]
    }
    
    extension [Self <: PartialPullDownOption](x: Self) {
      
      inline def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.PullUpOption> */
  trait PartialPullUpOption extends StObject {
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object PartialPullUpOption {
    
    inline def apply(): PartialPullUpOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPullUpOption]
    }
    
    extension [Self <: PartialPullUpOption](x: Self) {
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.ScrollBarOption> */
  trait PartialScrollBarOption extends StObject {
    
    var fade: js.UndefOr[Boolean] = js.undefined
  }
  object PartialScrollBarOption {
    
    inline def apply(): PartialScrollBarOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollBarOption]
    }
    
    extension [Self <: PartialScrollBarOption](x: Self) {
      
      inline def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.SlideOption> */
  trait PartialSlideOption extends StObject {
    
    var el: js.UndefOr[Element] = js.undefined
    
    var listenFlick: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var stepX: js.UndefOr[Double] = js.undefined
    
    var stepY: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object PartialSlideOption {
    
    inline def apply(): PartialSlideOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSlideOption]
    }
    
    extension [Self <: PartialSlideOption](x: Self) {
      
      inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setListenFlick(value: Boolean): Self = StObject.set(x, "listenFlick", value.asInstanceOf[js.Any])
      
      inline def setListenFlickUndefined: Self = StObject.set(x, "listenFlick", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setStepX(value: Double): Self = StObject.set(x, "stepX", value.asInstanceOf[js.Any])
      
      inline def setStepXUndefined: Self = StObject.set(x, "stepX", js.undefined)
      
      inline def setStepY(value: Double): Self = StObject.set(x, "stepY", value.asInstanceOf[js.Any])
      
      inline def setStepYUndefined: Self = StObject.set(x, "stepY", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.WheelOption> */
  trait PartialWheelOption extends StObject {
    
    var adjustTime: js.UndefOr[Double] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    var wheelItemClass: js.UndefOr[String] = js.undefined
    
    var wheelWrapperClass: js.UndefOr[String] = js.undefined
  }
  object PartialWheelOption {
    
    inline def apply(): PartialWheelOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWheelOption]
    }
    
    extension [Self <: PartialWheelOption](x: Self) {
      
      inline def setAdjustTime(value: Double): Self = StObject.set(x, "adjustTime", value.asInstanceOf[js.Any])
      
      inline def setAdjustTimeUndefined: Self = StObject.set(x, "adjustTime", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setWheelItemClass(value: String): Self = StObject.set(x, "wheelItemClass", value.asInstanceOf[js.Any])
      
      inline def setWheelItemClassUndefined: Self = StObject.set(x, "wheelItemClass", js.undefined)
      
      inline def setWheelWrapperClass(value: String): Self = StObject.set(x, "wheelWrapperClass", value.asInstanceOf[js.Any])
      
      inline def setWheelWrapperClassUndefined: Self = StObject.set(x, "wheelWrapperClass", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.ZoomOption> */
  trait PartialZoomOption extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object PartialZoomOption {
    
    inline def apply(): PartialZoomOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialZoomOption]
    }
    
    extension [Self <: PartialZoomOption](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
