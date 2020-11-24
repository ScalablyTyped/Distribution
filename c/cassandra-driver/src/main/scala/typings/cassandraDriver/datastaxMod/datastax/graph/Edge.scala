package typings.cassandraDriver.datastaxMod.datastax.graph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge
  extends typings.cassandraDriver.graphMod.graph.Element {
  
  var inV: js.UndefOr[typings.cassandraDriver.graphMod.graph.Vertex] = js.native
  
  var inVLabel: js.UndefOr[String] = js.native
  
  var outV: js.UndefOr[typings.cassandraDriver.graphMod.graph.Vertex] = js.native
  
  var outVLabel: js.UndefOr[String] = js.native
  
  var properties: js.UndefOr[js.Object] = js.native
}
object Edge {
  
  @scala.inline
  def apply(id: js.Any, label: String): Edge = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    
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
    def setInV(value: typings.cassandraDriver.graphMod.graph.Vertex): Self = this.set("inV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInV: Self = this.set("inV", js.undefined)
    
    @scala.inline
    def setInVLabel(value: String): Self = this.set("inVLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInVLabel: Self = this.set("inVLabel", js.undefined)
    
    @scala.inline
    def setOutV(value: typings.cassandraDriver.graphMod.graph.Vertex): Self = this.set("outV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutV: Self = this.set("outV", js.undefined)
    
    @scala.inline
    def setOutVLabel(value: String): Self = this.set("outVLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutVLabel: Self = this.set("outVLabel", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Object): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
