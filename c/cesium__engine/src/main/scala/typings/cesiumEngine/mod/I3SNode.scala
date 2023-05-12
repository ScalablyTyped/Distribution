package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "I3SNode")
@js.native
open class I3SNode () extends StObject {
  
  /**
    * Gets the children nodes.
    */
  val children: js.Array[I3SNode] = js.native
  
  /**
    * Gets the I3S data for this object.
    */
  val data: Any = js.native
  
  /**
    * Gets the collection of features.
    */
  val featureData: js.Array[I3SFeature] = js.native
  
  /**
    * Gets the collection of fields.
    */
  val fields: js.Array[I3SField] = js.native
  
  /**
    * Gets the collection of geometries.
    */
  val geometryData: js.Array[I3SGeometry] = js.native
  
  /**
    * Returns the fields for a given feature
    * @param featureIndex - Index of the feature whose attributes we want to get
    * @returns Object containing field names and their values
    */
  def getFieldsForFeature(featureIndex: Double): Any = js.native
  
  /**
    * Returns the fields for a given picked position
    * @param pickedPosition - The picked position
    * @returns Object containing field names and their values
    */
  def getFieldsForPickedPosition(pickedPosition: Cartesian3): Any = js.native
  
  /**
    * Gets the parent layer.
    */
  val layer: I3SLayer = js.native
  
  /**
    * Loads the node fields.
    * @returns A promise that is resolved when the I3S Node fields are loaded
    */
  def loadFields(): js.Promise[Unit] = js.native
  
  /**
    * Gets the parent node.
    */
  val parent: js.UndefOr[I3SNode] = js.native
  
  /**
    * Gets the resource for the node.
    */
  val resource: Resource = js.native
  
  /**
    * Gets the Cesium3DTile for this node.
    */
  val tile: Cesium3DTile = js.native
}
