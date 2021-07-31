package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.pageRank
  */
trait SearchPageRankResult extends StObject {
  
  /** function that computes the rank of a given node (either object or selector string) */
  def rank(node: NodeCollection): Double
}
object SearchPageRankResult {
  
  @scala.inline
  def apply(rank: NodeCollection => Double): SearchPageRankResult = {
    val __obj = js.Dynamic.literal(rank = js.Any.fromFunction1(rank))
    __obj.asInstanceOf[SearchPageRankResult]
  }
  
  @scala.inline
  implicit class SearchPageRankResultMutableBuilder[Self <: SearchPageRankResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRank(value: NodeCollection => Double): Self = StObject.set(x, "rank", js.Any.fromFunction1(value))
  }
}
