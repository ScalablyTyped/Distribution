package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/position--dimensions
  */
@js.native
trait CollectionPosition extends StObject {
  
  /**
    * Get the bounding box of the elements in model coordinates.
    * @param options An object containing options for the function.
    * http://js.cytoscape.org/#eles.boundingBox
    */
  def boundingBox(): BoundingBox12 & BoundingBoxWH = js.native
  def boundingBox(options: BoundingBoxOptions): BoundingBox12 & BoundingBoxWH = js.native
  
  def boundingbox(): BoundingBox12 & BoundingBoxWH = js.native
  def boundingbox(options: BoundingBoxOptions): BoundingBox12 & BoundingBoxWH = js.native
  
  /**
    * Get the bounding box of the elements in rendered coordinates.
    * @param options An object containing options for the function.
    */
  def renderedBoundingBox(): BoundingBox12 & BoundingBoxWH = js.native
  def renderedBoundingBox(options: BoundingBoxOptions): BoundingBox12 & BoundingBoxWH = js.native
  
  def renderedBoundingbox(): BoundingBox12 & BoundingBoxWH = js.native
  def renderedBoundingbox(options: BoundingBoxOptions): BoundingBox12 & BoundingBoxWH = js.native
}
