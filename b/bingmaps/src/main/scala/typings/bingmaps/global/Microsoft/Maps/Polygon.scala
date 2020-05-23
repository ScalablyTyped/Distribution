package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IPolygonOptions
import typings.bingmaps.Microsoft.Maps.IPrimitiveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Polygon")
@js.native
class Polygon protected ()
  extends typings.bingmaps.Microsoft.Maps.Polygon {
  /**
    * @constructor
    * @param rings A Location array for basic polygon with single outer perimeter,
    * or an array of Location arrays for advanced polygon (multi-polygon, polygon with holes, or combination of polygons).
    * @param options Options used to customize polygon.
    */
  def this(rings: js.Array[
        js.Array[typings.bingmaps.Microsoft.Maps.Location] | typings.bingmaps.Microsoft.Maps.Location
      ]) = this()
  def this(
    rings: js.Array[
        js.Array[typings.bingmaps.Microsoft.Maps.Location] | typings.bingmaps.Microsoft.Maps.Location
      ],
    options: IPolygonOptions
  ) = this()
  /**
    * Gets the css cursor value when the primitive has events on it.
    * @returns css cursor string when primitive has events on it.
    */
  /* CompleteClass */
  override def getCursor(): String = js.native
  /**
    * Gets whether the primitive is visible.
    * @returns A boolean indicating whether the primitive is visible or not.
    */
  /* CompleteClass */
  override def getVisible(): Boolean = js.native
  /**
    * Sets the options for customizing the IPrimitive.
    * @param options The options for customizing the IPrimitive.
    */
  /* CompleteClass */
  override def setOptions(options: IPrimitiveOptions): Unit = js.native
}

