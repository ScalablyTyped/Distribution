package typings.d3Sankey.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SankeyNodeMinimal[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] extends js.Object {
  
  /**
    * Node’s zero-based graph depth, derived from the graph topology calculated by Sankey layout generator.
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * Node’s zero-based graph height, derived from the graph topology calculated by Sankey layout generator.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Node’s zero-based index within the array of nodes calculated by Sankey layout generator.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Array of outgoing links which have this node as their source.
    * This property is calculated internally by the Sankey layout generator.
    */
  var sourceLinks: js.UndefOr[js.Array[SankeyLink[N, L]]] = js.native
  
  /**
    * Array of incoming links which have this node as their target.
    * This property is calculated internally by the Sankey layout generator.
    */
  var targetLinks: js.UndefOr[js.Array[SankeyLink[N, L]]] = js.native
  
  /**
    * Node's value calculated by Sankey layout Generator;
    * the sum of link.value for the node’s incoming links.
    */
  var value: js.UndefOr[Double] = js.native
  
  /**
    * Node's minimum horizontal position (derived from the node.depth) calculated by Sankey layout generator.
    */
  var x0: js.UndefOr[Double] = js.native
  
  /**
    * Node’s maximum horizontal position (node.x0 + sankey.nodeWidth) calculated by Sankey layout generator.
    */
  var x1: js.UndefOr[Double] = js.native
  
  /**
    * Node's minimum vertical position calculated by Sankey layout generator.
    */
  var y0: js.UndefOr[Double] = js.native
  
  /**
    * Node's maximum vertical position (node.y1 - node.y0 is proportional to node.value) calculated by Sankey layout generator.
    */
  var y1: js.UndefOr[Double] = js.native
}
object SankeyNodeMinimal {
  
  @scala.inline
  def apply[N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */](): SankeyNodeMinimal[N, L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyNodeMinimal[N, L]]
  }
  
  @scala.inline
  implicit class SankeyNodeMinimalOps[Self <: SankeyNodeMinimal[_, _], N /* <: SankeyExtraProperties */, L /* <: SankeyExtraProperties */] (val x: Self with (SankeyNodeMinimal[N, L])) extends AnyVal {
    
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setSourceLinksVarargs(value: (SankeyLink[N, L])*): Self = this.set("sourceLinks", js.Array(value :_*))
    
    @scala.inline
    def setSourceLinks(value: js.Array[SankeyLink[N, L]]): Self = this.set("sourceLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLinks: Self = this.set("sourceLinks", js.undefined)
    
    @scala.inline
    def setTargetLinksVarargs(value: (SankeyLink[N, L])*): Self = this.set("targetLinks", js.Array(value :_*))
    
    @scala.inline
    def setTargetLinks(value: js.Array[SankeyLink[N, L]]): Self = this.set("targetLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetLinks: Self = this.set("targetLinks", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setX0(value: Double): Self = this.set("x0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX0: Self = this.set("x0", js.undefined)
    
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    
    @scala.inline
    def setY0(value: Double): Self = this.set("y0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY0: Self = this.set("y0", js.undefined)
    
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
  }
}
