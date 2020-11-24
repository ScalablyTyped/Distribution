package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.degreeCentralityNormalized
  */
@js.native
trait SearchDegreeCentralityNormalizedOptions extends js.Object {
  
  /**
    * The alpha value for the centrality calculation, ranging on [0, 1].
    * With value 0 (default), disregards edge weights and solely uses
    * number of edges in the centrality calculation. With value 1,
    * disregards number of edges and solely uses the edge weights
    * in the centrality calculation.
    */
  var alpha: js.UndefOr[Double] = js.native
  
  /**
    * A boolean indicating whether the directed indegree and outdegree centrality is calculated (true) or
    * whether the undirected centrality is calculated (false, default).
    */
  var directed: js.UndefOr[Boolean] = js.native
  
  /**  A function that returns the weight for the edge. */
  def weight(edge: EdgeSingular): Double = js.native
}
object SearchDegreeCentralityNormalizedOptions {
  
  @scala.inline
  def apply(weight: EdgeSingular => Double): SearchDegreeCentralityNormalizedOptions = {
    val __obj = js.Dynamic.literal(weight = js.Any.fromFunction1(weight))
    __obj.asInstanceOf[SearchDegreeCentralityNormalizedOptions]
  }
  
  @scala.inline
  implicit class SearchDegreeCentralityNormalizedOptionsOps[Self <: SearchDegreeCentralityNormalizedOptions] (val x: Self) extends AnyVal {
    
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
    def setWeight(value: EdgeSingular => Double): Self = this.set("weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setDirected(value: Boolean): Self = this.set("directed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirected: Self = this.set("directed", js.undefined)
  }
}
