package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.FeatureId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "ModelFeature")
@js.native
open class ModelFeature protected () extends StObject {
  def this(options: FeatureId) = this()
  
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
    * Returns a copy of the value of the feature's property with the given name.
    * @example
    * // Display all the properties for a feature in the console log.
    * const propertyIds = feature.getPropertyIds();
    * const length = propertyIds.length;
    * for (let i = 0; i < length; ++i) {
    *     const propertyId = propertyIds[i];
    *     console.log(propertyId + ': ' + feature.getProperty(propertyId));
    * }
    * @param name - The case-sensitive name of the property.
    * @returns The value of the property or <code>undefined</code> if the feature does not have this property.
    */
  def getProperty(name: String): Any = js.native
  
  /**
    * Returns an array of property IDs for the feature.
    * @param [results] - An array into which to store the results.
    * @returns The IDs of the feature's properties.
    */
  def getPropertyIds(): js.Array[String] = js.native
  def getPropertyIds(results: js.Array[String]): js.Array[String] = js.native
  
  /**
    * Returns a copy of the feature's property with the given name, examining all
    * the metadata from the EXT_structural_metadata and legacy EXT_feature_metadata glTF
    * extensions. Metadata is checked against name from most specific to most
    * general and the first match is returned. Metadata is checked in this order:
    * <ol>
    *   <li>structural metadata property by semantic</li>
    *   <li>structural metadata property by property ID</li>
    * </ol>
    * <p>
    * See the {@link https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_structural_metadata|EXT_structural_metadata Extension} as well as the
    * previous {@link https://github.com/CesiumGS/glTF/tree/3d-tiles-next/extensions/2.0/Vendor/EXT_feature_metadata|EXT_feature_metadata Extension} for glTF.
    * </p>
    * @param name - The semantic or property ID of the feature. Semantics are checked before property IDs in each granularity of metadata.
    * @returns The value of the property or <code>undefined</code> if the feature does not have this property.
    */
  def getPropertyInherited(name: String): Any = js.native
  
  /**
    * Returns whether the feature contains this property.
    * @param name - The case-sensitive name of the property.
    * @returns Whether the feature contains this property.
    */
  def hasProperty(name: String): Boolean = js.native
  
  /**
    * Sets the value of the feature's property with the given name.
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
    * @returns <code>true</code> if the property was set, <code>false</code> otherwise.
    */
  def setProperty(name: String, value: Any): Boolean = js.native
  
  /**
    * Gets or sets if the feature will be shown. This is set for all features
    * when a style's show is evaluated.
    */
  var show: Boolean = js.native
}
