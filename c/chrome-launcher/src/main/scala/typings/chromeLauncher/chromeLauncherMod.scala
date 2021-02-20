package typings.chromeLauncher

import org.scalablytyped.runtime.StringDictionary
import typings.chromeLauncher.anon.FnCall
import typings.chromeLauncher.anon.Typeoffs
import typings.chromeLauncher.chromeLauncherStrings.error
import typings.chromeLauncher.chromeLauncherStrings.info
import typings.chromeLauncher.chromeLauncherStrings.silent
import typings.chromeLauncher.chromeLauncherStrings.verbose
import typings.node.childProcessMod.ChildProcess
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeLauncherMod {
  
  @JSImport("chrome-launcher/dist/chrome-launcher", JSImport.Default)
  @js.native
  class default () extends Launcher {
    def this(opts: Options) = this()
    def this(opts: js.UndefOr[scala.Nothing], moduleOverrides: ModuleOverrides) = this()
    def this(opts: Options, moduleOverrides: ModuleOverrides) = this()
  }
  object default {
    
    /* static member */
    @JSImport("chrome-launcher/dist/chrome-launcher", "default.defaultFlags")
    @js.native
    def defaultFlags(): js.Array[String] = js.native
    
    /** Returns the highest priority chrome installation. */
    /* static member */
    @JSImport("chrome-launcher/dist/chrome-launcher", "default.getFirstInstallation")
    @js.native
    def getFirstInstallation(): js.UndefOr[String] = js.native
    
    /** Returns all available chrome installations in decreasing priority order. */
    /* static member */
    @JSImport("chrome-launcher/dist/chrome-launcher", "default.getInstallations")
    @js.native
    def getInstallations(): js.Array[String] = js.native
  }
  
  @JSImport("chrome-launcher/dist/chrome-launcher", "Launcher")
  @js.native
  class Launcher () extends StObject {
    def this(opts: Options) = this()
    def this(opts: js.UndefOr[scala.Nothing], moduleOverrides: ModuleOverrides) = this()
    def this(opts: Options, moduleOverrides: ModuleOverrides) = this()
    
    var chrome: js.UndefOr[ChildProcess] = js.native
    
    var chromeFlags: js.Any = js.native
    
    var chromePath: js.Any = js.native
    
    var cleanup: js.Any = js.native
    
    var connectionPollInterval: js.Any = js.native
    
    def destroyTmp(): js.Promise[_] = js.native
    
    var envVars: js.Any = js.native
    
    var errFile: js.Any = js.native
    
    /* private */ def flags: js.Any = js.native
    
    var fs: js.Any = js.native
    
    var ignoreDefaultFlags: js.Any = js.native
    
    var isDebuggerReady: js.Any = js.native
    
    def kill(): js.Promise[js.Object] = js.native
    
    def launch(): js.Promise[Unit | js.Object] = js.native
    
    def makeTmpDir(): String = js.native
    
    var maxConnectionRetries: js.Any = js.native
    
    var opts: js.Any = js.native
    
    var outFile: js.Any = js.native
    
    var pid: js.UndefOr[Double] = js.native
    
    var pidFile: js.Any = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    def prepare(): Unit = js.native
    
    var requestedPort: js.Any = js.native
    
    var rimraf: js.Any = js.native
    
    var spawn: js.Any = js.native
    
    var spawnProcess: js.Any = js.native
    
    var startingUrl: js.Any = js.native
    
    var tmpDirandPidFileReady: js.Any = js.native
    
    var useDefaultProfile: js.Any = js.native
    
    var userDataDir: js.UndefOr[String] = js.native
    
    def waitUntilReady(): js.Promise[_] = js.native
  }
  object Launcher {
    
    /* static member */
    @JSImport("chrome-launcher/dist/chrome-launcher", "Launcher.defaultFlags")
    @js.native
    def defaultFlags(): js.Array[String] = js.native
    
    /** Returns the highest priority chrome installation. */
    /* static member */
    @JSImport("chrome-launcher/dist/chrome-launcher", "Launcher.getFirstInstallation")
    @js.native
    def getFirstInstallation(): js.UndefOr[String] = js.native
    
    /** Returns all available chrome installations in decreasing priority order. */
    /* static member */
    @JSImport("chrome-launcher/dist/chrome-launcher", "Launcher.getInstallations")
    @js.native
    def getInstallations(): js.Array[String] = js.native
  }
  
  @JSImport("chrome-launcher/dist/chrome-launcher", "killAll")
  @js.native
  def killAll(): js.Promise[js.Array[Error]] = js.native
  
  @JSImport("chrome-launcher/dist/chrome-launcher", "launch")
  @js.native
  def launch(): js.Promise[LaunchedChrome] = js.native
  @JSImport("chrome-launcher/dist/chrome-launcher", "launch")
  @js.native
  def launch(opts: Options): js.Promise[LaunchedChrome] = js.native
  
  @js.native
  trait LaunchedChrome extends StObject {
    
    def kill(): js.Promise[js.Object] = js.native
    
    var pid: Double = js.native
    
    var port: Double = js.native
    
    var process: ChildProcess = js.native
  }
  object LaunchedChrome {
    
    @scala.inline
    def apply(kill: () => js.Promise[js.Object], pid: Double, port: Double, process: ChildProcess): LaunchedChrome = {
      val __obj = js.Dynamic.literal(kill = js.Any.fromFunction0(kill), pid = pid.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchedChrome]
    }
    
    @scala.inline
    implicit class LaunchedChromeMutableBuilder[Self <: LaunchedChrome] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKill(value: () => js.Promise[js.Object]): Self = StObject.set(x, "kill", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcess(value: ChildProcess): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModuleOverrides extends StObject {
    
    var fs: js.UndefOr[Typeoffs] = js.native
    
    var rimraf: js.UndefOr[RimrafModule] = js.native
    
    var spawn: js.UndefOr[FnCall] = js.native
  }
  object ModuleOverrides {
    
    @scala.inline
    def apply(): ModuleOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModuleOverrides]
    }
    
    @scala.inline
    implicit class ModuleOverridesMutableBuilder[Self <: ModuleOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFs(value: Typeoffs): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setRimraf(value: (/* path */ String, /* callback */ js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "rimraf", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRimrafUndefined: Self = StObject.set(x, "rimraf", js.undefined)
      
      @scala.inline
      def setSpawn(value: FnCall): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var chromeFlags: js.UndefOr[js.Array[String]] = js.native
    
    var chromePath: js.UndefOr[String] = js.native
    
    var connectionPollInterval: js.UndefOr[Double] = js.native
    
    var envVars: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
    
    var handleSIGINT: js.UndefOr[Boolean] = js.native
    
    var ignoreDefaultFlags: js.UndefOr[Boolean] = js.native
    
    var logLevel: js.UndefOr[verbose | info | error | silent] = js.native
    
    var maxConnectionRetries: js.UndefOr[Double] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var startingUrl: js.UndefOr[String] = js.native
    
    var userDataDir: js.UndefOr[String | Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChromeFlags(value: js.Array[String]): Self = StObject.set(x, "chromeFlags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeFlagsUndefined: Self = StObject.set(x, "chromeFlags", js.undefined)
      
      @scala.inline
      def setChromeFlagsVarargs(value: String*): Self = StObject.set(x, "chromeFlags", js.Array(value :_*))
      
      @scala.inline
      def setChromePath(value: String): Self = StObject.set(x, "chromePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromePathUndefined: Self = StObject.set(x, "chromePath", js.undefined)
      
      @scala.inline
      def setConnectionPollInterval(value: Double): Self = StObject.set(x, "connectionPollInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionPollIntervalUndefined: Self = StObject.set(x, "connectionPollInterval", js.undefined)
      
      @scala.inline
      def setEnvVars(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "envVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvVarsUndefined: Self = StObject.set(x, "envVars", js.undefined)
      
      @scala.inline
      def setHandleSIGINT(value: Boolean): Self = StObject.set(x, "handleSIGINT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleSIGINTUndefined: Self = StObject.set(x, "handleSIGINT", js.undefined)
      
      @scala.inline
      def setIgnoreDefaultFlags(value: Boolean): Self = StObject.set(x, "ignoreDefaultFlags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDefaultFlagsUndefined: Self = StObject.set(x, "ignoreDefaultFlags", js.undefined)
      
      @scala.inline
      def setLogLevel(value: verbose | info | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setMaxConnectionRetries(value: Double): Self = StObject.set(x, "maxConnectionRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConnectionRetriesUndefined: Self = StObject.set(x, "maxConnectionRetries", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setStartingUrl(value: String): Self = StObject.set(x, "startingUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingUrlUndefined: Self = StObject.set(x, "startingUrl", js.undefined)
      
      @scala.inline
      def setUserDataDir(value: String | Boolean): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataDirUndefined: Self = StObject.set(x, "userDataDir", js.undefined)
    }
  }
  
  type RimrafModule = js.Function2[/* path */ String, /* callback */ js.Function1[/* error */ Error, Unit], Unit]
}
