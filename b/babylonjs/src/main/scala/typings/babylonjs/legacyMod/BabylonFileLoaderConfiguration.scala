package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BabylonFileLoaderConfiguration")
@js.native
class BabylonFileLoaderConfiguration ()
  extends typings.babylonjs.indexMod.BabylonFileLoaderConfiguration
/* static members */
@JSImport("babylonjs/Legacy/legacy", "BabylonFileLoaderConfiguration")
@js.native
object BabylonFileLoaderConfiguration extends js.Object {
  
  /**
    * The loader does not allow injecting custom physix engine into the plugins.
    * Unfortunately in ES6, we need to manually inject them into the plugin.
    * So you could set this variable to your engine import to make it work.
    */
  var LoaderInjectedPhysicsEngine: js.Any = js.native
}
