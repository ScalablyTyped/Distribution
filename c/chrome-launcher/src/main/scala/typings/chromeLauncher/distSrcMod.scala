package typings.chromeLauncher

import typings.chromeLauncher.distSrcChromeLauncherMod.LaunchedChrome
import typings.chromeLauncher.distSrcChromeLauncherMod.ModuleOverrides
import typings.chromeLauncher.distSrcChromeLauncherMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMod {
  
  @JSImport("chrome-launcher/dist/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chrome-launcher/dist/src", JSImport.Default)
  @js.native
  open class default ()
    extends typings.chromeLauncher.distSrcChromeLauncherMod.default {
    def this(opts: Options) = this()
    def this(opts: Unit, moduleOverrides: ModuleOverrides) = this()
    def this(opts: Options, moduleOverrides: ModuleOverrides) = this()
  }
  
  @JSImport("chrome-launcher/dist/src", "Launcher")
  @js.native
  open class Launcher ()
    extends typings.chromeLauncher.distSrcChromeLauncherMod.Launcher {
    def this(opts: Options) = this()
    def this(opts: Unit, moduleOverrides: ModuleOverrides) = this()
    def this(opts: Options, moduleOverrides: ModuleOverrides) = this()
  }
  
  inline def launch(): js.Promise[LaunchedChrome] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")().asInstanceOf[js.Promise[LaunchedChrome]]
  inline def launch(opts: Options): js.Promise[LaunchedChrome] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LaunchedChrome]]
}
