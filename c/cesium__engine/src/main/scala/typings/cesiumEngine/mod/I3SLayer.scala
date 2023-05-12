package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "I3SLayer")
@js.native
open class I3SLayer () extends StObject {
  
  /**
    * Gets the I3S data for this object.
    */
  val data: Any = js.native
  
  /**
    * When <code>true</code>, when the loaded I3S version is 1.6 or older
    */
  val legacyVersion16: Boolean = js.native
  
  /**
    * The major version number of the loaded I3S dataset
    */
  val majorVersion: Double = js.native
  
  /**
    * The minor version number of the loaded I3S dataset
    */
  val minorVersion: Double = js.native
  
  /**
    * Gets the resource for the layer.
    */
  val resource: Resource = js.native
  
  /**
    * Gets the root node of this layer.
    */
  val rootNode: I3SNode = js.native
  
  /**
    * Gets the Cesium3DTileset for this layer.
    */
  val tileset: js.UndefOr[Cesium3DTileset] = js.native
  
  /**
    * The version string of the loaded I3S dataset
    */
  val version: String = js.native
}
