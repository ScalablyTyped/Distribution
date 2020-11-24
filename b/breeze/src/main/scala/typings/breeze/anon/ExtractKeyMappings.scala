package typings.breeze.anon

import typings.breeze.breeze.KeyMapping
import typings.breeze.breeze.NodeContext
import typings.breeze.breeze.QueryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtractKeyMappings extends js.Object {
  
  var extractKeyMappings: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[KeyMapping]]] = js.native
  
  var extractResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Object]] = js.native
  
  var extractSaveResults: js.UndefOr[js.Function1[/* data */ js.Object, js.Array[_]]] = js.native
  
  var name: String = js.native
  
  def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): EntityType = js.native
}
object ExtractKeyMappings {
  
  @scala.inline
  def apply(name: String, visitNode: (js.Object, QueryContext, NodeContext) => EntityType): ExtractKeyMappings = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], visitNode = js.Any.fromFunction3(visitNode))
    __obj.asInstanceOf[ExtractKeyMappings]
  }
  
  @scala.inline
  implicit class ExtractKeyMappingsOps[Self <: ExtractKeyMappings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisitNode(value: (js.Object, QueryContext, NodeContext) => EntityType): Self = this.set("visitNode", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExtractKeyMappings(value: /* data */ js.Object => js.Array[KeyMapping]): Self = this.set("extractKeyMappings", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExtractKeyMappings: Self = this.set("extractKeyMappings", js.undefined)
    
    @scala.inline
    def setExtractResults(value: /* data */ js.Object => js.Object): Self = this.set("extractResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExtractResults: Self = this.set("extractResults", js.undefined)
    
    @scala.inline
    def setExtractSaveResults(value: /* data */ js.Object => js.Array[_]): Self = this.set("extractSaveResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExtractSaveResults: Self = this.set("extractSaveResults", js.undefined)
  }
}
