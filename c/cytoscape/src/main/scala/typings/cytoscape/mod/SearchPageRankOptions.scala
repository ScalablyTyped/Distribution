package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.kruskal
  * trivial so implemented in the function
  */
/**
  * http://js.cytoscape.org/#eles.pageRank
  */
@js.native
trait SearchPageRankOptions extends js.Object {
  
  /** Numeric parameter for the algorithm. */
  var dampingFactor: js.UndefOr[Double] = js.native
  
  /** Maximum number of iterations to perform. */
  var iterations: js.UndefOr[Double] = js.native
  
  /** Numeric parameter that represents the required precision. */
  var precision: js.UndefOr[Double] = js.native
}
object SearchPageRankOptions {
  
  @scala.inline
  def apply(): SearchPageRankOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchPageRankOptions]
  }
  
  @scala.inline
  implicit class SearchPageRankOptionsOps[Self <: SearchPageRankOptions] (val x: Self) extends AnyVal {
    
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
    def setDampingFactor(value: Double): Self = this.set("dampingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDampingFactor: Self = this.set("dampingFactor", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
  }
}
