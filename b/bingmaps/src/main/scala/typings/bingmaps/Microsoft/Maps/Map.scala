package typings.bingmaps.Microsoft.Maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map extends StObject {
  
  /** Deletes the Map object and releases any associated resources. */
  def dispose(): Unit = js.native
  
  /** Entities of the map */
  var entities: EntityCollection = js.native
  
  /**
    * Gets the location rectangle that defines the boundaries of the current map view.
    * @returns The location rectangle that defines the boundaries of the current map view.
    */
  def getBounds(): LocationRect = js.native
  
  /**
    * Gets the location of the center of the current map view.
    * @returns The location of the center of the current map view.
    */
  def getCenter(): Location = js.native
  
  /**
    * Gets to the specified callback an array of strings representing the attributions of the imagery currently displayed on the map.
    * @param callback The callback function that needs to be called after retrieving the copyright information.
    */
  def getCopyrights(callback: js.Function1[/* copyrights */ js.Array[String], Unit]): Unit = js.native
  
  /**
    * Gets the session ID. This method calls the callback function with the session ID as the first parameter
    * @param callback The callback function that needs to be called with the session id.
    */
  def getCredentials(callback: js.Function1[/* creds */ String, Unit]): Unit = js.native
  
  /**
    * Gets the current culture.
    * @returns The current culture.
    */
  def getCulture(): String = js.native
  
  /**
    * Returns the heading of the current map view.
    * @returns Returns the heading of the current map view.
    */
  def getHeading(): Double = js.native
  
  /**
    * Gets the height of the map control.
    * @returns The height of the map control.
    */
  def getHeight(): Double = js.native
  
  /**
    * Gets the string that represents the imagery currently displayed on the map.
    * @returns The string that represents the imagery currently displayed on the map.
    */
  def getImageryId(): String = js.native
  
  /**
    * Gets a string that represents the current map type displayed on the map.
    * @returns A string that represents the current map type displayed on the map.
    */
  def getMapTypeId(): MapTypeId = js.native
  
  /**
    * Gets the current scale in meters per pixel of the center of the map.
    * @returns The current scale in meters per pixel of the center of the map.
    */
  def getMetersPerPixel(): Double = js.native
  
  /**
    * Gets the map options that have been set.
    * @returns the map options that have been set.
    */
  def getOptions(): IMapOptions = js.native
  
  /**
    * Gets the x coordinate of the top left corner of the map control, relative to the page.
    * @returns The x coordinate of the top left corner of the map control, relative to the page.
    */
  def getPageX(): Double = js.native
  
  /**
    * Gets the y coordinate of the top left corner of the map control, relative to the page.
    * @returns The y coordinate of the top left corner of the map control, relative to the page.
    */
  def getPageY(): Double = js.native
  
  /**
    * Returns the pitch of the current streetside map view.
    * @returns Returns the pitch of the current streetside map view.
    */
  def getPitch(): Double = js.native
  
  /**
    * Gets the map root node.
    * @returns the map root node.
    */
  def getRootElement(): HTMLElement = js.native
  
  /**
    * Gets the user region.
    * @returns The user region.
    */
  def getUserRegion(): String = js.native
  
  /**
    * Gets the width of the map control.
    * @returns the width of the map control.
    */
  def getWidth(): Double = js.native
  
  /**
    * Gets the zoom level of the current map view.
    * @returns Returns the zoom level of the current map view.
    */
  def getZoom(): Double = js.native
  
  /**
    * Gets the range of valid zoom levels for the current map view.
    * @returns The range of valid zoom levels for the current map view.
    */
  def getZoomRange(): IRange = js.native
  
  /**
    * Gets a boolean indicating whether the map is in a regular Mercator nadir mode.
    * @returns A boolean indicating whether the map is in a regular Mercator nadir mode.
    */
  def isMercator(): Boolean = js.native
  
  /**
    * Gets a boolean indicating if the current map type allows the heading to change; false if the display heading is fixed.
    * @returns true if the current map type allows the heading to change; false if the display heading is fixed.
    */
  def isRotationEnabled(): Boolean = js.native
  
  /** Set of map layers */
  var layers: LayerCollection = js.native
  
  /**
    * Sets the current map type.
    * @param mapTypeId The map imagery type of the map to set.
    */
  def setMapType(mapTypeId: MapTypeId): Unit = js.native
  
  /**
    * Sets the map options.
    * @param options The map options to be set.
    */
  def setOptions(options: IMapOptions): Unit = js.native
  
  /**
    * Sets the view of the map.
    * @param viewOptions The view options to be set.
    */
  def setView(viewOptions: IViewOptions): Unit = js.native
  
  def tryLocationToPixel(location: js.Array[Location]): Point | js.Array[Point] = js.native
  def tryLocationToPixel(location: js.Array[Location], reference: Any): Point | js.Array[Point] = js.native
  /**
    * Converts a specified Location or a Location array to a Point or Point array on the map
    * relative to the specified PixelReference. If no reference is specified, PixelReference.viewport
    * is taken.
    * @param location The given Location or Location[] to convert.
    * @param reference The PixelReference to specify the reference point.
    * @returns The converted Point or Point[], or null if the conversion fails.
    */
  def tryLocationToPixel(location: Location): Point | js.Array[Point] = js.native
  def tryLocationToPixel(location: Location, reference: Any): Point | js.Array[Point] = js.native
  
  def tryPixelToLocation(point: js.Array[Point]): Location | js.Array[Location] = js.native
  def tryPixelToLocation(point: js.Array[Point], reference: Any): Location | js.Array[Location] = js.native
  /**
    * Converts a specified Point or a Point array to a Location or Location array on the map
    * relative to the specified PixelReference. If no reference is specified, PixelReference.viewport
    * is taken.
    * @param point The given Point or Point[] to convert.
    * @param reference The PixelReference to specify the reference point.
    * @returns The converted Location or Location[], or null if the conversion fails.
    */
  def tryPixelToLocation(point: Point): Location | js.Array[Location] = js.native
  def tryPixelToLocation(point: Point, reference: Any): Location | js.Array[Location] = js.native
}
