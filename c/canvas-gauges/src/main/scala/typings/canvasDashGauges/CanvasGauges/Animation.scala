package typings.canvasDashGauges.CanvasGauges

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CanvasGauges.Animation")
@js.native
class Animation () extends js.Object {
  def this(rule: String) = this()
  def this(rule: AnimationRule) = this()
  def this(rule: String, duration: Double) = this()
  def this(rule: AnimationRule, duration: Double) = this()
  def this(rule: String, duration: Double, draw: DrawEventCallback) = this()
  def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback) = this()
  def this(rule: String, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
  def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
  @JSName("draw")
  var draw_Original: DrawEventCallback = js.native
  var duration: Double = js.native
  @JSName("end")
  var end_Original: EndEventCallback = js.native
  var rule: String | AnimationRule = js.native
  def animate(): js.Any = js.native
  def animate(draw: DrawEventCallback): js.Any = js.native
  def animate(draw: DrawEventCallback, end: EndEventCallback): js.Any = js.native
  def destroy(): js.Any = js.native
  def draw(percent: Double): js.Any = js.native
  def end(): js.Any = js.native
}

/* static members */
@JSGlobal("CanvasGauges.Animation")
@js.native
object Animation extends js.Object {
  var rules: typings.canvasDashGauges.CanvasGauges.rules = js.native
}

