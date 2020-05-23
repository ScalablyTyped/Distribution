package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlineRenderer extends ISceneComponent {
  var _afterRenderingMesh: js.Any = js.native
  var _beforeRenderingMesh: js.Any = js.native
  var _cachedDefines: js.Any = js.native
  var _effect: js.Any = js.native
  var _engine: js.Any = js.native
  var _savedDepthWrite: js.Any = js.native
  /**
    * Defines a zOffset to prevent zFighting between the overlay and the mesh.
    */
  var zOffset: Double = js.native
  /**
    * Returns whether or not the outline renderer is ready for a given submesh.
    * All the dependencies e.g. submeshes, texture, effect... mus be ready
    * @param subMesh Defines the submesh to check readyness for
    * @param useInstances Defines wheter wee are trying to render instances or not
    * @returns true if ready otherwise false
    */
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  /**
    * Renders the outline in the canvas.
    * @param subMesh Defines the sumesh to render
    * @param batch Defines the batch of meshes in case of instances
    * @param useOverlay Defines if the rendering is for the overlay or the outline
    */
  def render(subMesh: SubMesh, batch: InstancesBatch): Unit = js.native
  def render(subMesh: SubMesh, batch: InstancesBatch, useOverlay: Boolean): Unit = js.native
}

