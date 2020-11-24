package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.bellmanFord
  */
@js.native
trait SearchBellmanFordOptions extends js.Object {
  
  /**
    * Indicating whether the algorithm should only go along
    * edges from source to target (default false).
    */
  var directed: Boolean = js.native
  
  /**
    * The root node (selector or collection) where the search starts.
    */
  var root: js.Any = js.native
  
  /**
    * A function that returns the positive numeric weight for this edge.
    */
  var weight: js.UndefOr[WeightFn] = js.native
}
object SearchBellmanFordOptions {
  
  @scala.inline
  def apply(directed: Boolean, root: js.Any): SearchBellmanFordOptions = {
    val __obj = js.Dynamic.literal(directed = directed.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBellmanFordOptions]
  }
  
  @scala.inline
  implicit class SearchBellmanFordOptionsOps[Self <: SearchBellmanFordOptions] (val x: Self) extends AnyVal {
    
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
    def setDirected(value: Boolean): Self = this.set("directed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: /* edge */ EdgeCollection => Double): Self = this.set("weight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
