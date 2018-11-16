package typings
package canvasDashGaugesLib.canvasDashGaugesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvas-gauges", "Animation")
@js.native
class Animation ()
  extends canvasDashGaugesLib.CanvasGaugesNs.Animation {
  def this(rule: canvasDashGaugesLib.CanvasGaugesNs.AnimationRule) = this()
  def this(rule: java.lang.String) = this()
  def this(rule: canvasDashGaugesLib.CanvasGaugesNs.AnimationRule, duration: scala.Double) = this()
  def this(rule: java.lang.String, duration: scala.Double) = this()
  def this(rule: canvasDashGaugesLib.CanvasGaugesNs.AnimationRule, duration: scala.Double, draw: canvasDashGaugesLib.CanvasGaugesNs.DrawEventCallback) = this()
  def this(rule: java.lang.String, duration: scala.Double, draw: canvasDashGaugesLib.CanvasGaugesNs.DrawEventCallback) = this()
  def this(rule: canvasDashGaugesLib.CanvasGaugesNs.AnimationRule, duration: scala.Double, draw: canvasDashGaugesLib.CanvasGaugesNs.DrawEventCallback, end: canvasDashGaugesLib.CanvasGaugesNs.EndEventCallback) = this()
  def this(rule: java.lang.String, duration: scala.Double, draw: canvasDashGaugesLib.CanvasGaugesNs.DrawEventCallback, end: canvasDashGaugesLib.CanvasGaugesNs.EndEventCallback) = this()
}

@JSImport("canvas-gauges", "Animation")
@js.native
object Animation extends js.Object {
  var rules: canvasDashGaugesLib.CanvasGaugesNs.rules = js.native
}

