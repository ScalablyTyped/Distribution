package typings.chromeLauncher

import typings.chromeLauncher.chromeLauncherMod.LaunchedChrome
import typings.chromeLauncher.chromeLauncherMod.ModuleOverrides
import typings.chromeLauncher.chromeLauncherMod.Options
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chrome-launcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chrome-launcher", "Launcher")
  @js.native
  class Launcher ()
    extends typings.chromeLauncher.chromeLauncherMod.Launcher {
    def this(opts: Options) = this()
    def this(opts: Unit, moduleOverrides: ModuleOverrides) = this()
    def this(opts: Options, moduleOverrides: ModuleOverrides) = this()
  }
  object Launcher {
    
    @JSImport("chrome-launcher", "Launcher")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def defaultFlags(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultFlags")().asInstanceOf[js.Array[String]]
    
    /** Returns the highest priority chrome installation. */
    /* static member */
    @scala.inline
    def getFirstInstallation(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstInstallation")().asInstanceOf[js.UndefOr[String]]
    
    /** Returns all available chrome installations in decreasing priority order. */
    /* static member */
    @scala.inline
    def getInstallations(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")().asInstanceOf[js.Array[String]]
  }
  
  @scala.inline
  def killAll(): js.Promise[js.Array[Error]] = ^.asInstanceOf[js.Dynamic].applyDynamic("killAll")().asInstanceOf[js.Promise[js.Array[Error]]]
  
  @scala.inline
  def launch(): js.Promise[LaunchedChrome] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")().asInstanceOf[js.Promise[LaunchedChrome]]
  @scala.inline
  def launch(opts: Options): js.Promise[LaunchedChrome] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LaunchedChrome]]
}
