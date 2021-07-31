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
    
    @scala.inline
    def apply(fn: Double => Double, style: String): Fn = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fn]
    }
    
    @scala.inline
    implicit class FnMutableBuilder[Self <: Fn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFn(value: Double => Double): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): PartialBsOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBsOption]
    }
    
    @scala.inline
    implicit class PartialBsOptionMutableBuilder[Self <: PartialBsOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoBlur(value: Boolean): Self = StObject.set(x, "autoBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoBlurUndefined: Self = StObject.set(x, "autoBlur", js.undefined)
      
      @scala.inline
      def setBindToWrapper(value: Boolean): Self = StObject.set(x, "bindToWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindToWrapperUndefined: Self = StObject.set(x, "bindToWrapper", js.undefined)
      
      @scala.inline
      def setBounce(value: Boolean | BounceObjectOption): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceTime(value: Double): Self = StObject.set(x, "bounceTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBounceTimeUndefined: Self = StObject.set(x, "bounceTime", js.undefined)
      
      @scala.inline
      def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      @scala.inline
      def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setDblclick(value: Boolean | DoubleClick): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDblclickUndefined: Self = StObject.set(x, "dblclick", js.undefined)
      
      @scala.inline
      def setDeceleration(value: Double): Self = StObject.set(x, "deceleration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecelerationUndefined: Self = StObject.set(x, "deceleration", js.undefined)
      
      @scala.inline
      def setDirectionLockThreshold(value: Double): Self = StObject.set(x, "directionLockThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionLockThresholdUndefined: Self = StObject.set(x, "directionLockThreshold", js.undefined)
      
      @scala.inline
      def setDisableMouse(value: Boolean): Self = StObject.set(x, "disableMouse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableMouseUndefined: Self = StObject.set(x, "disableMouse", js.undefined)
      
      @scala.inline
      def setDisableTouch(value: Boolean): Self = StObject.set(x, "disableTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTouchUndefined: Self = StObject.set(x, "disableTouch", js.undefined)
      
      @scala.inline
      def setEventPassthrough(value: String | Boolean): Self = StObject.set(x, "eventPassthrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPassthroughUndefined: Self = StObject.set(x, "eventPassthrough", js.undefined)
      
      @scala.inline
      def setFlickLimitDistance(value: Double): Self = StObject.set(x, "flickLimitDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlickLimitDistanceUndefined: Self = StObject.set(x, "flickLimitDistance", js.undefined)
      
      @scala.inline
      def setFlickLimitTime(value: Double): Self = StObject.set(x, "flickLimitTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlickLimitTimeUndefined: Self = StObject.set(x, "flickLimitTime", js.undefined)
      
      @scala.inline
      def setFreeScroll(value: Boolean): Self = StObject.set(x, "freeScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeScrollUndefined: Self = StObject.set(x, "freeScroll", js.undefined)
      
      @scala.inline
      def setHWCompositing(value: Boolean): Self = StObject.set(x, "HWCompositing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHWCompositingUndefined: Self = StObject.set(x, "HWCompositing", js.undefined)
      
      @scala.inline
      def setInfinity(value: PartialInfinityOption | Boolean): Self = StObject.set(x, "infinity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfinityUndefined: Self = StObject.set(x, "infinity", js.undefined)
      
      @scala.inline
      def setMomentum(value: Boolean): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMomentumLimitDistance(value: Double): Self = StObject.set(x, "momentumLimitDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMomentumLimitDistanceUndefined: Self = StObject.set(x, "momentumLimitDistance", js.undefined)
      
      @scala.inline
      def setMomentumLimitTime(value: Double): Self = StObject.set(x, "momentumLimitTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMomentumLimitTimeUndefined: Self = StObject.set(x, "momentumLimitTime", js.undefined)
      
      @scala.inline
      def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
      
      @scala.inline
      def setMouseWheel(value: PartialMouseWheelOption | Boolean): Self = StObject.set(x, "mouseWheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseWheelUndefined: Self = StObject.set(x, "mouseWheel", js.undefined)
      
      @scala.inline
      def setObserveDOM(value: Boolean): Self = StObject.set(x, "observeDOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserveDOMUndefined: Self = StObject.set(x, "observeDOM", js.undefined)
      
      @scala.inline
      def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultException(value: js.Object): Self = StObject.set(x, "preventDefaultException", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultExceptionUndefined: Self = StObject.set(x, "preventDefaultException", js.undefined)
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setProbeType(value: Double): Self = StObject.set(x, "probeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProbeTypeUndefined: Self = StObject.set(x, "probeType", js.undefined)
      
      @scala.inline
      def setPullDownRefresh(value: PartialPullDownOption | Boolean): Self = StObject.set(x, "pullDownRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullDownRefreshUndefined: Self = StObject.set(x, "pullDownRefresh", js.undefined)
      
      @scala.inline
      def setPullUpLoad(value: PartialPullUpOption | Boolean): Self = StObject.set(x, "pullUpLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullUpLoadUndefined: Self = StObject.set(x, "pullUpLoad", js.undefined)
      
      @scala.inline
      def setResizePolling(value: Double): Self = StObject.set(x, "resizePolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizePollingUndefined: Self = StObject.set(x, "resizePolling", js.undefined)
      
      @scala.inline
      def setScrollX(value: Boolean): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
      
      @scala.inline
      def setScrollY(value: Boolean): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
      
      @scala.inline
      def setScrollbar(value: PartialScrollBarOption | Boolean): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
      
      @scala.inline
      def setSnap(value: PartialSlideOption | Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      @scala.inline
      def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartXUndefined: Self = StObject.set(x, "startX", js.undefined)
      
      @scala.inline
      def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartYUndefined: Self = StObject.set(x, "startY", js.undefined)
      
      @scala.inline
      def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      @scala.inline
      def setSwipeBounceTime(value: Double): Self = StObject.set(x, "swipeBounceTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeBounceTimeUndefined: Self = StObject.set(x, "swipeBounceTime", js.undefined)
      
      @scala.inline
      def setSwipeTime(value: Double): Self = StObject.set(x, "swipeTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeTimeUndefined: Self = StObject.set(x, "swipeTime", js.undefined)
      
      @scala.inline
      def setTap(value: Boolean): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
      
      @scala.inline
      def setUseTransform(value: Boolean): Self = StObject.set(x, "useTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTransformUndefined: Self = StObject.set(x, "useTransform", js.undefined)
      
      @scala.inline
      def setUseTransition(value: Boolean): Self = StObject.set(x, "useTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTransitionUndefined: Self = StObject.set(x, "useTransition", js.undefined)
      
      @scala.inline
      def setWheel(value: PartialWheelOption | Boolean): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
      
      @scala.inline
      def setZoom(value: PartialZoomOption | Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.InfinityOption> */
  trait PartialInfinityOption extends StObject {
    
    var createTombstone: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var fetch: js.UndefOr[js.Function1[/* count */ Double, Unit]] = js.undefined
    
    var render: js.UndefOr[js.Function2[/* item */ js.Any, /* div */ Element, Element]] = js.undefined
  }
  object PartialInfinityOption {
    
    @scala.inline
    def apply(): PartialInfinityOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInfinityOption]
    }
    
    @scala.inline
    implicit class PartialInfinityOptionMutableBuilder[Self <: PartialInfinityOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateTombstone(value: () => Element): Self = StObject.set(x, "createTombstone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateTombstoneUndefined: Self = StObject.set(x, "createTombstone", js.undefined)
      
      @scala.inline
      def setFetch(value: /* count */ Double => Unit): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setRender(value: (/* item */ js.Any, /* div */ Element) => Element): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.MouseWheelOption> */
  trait PartialMouseWheelOption extends StObject {
    
    var easeTime: js.UndefOr[Double] = js.undefined
    
    var invert: js.UndefOr[Boolean] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object PartialMouseWheelOption {
    
    @scala.inline
    def apply(): PartialMouseWheelOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMouseWheelOption]
    }
    
    @scala.inline
    implicit class PartialMouseWheelOptionMutableBuilder[Self <: PartialMouseWheelOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEaseTime(value: Double): Self = StObject.set(x, "easeTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseTimeUndefined: Self = StObject.set(x, "easeTime", js.undefined)
      
      @scala.inline
      def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.PullDownOption> */
  trait PartialPullDownOption extends StObject {
    
    var stop: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object PartialPullDownOption {
    
    @scala.inline
    def apply(): PartialPullDownOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPullDownOption]
    }
    
    @scala.inline
    implicit class PartialPullDownOptionMutableBuilder[Self <: PartialPullDownOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.PullUpOption> */
  trait PartialPullUpOption extends StObject {
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object PartialPullUpOption {
    
    @scala.inline
    def apply(): PartialPullUpOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPullUpOption]
    }
    
    @scala.inline
    implicit class PartialPullUpOptionMutableBuilder[Self <: PartialPullUpOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.ScrollBarOption> */
  trait PartialScrollBarOption extends StObject {
    
    var fade: js.UndefOr[Boolean] = js.undefined
  }
  object PartialScrollBarOption {
    
    @scala.inline
    def apply(): PartialScrollBarOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollBarOption]
    }
    
    @scala.inline
    implicit class PartialScrollBarOptionMutableBuilder[Self <: PartialScrollBarOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
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
    
    @scala.inline
    def apply(): PartialSlideOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSlideOption]
    }
    
    @scala.inline
    implicit class PartialSlideOptionMutableBuilder[Self <: PartialSlideOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      @scala.inline
      def setListenFlick(value: Boolean): Self = StObject.set(x, "listenFlick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenFlickUndefined: Self = StObject.set(x, "listenFlick", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStepX(value: Double): Self = StObject.set(x, "stepX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepXUndefined: Self = StObject.set(x, "stepX", js.undefined)
      
      @scala.inline
      def setStepY(value: Double): Self = StObject.set(x, "stepY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepYUndefined: Self = StObject.set(x, "stepY", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
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
    
    @scala.inline
    def apply(): PartialWheelOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWheelOption]
    }
    
    @scala.inline
    implicit class PartialWheelOptionMutableBuilder[Self <: PartialWheelOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustTime(value: Double): Self = StObject.set(x, "adjustTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustTimeUndefined: Self = StObject.set(x, "adjustTime", js.undefined)
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      @scala.inline
      def setWheelItemClass(value: String): Self = StObject.set(x, "wheelItemClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelItemClassUndefined: Self = StObject.set(x, "wheelItemClass", js.undefined)
      
      @scala.inline
      def setWheelWrapperClass(value: String): Self = StObject.set(x, "wheelWrapperClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelWrapperClassUndefined: Self = StObject.set(x, "wheelWrapperClass", js.undefined)
    }
  }
  
  /* Inlined std.Partial<better-scroll.better-scroll.ZoomOption> */
  trait PartialZoomOption extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object PartialZoomOption {
    
    @scala.inline
    def apply(): PartialZoomOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialZoomOption]
    }
    
    @scala.inline
    implicit class PartialZoomOptionMutableBuilder[Self <: PartialZoomOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
