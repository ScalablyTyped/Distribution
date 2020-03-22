package typings.breeze.breeze

import typings.breeze.AnonEntityType
import typings.breeze.AnonExtractKeyMappings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.JsonResultsAdapter")
@js.native
class JsonResultsAdapter protected () extends js.Object {
  def this(config: AnonExtractKeyMappings) = this()
  var name: String = js.native
  def extractKeyMappings(data: js.Object): js.Array[KeyMapping] = js.native
  def extractResults(data: js.Object): js.Object = js.native
  def extractSaveResults(data: js.Object): js.Array[_] = js.native
  def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): AnonEntityType = js.native
}

