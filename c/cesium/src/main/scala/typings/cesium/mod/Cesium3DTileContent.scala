package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cesium3DTileContent")
@js.native
open class Cesium3DTileContent () extends StObject {
  
  /**
    * Gets the amount of memory used by the batch table textures and any binary
    * metadata properties not accounted for in geometryByteLength or
    * texturesByteLength
    */
  val batchTableByteLength: Double = js.native
  
  /**
    * Gets the number of features in the tile.
    */
  val featuresLength: Double = js.native
  
  /**
    * Gets the tile's geometry memory in bytes.
    */
  val geometryByteLength: Double = js.native
  
  /**
    * Returns the {@link Cesium3DTileFeature} object for the feature with the
    * given <code>batchId</code>.  This object is used to get and modify the
    * feature's properties.
    * <p>
    * Features in a tile are ordered by <code>batchId</code>, an index used to retrieve their metadata from the batch table.
    * </p>
    * @param batchId - The batchId for the feature.
    * @returns The corresponding {@link Cesium3DTileFeature} object.
    */
  def getFeature(batchId: Double): Cesium3DTileFeature = js.native
  
  /**
    * Returns whether the feature has this property.
    * @param batchId - The batchId for the feature.
    * @param name - The case-sensitive name of the property.
    * @returns <code>true</code> if the feature has this property; otherwise, <code>false</code>.
    */
  def hasProperty(batchId: Double, name: String): Boolean = js.native
  
  /**
    * Gets the array of {@link Cesium3DTileContent} objects for contents that contain other contents, such as composite tiles. The inner contents may in turn have inner contents, such as a composite tile that contains a composite tile.
    */
  val innerContents: js.Array[Any] = js.native
  
  /**
    * Gets the number of points in the tile.
    * <p>
    * Only applicable for tiles with Point Cloud content. This is different than {@link Cesium3DTileContent#featuresLength} which
    * equals the number of groups of points as distinguished by the <code>BATCH_ID</code> feature table semantic.
    * </p>
    */
  val pointsLength: Double = js.native
  
  /**
    * Gets the promise that will be resolved when the tile's content is ready to render.
    */
  val readyPromise: js.Promise[Cesium3DTileContent] = js.native
  
  /**
    * Gets the tile's texture memory in bytes.
    */
  val texturesByteLength: Double = js.native
  
  /**
    * Gets the tile containing this content.
    */
  val tile: Cesium3DTile = js.native
  
  /**
    * Gets the tileset for this tile.
    */
  val tileset: Cesium3DTileset = js.native
  
  /**
    * Gets the number of triangles in the tile.
    */
  val trianglesLength: Double = js.native
  
  /**
    * Gets the url of the tile's content.
    */
  val url: String = js.native
}
