package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionTraversing extends StObject {
  
  /**
    * Get the closed neighbourhood of the elements.
    *
    * The neighbourhood returned by this function is a bit different than the traditional definition of a "neighbourhood":
    * This returned neighbourhood includes the edges connecting the collection to the neighbourhood. This gives you more flexibility.
    * A closed neighbourhood is one that does include the original set of elements.
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def closedNeighborhood(): CollectionReturnValue = js.native
  def closedNeighborhood(selector: Selector): CollectionReturnValue = js.native
  
  /**
    * Get the connected components, considering only the elements in the calling collection.
    * An array of collections is returned, with each collection representing a component.
    */
  def components(): js.Array[CollectionReturnValue] = js.native
  
  // http://js.cytoscape.org/#collection/traversing
  /**
    * Get the open neighbourhood of the elements.
    *
    * The neighbourhood returned by this function is a bit different than the traditional definition of a "neighbourhood":
    * This returned neighbourhood includes the edges connecting the collection to the neighbourhood. This gives you more flexibility.
    * An open neighbourhood is one that does not include the original set of elements. If unspecified, a neighbourhood is open by default.
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def neighborhood(): CollectionReturnValue = js.native
  def neighborhood(selector: Selector): CollectionReturnValue = js.native
  
  /**
    * Get the open neighbourhood of the elements.
    *
    * The neighbourhood returned by this function is a bit different than the traditional definition of a "neighbourhood":
    * This returned neighbourhood includes the edges connecting the collection to the neighbourhood. This gives you more flexibility.
    * An open neighbourhood is one that does not include the original set of elements. If unspecified, a neighbourhood is open by default.
    *
    * @param selector [optional] An optional selector that is used to filter the resultant collection.
    */
  def openNeighborhood(): CollectionReturnValue = js.native
  def openNeighborhood(selector: Selector): CollectionReturnValue = js.native
}
