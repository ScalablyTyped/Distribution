package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.pageRank
  */
@js.native
trait SearchPageRankResult extends js.Object {
  
  /** function that computes the rank of a given node (either object or selector string) */
  def rank(node: NodeCollection): Double = js.native
}
object SearchPageRankResult {
  
  @scala.inline
  def apply(rank: NodeCollection => Double): SearchPageRankResult = {
    val __obj = js.Dynamic.literal(rank = js.Any.fromFunction1(rank))
    __obj.asInstanceOf[SearchPageRankResult]
  }
  
  @scala.inline
  implicit class SearchPageRankResultOps[Self <: SearchPageRankResult] (val x: Self) extends AnyVal {
    
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
    def setRank(value: NodeCollection => Double): Self = this.set("rank", js.Any.fromFunction1(value))
  }
}
