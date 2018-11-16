package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////
/// Tile Calculations
//////////////////////////////////////////////
/**
* A colleciton of mathematical algorithms based on the tile pyramid used by Bign Maps.
* @requires The Microsoft.Maps.SpatialMath module.
*/
@JSGlobal("Microsoft.Maps.SpatialMath.Tiles")
@js.native
object TilesNs extends js.Object {
  def getTilesInBounds(bounds: bingmapsLib.MicrosoftNs.MapsNs.LocationRect, zoom: scala.Double): js.Array[bingmapsLib.MicrosoftNs.MapsNs.PyramidTileId] = js.native
  def globalPixelToLocation(point: bingmapsLib.MicrosoftNs.MapsNs.Point, zoom: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.Location = js.native
  def globalPixelToTile(pixel: bingmapsLib.MicrosoftNs.MapsNs.Point, zoom: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.PyramidTileId = js.native
  def groundResolution(latitude: scala.Double, zoom: scala.Double): scala.Double = js.native
  def groundResolution(
    latitude: scala.Double,
    zoom: scala.Double,
    units: bingmapsLib.MicrosoftNs.MapsNs.SpatialMathNs.DistanceUnits
  ): scala.Double = js.native
  def locationToGlobalPixel(loc: bingmapsLib.MicrosoftNs.MapsNs.Location, zoom: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.Point = js.native
  def locationToTile(loc: bingmapsLib.MicrosoftNs.MapsNs.Location, zoom: scala.Double): bingmapsLib.MicrosoftNs.MapsNs.PyramidTileId = js.native
  def mapSize(zoom: scala.Double): scala.Double = js.native
  def tileToGlobalPixel(tile: bingmapsLib.MicrosoftNs.MapsNs.PyramidTileId): bingmapsLib.MicrosoftNs.MapsNs.Point = js.native
  def tileToLocationRect(tile: bingmapsLib.MicrosoftNs.MapsNs.PyramidTileId): bingmapsLib.MicrosoftNs.MapsNs.LocationRect = js.native
}

