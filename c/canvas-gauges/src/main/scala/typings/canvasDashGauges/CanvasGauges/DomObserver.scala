package typings.canvasDashGauges.CanvasGauges

import typings.std.HTMLElement
import typings.std.MutationRecord
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CanvasGauges.DomObserver")
@js.native
class DomObserver protected () extends js.Object {
  def this(options: GenericOptions, element: String, `type`: String) = this()
  var Type: BaseGauge = js.native
  var element: String = js.native
  var isObservable: Boolean = js.native
  var mutationsObserved: Boolean = js.native
  var options: GenericOptions = js.native
  var `type`: String = js.native
  def isValidNode(node: HTMLElement): Boolean = js.native
  def isValidNode(node: Node): Boolean = js.native
  def observe(records: js.Array[MutationRecord]): js.Any = js.native
  def process(node: HTMLElement): BaseGauge = js.native
  def process(node: Node): BaseGauge = js.native
  def traverse(): js.Any = js.native
}

/* static members */
@JSGlobal("CanvasGauges.DomObserver")
@js.native
object DomObserver extends js.Object {
  def domReady(handler: js.Function): js.Any = js.native
  def parse(value: js.Any): js.Any = js.native
  def toAttributeName(str: String): String = js.native
  def toDashed(camelCase: String): String = js.native
}

