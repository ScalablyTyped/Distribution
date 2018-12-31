package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a Lens Flare System or the shiny effect created by the light reflection on the  camera lenses.
  * It is usually composed of several `BABYLON.lensFlare`.
  * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
  */
@JSGlobal("BABYLON.LensFlareSystem")
@js.native
class LensFlareSystem protected () extends js.Object {
  /**
    * Instantiates a lens flare system.
    * This represents a Lens Flare System or the shiny effect created by the light reflection on the  camera lenses.
    * It is usually composed of several `BABYLON.lensFlare`.
    * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
    * @param name Define the name of the lens flare system in the scene
    * @param emitter Define the source (the emitter) of the lens flares (it can be a camera, a light or a mesh).
    * @param scene Define the scene the lens flare system belongs to
    */
  def this(/**
    * Define the name of the lens flare system
    */
  name: java.lang.String, emitter: js.Any, scene: Scene) = this()
  var _effect: js.Any = js.native
  var _emitter: js.Any = js.native
  var _indexBuffer: js.Any = js.native
  var _isEnabled: js.Any = js.native
  var _positionX: js.Any = js.native
  var _positionY: js.Any = js.native
  var _scene: js.Any = js.native
  var _vertexBuffers: js.Any = js.native
  /**
    * Define a limit from the border the lens flare can be visible.
    */
  var borderLimit: scala.Double = js.native
  /**
    * Define the id of the lens flare system in the scene.
    * (equal to name by default)
    */
  var id: java.lang.String = js.native
  /**
    * Define if the lens flare system is enabled.
    */
  var isEnabled: scala.Boolean = js.native
  /**
    * Restricts the rendering of the effect to only the camera rendering this layer mask.
    */
  var layerMask: scala.Double = js.native
  /**
    * List of lens flares used in this system.
    */
  var lensFlares: js.Array[LensFlare] = js.native
  /**
    * Define the name of the lens flare system
    */
  var name: java.lang.String = js.native
  /**
    * Define a viewport border we do not want to see the lens flare in.
    */
  var viewportBorder: scala.Double = js.native
  /** @hidden */
  def _isVisible(): scala.Boolean = js.native
  /**
    * @hidden
    */
  def computeEffectivePosition(globalViewport: Viewport): scala.Boolean = js.native
  /**
    * Dispose and release the lens flare with its associated resources.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Get the emitter of the lens flare system.
    * It defines the source of the lens flares (it can be a camera, a light or a mesh).
    * @returns the emitter of the lens flare system
    */
  def getEmitter(): js.Any = js.native
  /**
    * Get the lens flare system emitter position.
    * The emitter defines the source of the lens flares (it can be a camera, a light or a mesh).
    * @returns the position
    */
  def getEmitterPosition(): Vector3 = js.native
  /**
    * Get the scene the effects belongs to.
    * @returns the scene holding the lens flare system
    */
  def getScene(): Scene = js.native
  /**
    * Define a predicate which could limit the list of meshes able to occlude the effect.
    */
  def meshesSelectionPredicate(mesh: AbstractMesh): scala.Boolean = js.native
  /**
    * @hidden
    */
  def render(): scala.Boolean = js.native
  /**
    * Serialize the current Lens Flare System into a JSON representation.
    * @returns the serialized JSON
    */
  def serialize(): js.Any = js.native
  /**
    * Set the emitter of the lens flare system.
    * It defines the source of the lens flares (it can be a camera, a light or a mesh).
    * @param newEmitter Define the new emitter of the system
    */
  def setEmitter(newEmitter: js.Any): scala.Unit = js.native
}

/**
  * This represents a Lens Flare System or the shiny effect created by the light reflection on the  camera lenses.
  * It is usually composed of several `BABYLON.lensFlare`.
  * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
  */
@JSGlobal("BABYLON.LensFlareSystem")
@js.native
object LensFlareSystem extends js.Object {
  /**
    * Parse a lens flare system from a JSON repressentation
    * @param parsedLensFlareSystem Define the JSON to parse
    * @param scene Define the scene the parsed system should be instantiated in
    * @param rootUrl Define the rootUrl of the load sequence to easily find a load relative dependencies such as textures
    * @returns the parsed system
    */
  def Parse(parsedLensFlareSystem: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.LensFlareSystem = js.native
}

