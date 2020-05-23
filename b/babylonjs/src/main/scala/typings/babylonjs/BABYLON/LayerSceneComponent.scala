package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerSceneComponent extends ISceneComponent {
  var _draw: js.Any = js.native
  var _drawCameraBackground: js.Any = js.native
  var _drawCameraForeground: js.Any = js.native
  var _drawCameraPredicate: js.Any = js.native
  var _drawRenderTargetBackground: js.Any = js.native
  var _drawRenderTargetForeground: js.Any = js.native
  var _drawRenderTargetPredicate: js.Any = js.native
  var _engine: js.Any = js.native
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
}

