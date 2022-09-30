package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _draw: Any = js.native
  
  /* private */ var _drawCameraBackground: Any = js.native
  
  /* private */ var _drawCameraForegroundWithPostProcessing: Any = js.native
  
  /* private */ var _drawCameraForegroundWithoutPostProcessing: Any = js.native
  
  /* private */ var _drawCameraPredicate: Any = js.native
  
  /* private */ var _drawRenderTargetBackground: Any = js.native
  
  /* private */ var _drawRenderTargetForegroundWithPostProcessing: Any = js.native
  
  /* private */ var _drawRenderTargetForegroundWithoutPostProcessing: Any = js.native
  
  /* private */ var _drawRenderTargetPredicate: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
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
