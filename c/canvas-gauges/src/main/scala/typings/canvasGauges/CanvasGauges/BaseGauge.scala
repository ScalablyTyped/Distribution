package typings.canvasGauges.CanvasGauges

import typings.canvasGauges.canvasGaugesStrings.animate
import typings.canvasGauges.canvasGaugesStrings.animationEnd
import typings.canvasGauges.canvasGaugesStrings.animationStart
import typings.canvasGauges.canvasGaugesStrings.beforeHighlights
import typings.canvasGauges.canvasGaugesStrings.beforeMajorTicks
import typings.canvasGauges.canvasGaugesStrings.beforeMinorTicks
import typings.canvasGauges.canvasGaugesStrings.beforeNeedle
import typings.canvasGauges.canvasGaugesStrings.beforeNumbers
import typings.canvasGauges.canvasGaugesStrings.beforePlate
import typings.canvasGauges.canvasGaugesStrings.beforeProgressBar
import typings.canvasGauges.canvasGaugesStrings.beforeTitle
import typings.canvasGauges.canvasGaugesStrings.beforeUnits
import typings.canvasGauges.canvasGaugesStrings.beforeValueBox
import typings.canvasGauges.canvasGaugesStrings.destroy
import typings.canvasGauges.canvasGaugesStrings.init
import typings.canvasGauges.canvasGaugesStrings.render
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CanvasGauges.BaseGauge")
@js.native
abstract class BaseGauge protected () extends js.Object {
  def this(options: GenericOptions) = this()
  var animation: Animation = js.native
  var canvas: SmartCanvas = js.native
  var options: GenericOptions = js.native
  var `type`: BaseGauge = js.native
  var value: Double = js.native
  def destroy(): js.Any = js.native
  def draw(): BaseGauge = js.native
  @JSName("on")
  def on_animate(event: animate, listeners: js.Function2[/* percent */ Double, /* value */ Double, Unit]): Unit = js.native
  @JSName("on")
  def on_animationEnd(event: animationEnd, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_animationStart(event: animationStart, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeHighlights(event: beforeHighlights, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeMajorTicks(event: beforeMajorTicks, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeMinorTicks(event: beforeMinorTicks, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeNeedle(event: beforeNeedle, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeNumbers(event: beforeNumbers, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforePlate(event: beforePlate, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeProgressBar(event: beforeProgressBar, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeTitle(event: beforeTitle, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeUnits(event: beforeUnits, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_beforeValueBox(event: beforeValueBox, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_destroy(event: destroy, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_init(event: init, listeners: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_render(event: render, listeners: js.Function0[Unit]): Unit = js.native
  def update(options: GenericOptions): BaseGauge = js.native
}

/* static members */
@JSGlobal("CanvasGauges.BaseGauge")
@js.native
object BaseGauge extends js.Object {
  val version: Double = js.native
  def ensureValue(value: Double): Double = js.native
  def fromElement(element: HTMLElement): js.Any = js.native
  def initialize(`type`: String, options: GenericOptions): js.Any = js.native
}

