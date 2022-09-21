package typings.cesium

import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.TerrainProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terrainProviderMod {
  
  @JSImport("cesium/Source/Core/TerrainProvider", JSImport.Default)
  @js.native
  open class default () extends TerrainProvider
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/TerrainProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines an appropriate geometric error estimate when the geometry comes from a heightmap.
      * @param ellipsoid - The ellipsoid to which the terrain is attached.
      * @param tileImageWidth - The width, in pixels, of the heightmap associated with a single tile.
      * @param numberOfTilesAtLevelZero - The number of tiles in the horizontal direction at tile level zero.
      * @returns An estimated geometric error.
      */
    inline def getEstimatedLevelZeroGeometricErrorForAHeightmap(ellipsoid: Ellipsoid, tileImageWidth: Double, numberOfTilesAtLevelZero: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEstimatedLevelZeroGeometricErrorForAHeightmap")(ellipsoid.asInstanceOf[js.Any], tileImageWidth.asInstanceOf[js.Any], numberOfTilesAtLevelZero.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Gets a list of indices for a triangle mesh representing a regular grid.  Calling
      * this function multiple times with the same grid width and height returns the
      * same list of indices.  The total number of vertices must be less than or equal
      * to 65536.
      * @param width - The number of vertices in the regular grid in the horizontal direction.
      * @param height - The number of vertices in the regular grid in the vertical direction.
      * @returns The list of indices. Uint16Array gets returned for 64KB or less and Uint32Array for 4GB or less.
      */
    inline def getRegularGridIndices(width: Double, height: Double): js.typedarray.Uint16Array | js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegularGridIndices")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array | js.typedarray.Uint32Array]
    
    /**
      * Specifies the quality of terrain created from heightmaps.  A value of 1.0 will
      * ensure that adjacent heightmap vertices are separated by no more than
      * {@link Globe.maximumScreenSpaceError} screen pixels and will probably go very slowly.
      * A value of 0.5 will cut the estimated level zero geometric error in half, allowing twice the
      * screen pixels between adjacent heightmap vertices and thus rendering more quickly.
      */
    @JSImport("cesium/Source/Core/TerrainProvider", "default.heightmapTerrainQuality")
    @js.native
    def heightmapTerrainQuality: Double = js.native
    inline def heightmapTerrainQuality_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heightmapTerrainQuality")(x.asInstanceOf[js.Any])
  }
}
