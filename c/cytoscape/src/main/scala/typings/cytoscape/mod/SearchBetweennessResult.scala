package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.betweennessCentrality
  */
@js.native
trait SearchBetweennessResult extends js.Object {
  /** returns the betweenness centrality of the specified node */
  def betweenness(node: NodeSingular): Double = js.native
  def betweennessNormalised(node: NodeSingular): Double = js.native
  /** returns the normalised betweenness centrality of the specified node */
  def betweennessNormalized(node: NodeSingular): Double = js.native
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
  @scala.inline
  implicit class SearchBetweennessResultOps[Self <: SearchBetweennessResult] (val x: Self) extends AnyVal {
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
    def setBetweenness(value: NodeSingular => Double): Self = this.set("betweenness", js.Any.fromFunction1(value))
    @scala.inline
    def setBetweennessNormalised(value: NodeSingular => Double): Self = this.set("betweennessNormalised", js.Any.fromFunction1(value))
    @scala.inline
    def setBetweennessNormalized(value: NodeSingular => Double): Self = this.set("betweennessNormalized", js.Any.fromFunction1(value))
  }
  
}

