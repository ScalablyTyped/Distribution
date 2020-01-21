package typings.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://developer.mozilla.org/en-US/docs/Web/CSS/font-style */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.normal
  - typings.cytoscape.cytoscapeStrings.italic
  - typings.cytoscape.cytoscapeStrings.oblique
*/
trait FontStyle extends js.Object

object FontStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def italic: typings.cytoscape.cytoscapeStrings.italic = this.cast("italic")
  @scala.inline
  def normal: typings.cytoscape.cytoscapeStrings.normal = this.cast("normal")
  @scala.inline
  def oblique: typings.cytoscape.cytoscapeStrings.oblique = this.cast("oblique")
}

