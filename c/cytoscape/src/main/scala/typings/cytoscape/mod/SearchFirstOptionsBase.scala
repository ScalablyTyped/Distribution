package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFirstOptionsBase extends js.Object {
  
  /**
    * A boolean indicating whether the algorithm should only go along edges from source to target (default false).
    */
  var directed: js.UndefOr[Boolean] = js.native
  
  /**
    * A handler function that is called when a node is visited in the search.
    */
  var visit: js.UndefOr[SearchVisitFunction] = js.native
}
object SearchFirstOptionsBase {
  
  @scala.inline
  def apply(): SearchFirstOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFirstOptionsBase]
  }
  
  @scala.inline
  implicit class SearchFirstOptionsBaseOps[Self <: SearchFirstOptionsBase] (val x: Self) extends AnyVal {
    
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
    def deleteDirected: Self = this.set("directed", js.undefined)
    
    @scala.inline
    def setVisit(
      value: (/* v */ NodeSingular, /* e */ EdgeSingular, /* u */ NodeSingular, /* i */ Double, /* depth */ Double) => Boolean | Unit
    ): Self = this.set("visit", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteVisit: Self = this.set("visit", js.undefined)
  }
}
