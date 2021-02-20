package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 3D Tiles tileset represented by an Entity.
  * The tileset modelMatrix is determined by the containing Entity position and orientation or is left unset if position is undefined.
  */
@JSImport("cesium", "Cesium3DTilesetGraphics")
@js.native
class Cesium3DTilesetGraphics () extends StObject {
  def this(options: Cesium3DTilesetGraphicsOptions) = this()
  
  def clone(result: Cesium3DTilesetGraphics): Cesium3DTilesetGraphics = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Array[_]] = js.native
  
  /**
    * Gets or sets the maximum screen space error used to drive level of detail refinement.
    * @default true
    */
  var maximumScreenSpaceError: Property = js.native
  
  /**
    * Assigns each unassigned property on this object to the value of the same property on the provided source object.
    */
  def merge(source: Cesium3DTilesetGraphics): Unit = js.native
  
  /**
    * Gets or sets the boolean Property specifying the visibility of the model.
    * @default true
    */
  var show: Property = js.native
  
  /**
    * Gets or sets the string Property specifying the URI of the glTF asset.
    */
  var uri: Property = js.native
}
