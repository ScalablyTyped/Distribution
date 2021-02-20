package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContourLayer extends Layer {
  
  /**
    * Gets the contour lines of this layer.
    * @returns The contour lines of this layer.
    */
  def getContourLines(): js.Array[ContourLine] = js.native
  
  /**
    * Gets the polygons that were generated from the contour lines in this layer.
    * @returns The polygons that were generated from the contour lines in this layer.
    */
  def getContourPolygons(): js.Array[Polygon] = js.native
  
  /**
    * Retrieves the options of this contour layer.
    * @returns The options of this contour layer.
    */
  def getOptions(): IContourLayerOptions = js.native
  
  /**
    * Sets the contour lines used to calculate the polygon areas of this layer.
    * @param contourLines The contour lines used to calculate the polygon areas of this layer.
    */
  def setContourLines(contourLines: js.Array[ContourLine]): Unit = js.native
  
  /**
    * Sets the options of the contour layer.
    * @param options The new options to update the layer.
    */
  def setOptions(options: IContourLayerOptions): Unit = js.native
}
