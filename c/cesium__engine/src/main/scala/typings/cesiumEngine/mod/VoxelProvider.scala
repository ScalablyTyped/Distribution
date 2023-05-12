package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.TileLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "VoxelProvider")
@js.native
open class VoxelProvider () extends StObject {
  
  /**
    * Gets the metadata component types.
    * This should not be called before {@link VoxelProvider#ready} returns true.
    */
  val componentTypes: js.Array[MetadataComponentType] = js.native
  
  /**
    * Gets the number of voxels per dimension of a tile. This is the same for all tiles in the dataset.
    * This should not be called before {@link VoxelProvider#ready} returns true.
    */
  val dimensions: Cartesian3 = js.native
  
  /**
    * A transform from local space to global space. If undefined, the identity matrix will be used instead.
    */
  val globalTransform: js.UndefOr[Matrix4] = js.native
  
  /**
    * Gets the maximum bounds.
    * If undefined, the shape's default maximum bounds will be used instead.
    * This should not be called before {@link VoxelProvider#ready} returns true.
    */
  val maxBounds: js.UndefOr[Cartesian3] = js.native
  
  /**
    * The maximum number of tiles that exist for this provider. This value is used as a hint to the voxel renderer to allocate an appropriate amount of GPU memory. If this value is not known it can be undefined.
    * This should not be called before {@link VoxelProvider#ready} returns true.
    */
  val maximumTileCount: js.UndefOr[Double] = js.native
  
  /**
    * Gets the metadata maximum values.
    * This should not be called before {@link VoxelProvider#ready} returns true.
    */
  val maximumValues: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  /**
    * Gets the minimum bounds.
    * If undefined, the shape's default minimum bounds will be used instead.
    * This should not be called before {@link VoxelProvider#ready} returns true.
    */
  val minBounds: js.UndefOr[Cartesian3] = js.native
  
  /**
    * Gets the metadata minimum values.
    * This should not be called before {@link VoxelProvider#ready} returns true.
    */
  val minimumValues: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  /**
    * Gets the metadata names.
    * This should not be called before {@link VoxelProvider#ready} returns true.
    */
  val names: js.Array[String] = js.native
  
  /**
    * Gets the number of padding voxels after the tile. This improves rendering quality when sampling the edge of a tile, but it increases memory usage.
    * This should not be called before {@link VoxelProvider#ready} returns true.
    */
  val paddingAfter: js.UndefOr[Cartesian3] = js.native
  
  /**
    * Gets the number of padding voxels before the tile. This improves rendering quality when sampling the edge of a tile, but it increases memory usage.
    * This should not be called before {@link VoxelProvider#ready} returns true.
    */
  val paddingBefore: js.UndefOr[Cartesian3] = js.native
  
  /**
    * Gets a value indicating whether or not the provider is ready for use.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets the promise that will be resolved when the provider is ready for use.
    */
  val readyPromise: js.Promise[VoxelProvider] = js.native
  
  /**
    * Requests the data for a given tile. The data is a flattened 3D array ordered by X, then Y, then Z.
    * This function should not be called before {@link VoxelProvider#ready} returns true.
    * @param [options] - Object with the following properties:
    * @param [options.tileLevel = 0] - The tile's level.
    * @param [options.tileX = 0] - The tile's X coordinate.
    * @param [options.tileY = 0] - The tile's Y coordinate.
    * @param [options.tileZ = 0] - The tile's Z coordinate.
    * @returns A promise to an array of typed arrays containing the requested voxel data or undefined if there was a problem loading the data.
    */
  def requestData(): js.UndefOr[js.Promise[js.Array[js.Array[Any]]]] = js.native
  def requestData(options: TileLevel): js.UndefOr[js.Promise[js.Array[js.Array[Any]]]] = js.native
  
  /**
    * Gets the {@link VoxelShapeType}
    * This should not be called before {@link VoxelProvider#ready} returns true.
    */
  val shape: VoxelShapeType = js.native
  
  /**
    * A transform from shape space to local space. If undefined, the identity matrix will be used instead.
    */
  val shapeTransform: js.UndefOr[Matrix4] = js.native
  
  /**
    * Gets the metadata types.
    * This should not be called before {@link VoxelProvider#ready} returns true.
    */
  val types: js.Array[MetadataType] = js.native
}
