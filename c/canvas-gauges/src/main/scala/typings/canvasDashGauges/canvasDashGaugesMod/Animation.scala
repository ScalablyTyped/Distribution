package typings.canvasDashGauges.canvasDashGaugesMod

import typings.canvasDashGauges.CanvasGaugesNs.AnimationRule
import typings.canvasDashGauges.CanvasGaugesNs.DrawEventCallback
import typings.canvasDashGauges.CanvasGaugesNs.EndEventCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvas-gauges", "Animation")
@js.native
class Animation ()
  extends typings.canvasDashGauges.CanvasGaugesNs.Animation {
  def this(rule: String) = this()
  def this(rule: AnimationRule) = this()
  def this(rule: String, duration: Double) = this()
  def this(rule: AnimationRule, duration: Double) = this()
  def this(rule: String, duration: Double, draw: DrawEventCallback) = this()
  def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback) = this()
  def this(rule: String, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
  def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
}

/* static members */
@JSImport("canvas-gauges", "Animation")
@js.native
object Animation extends js.Object {
  var rules: typings.canvasDashGauges.CanvasGaugesNs.rules = js.native
}

