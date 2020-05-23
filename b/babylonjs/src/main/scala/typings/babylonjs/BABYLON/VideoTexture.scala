package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoTexture extends Texture {
  var _createInternalTexture: js.Any = js.native
  var _createInternalTextureOnEvent: js.Any = js.native
  var _currentSrc: js.Any = js.native
  var _displayingPosterTexture: js.Any = js.native
  var _engine: js.Any = js.native
  var _frameId: js.Any = js.native
  var _generateMipMaps: js.Any = js.native
  var _getName: js.Any = js.native
  var _getVideo: js.Any = js.native
  var _onUserActionRequestedObservable: js.Any = js.native
  var _settings: js.Any = js.native
  var _stillImageCaptured: js.Any = js.native
  /**
    * Tells whether textures will be updated automatically or user is required to call `updateTexture` manually
    */
  val autoUpdateTexture: Boolean = js.native
  var reset: js.Any = js.native
  /**
    * The video instance used by the texture internally
    */
  val video: HTMLVideoElement = js.native
  /* protected */ def _updateInternalTexture(): Unit = js.native
  /**
    * Event triggerd when a dom action is required by the user to play the video.
    * This happens due to recent changes in browser policies preventing video to auto start.
    */
  def onUserActionRequestedObservable: Observable[Texture] = js.native
  /**
    * Update Texture in the `auto` mode. Does not do anything if `settings.autoUpdateTexture` is false.
    */
  def update(): Unit = js.native
  /**
    * Update Texture in `manual` mode. Does not do anything if not visible or paused.
    * @param isVisible Visibility state, detected by user using `scene.getActiveMeshes()` or othervise.
    */
  def updateTexture(isVisible: Boolean): Unit = js.native
}

