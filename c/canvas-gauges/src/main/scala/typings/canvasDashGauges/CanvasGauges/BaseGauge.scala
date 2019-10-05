package typings.canvasDashGauges.CanvasGauges

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

