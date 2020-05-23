package typings.breeze.global.breeze

import typings.breeze.anon.ExtractKeyMappings
import typings.breeze.breeze.KeyMapping
import typings.breeze.breeze.NodeContext
import typings.breeze.breeze.QueryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.JsonResultsAdapter")
@js.native
class JsonResultsAdapter protected ()
  extends typings.breeze.breeze.JsonResultsAdapter {
  def this(config: ExtractKeyMappings) = this()
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def extractKeyMappings(data: js.Object): js.Array[KeyMapping] = js.native
  /* CompleteClass */
  override def extractResults(data: js.Object): js.Object = js.native
  /* CompleteClass */
  override def extractSaveResults(data: js.Object): js.Array[_] = js.native
  /* CompleteClass */
  override def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): typings.breeze.anon.EntityType = js.native
}

