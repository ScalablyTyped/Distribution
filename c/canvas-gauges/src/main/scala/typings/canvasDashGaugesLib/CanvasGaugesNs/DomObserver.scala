package typings
package canvasDashGaugesLib.CanvasGaugesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CanvasGauges.DomObserver")
@js.native
class DomObserver protected () extends js.Object {
  def this(options: GenericOptions, element: java.lang.String, `type`: java.lang.String) = this()
  var Type: BaseGauge = js.native
  var element: java.lang.String = js.native
  var isObservable: scala.Boolean = js.native
  var mutationsObserved: scala.Boolean = js.native
  var options: GenericOptions = js.native
  var `type`: java.lang.String = js.native
  def isValidNode(node: stdLib.HTMLElement): scala.Boolean = js.native
  def isValidNode(node: stdLib.Node): scala.Boolean = js.native
  def observe(records: js.Array[stdLib.MutationRecord]): js.Any = js.native
  def process(node: stdLib.HTMLElement): BaseGauge = js.native
  def process(node: stdLib.Node): BaseGauge = js.native
  def traverse(): js.Any = js.native
}

/* static members */
@JSGlobal("CanvasGauges.DomObserver")
@js.native
object DomObserver extends js.Object {
  def domReady(handler: js.Function): js.Any = js.native
  def parse(value: js.Any): js.Any = js.native
  def toAttributeName(str: java.lang.String): java.lang.String = js.native
  def toDashed(camelCase: java.lang.String): java.lang.String = js.native
}

