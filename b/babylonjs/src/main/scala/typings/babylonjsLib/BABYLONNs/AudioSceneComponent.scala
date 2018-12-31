package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the sound scene component responsible to manage any sounds
  * in a given scene.
  */
@JSGlobal("BABYLON.AudioSceneComponent")
@js.native
class AudioSceneComponent protected () extends ISceneSerializableComponent {
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  def this(scene: Scene) = this()
  var _afterRender: js.Any = js.native
  var _audioEnabled: js.Any = js.native
  var _headphone: js.Any = js.native
  /**
    * Gets whether audio is enabled or not.
    * Please use related enable/disable method to switch state.
    */
  val audioEnabled: scala.Boolean = js.native
  /**
    * Gets whether audio is outputing to headphone or not.
    * Please use the according Switch methods to change output.
    */
  val headphone: scala.Boolean = js.native
  /**
    * The name of the component. Each component must have a unique name.
    */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * The scene the component belongs to.
    */
  /* CompleteClass */
  override var scene: Scene = js.native
  /**
    * Adds all the element from the container to the scene
    * @param container the container holding the elements
    */
  /* CompleteClass */
  override def addFromContainer(container: AbstractScene): scala.Unit = js.native
  /**
    * Disables audio in the associated scene.
    */
  def disableAudio(): scala.Unit = js.native
  /**
    * Disposes the component and the associated ressources.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Enables audio in the associated scene.
    */
  def enableAudio(): scala.Unit = js.native
  /**
    * Rebuilds the elements related to this component in case of
    * context lost for instance.
    */
  /* CompleteClass */
  override def rebuild(): scala.Unit = js.native
  /**
    * Register the component to one instance of a scene.
    */
  /* CompleteClass */
  override def register(): scala.Unit = js.native
  /**
    * Removes all the elements in the container from the scene
    * @param container contains the elements to remove
    */
  /* CompleteClass */
  override def removeFromContainer(container: AbstractScene): scala.Unit = js.native
  /**
    * Serializes the component data to the specified json object
    * @param serializationObject The object to serialize to
    */
  /* CompleteClass */
  override def serialize(serializationObject: js.Any): scala.Unit = js.native
  /**
    * Switch audio to headphone output.
    */
  def switchAudioModeForHeadphones(): scala.Unit = js.native
  /**
    * Switch audio to normal speakers.
    */
  def switchAudioModeForNormalSpeakers(): scala.Unit = js.native
}

