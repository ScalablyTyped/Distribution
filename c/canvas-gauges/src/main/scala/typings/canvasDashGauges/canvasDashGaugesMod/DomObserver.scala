package typings.canvasDashGauges.canvasDashGaugesMod

import typings.canvasDashGauges.CanvasGaugesNs.GenericOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvas-gauges", "DomObserver")
@js.native
class DomObserver protected ()
  extends typings.canvasDashGauges.CanvasGaugesNs.DomObserver {
  def this(options: GenericOptions, element: String, `type`: String) = this()
}

/* static members */
@JSImport("canvas-gauges", "DomObserver")
@js.native
object DomObserver extends js.Object {
  def domReady(handler: js.Function): js.Any = js.native
  def parse(value: js.Any): js.Any = js.native
  def toAttributeName(str: String): String = js.native
  def toDashed(camelCase: String): String = js.native
}

