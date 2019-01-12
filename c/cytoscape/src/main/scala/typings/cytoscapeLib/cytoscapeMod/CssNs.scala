package typings
package cytoscapeLib.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Style in Cytoscape.js follows CSS conventions as closely as possible.
  * In most cases, a property has the same name and behaviour as its corresponding CSS namesake.
  * However, the properties in CSS are not sufficient to specify the style of some parts of the graph.
  * In that case, additional properties are introduced that are unique to Cytoscape.js.
  *
  * For simplicity and ease of use, specificity rules are completely ignored in stylesheets.
  * For a given style property for a given element, the last matching selector wins.
  *
  * http://js.cytoscape.org/#style
  */
@JSImport("cytoscape", "Css")
@js.native
object CssNs extends js.Object

