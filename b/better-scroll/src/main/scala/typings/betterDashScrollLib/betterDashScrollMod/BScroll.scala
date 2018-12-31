package typings
package betterDashScrollLib.betterDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BScroll extends js.Object {
  var directionX: scala.Double = js.native
  var directionY: scala.Double = js.native
  var enabled: scala.Boolean = js.native
  var isAnimating: scala.Boolean = js.native
  var isInTransition: scala.Boolean = js.native
  var maxScrollX: scala.Double = js.native
  var maxScrollY: scala.Double = js.native
  var movingDirectionX: scala.Double = js.native
  var movingDirectionY: scala.Double = js.native
  var options: BsOption = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def finishPullDown(): scala.Unit = js.native
  def finishPullUp(): scala.Unit = js.native
  def getCurrentPage(): PageOption = js.native
  def getSelectedIndex(): scala.Double = js.native
  def goToPage(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def goToPage(x: scala.Double, y: scala.Double, time: scala.Double): scala.Unit = js.native
  def goToPage(x: scala.Double, y: scala.Double, time: scala.Double, easing: js.Object): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def next(time: scala.Double): scala.Unit = js.native
  def next(time: scala.Double, easing: js.Object): scala.Unit = js.native
  def off(
    `type`: betterDashScrollLib.betterDashScrollLibStrings.beforeScrollStart | betterDashScrollLib.betterDashScrollLibStrings.scrollStart | betterDashScrollLib.betterDashScrollLibStrings.scroll | betterDashScrollLib.betterDashScrollLibStrings.scrollCancel | betterDashScrollLib.betterDashScrollLibStrings.scrollEnd | betterDashScrollLib.betterDashScrollLibStrings.touchEnd | betterDashScrollLib.betterDashScrollLibStrings.flick | betterDashScrollLib.betterDashScrollLibStrings.refresh | betterDashScrollLib.betterDashScrollLibStrings.destroy | betterDashScrollLib.betterDashScrollLibStrings.pullingDown | betterDashScrollLib.betterDashScrollLibStrings.pullingUp,
    fn: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_beforeScrollStart(`type`: betterDashScrollLib.betterDashScrollLibStrings.beforeScrollStart, fn: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_destroy(`type`: betterDashScrollLib.betterDashScrollLibStrings.destroy, fn: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_flick(`type`: betterDashScrollLib.betterDashScrollLibStrings.flick, fn: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_pullingDown(`type`: betterDashScrollLib.betterDashScrollLibStrings.pullingDown, fn: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_pullingUp(`type`: betterDashScrollLib.betterDashScrollLibStrings.pullingUp, fn: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_refresh(`type`: betterDashScrollLib.betterDashScrollLibStrings.refresh, fn: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_scroll(
    `type`: betterDashScrollLib.betterDashScrollLibStrings.scroll,
    fn: js.Function1[/* pos */ Position, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_scrollCancel(`type`: betterDashScrollLib.betterDashScrollLibStrings.scrollCancel, fn: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_scrollEnd(
    `type`: betterDashScrollLib.betterDashScrollLibStrings.scrollEnd,
    fn: js.Function1[/* pos */ Position, _]
  ): scala.Unit = js.native
  @JSName("on")
  def on_scrollStart(`type`: betterDashScrollLib.betterDashScrollLibStrings.scrollStart, fn: js.Function0[_]): scala.Unit = js.native
  @JSName("on")
  def on_touchEnd(
    `type`: betterDashScrollLib.betterDashScrollLibStrings.touchEnd,
    fn: js.Function1[/* pos */ Position, _]
  ): scala.Unit = js.native
  def prev(): scala.Unit = js.native
  def prev(time: scala.Double): scala.Unit = js.native
  def prev(time: scala.Double, easing: js.Object): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def scrollBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollBy(x: scala.Double, y: scala.Double, time: scala.Double): scala.Unit = js.native
  def scrollBy(x: scala.Double, y: scala.Double, time: scala.Double, easing: js.Object): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double, time: scala.Double): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double, time: scala.Double, easing: js.Object): scala.Unit = js.native
  def scrollToElement(el: java.lang.String): scala.Unit = js.native
  def scrollToElement(el: java.lang.String, time: scala.Double): scala.Unit = js.native
  def scrollToElement(el: java.lang.String, time: scala.Double, offsetX: scala.Boolean): scala.Unit = js.native
  def scrollToElement(el: java.lang.String, time: scala.Double, offsetX: scala.Boolean, offsetY: scala.Boolean): scala.Unit = js.native
  def scrollToElement(
    el: java.lang.String,
    time: scala.Double,
    offsetX: scala.Boolean,
    offsetY: scala.Boolean,
    easing: js.Object
  ): scala.Unit = js.native
  def scrollToElement(el: java.lang.String, time: scala.Double, offsetX: scala.Boolean, offsetY: scala.Double): scala.Unit = js.native
  def scrollToElement(
    el: java.lang.String,
    time: scala.Double,
    offsetX: scala.Boolean,
    offsetY: scala.Double,
    easing: js.Object
  ): scala.Unit = js.native
  def scrollToElement(el: java.lang.String, time: scala.Double, offsetX: scala.Double): scala.Unit = js.native
  def scrollToElement(el: java.lang.String, time: scala.Double, offsetX: scala.Double, offsetY: scala.Boolean): scala.Unit = js.native
  def scrollToElement(
    el: java.lang.String,
    time: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Boolean,
    easing: js.Object
  ): scala.Unit = js.native
  def scrollToElement(el: java.lang.String, time: scala.Double, offsetX: scala.Double, offsetY: scala.Double): scala.Unit = js.native
  def scrollToElement(
    el: java.lang.String,
    time: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double,
    easing: js.Object
  ): scala.Unit = js.native
  def scrollToElement(el: stdLib.HTMLElement): scala.Unit = js.native
  def scrollToElement(el: stdLib.HTMLElement, time: scala.Double): scala.Unit = js.native
  def scrollToElement(el: stdLib.HTMLElement, time: scala.Double, offsetX: scala.Boolean): scala.Unit = js.native
  def scrollToElement(el: stdLib.HTMLElement, time: scala.Double, offsetX: scala.Boolean, offsetY: scala.Boolean): scala.Unit = js.native
  def scrollToElement(
    el: stdLib.HTMLElement,
    time: scala.Double,
    offsetX: scala.Boolean,
    offsetY: scala.Boolean,
    easing: js.Object
  ): scala.Unit = js.native
  def scrollToElement(el: stdLib.HTMLElement, time: scala.Double, offsetX: scala.Boolean, offsetY: scala.Double): scala.Unit = js.native
  def scrollToElement(
    el: stdLib.HTMLElement,
    time: scala.Double,
    offsetX: scala.Boolean,
    offsetY: scala.Double,
    easing: js.Object
  ): scala.Unit = js.native
  def scrollToElement(el: stdLib.HTMLElement, time: scala.Double, offsetX: scala.Double): scala.Unit = js.native
  def scrollToElement(el: stdLib.HTMLElement, time: scala.Double, offsetX: scala.Double, offsetY: scala.Boolean): scala.Unit = js.native
  def scrollToElement(
    el: stdLib.HTMLElement,
    time: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Boolean,
    easing: js.Object
  ): scala.Unit = js.native
  def scrollToElement(el: stdLib.HTMLElement, time: scala.Double, offsetX: scala.Double, offsetY: scala.Double): scala.Unit = js.native
  def scrollToElement(
    el: stdLib.HTMLElement,
    time: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double,
    easing: js.Object
  ): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def trigger(`type`: java.lang.String): scala.Unit = js.native
  def wheelTo(index: scala.Double): scala.Unit = js.native
}

