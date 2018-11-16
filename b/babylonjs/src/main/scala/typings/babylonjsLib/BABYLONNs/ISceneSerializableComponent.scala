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

