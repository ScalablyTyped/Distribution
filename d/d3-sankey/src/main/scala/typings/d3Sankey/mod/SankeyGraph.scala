package typings.d3Sankey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SankeyGraph[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends js.Object {
  
  /**
    * Array of Sankey diagram links
    */
  var links: js.Array[SankeyLink[N, L]] = js.native
  
  /**
    * Array of Sankey diagram nodes
    */
  var nodes: js.Array[SankeyNode[N, L]] = js.native
}
object SankeyGraph {
  
  @scala.inline
  def apply[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](links: js.Array[SankeyLink[N, L]], nodes: js.Array[SankeyNode[N, L]]): SankeyGraph[N, L] = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyGraph[N, L]]
  }
  
  @scala.inline
  implicit class SankeyGraphOps[Self <: SankeyGraph[_, _], N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] (val x: Self with (SankeyGraph[N, L])) extends AnyVal {
    
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
    def setLinksVarargs(value: (SankeyLink[N, L])*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[SankeyLink[N, L]]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: (SankeyNode[N, L])*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[SankeyNode[N, L]]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
}
