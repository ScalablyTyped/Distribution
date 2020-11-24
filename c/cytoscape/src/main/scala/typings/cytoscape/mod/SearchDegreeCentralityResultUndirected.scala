package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.degreeCentrality
  */
@js.native
trait SearchDegreeCentralityResultUndirected extends js.Object {
  
  /** the degree centrality of the root node */
  var degree: Double = js.native
}
object SearchDegreeCentralityResultUndirected {
  
  @scala.inline
  def apply(degree: Double): SearchDegreeCentralityResultUndirected = {
    val __obj = js.Dynamic.literal(degree = degree.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDegreeCentralityResultUndirected]
  }
  
  @scala.inline
  implicit class SearchDegreeCentralityResultUndirectedOps[Self <: SearchDegreeCentralityResultUndirected] (val x: Self) extends AnyVal {
    
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
    def setDegree(value: Double): Self = this.set("degree", value.asInstanceOf[js.Any])
  }
}
