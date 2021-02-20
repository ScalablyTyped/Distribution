package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRDefaultExperience")
@js.native
class WebXRDefaultExperience protected ()
  extends typings.babylonjs.BABYLON.WebXRDefaultExperience
/* static members */
object WebXRDefaultExperience {
  
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  @JSGlobal("BABYLON.WebXRDefaultExperience.CreateAsync")
  @js.native
  def CreateAsync(scene: typings.babylonjs.BABYLON.Scene): js.Promise[typings.babylonjs.BABYLON.WebXRDefaultExperience] = js.native
  @JSGlobal("BABYLON.WebXRDefaultExperience.CreateAsync")
  @js.native
  def CreateAsync(
    scene: typings.babylonjs.BABYLON.Scene,
    options: typings.babylonjs.BABYLON.WebXRDefaultExperienceOptions
  ): js.Promise[typings.babylonjs.BABYLON.WebXRDefaultExperience] = js.native
}
