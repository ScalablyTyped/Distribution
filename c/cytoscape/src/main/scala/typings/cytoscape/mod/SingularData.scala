package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/data
  */
@js.native
trait SingularData extends StObject {
  
  /**
    * Get the group string that defines the type of the element.
    *
    * The group strings are 'nodes' for nodes and 'edges' for edges.
    * In general, you should be using ele.isEdge()
    * and ele.isNode() instead of ele.group().
    * http://js.cytoscape.org/#ele.group
    */
  def group(): ElementGroup = js.native
  
  /**
    * A shortcut to get the ID of an element.
    * http://js.cytoscape.org/#ele.id
    */
  def id(): String = js.native
  
  /**
    * Get whether the element is an edge.
    * http://js.cytoscape.org/#ele.isEdge
    */
  def isEdge(): /* is cytoscape.cytoscape.EdgeSingular */ Boolean = js.native
  
  /**
    * Get whether the element is a node.
    * http://js.cytoscape.org/#ele.isNode
    */
  def isNode(): /* is cytoscape.cytoscape.NodeSingular */ Boolean = js.native
  
  /**
    * Get the element's plain JavaScript object representation.
    * http://js.cytoscape.org/#ele.json
    */
  def json(): String = js.native
  
  /**
    * Remove scratchpad data.
    * You should remove scratchpad data only at your own namespaces.
    * http://js.cytoscape.org/#ele.removeScratch
    * @param namespace A namespace string.
    */
  def removeScratch(namespace: String): this.type = js.native
  
  /**
    * Get or set the scratchpad at a particular namespace,
    * where temporary or non-JSON data can be stored.
    * Get scratchpad if one or no parameter provided.
    * App-level scratchpad data should use namespaces
    * prefixed with underscore, like '_foo'.
    * http://js.cytoscape.org/#ele.scratch
    * @param namespace A namespace string.
    * @param value The value to set at the specified namespace.
    */
  def scratch(): Scratchpad = js.native
  def scratch(namespace: String): Scratchpad = js.native
  def scratch(namespace: String, value: Any): this.type = js.native
}
