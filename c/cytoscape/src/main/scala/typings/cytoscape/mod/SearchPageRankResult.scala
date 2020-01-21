package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.pageRank
  */
trait SearchPageRankResult extends js.Object {
  /** function that computes the rank of a given node (either object or selector string) */
  def rank(node: NodeCollection): Double
}

object SearchPageRankResult {
  @scala.inline
  def apply(rank: NodeCollection => Double): SearchPageRankResult = {
    val __obj = js.Dynamic.literal(rank = js.Any.fromFunction1(rank))
  
    __obj.asInstanceOf[SearchPageRankResult]
  }
}

