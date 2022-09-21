package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoTexture
  extends StObject
     with Texture {
  
  /* private */ var _createInternalTexture: Any = js.native
  
  /* private */ var _createInternalTextureOnEvent: Any = js.native
  
  /* private */ var _currentSrc: Any = js.native
  
  /* private */ var _displayingPosterTexture: Any = js.native
  
  /* private */ var _errorFound: Any = js.native
  
  /* private */ var _frameId: Any = js.native
  
  /* private */ var _generateMipMaps: Any = js.native
  
  /* private */ var _getName: Any = js.native
  
  /* private */ var _getVideo: Any = js.native
  
  /* private */ var _handlePlay: Any = js.native
  
  /* private */ var _onError: Any = js.native
  
  /* private */ var _onUserActionRequestedObservable: Any = js.native
  
  /* private */ var _processError: Any = js.native
  
  /* private */ var _reset: Any = js.native
  
  /* private */ var _settings: Any = js.native
  
  /* private */ var _stillImageCaptured: Any = js.native
  
  /* protected */ def _updateInternalTexture(): Unit = js.native
  
  /**
    * Tells whether textures will be updated automatically or user is required to call `updateTexture` manually
    */
  val autoUpdateTexture: Boolean = js.native
  
  /**
    * Event triggered when a dom action is required by the user to play the video.
    * This happens due to recent changes in browser policies preventing video to auto start.
    */
  def onUserActionRequestedObservable: Observable[Texture] = js.native
  
  /**
    * Update Texture in the `auto` mode. Does not do anything if `settings.autoUpdateTexture` is false.
    */
  def update(): Unit = js.native
  
  /**
    * Update Texture in `manual` mode. Does not do anything if not visible or paused.
    * @param isVisible Visibility state, detected by user using `scene.getActiveMeshes()` or otherwise.
    */
  def updateTexture(isVisible: Boolean): Unit = js.native
  
  /**
    * The video instance used by the texture internally
    */
  val video: HTMLVideoElement = js.native
}
