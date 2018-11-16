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

