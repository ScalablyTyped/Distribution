package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.kruskal
  * trivial so implemented in the function
  */
/**
  * http://js.cytoscape.org/#eles.pageRank
  */
trait SearchPageRankOptions extends StObject {
  
  /** Numeric parameter for the algorithm. */
  var dampingFactor: js.UndefOr[Double] = js.undefined
  
  /** Maximum number of iterations to perform. */
  var iterations: js.UndefOr[Double] = js.undefined
  
  /** Numeric parameter that represents the required precision. */
  var precision: js.UndefOr[Double] = js.undefined
}
object SearchPageRankOptions {
  
  @scala.inline
  def apply(): SearchPageRankOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchPageRankOptions]
  }
  
  @scala.inline
  implicit class SearchPageRankOptionsMutableBuilder[Self <: SearchPageRankOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDampingFactor(value: Double): Self = StObject.set(x, "dampingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingFactorUndefined: Self = StObject.set(x, "dampingFactor", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
  }
}
