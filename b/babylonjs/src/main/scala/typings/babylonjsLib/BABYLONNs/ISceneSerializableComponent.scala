package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a SERIALIZABLE scene component.
  *
  * This extends Scene Component to add Serialization methods on top.
  */
trait ISceneSerializableComponent extends ISceneComponent {
  /**
    * Adds all the element from the container to the scene
    * @param container the container holding the elements
    */
  def addFromContainer(container: AbstractScene): scala.Unit
  /**
    * Removes all the elements in the container from the scene
    * @param container contains the elements to remove
    */
  def removeFromContainer(container: AbstractScene): scala.Unit
  /**
    * Serializes the component data to the specified json object
    * @param serializationObject The object to serialize to
    */
  def serialize(serializationObject: js.Any): scala.Unit
}

object ISceneSerializableComponent {
  @scala.inline
  def apply(
    addFromContainer: js.Function1[AbstractScene, scala.Unit],
    dispose: js.Function0[scala.Unit],
    name: java.lang.String,
    rebuild: js.Function0[scala.Unit],
    register: js.Function0[scala.Unit],
    removeFromContainer: js.Function1[AbstractScene, scala.Unit],
    scene: Scene,
    serialize: js.Function1[js.Any, scala.Unit]
  ): ISceneSerializableComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addFromContainer")(addFromContainer)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("rebuild")(rebuild)
    __obj.updateDynamic("register")(register)
    __obj.updateDynamic("removeFromContainer")(removeFromContainer)
    __obj.updateDynamic("scene")(scene)
    __obj.updateDynamic("serialize")(serialize)
    __obj.asInstanceOf[ISceneSerializableComponent]
  }
}

