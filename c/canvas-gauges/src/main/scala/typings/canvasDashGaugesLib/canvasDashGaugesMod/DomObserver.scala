package typings
package canvasDashGaugesLib.canvasDashGaugesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvas-gauges", "DomObserver")
@js.native
class DomObserver protected ()
  extends canvasDashGaugesLib.CanvasGaugesNs.DomObserver {
  def this(options: canvasDashGaugesLib.CanvasGaugesNs.GenericOptions, element: java.lang.String, `type`: java.lang.String) = this()
}

@JSImport("canvas-gauges", "DomObserver")
@js.native
object DomObserver extends js.Object {
  def domReady(handler: js.Function): js.Any = js.native
  def parse(value: js.Any): js.Any = js.native
  def toAttributeName(str: java.lang.String): java.lang.String = js.native
  def toDashed(camelCase: java.lang.String): java.lang.String = js.native
}

