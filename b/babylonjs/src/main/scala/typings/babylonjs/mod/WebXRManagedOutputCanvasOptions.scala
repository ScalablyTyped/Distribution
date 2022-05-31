package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRManagedOutputCanvasOptions")
@js.native
class WebXRManagedOutputCanvasOptions ()
  extends typings.babylonjs.legacyMod.WebXRManagedOutputCanvasOptions
/* static members */
object WebXRManagedOutputCanvasOptions {
  
  @JSImport("babylonjs", "WebXRManagedOutputCanvasOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the default values of the configuration object
    * @param engine defines the engine to use (can be null)
    * @returns default values of this configuration object
    */
  inline def GetDefaults(): typings.babylonjs.webXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefaults")().asInstanceOf[typings.babylonjs.webXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions]
  inline def GetDefaults(engine: typings.babylonjs.thinEngineMod.ThinEngine): typings.babylonjs.webXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDefaults")(engine.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.webXRManagedOutputCanvasMod.WebXRManagedOutputCanvasOptions]
}
