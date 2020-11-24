package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#ele.group
  * http://js.cytoscape.org/#notation/elements-json
  *
  * 'nodes'
  * 'edges'
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.nodes
  - typings.cytoscape.cytoscapeStrings.edges
*/
trait ElementGroup extends js.Object
object ElementGroup {
  
  @scala.inline
  def edges: typings.cytoscape.cytoscapeStrings.edges = "edges".asInstanceOf[typings.cytoscape.cytoscapeStrings.edges]
  
  @scala.inline
  def nodes: typings.cytoscape.cytoscapeStrings.nodes = "nodes".asInstanceOf[typings.cytoscape.cytoscapeStrings.nodes]
}
