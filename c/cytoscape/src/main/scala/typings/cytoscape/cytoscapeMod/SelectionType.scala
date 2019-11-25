package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A string indicating the selection behaviour from user input.
  * http://js.cytoscape.org/#core/initialisation
  *
  * 'additive' : a new selection made by the user adds to the set of currently selected elements.
  * 'single' : a new selection made by the user becomes the entire set of currently
  *            selected elements (i.e. the previous elements are unselected)
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.additive
  - typings.cytoscape.cytoscapeStrings.single
*/
trait SelectionType extends js.Object

object SelectionType {
  @scala.inline
  def additive: typings.cytoscape.cytoscapeStrings.additive = this.cast("additive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def single: typings.cytoscape.cytoscapeStrings.single = this.cast("single")
}

