package typings.cesium.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TerrainData")
@js.native
open class TerrainData () extends StObject {
  
  /**
    * An array of credits for this tile.
    */
  var credits: js.Array[Credit] = js.native
  
  /**
    * Computes the terrain height at a specified longitude and latitude.
    * @param rectangle - The rectangle covered by this terrain data.
    * @param longitude - The longitude in radians.
    * @param latitude - The latitude in radians.
    * @returns The terrain height at the specified position.  If the position
    *          is outside the rectangle, this method will extrapolate the height, which is likely to be wildly
    *          incorrect for positions far outside the rectangle.
    */
  def interpolateHeight(rectangle: Rectangle, longitude: Double, latitude: Double): Double = js.native
  
  /**
    * Determines if a given child tile is available, based on the
    * {@link TerrainData#childTileMask}.  The given child tile coordinates are assumed
    * to be one of the four children of this tile.  If non-child tile coordinates are
    * given, the availability of the southeast child tile is returned.
    * @param thisX - The tile X coordinate of this (the parent) tile.
    * @param thisY - The tile Y coordinate of this (the parent) tile.
    * @param childX - The tile X coordinate of the child tile to check for availability.
    * @param childY - The tile Y coordinate of the child tile to check for availability.
    * @returns True if the child tile is available; otherwise, false.
    */
  def isChildAvailable(thisX: Double, thisY: Double, childX: Double, childY: Double): Boolean = js.native
  
  /**
    * Upsamples this terrain data for use by a descendant tile.
    * @param tilingScheme - The tiling scheme of this terrain data.
    * @param thisX - The X coordinate of this tile in the tiling scheme.
    * @param thisY - The Y coordinate of this tile in the tiling scheme.
    * @param thisLevel - The level of this tile in the tiling scheme.
    * @param descendantX - The X coordinate within the tiling scheme of the descendant tile for which we are upsampling.
    * @param descendantY - The Y coordinate within the tiling scheme of the descendant tile for which we are upsampling.
    * @param descendantLevel - The level within the tiling scheme of the descendant tile for which we are upsampling.
    * @returns A promise for upsampled terrain data for the descendant tile,
    *          or undefined if too many asynchronous upsample operations are in progress and the request has been
    *          deferred.
    */
  def upsample(
    tilingScheme: TilingScheme,
    thisX: Double,
    thisY: Double,
    thisLevel: Double,
    descendantX: Double,
    descendantY: Double,
    descendantLevel: Double
  ): js.UndefOr[js.Promise[TerrainData]] = js.native
  
  /**
    * Gets a value indicating whether or not this terrain data was created by upsampling lower resolution
    * terrain data.  If this value is false, the data was obtained from some other source, such
    * as by downloading it from a remote server.  This method should return true for instances
    * returned from a call to {@link TerrainData#upsample}.
    * @returns True if this instance was created by upsampling; otherwise, false.
    */
  def wasCreatedByUpsampling(): Boolean = js.native
  
  /**
    * The water mask included in this terrain data, if any.  A water mask is a rectangular
    * Uint8Array or image where a value of 255 indicates water and a value of 0 indicates land.
    * Values in between 0 and 255 are allowed as well to smoothly blend between land and water.
    */
  var waterMask: js.typedarray.Uint8Array | HTMLImageElement | HTMLCanvasElement = js.native
}
