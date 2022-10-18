package typings.chromeLauncher

import typings.chromeLauncher.distChromeLauncherMod.LaunchedChrome
import typings.chromeLauncher.distChromeLauncherMod.ModuleOverrides
import typings.chromeLauncher.distChromeLauncherMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chrome-launcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chrome-launcher", JSImport.Default)
  @js.native
  open class default ()
    extends typings.chromeLauncher.distChromeLauncherMod.default {
    def this(opts: Options) = this()
    def this(opts: Unit, moduleOverrides: ModuleOverrides) = this()
    def this(opts: Options, moduleOverrides: ModuleOverrides) = this()
  }
  object default {
    
    @JSImport("chrome-launcher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def defaultFlags(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultFlags")().asInstanceOf[js.Array[String]]
    
    /** Returns the highest priority chrome installation. */
    /* static member */
    inline def getFirstInstallation(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstInstallation")().asInstanceOf[js.UndefOr[String]]
    
    /** Returns all available chrome installations in decreasing priority order. */
    /* static member */
    inline def getInstallations(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")().asInstanceOf[js.Array[String]]
  }
  
  /** Returns Chrome installation path that chrome-launcher will launch by default. */
  inline def getChromePath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getChromePath")().asInstanceOf[String]
  
  inline def killAll(): js.Array[js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("killAll")().asInstanceOf[js.Array[js.Error]]
  
  inline def launch(): js.Promise[LaunchedChrome] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")().asInstanceOf[js.Promise[LaunchedChrome]]
  inline def launch(opts: Options): js.Promise[LaunchedChrome] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LaunchedChrome]]
}
