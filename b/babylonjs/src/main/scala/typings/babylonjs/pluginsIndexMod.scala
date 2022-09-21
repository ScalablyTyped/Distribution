package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsIndexMod {
  
  @JSImport("babylonjs/Loading/Plugins/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Loading/Plugins/index", "BabylonFileLoaderConfiguration")
  @js.native
  open class BabylonFileLoaderConfiguration ()
    extends typings.babylonjs.babylonFileLoaderMod.BabylonFileLoaderConfiguration
  /* static members */
  object BabylonFileLoaderConfiguration {
    
    @JSImport("babylonjs/Loading/Plugins/index", "BabylonFileLoaderConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The loader does not allow injecting custom physics engine into the plugins.
      * Unfortunately in ES6, we need to manually inject them into the plugin.
      * So you could set this variable to your engine import to make it work.
      */
    @JSImport("babylonjs/Loading/Plugins/index", "BabylonFileLoaderConfiguration.LoaderInjectedPhysicsEngine")
    @js.native
    def LoaderInjectedPhysicsEngine: Any = js.native
    inline def LoaderInjectedPhysicsEngine_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoaderInjectedPhysicsEngine")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Loading/Plugins/index", "_BabylonLoaderRegistered")
  @js.native
  def BabylonLoaderRegistered: Boolean = js.native
  
  inline def BabylonLoaderRegistered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BabylonLoaderRegistered")(x.asInstanceOf[js.Any])
}
