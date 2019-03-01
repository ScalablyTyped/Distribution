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

object CollectionPosition {
  @scala.inline
  def apply(
    boundingBox: js.Function1[BoundingBoxOptions, BoundingBox12 | BoundingBoxWH],
    boundingbox: js.Function1[BoundingBoxOptions, BoundingBox12 | BoundingBoxWH],
    renderedBoundingBox: js.Function1[BoundingBoxOptions, BoundingBox12 | BoundingBoxWH],
    renderedBoundingbox: js.Function1[BoundingBoxOptions, BoundingBox12 | BoundingBoxWH]
  ): CollectionPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boundingBox")(boundingBox)
    __obj.updateDynamic("boundingbox")(boundingbox)
    __obj.updateDynamic("renderedBoundingBox")(renderedBoundingBox)
    __obj.updateDynamic("renderedBoundingbox")(renderedBoundingbox)
    __obj.asInstanceOf[CollectionPosition]
  }
}

