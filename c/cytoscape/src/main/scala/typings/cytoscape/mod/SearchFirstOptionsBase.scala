package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFirstOptionsBase extends StObject {
  
  /**
    * A boolean indicating whether the algorithm should only go along edges from source to target (default false).
    */
  var directed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A handler function that is called when a node is visited in the search.
    */
  var visit: js.UndefOr[SearchVisitFunction] = js.undefined
}
object SearchFirstOptionsBase {
  
  @scala.inline
  def apply(): SearchFirstOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFirstOptionsBase]
  }
  
  @scala.inline
  implicit class SearchFirstOptionsBaseMutableBuilder[Self <: SearchFirstOptionsBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectedUndefined: Self = StObject.set(x, "directed", js.undefined)
    
    @scala.inline
    def setVisit(
      value: (/* v */ NodeSingular, /* e */ EdgeSingular, /* u */ NodeSingular, /* i */ Double, /* depth */ Double) => Boolean | Unit
    ): Self = StObject.set(x, "visit", js.Any.fromFunction5(value))
    
    @scala.inline
    def setVisitUndefined: Self = StObject.set(x, "visit", js.undefined)
  }
}
