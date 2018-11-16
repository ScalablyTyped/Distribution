package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.JsonResultsAdapter")
@js.native
class JsonResultsAdapter protected () extends js.Object {
  def this(config: breezeLib.Anon_NameVisitNode) = this()
  var name: java.lang.String = js.native
  def extractKeyMappings(data: js.Object): js.Array[KeyMapping] = js.native
  def extractResults(data: js.Object): js.Object = js.native
  def extractSaveResults(data: js.Object): js.Array[_] = js.native
  def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): breezeLib.Anon_NodeId = js.native
}

