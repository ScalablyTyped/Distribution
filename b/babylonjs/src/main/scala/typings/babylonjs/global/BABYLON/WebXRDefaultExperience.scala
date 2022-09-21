package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.WebXRRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRDefaultExperience")
@js.native
/* private */ open class WebXRDefaultExperience ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRDefaultExperience {
  
  /**
    * Base experience
    */
  /* CompleteClass */
  var baseExperience: typings.babylonjs.BABYLON.WebXRExperienceHelper = js.native
  
  /**
    * Disposes of the experience helper
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Enables ui for entering/exiting xr
    */
  /* CompleteClass */
  var enterExitUI: typings.babylonjs.BABYLON.WebXREnterExitUI = js.native
  
  /**
    * Input experience extension
    */
  /* CompleteClass */
  var input: typings.babylonjs.BABYLON.WebXRInput = js.native
  
  /**
    * Enables near interaction for hands/controllers
    */
  /* CompleteClass */
  var nearInteraction: typings.babylonjs.BABYLON.WebXRNearInteraction = js.native
  
  /**
    * Enables laser pointer and selection
    */
  /* CompleteClass */
  var pointerSelection: typings.babylonjs.BABYLON.WebXRControllerPointerSelection = js.native
  
  /**
    * Default target xr should render to
    */
  /* CompleteClass */
  var renderTarget: WebXRRenderTarget = js.native
  
  /**
    * Enables teleportation
    */
  /* CompleteClass */
  var teleportation: typings.babylonjs.BABYLON.WebXRMotionControllerTeleportation = js.native
}
/* static members */
object WebXRDefaultExperience {
  
  @JSGlobal("BABYLON.WebXRDefaultExperience")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  inline def CreateAsync(scene: typings.babylonjs.BABYLON.Scene): js.Promise[typings.babylonjs.BABYLON.WebXRDefaultExperience] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.WebXRDefaultExperience]]
  inline def CreateAsync(
    scene: typings.babylonjs.BABYLON.Scene,
    options: typings.babylonjs.BABYLON.WebXRDefaultExperienceOptions
  ): js.Promise[typings.babylonjs.BABYLON.WebXRDefaultExperience] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.WebXRDefaultExperience]]
}
