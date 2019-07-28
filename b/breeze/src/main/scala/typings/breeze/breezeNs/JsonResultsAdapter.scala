package typings.breeze.breezeNs

import typings.breeze.Anon_Data
import typings.breeze.Anon_EntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.JsonResultsAdapter")
@js.native
class JsonResultsAdapter protected () extends js.Object {
  def this(config: Anon_Data) = this()
  var name: String = js.native
  def extractKeyMappings(data: js.Object): js.Array[KeyMapping] = js.native
  def extractResults(data: js.Object): js.Object = js.native
  def extractSaveResults(data: js.Object): js.Array[_] = js.native
  def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): Anon_EntityType = js.native
}

