package typings.betterScroll.mod

import typings.betterScroll.betterScrollStrings.beforeScrollStart
import typings.betterScroll.betterScrollStrings.destroy
import typings.betterScroll.betterScrollStrings.flick
import typings.betterScroll.betterScrollStrings.pullingDown
import typings.betterScroll.betterScrollStrings.pullingUp
import typings.betterScroll.betterScrollStrings.refresh
import typings.betterScroll.betterScrollStrings.scroll
import typings.betterScroll.betterScrollStrings.scrollCancel
import typings.betterScroll.betterScrollStrings.scrollEnd
import typings.betterScroll.betterScrollStrings.scrollStart
import typings.betterScroll.betterScrollStrings.touchEnd
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BScroll extends js.Object {
  var directionX: Double = js.native
  var directionY: Double = js.native
  var enabled: Boolean = js.native
  var isAnimating: Boolean = js.native
  var isInTransition: Boolean = js.native
  var maxScrollX: Double = js.native
  var maxScrollY: Double = js.native
  var movingDirectionX: Double = js.native
  var movingDirectionY: Double = js.native
  var options: BsOption = js.native
  var x: Double = js.native
  var y: Double = js.native
  def destroy(): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def finishPullDown(): Unit = js.native
  def finishPullUp(): Unit = js.native
  def getCurrentPage(): PageOption = js.native
  def getSelectedIndex(): Double = js.native
  def goToPage(x: Double, y: Double): Unit = js.native
  def goToPage(x: Double, y: Double, time: Double): Unit = js.native
  def goToPage(x: Double, y: Double, time: Double, easing: js.Object): Unit = js.native
  def next(): Unit = js.native
  def next(time: Double): Unit = js.native
  def next(time: Double, easing: js.Object): Unit = js.native
  def off(
    `type`: beforeScrollStart | scrollStart | scroll | scrollCancel | scrollEnd | touchEnd | flick | refresh | destroy | pullingDown | pullingUp,
    fn: js.Function1[/* repeated */ js.Any, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_beforeScrollStart(`type`: beforeScrollStart, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_destroy(`type`: destroy, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_flick(`type`: flick, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_pullingDown(`type`: pullingDown, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_pullingUp(`type`: pullingUp, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_refresh(`type`: refresh, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_scroll(`type`: scroll, fn: js.Function1[/* pos */ Position, _]): Unit = js.native
  @JSName("on")
  def on_scrollCancel(`type`: scrollCancel, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_scrollEnd(`type`: scrollEnd, fn: js.Function1[/* pos */ Position, _]): Unit = js.native
  @JSName("on")
  def on_scrollStart(`type`: scrollStart, fn: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_touchEnd(`type`: touchEnd, fn: js.Function1[/* pos */ Position, _]): Unit = js.native
  def prev(): Unit = js.native
  def prev(time: Double): Unit = js.native
  def prev(time: Double, easing: js.Object): Unit = js.native
  def refresh(): Unit = js.native
  def scrollBy(x: Double, y: Double): Unit = js.native
  def scrollBy(x: Double, y: Double, time: Double): Unit = js.native
  def scrollBy(x: Double, y: Double, time: Double, easing: js.Object): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, time: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, time: Double, easing: js.Object): Unit = js.native
  def scrollToElement(el: String): Unit = js.native
  def scrollToElement(el: String, time: Double): Unit = js.native
  def scrollToElement(el: String, time: Double, offsetX: Boolean): Unit = js.native
  def scrollToElement(el: String, time: Double, offsetX: Boolean, offsetY: Boolean): Unit = js.native
  def scrollToElement(el: String, time: Double, offsetX: Boolean, offsetY: Boolean, easing: js.Object): Unit = js.native
  def scrollToElement(el: String, time: Double, offsetX: Boolean, offsetY: Double): Unit = js.native
  def scrollToElement(el: String, time: Double, offsetX: Boolean, offsetY: Double, easing: js.Object): Unit = js.native
  def scrollToElement(el: String, time: Double, offsetX: Double): Unit = js.native
  def scrollToElement(el: String, time: Double, offsetX: Double, offsetY: Boolean): Unit = js.native
  def scrollToElement(el: String, time: Double, offsetX: Double, offsetY: Boolean, easing: js.Object): Unit = js.native
  def scrollToElement(el: String, time: Double, offsetX: Double, offsetY: Double): Unit = js.native
  def scrollToElement(el: String, time: Double, offsetX: Double, offsetY: Double, easing: js.Object): Unit = js.native
  def scrollToElement(el: HTMLElement): Unit = js.native
  def scrollToElement(el: HTMLElement, time: Double): Unit = js.native
  def scrollToElement(el: HTMLElement, time: Double, offsetX: Boolean): Unit = js.native
  def scrollToElement(el: HTMLElement, time: Double, offsetX: Boolean, offsetY: Boolean): Unit = js.native
  def scrollToElement(el: HTMLElement, time: Double, offsetX: Boolean, offsetY: Boolean, easing: js.Object): Unit = js.native
  def scrollToElement(el: HTMLElement, time: Double, offsetX: Boolean, offsetY: Double): Unit = js.native
  def scrollToElement(el: HTMLElement, time: Double, offsetX: Boolean, offsetY: Double, easing: js.Object): Unit = js.native
  def scrollToElement(el: HTMLElement, time: Double, offsetX: Double): Unit = js.native
  def scrollToElement(el: HTMLElement, time: Double, offsetX: Double, offsetY: Boolean): Unit = js.native
  def scrollToElement(el: HTMLElement, time: Double, offsetX: Double, offsetY: Boolean, easing: js.Object): Unit = js.native
  def scrollToElement(el: HTMLElement, time: Double, offsetX: Double, offsetY: Double): Unit = js.native
  def scrollToElement(el: HTMLElement, time: Double, offsetX: Double, offsetY: Double, easing: js.Object): Unit = js.native
  def stop(): Unit = js.native
  def trigger(`type`: String): Unit = js.native
  def wheelTo(index: Double): Unit = js.native
}

