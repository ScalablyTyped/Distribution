package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Map")
@js.native
class Map protected () extends js.Object {
  /**
           * @constructor
           * @param parentElement The parent element of the map as a CSS selector string or HTMLElement.
           * @param options Options used when creating the map.
           */
  def this(parentElement: java.lang.String, options: IMapLoadOptions) = this()
  /**
           * @constructor
           * @param parentElement The parent element of the map as a CSS selector string or HTMLElement.
           * @param options Options used when creating the map.
           */
  def this(parentElement: stdLib.HTMLElement, options: IMapLoadOptions) = this()
  /** Entities of the map */
  var entities: EntityCollection = js.native
  /** Set of map layers */
  var layers: LayerCollection = js.native
  /** Deletes the Map object and releases any associated resources. */
  def dispose(): scala.Unit = js.native
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
  def getCopyrights(callback: js.Function1[/* copyrights */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  /**
           * Gets the session ID. This method calls the callback function with the session ID as the first parameter
           * @param callback The callback function that needs to be called with the session id.
           */
  def getCredentials(callback: js.Function1[/* creds */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
           * Gets the current culture.
           * @returns The current culture.
           */
  def getCulture(): java.lang.String = js.native
  /**
           * Returns the heading of the current map view.
           * @returns Returns the heading of the current map view.
           */
  def getHeading(): scala.Double = js.native
  /**
           * Gets the height of the map control.
           * @returns The height of the map control.
           */
  def getHeight(): scala.Double = js.native
  /**
           * Gets the string that represents the imagery currently displayed on the map.
           * @returns The string that represents the imagery currently displayed on the map.
           */
  def getImageryId(): java.lang.String = js.native
  /**
           * Gets a string that represents the current map type displayed on the map.
           * @returns A string that represents the current map type displayed on the map.
           */
  def getMapTypeId(): MapTypeId = js.native
  /**
           * Gets the current scale in meters per pixel of the center of the map.
           * @returns The current scale in meters per pixel of the center of the map.
           */
  def getMetersPerPixel(): scala.Double = js.native
  /**
           * Gets the map options that have been set.
           * @returns the map options that have been set.
           */
  def getOptions(): IMapOptions = js.native
  /**
           * Gets the x coordinate of the top left corner of the map control, relative to the page.
           * @returns The x coordinate of the top left corner of the map control, relative to the page.
           */
  def getPageX(): scala.Double = js.native
  /**
           * Gets the y coordinate of the top left corner of the map control, relative to the page.
           * @returns The y coordinate of the top left corner of the map control, relative to the page.
           */
  def getPageY(): scala.Double = js.native
  /**
           * Returns the pitch of the current streetside map view.
           * @returns Returns the pitch of the current streetside map view.
           */
  def getPitch(): scala.Double = js.native
  /**
           * Gets the map root node.
           * @returns the map root node.
           */
  def getRootElement(): stdLib.HTMLElement = js.native
  /**
           * Gets the user region.
           * @returns The user region.
           */
  def getUserRegion(): java.lang.String = js.native
  /**
           * Gets the width of the map control.
           * @returns the width of the map control.
           */
  def getWidth(): scala.Double = js.native
  /**
           * Gets the zoom level of the current map view.
           * @returns Returns the zoom level of the current map view.
           */
  def getZoom(): scala.Double = js.native
  /**
           * Gets the range of valid zoom levels for the current map view.
           * @returns The range of valid zoom levels for the current map view.
           */
  def getZoomRange(): IRange = js.native
  /**
           * Gets a boolean indicating whether the map is in a regular Mercator nadir mode.
           * @returns A boolean indicating whether the map is in a regular Mercator nadir mode.
           */
  def isMercator(): scala.Boolean = js.native
  /**
           * Gets a boolean indicating if the current map type allows the heading to change; false if the display heading is fixed.
           * @returns true if the current map type allows the heading to change; false if the display heading is fixed.
           */
  def isRotationEnabled(): scala.Boolean = js.native
  /**
           * Sets the current map type.
           * @param mapTypeId The map imagery type of the map to set.
           */
  def setMapType(mapTypeId: MapTypeId): scala.Unit = js.native
  /**
           * Sets the map options.
           * @param options The map options to be set.
           */
  def setOptions(options: IMapOptions): scala.Unit = js.native
  /**
           * Sets the view of the map.
           * @param viewOptions The view options to be set.
           */
  def setView(viewOptions: IViewOptions): scala.Unit = js.native
  /**
           * Converts a specified Location or a Location array to a Point or Point array on the map
           * relative to the specified PixelReference. If no reference is specified, PixelReference.viewport
           * is taken.
           * @param location The given Location or Location[] to convert.
           * @param reference The PixelReference to specify the reference point.
           * @returns The converted Point or Point[], or null if the conversion fails.
           */
  def tryLocationToPixel(location: Location): Point | js.Array[Point] = js.native
  /**
           * Converts a specified Location or a Location array to a Point or Point array on the map
           * relative to the specified PixelReference. If no reference is specified, PixelReference.viewport
           * is taken.
           * @param location The given Location or Location[] to convert.
           * @param reference The PixelReference to specify the reference point.
           * @returns The converted Point or Point[], or null if the conversion fails.
           */
  def tryLocationToPixel(location: Location, reference: js.Any): Point | js.Array[Point] = js.native
  /**
           * Converts a specified Location or a Location array to a Point or Point array on the map
           * relative to the specified PixelReference. If no reference is specified, PixelReference.viewport
           * is taken.
           * @param location The given Location or Location[] to convert.
           * @param reference The PixelReference to specify the reference point.
           * @returns The converted Point or Point[], or null if the conversion fails.
           */
  def tryLocationToPixel(location: js.Array[Location]): Point | js.Array[Point] = js.native
  /**
           * Converts a specified Location or a Location array to a Point or Point array on the map
           * relative to the specified PixelReference. If no reference is specified, PixelReference.viewport
           * is taken.
           * @param location The given Location or Location[] to convert.
           * @param reference The PixelReference to specify the reference point.
           * @returns The converted Point or Point[], or null if the conversion fails.
           */
  def tryLocationToPixel(location: js.Array[Location], reference: js.Any): Point | js.Array[Point] = js.native
  /**
           * Converts a specified Point or a Point array to a Location or Location array on the map
           * relative to the specified PixelReference. If no reference is specified, PixelReference.viewport
           * is taken.
           * @param point The given Point or Point[] to convert.
           * @param reference The PixelReference to specify the reference point.
           * @returns The converted Location or Location[], or null if the conversion fails.
           */
  def tryPixelToLocation(point: Point): Location | js.Array[Location] = js.native
  /**
           * Converts a specified Point or a Point array to a Location or Location array on the map
           * relative to the specified PixelReference. If no reference is specified, PixelReference.viewport
           * is taken.
           * @param point The given Point or Point[] to convert.
           * @param reference The PixelReference to specify the reference point.
           * @returns The converted Location or Location[], or null if the conversion fails.
           */
  def tryPixelToLocation(point: Point, reference: js.Any): Location | js.Array[Location] = js.native
  /**
           * Converts a specified Point or a Point array to a Location or Location array on the map
           * relative to the specified PixelReference. If no reference is specified, PixelReference.viewport
           * is taken.
           * @param point The given Point or Point[] to convert.
           * @param reference The PixelReference to specify the reference point.
           * @returns The converted Location or Location[], or null if the conversion fails.
           */
  def tryPixelToLocation(point: js.Array[Point]): Location | js.Array[Location] = js.native
  /**
           * Converts a specified Point or a Point array to a Location or Location array on the map
           * relative to the specified PixelReference. If no reference is specified, PixelReference.viewport
           * is taken.
           * @param point The given Point or Point[] to convert.
           * @param reference The PixelReference to specify the reference point.
           * @returns The converted Location or Location[], or null if the conversion fails.
           */
  def tryPixelToLocation(point: js.Array[Point], reference: js.Any): Location | js.Array[Location] = js.native
}

@JSGlobal("Microsoft.Maps.Map")
@js.native
object Map extends js.Object {
  /**
  		* Gets the streetside panorama information closest to the specified bounding box and returns using a success callback function. 
  		* This information can then be used to set the map view to that streetside panorama.
  		*/
  def getClosestPanorama(
    bounds: bingmapsLib.MicrosoftNs.MapsNs.LocationRect,
    success: js.Function1[/* panoramaInfo */ bingmapsLib.MicrosoftNs.MapsNs.IPanoramaInfo, scala.Unit],
    missingCoverage: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /** Returns the branch name; release, experimental, frozen. */
  def getVersion(): java.lang.String = js.native
}

