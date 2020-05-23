package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polygon extends IPrimitive {
  /**
    * Gets the fill color of the inside of the polygon. Will be string or Color object depending on the the what method was used in the pushpin options.
    * @returns The fill color of the inside of the polygon.
    */
  def getFillColor(): String | Color = js.native
  /**
    * Returns whether the polygon is generalizable based on zoom level or not.
    * @returns whether the polygon is generalizable based on zoom level or not.
    */
  def getGeneralizable(): Boolean = js.native
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
  def getStrokeColor(): String | Color = js.native
  /**
    * Gets the stroke dash array of the polygon, in format of either array or string, whichever user provides.
    * @returns The stroke dash array of the polygon.
    */
  def getStrokeDashArray(): js.Array[Double] | String = js.native
  /**
    * Gets the thickness of the border stroke of the polygon.
    * @returns The thickness of the border stroke of the polygon as a number.
    */
  def getStrokeThickness(): Double = js.native
  /**
    * Sets locations (single ring) of the polygon. (for V7 compatability)
    * @param locations A Location[] that defines the only ring of the polygon
    */
  def setLocations(locations: js.Array[Location]): Unit = js.native
  /**
    * Sets the properties for the polygon.
    * @param options The IPolygonOptions object containing the options to customize the polygon.
    */
  def setOptions(options: IPolygonOptions): Unit = js.native
  /**
    * Sets rings of the polygon.
    * @param rings A Location[][] where each Location[] defines a ring of the polygon.
    */
  def setRings(rings: js.Array[js.Array[Location] | Location]): Unit = js.native
}

