package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cesium3DTileFeature")
@js.native
open class Cesium3DTileFeature () extends StObject {
  
  /**
    * Gets or sets the highlight color multiplied with the feature's color.  When
    * this is white, the feature's color is not changed. This is set for all features
    * when a style's color is evaluated.
    */
  var color: Color = js.native
  
  /**
    * Get the feature ID associated with this feature. For 3D Tiles 1.0, the
    * batch ID is returned. For EXT_mesh_features, this is the feature ID from
    * the selected feature ID set.
    */
  val featureId: Double = js.native
  
  /**
    * Returns a copy of the value of the feature's property with the given name. This includes properties from this feature's
    * class and inherited classes when using a batch table hierarchy.
    * @example
    * // Display all the properties for a feature in the console log.
    * const propertyIds = feature.getPropertyIds();
    * const length = propertyIds.length;
    * for (let i = 0; i < length; ++i) {
    *     const propertyId = propertyIds[i];
    *     console.log(`{propertyId}: ${feature.getProperty(propertyId)}`);
    * }
    * @param name - The case-sensitive name of the property.
    * @returns The value of the property or <code>undefined</code> if the feature does not have this property.
    */
  def getProperty(name: String): Any = js.native
  
  /**
    * Returns an array of property IDs for the feature. This includes properties from this feature's
    * class and inherited classes when using a batch table hierarchy.
    * @param [results] - An array into which to store the results.
    * @returns The IDs of the feature's properties.
    */
  def getPropertyIds(): js.Array[String] = js.native
  def getPropertyIds(results: js.Array[String]): js.Array[String] = js.native
  
  /**
    * Returns an array of property names for the feature. This includes properties from this feature's
    * class and inherited classes when using a batch table hierarchy.
    * @param [results] - An array into which to store the results.
    * @returns The names of the feature's properties.
    */
  def getPropertyNames(): js.Array[String] = js.native
  def getPropertyNames(results: js.Array[String]): js.Array[String] = js.native
  
  /**
    * Returns whether the feature contains this property. This includes properties from this feature's
    * class and inherited classes when using a batch table hierarchy.
    * @param name - The case-sensitive name of the property.
    * @returns Whether the feature contains this property.
    */
  def hasProperty(name: String): Boolean = js.native
  
  /**
    * Gets a typed array containing the ECEF positions of the polyline.
    * Returns undefined if {@link Cesium3DTileset#vectorKeepDecodedPositions} is false
    * or the feature is not a polyline in a vector tile.
    */
  var polylinePositions: js.typedarray.Float64Array = js.native
  
  /**
    * All objects returned by {@link Scene#pick} have a <code>primitive</code> property. This returns
    * the tileset containing the feature.
    */
  val primitive: Cesium3DTileset = js.native
  
  /**
    * Sets the value of the feature's property with the given name.
    * <p>
    * If a property with the given name doesn't exist, it is created.
    * </p>
    * @example
    * const height = feature.getProperty('Height'); // e.g., the height of a building
    * @example
    * const name = 'clicked';
    * if (feature.getProperty(name)) {
    *     console.log('already clicked');
    * } else {
    *     feature.setProperty(name, true);
    *     console.log('first click');
    * }
    * @param name - The case-sensitive name of the property.
    * @param value - The value of the property that will be copied.
    */
  def setProperty(name: String, value: Any): Unit = js.native
  
  /**
    * Gets or sets if the feature will be shown. This is set for all features
    * when a style's show is evaluated.
    */
  var show: Boolean = js.native
  
  /**
    * Gets the tileset containing the feature.
    */
  val tileset: Cesium3DTileset = js.native
}
/* static members */
object Cesium3DTileFeature {
  
  @JSImport("cesium", "Cesium3DTileFeature")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a copy of the feature's property with the given name, examining all
    * the metadata from 3D Tiles 1.0 formats, the EXT_structural_metadata and legacy
    * EXT_feature_metadata glTF extensions, and the metadata present either in the
    * tileset JSON (3D Tiles 1.1) or in the 3DTILES_metadata 3D Tiles extension.
    * Metadata is checked against name from most specific to most general and the
    * first match is returned. Metadata is checked in this order:
    *
    * <ol>
    *   <li>Batch table (structural metadata) property by semantic</li>
    *   <li>Batch table (structural metadata) property by property ID</li>
    *   <li>Content metadata property by semantic</li>
    *   <li>Content metadata property by property</li>
    *   <li>Tile metadata property by semantic</li>
    *   <li>Tile metadata property by property ID</li>
    *   <li>Subtree metadata property by semantic</li>
    *   <li>Subtree metadata property by property ID</li>
    *   <li>Group metadata property by semantic</li>
    *   <li>Group metadata property by property ID</li>
    *   <li>Tileset metadata property by semantic</li>
    *   <li>Tileset metadata property by property ID</li>
    *   <li>Otherwise, return undefined</li>
    * </ol>
    * <p>
    * For 3D Tiles Next details, see the {@link https://github.com/CesiumGS/3d-tiles/tree/main/extensions/3DTILES_metadata|3DTILES_metadata Extension}
    * for 3D Tiles, as well as the {@link https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_structural_metadata|EXT_structural_metadata Extension}
    * for glTF. For the legacy glTF extension, see {@link https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_feature_metadata|EXT_feature_metadata Extension}
    * </p>
    * @param content - The content for accessing the metadata
    * @param batchId - The batch ID (or feature ID) of the feature to get a property for
    * @param name - The semantic or property ID of the feature. Semantics are checked before property IDs in each granularity of metadata.
    * @returns The value of the property or <code>undefined</code> if the feature does not have this property.
    */
  inline def getPropertyInherited(content: Cesium3DTileContent, batchId: Double, name: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyInherited")(content.asInstanceOf[js.Any], batchId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
}
