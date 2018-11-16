package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Polygon")
@js.native
class Polygon protected () extends IPrimitive {
  /**
           * @constructor
           * @param rings A Location array for basic polygon with single outer perimeter,
           * or an array of Location arrays for advanced polygon (multi-polygon, polygon with holes, or combination of polygons).
           * @param options Options used to customize polygon.
           */
  def this(rings: js.Array[Location | js.Array[Location]]) = this()
  /**
           * @constructor
           * @param rings A Location array for basic polygon with single outer perimeter,
           * or an array of Location arrays for advanced polygon (multi-polygon, polygon with holes, or combination of polygons).
           * @param options Options used to customize polygon.
           */
  def this(rings: js.Array[Location | js.Array[Location]], options: IPolygonOptions) = this()
  /**
           * Gets the css cursor value when the primitive has events on it.
           * @returns css cursor string when primitive has events on it.
           */
  /* CompleteClass */
  override def getCursor(): java.lang.String = js.native
  /**
          * Gets the fill color of the inside of the polygon. Will be string or Color object depending on the the what method was used in the pushpin options.
          * @returns The fill color of the inside of the polygon.
          */
  def getFillColor(): java.lang.String | Color = js.native
  /**
           * Returns whether the polygon is generalizable based on zoom level or not.
           * @returns whether the polygon is generalizable based on zoom level or not.
           */
  def getGeneralizable(): scala.Boolean = js.native
  /**
           * Gets the first ring of the polygon (for V7 compatability).
           * @returns An array of Locations that is the first ring of the polygon; or an empty array if the polygon has no ring at all.
           */
  def getLocations(): js.Array[Location] = js.native
  /**
           * Gets an array of location arrays, where each location array defines a ring of the polygon.
           * @returns An array of location arrays, where each location array defines a ring of the polygon.
           */
  def getRings(): js.Array[js.Array[Location]] = js.native
  /**
           * Gets the color of the border stroke of the polygon. Will be string or Color object depending on the the what method was used in the pushpin options.
           * @returns The color of the border stroke of the polygon.
           */
  def getStrokeColor(): java.lang.String | Color = js.native
  /**
           * Gets the stroke dash array of the polygon, in format of either array or string, whichever user provides.
           * @returns The stroke dash array of the polygon.
           */
  def getStrokeDashArray(): js.Array[scala.Double] | java.lang.String = js.native
  /**
           * Gets the thickness of the border stroke of the polygon.
           * @returns The thickness of the border stroke of the polygon as a number.
           */
  def getStrokeThickness(): scala.Double = js.native
  /**
           * Gets whether the primitive is visible.
           * @returns A boolean indicating whether the primitive is visible or not.
           */
  /* CompleteClass */
  override def getVisible(): scala.Boolean = js.native
  /**
           * Sets locations (single ring) of the polygon. (for V7 compatability)
           * @param locations A Location[] that defines the only ring of the polygon
           */
  def setLocations(locations: js.Array[Location]): scala.Unit = js.native
  /**
           * Sets the properties for the polygon.
           * @param options The IPolygonOptions object containing the options to customize the polygon.
           */
  def setOptions(options: IPolygonOptions): scala.Unit = js.native
  /**
          * Sets the options for customizing the IPrimitive.
          * @param options The options for customizing the IPrimitive.
          */
  /* CompleteClass */
  override def setOptions(options: IPrimitiveOptions): scala.Unit = js.native
  /**
           * Sets rings of the polygon.
           * @param rings A Location[][] where each Location[] defines a ring of the polygon.
           */
  def setRings(rings: js.Array[Location | js.Array[Location]]): scala.Unit = js.native
}

