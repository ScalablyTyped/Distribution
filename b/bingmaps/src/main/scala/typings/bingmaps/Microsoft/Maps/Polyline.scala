package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Polyline")
@js.native
class Polyline protected () extends IPrimitive {
  /**
    * @constructor
    * @param locations An array of locations that make up the path of the polyine.
    * @param options Options used to customize polyline.
    */
  def this(locations: js.Array[Location]) = this()
  def this(locations: js.Array[Location], options: IPolylineOptions) = this()
  /**
    * Gets the css cursor value when the primitive has events on it.
    * @returns css cursor string when primitive has events on it.
    */
  /* CompleteClass */
  override def getCursor(): String = js.native
  /**
    * Returns whether the polyline is generalizable based on zoom level or not.
    * @returns whether the polyline is generalizable based on zoom level or not.
    */
  def getGeneralizable(): Boolean = js.native
  /**
    * Gets the locations that make up the polyline.
    * @returns An array that defines the path of the polyline.
    */
  def getLocations(): js.Array[Location] = js.native
  /**
    * Gets the color of the border stroke of the polyline. Will be string or Color object depending on the the what method was used in the polyline options.
    * @returns The stroke color of the polyline.
    */
  def getStrokeColor(): String | Color = js.native
  /**
    * Gets the stroke dash array of the polyline, in format of either array or string, whichever user provides.
    * @returns The stroke dash array of the polyline.
    */
  def getStrokeDashArray(): js.Array[Double] | String = js.native
  /**
    * Gets the thickness of the border stroke of the polyline.
    * @returns The thickness of the border stroke of the polyline as a number.
    */
  def getStrokeThickness(): Double = js.native
  /**
    * Gets whether the primitive is visible.
    * @returns A boolean indicating whether the primitive is visible or not.
    */
  /* CompleteClass */
  override def getVisible(): Boolean = js.native
  /**
    * Sets locations of the polyline.
    * @param locations A Location[] that defines path of the polyline
    */
  def setLocations(locations: js.Array[Location]): Unit = js.native
  /**
    * Sets the properties for the polyline.
    * @param options The IPolylineOptions object containing the options to customize the polyline.
    */
  def setOptions(options: IPolylineOptions): Unit = js.native
  /**
    * Sets the options for customizing the IPrimitive.
    * @param options The options for customizing the IPrimitive.
    */
  /* CompleteClass */
  override def setOptions(options: IPrimitiveOptions): Unit = js.native
}

