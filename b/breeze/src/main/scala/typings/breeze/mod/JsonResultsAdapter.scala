package typings.breeze.mod

import typings.breeze.anon.ExtractKeyMappings
import typings.breeze.breeze.KeyMapping
import typings.breeze.breeze.NodeContext
import typings.breeze.breeze.QueryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "JsonResultsAdapter")
@js.native
class JsonResultsAdapter protected ()
  extends StObject
     with typings.breeze.breeze.JsonResultsAdapter {
  def this(config: ExtractKeyMappings) = this()
  
  /* CompleteClass */
  override def extractKeyMappings(data: js.Object): js.Array[KeyMapping] = js.native
  
  /* CompleteClass */
  override def extractResults(data: js.Object): js.Object = js.native
  
  /* CompleteClass */
  override def extractSaveResults(data: js.Object): js.Array[js.Any] = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): typings.breeze.anon.EntityType = js.native
}
