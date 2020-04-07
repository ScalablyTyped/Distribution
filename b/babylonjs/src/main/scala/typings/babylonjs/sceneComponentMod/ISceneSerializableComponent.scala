package typings.babylonjs.sceneComponentMod

import typings.babylonjs.abstractSceneMod.AbstractScene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISceneSerializableComponent extends ISceneComponent {
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
  def serialize(serializationObject: js.Any): Unit = js.native
}

