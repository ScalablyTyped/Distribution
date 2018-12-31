package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/position--dimensions
  */
trait CollectionPosition extends js.Object {
  /**
    * Get the bounding box of the elements in model coordinates.
    * @param options An object containing options for the function.
    * http://js.cytoscape.org/#eles.boundingBox
    */
  def boundingBox(options: BoundingBoxOptions): BoundingBox12 | BoundingBoxWH
  def boundingbox(options: BoundingBoxOptions): BoundingBox12 | BoundingBoxWH
  /**
    * Get the bounding box of the elements in rendered coordinates.
    * @param options An object containing options for the function.
    */
  def renderedBoundingBox(options: BoundingBoxOptions): BoundingBox12 | BoundingBoxWH
  def renderedBoundingbox(options: BoundingBoxOptions): BoundingBox12 | BoundingBoxWH
}

