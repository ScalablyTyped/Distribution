package typings.cesium.mod

import typings.cesium.mod.Cesium3DTilesetGraphics.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Cesium3DTilesetGraphics")
@js.native
open class Cesium3DTilesetGraphics () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  def clone(result: Cesium3DTilesetGraphics): Cesium3DTilesetGraphics = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the maximum screen space error used to drive level of detail refinement.
    */
  var maximumScreenSpaceError: js.UndefOr[Property] = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: Cesium3DTilesetGraphics): Unit = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the model.
    */
  var show: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the string Property specifying the URI of the glTF asset.
    */
  var uri: js.UndefOr[Property] = js.native
}
object Cesium3DTilesetGraphics {
  
  /**
    * Initialization options for the Cesium3DTilesetGraphics constructor
    * @property [show = true] - A boolean Property specifying the visibility of the tileset.
    * @property [uri] - A string or Resource Property specifying the URI of the tileset.
    * @property [maximumScreenSpaceError] - A number or Property specifying the maximum screen space error used to drive level of detail refinement.
    */
  trait ConstructorOptions extends StObject {
    
    var maximumScreenSpaceError: js.UndefOr[Property | Double] = js.undefined
    
    var show: js.UndefOr[Property | Boolean] = js.undefined
    
    var uri: js.UndefOr[Property | String | Resource] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setMaximumScreenSpaceError(value: Property | Double): Self = StObject.set(x, "maximumScreenSpaceError", value.asInstanceOf[js.Any])
      
      inline def setMaximumScreenSpaceErrorUndefined: Self = StObject.set(x, "maximumScreenSpaceError", js.undefined)
      
      inline def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setUri(value: Property | String | Resource): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
