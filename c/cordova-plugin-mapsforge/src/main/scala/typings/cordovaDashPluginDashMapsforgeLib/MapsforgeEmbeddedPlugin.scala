package typings
package cordovaDashPluginDashMapsforgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapsforgeEmbeddedPlugin extends js.Object {
  var COLOR_BLACK: scala.Double | java.lang.String = js.native
  var COLOR_BLUE: scala.Double | java.lang.String = js.native
  var COLOR_CYAN: scala.Double | java.lang.String = js.native
  var COLOR_DKGRAY: scala.Double | java.lang.String = js.native
  var COLOR_GREEN: scala.Double | java.lang.String = js.native
  var COLOR_RED: scala.Double | java.lang.String = js.native
  var COLOR_TRANSPARENT: scala.Double | java.lang.String = js.native
  var COLOR_WHITE: scala.Double | java.lang.String = js.native
  var COLOR_YELLOW: scala.Double | java.lang.String = js.native
  var MARKER_BLACK: scala.Double | java.lang.String = js.native
  var MARKER_BLUE: scala.Double | java.lang.String = js.native
  var MARKER_GREEN: scala.Double | java.lang.String = js.native
  var MARKER_RED: scala.Double | java.lang.String = js.native
  var MARKER_WHITE: scala.Double | java.lang.String = js.native
  var MARKER_YELLOW: scala.Double | java.lang.String = js.native
  /**
       * Adds a marker to the map in the specified coordinates and returns the key for that marker to the success function.
       * @param arg Array in the following form: [String marker_color, double lat, double lng].
       * The color of the marker should be one of the constants from mapsforge.embedded object; if the marker doesn't exist a green marker will be used instead.
       * @param success Success callback. Gets the key of created marker. That key is the one you have to use if you want to delete it.
       * @param error Error callback
       */
  def addMarker(arg: js.Array[_]): scala.Unit = js.native
  /**
       * Adds a marker to the map in the specified coordinates and returns the key for that marker to the success function.
       * @param arg Array in the following form: [String marker_color, double lat, double lng].
       * The color of the marker should be one of the constants from mapsforge.embedded object; if the marker doesn't exist a green marker will be used instead.
       * @param success Success callback. Gets the key of created marker. That key is the one you have to use if you want to delete it.
       * @param error Error callback
       */
  def addMarker(arg: js.Array[_], success: js.Function1[/* key */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
       * Adds a marker to the map in the specified coordinates and returns the key for that marker to the success function.
       * @param arg Array in the following form: [String marker_color, double lat, double lng].
       * The color of the marker should be one of the constants from mapsforge.embedded object; if the marker doesn't exist a green marker will be used instead.
       * @param success Success callback. Gets the key of created marker. That key is the one you have to use if you want to delete it.
       * @param error Error callback
       */
  def addMarker(
    arg: js.Array[_],
    success: js.Function1[/* key */ scala.Double, scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       *
       * @param arg Array in the following form: [int color, int strokeWidth,[double points]].
       * The color can be one of the constants specified before, or the new color you want.
       * This function will use the odd positions of the array of points for the latitudes and the even positions for the longitudes.
       * Example: [lat1, lng1, lat2, lng2, lat3, lng3].
       * If the length of the array is not even, the function will throw an exception and return the error message to the error function.
       * @param success Success callback. Gets the key of created polyline.
       * @param error Error callback
       */
  def addPolyline(arg: js.Array[_]): scala.Unit = js.native
  /**
       *
       * @param arg Array in the following form: [int color, int strokeWidth,[double points]].
       * The color can be one of the constants specified before, or the new color you want.
       * This function will use the odd positions of the array of points for the latitudes and the even positions for the longitudes.
       * Example: [lat1, lng1, lat2, lng2, lat3, lng3].
       * If the length of the array is not even, the function will throw an exception and return the error message to the error function.
       * @param success Success callback. Gets the key of created polyline.
       * @param error Error callback
       */
  def addPolyline(arg: js.Array[_], success: js.Function1[/* key */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
       *
       * @param arg Array in the following form: [int color, int strokeWidth,[double points]].
       * The color can be one of the constants specified before, or the new color you want.
       * This function will use the odd positions of the array of points for the latitudes and the even positions for the longitudes.
       * Example: [lat1, lng1, lat2, lng2, lat3, lng3].
       * If the length of the array is not even, the function will throw an exception and return the error message to the error function.
       * @param success Success callback. Gets the key of created polyline.
       * @param error Error callback
       */
  def addPolyline(
    arg: js.Array[_],
    success: js.Function1[/* key */ scala.Double, scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Deletes the layer(markers or polylines) with the specified key from the map.
       * @param key Key of marker or polyline.
       * @param success Success callback.
       * @param error Error callback
       */
  def deleteLayer(key: scala.Double): scala.Unit = js.native
  /**
       * Deletes the layer(markers or polylines) with the specified key from the map.
       * @param key Key of marker or polyline.
       * @param success Success callback.
       * @param error Error callback
       */
  def deleteLayer(key: scala.Double, success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Deletes the layer(markers or polylines) with the specified key from the map.
       * @param key Key of marker or polyline.
       * @param success Success callback.
       * @param error Error callback
       */
  def deleteLayer(
    key: scala.Double,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * To hide the map view.
       * @param success Success callback.
       * @param error Error callback
       */
  def hide(): scala.Unit = js.native
  /**
       * To hide the map view.
       * @param success Success callback.
       * @param error Error callback
       */
  def hide(success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * To hide the map view.
       * @param success Success callback.
       * @param error Error callback
       */
  def hide(success: js.Function0[scala.Unit], error: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
       * The map file path provided must be the absolute file path. You can specify the width and height values for the view that will be added,
       * or you can set them to 0 for set the value to MATCH_PARENT. You must call this method before any other method.
       * @param args Array in the following form: [String mapFilePath, int viewWidth, int viewHeight].
       * @param success Success callback.
       * @param error Error callback
       */
  def initialize(args: js.Array[_]): scala.Unit = js.native
  /**
       * The map file path provided must be the absolute file path. You can specify the width and height values for the view that will be added,
       * or you can set them to 0 for set the value to MATCH_PARENT. You must call this method before any other method.
       * @param args Array in the following form: [String mapFilePath, int viewWidth, int viewHeight].
       * @param success Success callback.
       * @param error Error callback
       */
  def initialize(args: js.Array[_], success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * The map file path provided must be the absolute file path. You can specify the width and height values for the view that will be added,
       * or you can set them to 0 for set the value to MATCH_PARENT. You must call this method before any other method.
       * @param args Array in the following form: [String mapFilePath, int viewWidth, int viewHeight].
       * @param success Success callback.
       * @param error Error callback
       */
  def initialize(
    args: js.Array[_],
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Stops and cleans the resources that have been used.
       * @param success Success callback.
       * @param error Error callback
       */
  def onDestroy(): scala.Unit = js.native
  /**
       * Stops and cleans the resources that have been used.
       * @param success Success callback.
       * @param error Error callback
       */
  def onDestroy(success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Stops and cleans the resources that have been used.
       * @param success Success callback.
       * @param error Error callback
       */
  def onDestroy(success: js.Function0[scala.Unit], error: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
       * Initializes again the map if the onStop method was called.
       * @param success Success callback.
       * @param error Error callback
       */
  def onStart(): scala.Unit = js.native
  /**
       * Initializes again the map if the onStop method was called.
       * @param success Success callback.
       * @param error Error callback
       */
  def onStart(success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Initializes again the map if the onStop method was called.
       * @param success Success callback.
       * @param error Error callback
       */
  def onStart(success: js.Function0[scala.Unit], error: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
       * Stops the rendering. Useful for when the app goes to the background. You have to call the onStart method to restart it.
       * @param success Success callback.
       * @param error Error callback
       */
  def onStop(): scala.Unit = js.native
  /**
       * Stops the rendering. Useful for when the app goes to the background. You have to call the onStart method to restart it.
       * @param success Success callback.
       * @param error Error callback
       */
  def onStop(success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Stops the rendering. Useful for when the app goes to the background. You have to call the onStart method to restart it.
       * @param success Success callback.
       * @param error Error callback
       */
  def onStop(success: js.Function0[scala.Unit], error: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
       * Sets the center of the map to the given coordinates.
       * @param lat Latitude of the new center.
       * @param lng Longitude of the new center.
       * @param success Success callback.
       * @param error Error callback
       */
  def setCenter(lat: scala.Double, lng: scala.Double): scala.Unit = js.native
  /**
       * Sets the center of the map to the given coordinates.
       * @param lat Latitude of the new center.
       * @param lng Longitude of the new center.
       * @param success Success callback.
       * @param error Error callback
       */
  def setCenter(lat: scala.Double, lng: scala.Double, success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Sets the center of the map to the given coordinates.
       * @param lat Latitude of the new center.
       * @param lng Longitude of the new center.
       * @param success Success callback.
       * @param error Error callback
       */
  def setCenter(
    lat: scala.Double,
    lng: scala.Double,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Sets the maximum zoom level.
       * @param maxZoom New maximum zoom level.
       * @param success Success callback.
       * @param error Error callback
       */
  def setMaxZoom(maxZoom: scala.Double): scala.Unit = js.native
  /**
       * Sets the maximum zoom level.
       * @param maxZoom New maximum zoom level.
       * @param success Success callback.
       * @param error Error callback
       */
  def setMaxZoom(maxZoom: scala.Double, success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Sets the maximum zoom level.
       * @param maxZoom New maximum zoom level.
       * @param success Success callback.
       * @param error Error callback
       */
  def setMaxZoom(
    maxZoom: scala.Double,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Sets the minimum zoom level.
       * @param minZoom New minimum zoom level.
       * @param success Success callback.
       * @param error Error callback
       */
  def setMinZoom(minZoom: scala.Double): scala.Unit = js.native
  /**
       * Sets the minimum zoom level.
       * @param minZoom New minimum zoom level.
       * @param success Success callback.
       * @param error Error callback
       */
  def setMinZoom(minZoom: scala.Double, success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Sets the minimum zoom level.
       * @param minZoom New minimum zoom level.
       * @param success Success callback.
       * @param error Error callback
       */
  def setMinZoom(
    minZoom: scala.Double,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * The path to the map ile is required, and the path to the render theme may be null in order to apply the default render theme.
       * @param args Array in the following form: [String mapFilePath, String renderThemePath]
       * @param success Success callback.
       * @param error Error callback
       */
  def setOfflineTileLayer(args: js.Array[_]): scala.Unit = js.native
  /**
       * The path to the map ile is required, and the path to the render theme may be null in order to apply the default render theme.
       * @param args Array in the following form: [String mapFilePath, String renderThemePath]
       * @param success Success callback.
       * @param error Error callback
       */
  def setOfflineTileLayer(args: js.Array[_], success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * The path to the map ile is required, and the path to the render theme may be null in order to apply the default render theme.
       * @param args Array in the following form: [String mapFilePath, String renderThemePath]
       * @param success Success callback.
       * @param error Error callback
       */
  def setOfflineTileLayer(
    args: js.Array[_],
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       *
       * @param args Array in the following form: [String providerName, String host, String baseUrl, String extension, int port]
       * @param success Success callback.
       * @param error Error callback
       */
  def setOnlineTileLayer(args: js.Array[_]): scala.Unit = js.native
  /**
       *
       * @param args Array in the following form: [String providerName, String host, String baseUrl, String extension, int port]
       * @param success Success callback.
       * @param error Error callback
       */
  def setOnlineTileLayer(args: js.Array[_], success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       *
       * @param args Array in the following form: [String providerName, String host, String baseUrl, String extension, int port]
       * @param success Success callback.
       * @param error Error callback
       */
  def setOnlineTileLayer(
    args: js.Array[_],
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Sets the zoom to the specified value (if it is between the zoom limits).
       * @param zoomLevel New zoom level.
       * @param success Success callback.
       * @param error Error callback
       */
  def setZoom(zoomLevel: scala.Double): scala.Unit = js.native
  /**
       * Sets the zoom to the specified value (if it is between the zoom limits).
       * @param zoomLevel New zoom level.
       * @param success Success callback.
       * @param error Error callback
       */
  def setZoom(zoomLevel: scala.Double, success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Sets the zoom to the specified value (if it is between the zoom limits).
       * @param zoomLevel New zoom level.
       * @param success Success callback.
       * @param error Error callback
       */
  def setZoom(
    zoomLevel: scala.Double,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * To show the map view.
       * @param success Success callback.
       * @param error Error callback
       */
  def show(): scala.Unit = js.native
  /**
       * To show the map view.
       * @param success Success callback.
       * @param error Error callback
       */
  def show(success: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * To show the map view.
       * @param success Success callback.
       * @param error Error callback
       */
  def show(success: js.Function0[scala.Unit], error: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

