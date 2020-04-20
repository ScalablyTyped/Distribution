package typings.cytoscape.mod

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
  def boundingBox(options: BoundingBoxOptions): BoundingBox12 with BoundingBoxWH
  def boundingbox(options: BoundingBoxOptions): BoundingBox12 with BoundingBoxWH
  /**
    * Get the bounding box of the elements in rendered coordinates.
    * @param options An object containing options for the function.
    */
  def renderedBoundingBox(options: BoundingBoxOptions): BoundingBox12 with BoundingBoxWH
  def renderedBoundingbox(options: BoundingBoxOptions): BoundingBox12 with BoundingBoxWH
}

object CollectionPosition {
  @scala.inline
  def apply(
    boundingBox: BoundingBoxOptions => BoundingBox12 with BoundingBoxWH,
    boundingbox: BoundingBoxOptions => BoundingBox12 with BoundingBoxWH,
    renderedBoundingBox: BoundingBoxOptions => BoundingBox12 with BoundingBoxWH,
    renderedBoundingbox: BoundingBoxOptions => BoundingBox12 with BoundingBoxWH
  ): CollectionPosition = {
    val __obj = js.Dynamic.literal(boundingBox = js.Any.fromFunction1(boundingBox), boundingbox = js.Any.fromFunction1(boundingbox), renderedBoundingBox = js.Any.fromFunction1(renderedBoundingBox), renderedBoundingbox = js.Any.fromFunction1(renderedBoundingbox))
    __obj.asInstanceOf[CollectionPosition]
  }
}

