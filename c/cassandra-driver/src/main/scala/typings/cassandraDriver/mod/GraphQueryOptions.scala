package typings.cassandraDriver.mod

import typings.cassandraDriver.typesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQueryOptions extends QueryOptions {
  
  var graphLanguage: js.UndefOr[String] = js.native
  
  var graphName: js.UndefOr[String] = js.native
  
  var graphReadConsistency: js.UndefOr[consistencies] = js.native
  
  var graphSource: js.UndefOr[String] = js.native
  
  var graphWriteConsistency: js.UndefOr[consistencies] = js.native
}
object GraphQueryOptions {
  
  @scala.inline
  def apply(): GraphQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQueryOptions]
  }
  
  @scala.inline
  implicit class GraphQueryOptionsOps[Self <: GraphQueryOptions] (val x: Self) extends AnyVal {
    
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
    def setGraphLanguage(value: String): Self = this.set("graphLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphLanguage: Self = this.set("graphLanguage", js.undefined)
    
    @scala.inline
    def setGraphName(value: String): Self = this.set("graphName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphName: Self = this.set("graphName", js.undefined)
    
    @scala.inline
    def setGraphReadConsistency(value: consistencies): Self = this.set("graphReadConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphReadConsistency: Self = this.set("graphReadConsistency", js.undefined)
    
    @scala.inline
    def setGraphSource(value: String): Self = this.set("graphSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphSource: Self = this.set("graphSource", js.undefined)
    
    @scala.inline
    def setGraphWriteConsistency(value: consistencies): Self = this.set("graphWriteConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphWriteConsistency: Self = this.set("graphWriteConsistency", js.undefined)
  }
}
