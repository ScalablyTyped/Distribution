package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneSerializableComponent
  extends StObject
     with ISceneComponent {
  
  /**
    * Adds all the elements from the container to the scene
    * @param container the container holding the elements
    */
  def addFromContainer(container: AbstractScene): Unit = js.native
  
  /**
    * Removes all the elements in the container from the scene
    * @param container contains the elements to remove
    * @param dispose if the removed element should be disposed (default: false)
    */
  def removeFromContainer(container: AbstractScene): Unit = js.native
  def removeFromContainer(container: AbstractScene, dispose: Boolean): Unit = js.native
  
  /**
    * Serializes the component data to the specified json object
    * @param serializationObject The object to serialize to
    */
  def serialize(serializationObject: Any): Unit = js.native
}
