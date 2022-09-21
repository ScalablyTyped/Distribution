package typings.cesium.mod

import typings.cesium.mod.OpenStreetMapImageryProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "OpenStreetMapImageryProvider")
@js.native
open class OpenStreetMapImageryProvider protected () extends UrlTemplateImageryProvider {
  def this(options: ConstructorOptions) = this()
}
object OpenStreetMapImageryProvider {
  
  /**
    * Initialization options for the OpenStreetMapImageryProvider constructor
    * @property [url = 'https://a.tile.openstreetmap.org'] - The OpenStreetMap server url.
    * @property [fileExtension = 'png'] - The file extension for images on the server.
    * @property [rectangle = Rectangle.MAX_VALUE] - The rectangle of the layer.
    * @property [minimumLevel = 0] - The minimum level-of-detail supported by the imagery provider.
    * @property [maximumLevel] - The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit.
    * @property [ellipsoid] - The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
    * @property [credit = 'MapQuest, Open Street Map and contributors, CC-BY-SA'] - A credit for the data source, which is displayed on the canvas.
    */
  trait ConstructorOptions extends StObject {
    
    var credit: js.UndefOr[Credit | String] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var fileExtension: js.UndefOr[String] = js.undefined
    
    var maximumLevel: js.UndefOr[Double] = js.undefined
    
    var minimumLevel: js.UndefOr[Double] = js.undefined
    
    var rectangle: js.UndefOr[Rectangle] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setCredit(value: Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
      
      inline def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
      
      inline def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
      
      inline def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
      
      inline def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
      
      inline def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
      
      inline def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
