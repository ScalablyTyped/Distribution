package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "BabylonFileLoaderConfiguration")
@js.native
class BabylonFileLoaderConfiguration ()
  extends typings.babylonjs.loadingIndexMod.BabylonFileLoaderConfiguration
/* static members */
object BabylonFileLoaderConfiguration {
  
  @JSImport("babylonjs/index", "BabylonFileLoaderConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The loader does not allow injecting custom physix engine into the plugins.
    * Unfortunately in ES6, we need to manually inject them into the plugin.
    * So you could set this variable to your engine import to make it work.
    */
  @JSImport("babylonjs/index", "BabylonFileLoaderConfiguration.LoaderInjectedPhysicsEngine")
  @js.native
  def LoaderInjectedPhysicsEngine: js.Any = js.native
  @scala.inline
  def LoaderInjectedPhysicsEngine_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoaderInjectedPhysicsEngine")(x.asInstanceOf[js.Any])
}
