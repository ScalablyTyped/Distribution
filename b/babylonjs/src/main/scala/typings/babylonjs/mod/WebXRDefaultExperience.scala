package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRDefaultExperience")
@js.native
/* private */ open class WebXRDefaultExperience ()
  extends typings.babylonjs.legacyLegacyMod.WebXRDefaultExperience
/* static members */
object WebXRDefaultExperience {
  
  @JSImport("babylonjs", "WebXRDefaultExperience")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  inline def CreateAsync(scene: typings.babylonjs.sceneMod.Scene): js.Promise[typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience]]
  inline def CreateAsync(
    scene: typings.babylonjs.sceneMod.Scene,
    options: typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperienceOptions
  ): js.Promise[typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.xRWebXRDefaultExperienceMod.WebXRDefaultExperience]]
}
