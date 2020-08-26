package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  * trivial
  */
/**
  * http://js.cytoscape.org/#eles.betweennessCentrality
  */
@js.native
trait SearchBetweennessOptions extends js.Object {
  /**
    * A boolean indicating whether the directed indegree and outdegree centrality is calculated (true) or
    * whether the undirected centrality is calculated (false, default).
    */
  var directed: js.UndefOr[Boolean] = js.native
  /**  A function that returns the weight for the edge. */
  var weight: js.UndefOr[js.Function1[/* edge */ EdgeSingular, Double]] = js.native
}

object SearchBetweennessOptions {
  @scala.inline
  def apply(): SearchBetweennessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBetweennessOptions]
  }
  @scala.inline
  implicit class SearchBetweennessOptionsOps[Self <: SearchBetweennessOptions] (val x: Self) extends AnyVal {
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
    def setWeight(value: /* edge */ EdgeSingular => Double): Self = this.set("weight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

