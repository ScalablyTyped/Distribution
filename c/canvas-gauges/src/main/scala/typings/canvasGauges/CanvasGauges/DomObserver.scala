package typings.canvasGauges.CanvasGauges

import typings.std.HTMLElement
import typings.std.MutationRecord
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomObserver extends js.Object {
  
  var Type: BaseGauge = js.native
  
  var element: String = js.native
  
  var isObservable: Boolean = js.native
  
  def isValidNode(node: HTMLElement): Boolean = js.native
  def isValidNode(node: Node): Boolean = js.native
  
  var mutationsObserved: Boolean = js.native
  
  def observe(records: js.Array[MutationRecord]): js.Any = js.native
  
  var options: GenericOptions = js.native
  
  def process(node: HTMLElement): BaseGauge = js.native
  def process(node: Node): BaseGauge = js.native
  
  def traverse(): js.Any = js.native
  
  var `type`: String = js.native
}
