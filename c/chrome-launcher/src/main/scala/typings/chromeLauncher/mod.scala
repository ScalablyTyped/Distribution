package typings.chromeLauncher

import typings.chromeLauncher.chromeLauncherMod.LaunchedChrome
import typings.chromeLauncher.chromeLauncherMod.ModuleOverrides
import typings.chromeLauncher.chromeLauncherMod.Options
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chrome-launcher", "Launcher")
  @js.native
  class Launcher ()
    extends typings.chromeLauncher.chromeLauncherMod.Launcher {
    def this(opts: Options) = this()
    def this(opts: js.UndefOr[scala.Nothing], moduleOverrides: ModuleOverrides) = this()
    def this(opts: Options, moduleOverrides: ModuleOverrides) = this()
  }
  object Launcher {
    
    /* static member */
    @JSImport("chrome-launcher", "Launcher.defaultFlags")
    @js.native
    def defaultFlags(): js.Array[String] = js.native
    
    /** Returns the highest priority chrome installation. */
    /* static member */
    @JSImport("chrome-launcher", "Launcher.getFirstInstallation")
    @js.native
    def getFirstInstallation(): js.UndefOr[String] = js.native
    
    /** Returns all available chrome installations in decreasing priority order. */
    /* static member */
    @JSImport("chrome-launcher", "Launcher.getInstallations")
    @js.native
    def getInstallations(): js.Array[String] = js.native
  }
  
  @JSImport("chrome-launcher", "killAll")
  @js.native
  def killAll(): js.Promise[js.Array[Error]] = js.native
  
  @JSImport("chrome-launcher", "launch")
  @js.native
  def launch(): js.Promise[LaunchedChrome] = js.native
  @JSImport("chrome-launcher", "launch")
  @js.native
  def launch(opts: Options): js.Promise[LaunchedChrome] = js.native
}
