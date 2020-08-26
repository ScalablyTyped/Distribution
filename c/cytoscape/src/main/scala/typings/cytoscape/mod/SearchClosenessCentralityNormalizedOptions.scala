package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.closenessCentrality
  * trivial
  */
/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  */
/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  */
@js.native
trait SearchClosenessCentralityNormalizedOptions extends js.Object {
  var directed: js.UndefOr[Boolean] = js.native
  /**
    * A boolean indicating whether the algorithm calculates the
    * harmonic mean (true, default) or the arithmetic mean (false) of distances.
    * The harmonic mean is very useful for graphs that are not strongly connected.
    */
  var harmonic: js.UndefOr[Boolean] = js.native
  /**  A function that returns the weight for the edge. */
  var weight: js.UndefOr[js.Function1[/* edge */ EdgeSingular, Double]] = js.native
}

object SearchClosenessCentralityNormalizedOptions {
  @scala.inline
  def apply(): SearchClosenessCentralityNormalizedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchClosenessCentralityNormalizedOptions]
  }
  @scala.inline
  implicit class SearchClosenessCentralityNormalizedOptionsOps[Self <: SearchClosenessCentralityNormalizedOptions] (val x: Self) extends AnyVal {
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
    def setHarmonic(value: Boolean): Self = this.set("harmonic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHarmonic: Self = this.set("harmonic", js.undefined)
    @scala.inline
    def setWeight(value: /* edge */ EdgeSingular => Double): Self = this.set("weight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

