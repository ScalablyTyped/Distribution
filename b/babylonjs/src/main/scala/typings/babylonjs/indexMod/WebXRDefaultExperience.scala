package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRDefaultExperience")
@js.native
class WebXRDefaultExperience protected ()
  extends typings.babylonjs.xRIndexMod.WebXRDefaultExperience
/* static members */
object WebXRDefaultExperience {
  
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  @JSImport("babylonjs/index", "WebXRDefaultExperience.CreateAsync")
  @js.native
  def CreateAsync(scene: typings.babylonjs.sceneMod.Scene): js.Promise[typings.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
  @JSImport("babylonjs/index", "WebXRDefaultExperience.CreateAsync")
  @js.native
  def CreateAsync(
    scene: typings.babylonjs.sceneMod.Scene,
    options: typings.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperienceOptions
  ): js.Promise[typings.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
}
