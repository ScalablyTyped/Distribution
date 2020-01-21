package typings.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The line style; may be solid, dotted, dashed, or double
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.solid
  - typings.cytoscape.cytoscapeStrings.dotted
  - typings.cytoscape.cytoscapeStrings.dashed
  - typings.cytoscape.cytoscapeStrings.double
*/
trait LineStyle extends js.Object

object LineStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dashed: typings.cytoscape.cytoscapeStrings.dashed = this.cast("dashed")
  @scala.inline
  def dotted: typings.cytoscape.cytoscapeStrings.dotted = this.cast("dotted")
  @scala.inline
  def double: typings.cytoscape.cytoscapeStrings.double = this.cast("double")
  @scala.inline
  def solid: typings.cytoscape.cytoscapeStrings.solid = this.cast("solid")
}

