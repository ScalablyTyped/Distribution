package typings
package canvasDashGaugesLib.CanvasGaugesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CanvasGauges.Animation")
@js.native
class Animation () extends js.Object {
  def this(rule: AnimationRule) = this()
  def this(rule: java.lang.String) = this()
  def this(rule: AnimationRule, duration: scala.Double) = this()
  def this(rule: java.lang.String, duration: scala.Double) = this()
  def this(rule: AnimationRule, duration: scala.Double, draw: DrawEventCallback) = this()
  def this(rule: java.lang.String, duration: scala.Double, draw: DrawEventCallback) = this()
  def this(rule: AnimationRule, duration: scala.Double, draw: DrawEventCallback, end: EndEventCallback) = this()
  def this(rule: java.lang.String, duration: scala.Double, draw: DrawEventCallback, end: EndEventCallback) = this()
  @JSName("draw")
  var draw_Original: DrawEventCallback = js.native
  var duration: scala.Double = js.native
  @JSName("end")
  var end_Original: EndEventCallback = js.native
  var rule: java.lang.String | AnimationRule = js.native
  def animate(): js.Any = js.native
  def animate(draw: DrawEventCallback): js.Any = js.native
  def animate(draw: DrawEventCallback, end: EndEventCallback): js.Any = js.native
  def destroy(): js.Any = js.native
  def draw(percent: scala.Double): js.Any = js.native
  def end(): js.Any = js.native
}

@JSGlobal("CanvasGauges.Animation")
@js.native
object Animation extends js.Object {
  var rules: canvasDashGaugesLib.CanvasGaugesNs.rules = js.native
}

