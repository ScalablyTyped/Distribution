package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/data
  */
@js.native
trait SingularData extends js.Object {
  /**
    * Get a particular data field for the element.
    * @param name The name of the field to get.
    */
  def attr(): js.Any = js.native
  def attr(name: String): js.Any = js.native
  /**
    * Set a particular data field for the element.
    * @param name The name of the field to set.
    * @param value The value to set for the field.
    */
  def attr(name: String, value: js.Any): this.type = js.native
  /**
    * Update multiple data fields at once via an object.
    * @param obj The object containing name- value pairs to update data fields.
    */
  def attr(obj: js.Any): this.type = js.native
  /**
    * Read and write developer-defined data associated with the elements
    * http://js.cytoscape.org/#eles.data
    */
  /**
    * Get a particular data field for the element.
    * @param name The name of the field to get.
    */
  def data(): js.Any = js.native
  def data(name: String): js.Any = js.native
  /**
    * Set a particular data field for the element.
    * @param name The name of the field to set.
    * @param value The value to set for the field.
    */
  def data(name: String, value: js.Any): this.type = js.native
  /**
    * Update multiple data fields at once via an object.
    * @param obj The object containing name- value pairs to update data fields.
    */
  def data(obj: js.Any): this.type = js.native
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
  def scratch(namespace: String, value: js.Any): this.type = js.native
}

