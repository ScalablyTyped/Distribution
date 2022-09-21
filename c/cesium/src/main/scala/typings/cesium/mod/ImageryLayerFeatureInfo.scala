package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ImageryLayerFeatureInfo")
@js.native
open class ImageryLayerFeatureInfo () extends StObject {
  
  /**
    * Configures the description of this feature by creating an HTML table of properties and their values.
    * @param properties - An object literal containing the properties of the feature.
    */
  def configureDescriptionFromProperties(properties: Any): Unit = js.native
  
  /**
    * Configures the name of this feature by selecting an appropriate property.  The name will be obtained from
    * one of the following sources, in this order: 1) the property with the name 'name', 2) the property with the name 'title',
    * 3) the first property containing the word 'name', 4) the first property containing the word 'title'.  If
    * the name cannot be obtained from any of these sources, the existing name will be left unchanged.
    * @param properties - An object literal containing the properties of the feature.
    */
  def configureNameFromProperties(properties: Any): Unit = js.native
  
  /**
    * Gets or sets the raw data describing the feature.  The raw data may be in any
    * number of formats, such as GeoJSON, KML, etc.
    */
  var data: js.UndefOr[Any] = js.native
  
  /**
    * Gets or sets an HTML description of the feature.  The HTML is not trusted and should
    * be sanitized before display to the user.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the image layer of the feature.
    */
  var imageryLayer: js.UndefOr[Any] = js.native
  
  /**
    * Gets or sets the name of the feature.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the position of the feature, or undefined if the position is not known.
    */
  var position: js.UndefOr[Cartographic] = js.native
}
