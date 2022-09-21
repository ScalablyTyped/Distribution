package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cesium3DTilePointFeature")
@js.native
open class Cesium3DTilePointFeature () extends StObject {
  
  /**
    * Gets or sets the color for the anchor line.
    * <p>
    * Only applied when <code>heightOffset</code> is defined.
    * </p>
    */
  var anchorLineColor: Color = js.native
  
  /**
    * Gets or sets whether the anchor line is displayed.
    * <p>
    * Only applied when <code>heightOffset</code> is defined.
    * </p>
    */
  var anchorLineEnabled: Boolean = js.native
  
  /**
    * Gets or sets the background color of the text for this feature.
    * <p>
    * Only applied when <code>labelText</code> is defined.
    * </p>
    */
  var backgroundColor: Color = js.native
  
  /**
    * Gets or sets whether to display the background of the text for this feature.
    * <p>
    * Only applied when <code>labelText</code> is defined.
    * </p>
    */
  var backgroundEnabled: Boolean = js.native
  
  /**
    * Gets or sets the background padding of the text for this feature.
    * <p>
    * Only applied when <code>labelText</code> is defined.
    * </p>
    */
  var backgroundPadding: Cartesian2 = js.native
  
  /**
    * Gets or sets the color of the point of this feature.
    * <p>
    * Only applied when <code>image</code> is <code>undefined</code>.
    * </p>
    */
  var color: Color = js.native
  
  /**
    * Gets or sets the distance where depth testing will be disabled.
    */
  var disableDepthTestDistance: Double = js.native
  
  /**
    * Gets or sets the condition specifying at what distance from the camera that this feature will be displayed.
    */
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  
  /**
    * Gets or sets the font of this feature.
    * <p>
    * Only applied when the <code>labelText</code> is defined.
    * </p>
    */
  var font: String = js.native
  
  /**
    * Returns a copy of the value of the feature's property with the given name. This includes properties from this feature's
    * class and inherited classes when using a batch table hierarchy.
    * @example
    * // Display all the properties for a feature in the console log.
    * const propertyIds = feature.getPropertyIds();
    * const length = propertyIds.length;
    * for (let i = 0; i < length; ++i) {
    *     const propertyId = propertyIds[i];
    *     console.log(`{propertyId} : ${feature.getProperty(propertyId)}`);
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
    * Gets or sets the height offset in meters of this feature.
    */
  var heightOffset: Double = js.native
  
  /**
    * Gets or sets the horizontal origin of this point, which determines if the point is
    * to the left, center, or right of its anchor position.
    */
  var horizontalOrigin: HorizontalOrigin = js.native
  
  /**
    * Gets or sets the image of this feature.
    */
  var image: String = js.native
  
  /**
    * Gets or sets the label color of this feature.
    * <p>
    * The color will be applied to the label if <code>labelText</code> is defined.
    * </p>
    */
  var labelColor: Color = js.native
  
  /**
    * Gets or sets the horizontal origin of this point's text, which determines if the point's text is
    * to the left, center, or right of its anchor position.
    */
  var labelHorizontalOrigin: HorizontalOrigin = js.native
  
  /**
    * Gets or sets the label outline color of this feature.
    * <p>
    * The outline color will be applied to the label if <code>labelText</code> is defined.
    * </p>
    */
  var labelOutlineColor: Color = js.native
  
  /**
    * Gets or sets the outline width in pixels of this feature.
    * <p>
    * The outline width will be applied to the point if <code>labelText</code> is defined.
    * </p>
    */
  var labelOutlineWidth: Double = js.native
  
  /**
    * Gets or sets the fill and outline style of this feature.
    * <p>
    * Only applied when <code>labelText</code> is defined.
    * </p>
    */
  var labelStyle: LabelStyle = js.native
  
  /**
    * Gets or sets the text for this feature.
    */
  var labelText: String = js.native
  
  /**
    * Get or sets the vertical origin of this point's text, which determines if the point's text is
    * to the bottom, center, top, or baseline of it's anchor point.
    */
  var labelVerticalOrigin: VerticalOrigin = js.native
  
  /**
    * Gets or sets the point outline color of this feature.
    * <p>
    * Only applied when <code>image</code> is <code>undefined</code>.
    * </p>
    */
  var pointOutlineColor: Color = js.native
  
  /**
    * Gets or sets the point outline width in pixels of this feature.
    * <p>
    * Only applied when <code>image</code> is <code>undefined</code>.
    * </p>
    */
  var pointOutlineWidth: Double = js.native
  
  /**
    * Gets or sets the point size of this feature.
    * <p>
    * Only applied when <code>image</code> is <code>undefined</code>.
    * </p>
    */
  var pointSize: Double = js.native
  
  /**
    * All objects returned by {@link Scene#pick} have a <code>primitive</code> property. This returns
    * the tileset containing the feature.
    */
  val primitive: Cesium3DTileset = js.native
  
  /**
    * Gets or sets the near and far scaling properties for this feature.
    */
  var scaleByDistance: NearFarScalar = js.native
  
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
  
  /**
    * Gets or sets the near and far translucency properties for this feature.
    */
  var translucencyByDistance: NearFarScalar = js.native
  
  /**
    * Gets or sets the vertical origin of this point, which determines if the point is
    * to the bottom, center, or top of its anchor position.
    */
  var verticalOrigin: VerticalOrigin = js.native
}
