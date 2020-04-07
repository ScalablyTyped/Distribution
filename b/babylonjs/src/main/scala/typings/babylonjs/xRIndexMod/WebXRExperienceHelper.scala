package typings.babylonjs.xRIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/XR/index", "WebXRExperienceHelper")
@js.native
/**
  * Creates a WebXRExperienceHelper
  * @param scene The scene the helper should be created in
  */
class WebXRExperienceHelper protected ()
  extends typings.babylonjs.webXRExperienceHelperMod.WebXRExperienceHelper

/* static members */
@JSImport("babylonjs/XR/index", "WebXRExperienceHelper")
@js.native
object WebXRExperienceHelper extends js.Object {
  /**
    * Creates the experience helper
    * @param scene the scene to attach the experience helper to
    * @returns a promise for the experience helper
    */
  def CreateAsync(scene: Scene): js.Promise[typings.babylonjs.webXRExperienceHelperMod.WebXRExperienceHelper] = js.native
}

