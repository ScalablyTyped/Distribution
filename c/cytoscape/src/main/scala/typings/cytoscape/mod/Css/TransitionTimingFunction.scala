package typings.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transition animation
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.linear
  - typings.cytoscape.cytoscapeStrings.spring
  - typings.cytoscape.cytoscapeStrings.`cubic-bezier`
  - typings.cytoscape.cytoscapeStrings.ease
  - typings.cytoscape.cytoscapeStrings.`ease-in`
  - typings.cytoscape.cytoscapeStrings.`ease-out`
  - typings.cytoscape.cytoscapeStrings.`ease-in-out`
  - typings.cytoscape.cytoscapeStrings.`ease-in-sine`
  - typings.cytoscape.cytoscapeStrings.`ease-out-sine`
  - typings.cytoscape.cytoscapeStrings.`ease-in-out-sine`
  - typings.cytoscape.cytoscapeStrings.`ease-in-quad`
  - typings.cytoscape.cytoscapeStrings.`ease-out-quad`
  - typings.cytoscape.cytoscapeStrings.`ease-in-out-quad`
  - typings.cytoscape.cytoscapeStrings.`ease-in-cubic`
  - typings.cytoscape.cytoscapeStrings.`ease-out-cubic`
  - typings.cytoscape.cytoscapeStrings.`ease-in-out-cubic`
  - typings.cytoscape.cytoscapeStrings.`ease-in-quart`
  - typings.cytoscape.cytoscapeStrings.`ease-out-quart`
  - typings.cytoscape.cytoscapeStrings.`ease-in-out-quart`
  - typings.cytoscape.cytoscapeStrings.`ease-in-quint`
  - typings.cytoscape.cytoscapeStrings.`ease-out-quint`
  - typings.cytoscape.cytoscapeStrings.`ease-in-out-quint`
  - typings.cytoscape.cytoscapeStrings.`ease-in-expo`
  - typings.cytoscape.cytoscapeStrings.`ease-out-expo`
  - typings.cytoscape.cytoscapeStrings.`ease-in-out-expo`
  - typings.cytoscape.cytoscapeStrings.`ease-in-circ`
  - typings.cytoscape.cytoscapeStrings.`ease-out-circ`
  - typings.cytoscape.cytoscapeStrings.`ease-in-out-circ`
*/
trait TransitionTimingFunction extends js.Object

object TransitionTimingFunction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `cubic-bezier`: typings.cytoscape.cytoscapeStrings.`cubic-bezier` = this.cast("cubic-bezier")
  @scala.inline
  def ease: typings.cytoscape.cytoscapeStrings.ease = this.cast("ease")
  @scala.inline
  def `ease-in`: typings.cytoscape.cytoscapeStrings.`ease-in` = this.cast("ease-in")
  @scala.inline
  def `ease-in-circ`: typings.cytoscape.cytoscapeStrings.`ease-in-circ` = this.cast("ease-in-circ")
  @scala.inline
  def `ease-in-cubic`: typings.cytoscape.cytoscapeStrings.`ease-in-cubic` = this.cast("ease-in-cubic")
  @scala.inline
  def `ease-in-expo`: typings.cytoscape.cytoscapeStrings.`ease-in-expo` = this.cast("ease-in-expo")
  @scala.inline
  def `ease-in-out`: typings.cytoscape.cytoscapeStrings.`ease-in-out` = this.cast("ease-in-out")
  @scala.inline
  def `ease-in-out-circ`: typings.cytoscape.cytoscapeStrings.`ease-in-out-circ` = this.cast("ease-in-out-circ")
  @scala.inline
  def `ease-in-out-cubic`: typings.cytoscape.cytoscapeStrings.`ease-in-out-cubic` = this.cast("ease-in-out-cubic")
  @scala.inline
  def `ease-in-out-expo`: typings.cytoscape.cytoscapeStrings.`ease-in-out-expo` = this.cast("ease-in-out-expo")
  @scala.inline
  def `ease-in-out-quad`: typings.cytoscape.cytoscapeStrings.`ease-in-out-quad` = this.cast("ease-in-out-quad")
  @scala.inline
  def `ease-in-out-quart`: typings.cytoscape.cytoscapeStrings.`ease-in-out-quart` = this.cast("ease-in-out-quart")
  @scala.inline
  def `ease-in-out-quint`: typings.cytoscape.cytoscapeStrings.`ease-in-out-quint` = this.cast("ease-in-out-quint")
  @scala.inline
  def `ease-in-out-sine`: typings.cytoscape.cytoscapeStrings.`ease-in-out-sine` = this.cast("ease-in-out-sine")
  @scala.inline
  def `ease-in-quad`: typings.cytoscape.cytoscapeStrings.`ease-in-quad` = this.cast("ease-in-quad")
  @scala.inline
  def `ease-in-quart`: typings.cytoscape.cytoscapeStrings.`ease-in-quart` = this.cast("ease-in-quart")
  @scala.inline
  def `ease-in-quint`: typings.cytoscape.cytoscapeStrings.`ease-in-quint` = this.cast("ease-in-quint")
  @scala.inline
  def `ease-in-sine`: typings.cytoscape.cytoscapeStrings.`ease-in-sine` = this.cast("ease-in-sine")
  @scala.inline
  def `ease-out`: typings.cytoscape.cytoscapeStrings.`ease-out` = this.cast("ease-out")
  @scala.inline
  def `ease-out-circ`: typings.cytoscape.cytoscapeStrings.`ease-out-circ` = this.cast("ease-out-circ")
  @scala.inline
  def `ease-out-cubic`: typings.cytoscape.cytoscapeStrings.`ease-out-cubic` = this.cast("ease-out-cubic")
  @scala.inline
  def `ease-out-expo`: typings.cytoscape.cytoscapeStrings.`ease-out-expo` = this.cast("ease-out-expo")
  @scala.inline
  def `ease-out-quad`: typings.cytoscape.cytoscapeStrings.`ease-out-quad` = this.cast("ease-out-quad")
  @scala.inline
  def `ease-out-quart`: typings.cytoscape.cytoscapeStrings.`ease-out-quart` = this.cast("ease-out-quart")
  @scala.inline
  def `ease-out-quint`: typings.cytoscape.cytoscapeStrings.`ease-out-quint` = this.cast("ease-out-quint")
  @scala.inline
  def `ease-out-sine`: typings.cytoscape.cytoscapeStrings.`ease-out-sine` = this.cast("ease-out-sine")
  @scala.inline
  def linear: typings.cytoscape.cytoscapeStrings.linear = this.cast("linear")
  @scala.inline
  def spring: typings.cytoscape.cytoscapeStrings.spring = this.cast("spring")
}

