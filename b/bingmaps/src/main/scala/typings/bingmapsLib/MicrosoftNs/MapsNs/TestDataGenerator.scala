package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.TestDataGenerator")
@js.native
class TestDataGenerator () extends js.Object

@JSGlobal("Microsoft.Maps.TestDataGenerator")
@js.native
object TestDataGenerator extends js.Object {
  /**
          * Generates a random hex or rgba color string. 
          * @param withAlpha A boolean indicating if the color should have an alpha value or not. if set to true, a rgba value will be returned with an alpha value of 0.5.
          * @returns A css color string, hex or rgba.
          */
  def getColor(): java.lang.String = js.native
  /**
          * Generates a random hex or rgba color string. 
          * @param withAlpha A boolean indicating if the color should have an alpha value or not. if set to true, a rgba value will be returned with an alpha value of 0.5.
          * @returns A css color string, hex or rgba.
          */
  def getColor(withAlpha: scala.Boolean): java.lang.String = js.native
  /**
          * Generates random Location objects.
          * @param num The number of locations to generate. If set to one a single Location will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the locations should fall within.
          * @returns One or more random Locations.
          */
  def getLocations(): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  /**
          * Generates random Location objects.
          * @param num The number of locations to generate. If set to one a single Location will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the locations should fall within.
          * @returns One or more random Locations.
          */
  def getLocations(num: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  /**
          * Generates random Location objects.
          * @param num The number of locations to generate. If set to one a single Location will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the locations should fall within.
          * @returns One or more random Locations.
          */
  def getLocations(num: scala.Double, bounds: bingmapsLib.MicrosoftNs.MapsNs.LocationRect): bingmapsLib.MicrosoftNs.MapsNs.Location | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Location] = js.native
  /**
          * Generates random polygons.
          * @param num The number of polygons to generate. If set to one a single Polygon will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the locations of the polygon should fall within.
          * @param size The number of locations each polygon should have. Default: random between 3 and 10.
          * @param scaleFactor A number that scales the size of the polygons based on the size of the bounding box. A value of 0.1 would generate polygons that are no larger than 10% of the width/height of the map. Default: 0.1
          * @param options The options to use for rendering the polygons. Default is random.
          * @param addHole A boolean indicating if the generated polygon should have a hole or not. Note that this will double the number of Location objects that are in the Polygon. Default: false
          * @returns One or more random polygons.
          */
  def getPolygons(
    num: js.UndefOr[scala.Double],
    bounds: js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.LocationRect],
    size: js.UndefOr[scala.Double],
    scaleFactor: js.UndefOr[scala.Double],
    options: js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IPolygonOptions],
    addHole: js.UndefOr[scala.Boolean]
  ): bingmapsLib.MicrosoftNs.MapsNs.Polygon | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polygon] = js.native
  /**
          * Generates random polylines.
          * @param num The number of polylines to generate. If set to one a single Polyline will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the locations of the polylines should fall within.
          * @param size The number of locations each polylines should have. Default: random between 3 and 10.
          * @param scaleFactor A number that scales the size of the polylines based on size of the bounding box. A value of 0.1 would generate polylines that are no larger than 10% of the width/height of the map. Default: 0.1
          * @param options The options to use for rendering the polylines. Default is random.
          * @returns One or more random Polylines.
          */
  def getPolylines(): bingmapsLib.MicrosoftNs.MapsNs.Polyline | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polyline] = js.native
  /**
          * Generates random polylines.
          * @param num The number of polylines to generate. If set to one a single Polyline will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the locations of the polylines should fall within.
          * @param size The number of locations each polylines should have. Default: random between 3 and 10.
          * @param scaleFactor A number that scales the size of the polylines based on size of the bounding box. A value of 0.1 would generate polylines that are no larger than 10% of the width/height of the map. Default: 0.1
          * @param options The options to use for rendering the polylines. Default is random.
          * @returns One or more random Polylines.
          */
  def getPolylines(num: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.Polyline | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polyline] = js.native
  /**
          * Generates random polylines.
          * @param num The number of polylines to generate. If set to one a single Polyline will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the locations of the polylines should fall within.
          * @param size The number of locations each polylines should have. Default: random between 3 and 10.
          * @param scaleFactor A number that scales the size of the polylines based on size of the bounding box. A value of 0.1 would generate polylines that are no larger than 10% of the width/height of the map. Default: 0.1
          * @param options The options to use for rendering the polylines. Default is random.
          * @returns One or more random Polylines.
          */
  def getPolylines(num: scala.Double, bounds: bingmapsLib.MicrosoftNs.MapsNs.LocationRect): bingmapsLib.MicrosoftNs.MapsNs.Polyline | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polyline] = js.native
  /**
          * Generates random polylines.
          * @param num The number of polylines to generate. If set to one a single Polyline will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the locations of the polylines should fall within.
          * @param size The number of locations each polylines should have. Default: random between 3 and 10.
          * @param scaleFactor A number that scales the size of the polylines based on size of the bounding box. A value of 0.1 would generate polylines that are no larger than 10% of the width/height of the map. Default: 0.1
          * @param options The options to use for rendering the polylines. Default is random.
          * @returns One or more random Polylines.
          */
  def getPolylines(num: scala.Double, bounds: bingmapsLib.MicrosoftNs.MapsNs.LocationRect, size: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.Polyline | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polyline] = js.native
  /**
          * Generates random polylines.
          * @param num The number of polylines to generate. If set to one a single Polyline will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the locations of the polylines should fall within.
          * @param size The number of locations each polylines should have. Default: random between 3 and 10.
          * @param scaleFactor A number that scales the size of the polylines based on size of the bounding box. A value of 0.1 would generate polylines that are no larger than 10% of the width/height of the map. Default: 0.1
          * @param options The options to use for rendering the polylines. Default is random.
          * @returns One or more random Polylines.
          */
  def getPolylines(
    num: scala.Double,
    bounds: bingmapsLib.MicrosoftNs.MapsNs.LocationRect,
    size: scala.Double,
    scaleFactor: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polyline] = js.native
  /**
          * Generates random polylines.
          * @param num The number of polylines to generate. If set to one a single Polyline will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the locations of the polylines should fall within.
          * @param size The number of locations each polylines should have. Default: random between 3 and 10.
          * @param scaleFactor A number that scales the size of the polylines based on size of the bounding box. A value of 0.1 would generate polylines that are no larger than 10% of the width/height of the map. Default: 0.1
          * @param options The options to use for rendering the polylines. Default is random.
          * @returns One or more random Polylines.
          */
  def getPolylines(
    num: scala.Double,
    bounds: bingmapsLib.MicrosoftNs.MapsNs.LocationRect,
    size: scala.Double,
    scaleFactor: scala.Double,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPolylineOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.Polyline | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Polyline] = js.native
  /**
          * Generates random pushpins.
          * @param num The number of pushpins to generate. If set to one a single Pushpin will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the pushpins should fall within.
          * @param options The options to use for rendering the pushpins. Default is random.
          * @returns One or more random Pushpins.
          */
  def getPushpins(): bingmapsLib.MicrosoftNs.MapsNs.Pushpin | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Pushpin] = js.native
  /**
          * Generates random pushpins.
          * @param num The number of pushpins to generate. If set to one a single Pushpin will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the pushpins should fall within.
          * @param options The options to use for rendering the pushpins. Default is random.
          * @returns One or more random Pushpins.
          */
  def getPushpins(num: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.Pushpin | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Pushpin] = js.native
  /**
          * Generates random pushpins.
          * @param num The number of pushpins to generate. If set to one a single Pushpin will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the pushpins should fall within.
          * @param options The options to use for rendering the pushpins. Default is random.
          * @returns One or more random Pushpins.
          */
  def getPushpins(num: scala.Double, bounds: bingmapsLib.MicrosoftNs.MapsNs.LocationRect): bingmapsLib.MicrosoftNs.MapsNs.Pushpin | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Pushpin] = js.native
  /**
          * Generates random pushpins.
          * @param num The number of pushpins to generate. If set to one a single Pushpin will be returned. If greater than one and array will be returned.
          * @param bounds The bounding box in which all the pushpins should fall within.
          * @param options The options to use for rendering the pushpins. Default is random.
          * @returns One or more random Pushpins.
          */
  def getPushpins(
    num: scala.Double,
    bounds: bingmapsLib.MicrosoftNs.MapsNs.LocationRect,
    options: bingmapsLib.MicrosoftNs.MapsNs.IPushpinOptions
  ): bingmapsLib.MicrosoftNs.MapsNs.Pushpin | js.Array[bingmapsLib.MicrosoftNs.MapsNs.Pushpin] = js.native
}

