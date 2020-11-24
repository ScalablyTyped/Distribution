package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/position--dimensions
  */
@js.native
trait CollectionPosition extends js.Object {
  
  /**
    * Get the bounding box of the elements in model coordinates.
    * @param options An object containing options for the function.
    * http://js.cytoscape.org/#eles.boundingBox
    */
  def boundingBox(options: BoundingBoxOptions): BoundingBox12 with BoundingBoxWH = js.native
  
  def boundingbox(options: BoundingBoxOptions): BoundingBox12 with BoundingBoxWH = js.native
  
  /**
    * Get the bounding box of the elements in rendered coordinates.
    * @param options An object containing options for the function.
    */
  def renderedBoundingBox(options: BoundingBoxOptions): BoundingBox12 with BoundingBoxWH = js.native
  
  def renderedBoundingbox(options: BoundingBoxOptions): BoundingBox12 with BoundingBoxWH = js.native
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
  
  @scala.inline
  implicit class CollectionPositionOps[Self <: CollectionPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoundingBox(value: BoundingBoxOptions => BoundingBox12 with BoundingBoxWH): Self = this.set("boundingBox", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderedBoundingBox(value: BoundingBoxOptions => BoundingBox12 with BoundingBoxWH): Self = this.set("renderedBoundingBox", js.Any.fromFunction1(value))
  }
}
