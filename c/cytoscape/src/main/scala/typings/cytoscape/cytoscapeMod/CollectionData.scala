package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/data
  *
  * The following fields are immutable:
  * id: The id field is used to uniquely identify an element in the graph.
  * source & target : These fields define an edge's relationship to nodes, and this relationship can not be changed after creation.
  * parent: The parent field defines the parent (compound) node.
  */
@js.native
trait CollectionData extends js.Object {
  /**
    * Get an array of the plain JavaScript object
    * representation of all elements in the collection.
    */
  def jsons(): js.Array[String] = js.native
  def removeAttr(): CollectionReturnValue = js.native
  def removeAttr(names: String): CollectionReturnValue = js.native
  /**
    * Remove developer-defined data associated with the elements.
    * http://js.cytoscape.org/#eles.removeData
    * @param names A space-separated list of fields to delete.
    */
  def removeData(): CollectionReturnValue = js.native
  def removeData(names: String): CollectionReturnValue = js.native
}

