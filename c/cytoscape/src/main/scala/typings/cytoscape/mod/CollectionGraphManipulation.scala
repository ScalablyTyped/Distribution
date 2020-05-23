package typings.cytoscape.mod

import typings.cytoscape.anon.Parent
import typings.cytoscape.anon.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/graph-manipulation
  */
@js.native
trait CollectionGraphManipulation extends js.Object {
  /**
    * Get a new collection containing clones (i.e. copies) of the elements in the calling collection.
    * http://js.cytoscape.org/#eles.clone
    */
  def copy(): CollectionReturnValue = js.native
  /**
    * Effectively move nodes to different parent node. The modified (actually new) elements are returned.
    * http://js.cytoscape.org/#eles.move
    */
  def move(location: Parent): NodeCollection = js.native
  /**
    * Effectively move edges to different nodes. The modified (actually new) elements are returned.
    * http://js.cytoscape.org/#eles.move
    */
  def move(location: Source): EdgeCollection = js.native
  /**
    * Remove the elements from the graph.
    * http://js.cytoscape.org/#eles.remove
    */
  def remove(): CollectionReturnValue = js.native
  /**
    * Put removed elements back into the graph.
    * http://js.cytoscape.org/#eles.restore
    */
  def restore(): CollectionReturnValue = js.native
}

