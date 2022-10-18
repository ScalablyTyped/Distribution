package typings.babylonjs.xRIndexMod

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRExperienceHelper")
@js.native
/**
  * Creates a WebXRExperienceHelper
  * @param _scene The scene the helper should be created in
  */
/* private */ open class WebXRExperienceHelper ()
  extends typings.babylonjs.xRWebXRExperienceHelperMod.WebXRExperienceHelper
/* static members */
object WebXRExperienceHelper {
  
  @JSImport("babylonjs/XR/index", "WebXRExperienceHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates the experience helper
    * @param scene the scene to attach the experience helper to
    * @returns a promise for the experience helper
    */
  inline def CreateAsync(scene: Scene): js.Promise[typings.babylonjs.xRWebXRExperienceHelperMod.WebXRExperienceHelper] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.babylonjs.xRWebXRExperienceHelperMod.WebXRExperienceHelper]]
}
