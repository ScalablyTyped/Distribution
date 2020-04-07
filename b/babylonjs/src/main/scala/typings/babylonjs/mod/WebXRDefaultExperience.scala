package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "WebXRDefaultExperience")
@js.native
class WebXRDefaultExperience protected ()
  extends typings.babylonjs.legacyMod.WebXRDefaultExperience

/* static members */
@JSImport("babylonjs", "WebXRDefaultExperience")
@js.native
object WebXRDefaultExperience extends js.Object {
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  def CreateAsync(scene: typings.babylonjs.sceneMod.Scene): js.Promise[typings.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
  def CreateAsync(
    scene: typings.babylonjs.sceneMod.Scene,
    options: typings.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperienceOptions
  ): js.Promise[typings.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
}

