package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.betweennessCentrality
  */
trait SearchBetweennessResult extends js.Object {
  /** returns the betweenness centrality of the specified node */
  def betweenness(node: NodeSingular): Double
  def betweennessNormalised(node: NodeSingular): Double
  /** returns the normalised betweenness centrality of the specified node */
  def betweennessNormalized(node: NodeSingular): Double
}

object SearchBetweennessResult {
  @scala.inline
  def apply(
    betweenness: NodeSingular => Double,
    betweennessNormalised: NodeSingular => Double,
    betweennessNormalized: NodeSingular => Double
  ): SearchBetweennessResult = {
    val __obj = js.Dynamic.literal(betweenness = js.Any.fromFunction1(betweenness), betweennessNormalised = js.Any.fromFunction1(betweennessNormalised), betweennessNormalized = js.Any.fromFunction1(betweennessNormalized))
  
    __obj.asInstanceOf[SearchBetweennessResult]
  }
}

