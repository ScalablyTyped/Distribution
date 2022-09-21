package typings.chromeLauncher

import org.scalablytyped.runtime.StringDictionary
import typings.chromeLauncher.anon.FnCall
import typings.chromeLauncher.anon.FnCallPathOptionsCallback
import typings.chromeLauncher.anon.Typeoffs
import typings.chromeLauncher.chromeLauncherStrings.error
import typings.chromeLauncher.chromeLauncherStrings.info
import typings.chromeLauncher.chromeLauncherStrings.silent
import typings.chromeLauncher.chromeLauncherStrings.verbose
import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcChromeLauncherMod {
  
  @JSImport("chrome-launcher/dist/src/chrome-launcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chrome-launcher/dist/src/chrome-launcher", JSImport.Default)
  @js.native
  open class default () extends Launcher {
    def this(opts: Options) = this()
    def this(opts: Unit, moduleOverrides: ModuleOverrides) = this()
    def this(opts: Options, moduleOverrides: ModuleOverrides) = this()
  }
  
  @JSImport("chrome-launcher/dist/src/chrome-launcher", "Launcher")
  @js.native
  open class Launcher () extends StObject {
    def this(opts: Options) = this()
    def this(opts: Unit, moduleOverrides: ModuleOverrides) = this()
    def this(opts: Options, moduleOverrides: ModuleOverrides) = this()
    
    var chrome: js.UndefOr[ChildProcess] = js.native
    
    /* private */ var chromeFlags: Any = js.native
    
    /* private */ var chromePath: Any = js.native
    
    /* private */ def cleanup(client: Any): Any = js.native
    
    /* private */ var connectionPollInterval: Any = js.native
    
    def defaultFlags(): js.Array[String] = js.native
    
    def destroyTmp(): js.Promise[js.Object] = js.native
    
    /* private */ var envVars: Any = js.native
    
    /* private */ var errFile: Any = js.native
    
    /* private */ val flags: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /* private */ var ignoreDefaultFlags: Any = js.native
    
    /* private */ def isDebuggerReady(): Any = js.native
    
    def kill(): js.Promise[js.Object] = js.native
    
    def launch(): js.Promise[Unit | js.Object] = js.native
    
    def makeTmpDir(): String = js.native
    
    /* private */ var maxConnectionRetries: Any = js.native
    
    /* private */ var opts: Any = js.native
    
    /* private */ var outFile: Any = js.native
    
    var pid: js.UndefOr[Double] = js.native
    
    /* private */ var pidFile: Any = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    def prepare(): Unit = js.native
    
    /* private */ var requestedPort: Any = js.native
    
    /* private */ var rimraf: Any = js.native
    
    /* private */ var spawn: Any = js.native
    
    /* private */ def spawnProcess(execPath: Any): Any = js.native
    
    /* private */ var startingUrl: Any = js.native
    
    /* private */ var tmpDirandPidFileReady: Any = js.native
    
    /* private */ var useDefaultProfile: Any = js.native
    
    var userDataDir: js.UndefOr[String] = js.native
    
    /* private */ def waitUntilReady(): Any = js.native
  }
  
  inline def launch(): js.Promise[LaunchedChrome] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")().asInstanceOf[js.Promise[LaunchedChrome]]
  inline def launch(opts: Options): js.Promise[LaunchedChrome] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LaunchedChrome]]
  
  trait LaunchedChrome extends StObject {
    
    def kill(): js.Promise[js.Object]
    
    var pid: Double
    
    var port: Double
    
    var process: ChildProcess
  }
  object LaunchedChrome {
    
    inline def apply(kill: () => js.Promise[js.Object], pid: Double, port: Double, process: ChildProcess): LaunchedChrome = {
      val __obj = js.Dynamic.literal(kill = js.Any.fromFunction0(kill), pid = pid.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchedChrome]
    }
    
    extension [Self <: LaunchedChrome](x: Self) {
      
      inline def setKill(value: () => js.Promise[js.Object]): Self = StObject.set(x, "kill", js.Any.fromFunction0(value))
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: ChildProcess): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleOverrides extends StObject {
    
    var fs: js.UndefOr[Typeoffs] = js.undefined
    
    var rimraf: js.UndefOr[FnCallPathOptionsCallback] = js.undefined
    
    var spawn: js.UndefOr[FnCall] = js.undefined
  }
  object ModuleOverrides {
    
    inline def apply(): ModuleOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModuleOverrides]
    }
    
    extension [Self <: ModuleOverrides](x: Self) {
      
      inline def setFs(value: Typeoffs): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setRimraf(value: FnCallPathOptionsCallback): Self = StObject.set(x, "rimraf", value.asInstanceOf[js.Any])
      
      inline def setRimrafUndefined: Self = StObject.set(x, "rimraf", js.undefined)
      
      inline def setSpawn(value: FnCall): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      inline def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var chromeFlags: js.UndefOr[js.Array[String]] = js.undefined
    
    var chromePath: js.UndefOr[String] = js.undefined
    
    var connectionPollInterval: js.UndefOr[Double] = js.undefined
    
    var envVars: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
    
    var handleSIGINT: js.UndefOr[Boolean] = js.undefined
    
    var ignoreDefaultFlags: js.UndefOr[Boolean] = js.undefined
    
    var logLevel: js.UndefOr[verbose | info | error | silent] = js.undefined
    
    var maxConnectionRetries: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var startingUrl: js.UndefOr[String] = js.undefined
    
    var userDataDir: js.UndefOr[String | Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChromeFlags(value: js.Array[String]): Self = StObject.set(x, "chromeFlags", value.asInstanceOf[js.Any])
      
      inline def setChromeFlagsUndefined: Self = StObject.set(x, "chromeFlags", js.undefined)
      
      inline def setChromeFlagsVarargs(value: String*): Self = StObject.set(x, "chromeFlags", js.Array(value*))
      
      inline def setChromePath(value: String): Self = StObject.set(x, "chromePath", value.asInstanceOf[js.Any])
      
      inline def setChromePathUndefined: Self = StObject.set(x, "chromePath", js.undefined)
      
      inline def setConnectionPollInterval(value: Double): Self = StObject.set(x, "connectionPollInterval", value.asInstanceOf[js.Any])
      
      inline def setConnectionPollIntervalUndefined: Self = StObject.set(x, "connectionPollInterval", js.undefined)
      
      inline def setEnvVars(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "envVars", value.asInstanceOf[js.Any])
      
      inline def setEnvVarsUndefined: Self = StObject.set(x, "envVars", js.undefined)
      
      inline def setHandleSIGINT(value: Boolean): Self = StObject.set(x, "handleSIGINT", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGINTUndefined: Self = StObject.set(x, "handleSIGINT", js.undefined)
      
      inline def setIgnoreDefaultFlags(value: Boolean): Self = StObject.set(x, "ignoreDefaultFlags", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDefaultFlagsUndefined: Self = StObject.set(x, "ignoreDefaultFlags", js.undefined)
      
      inline def setLogLevel(value: verbose | info | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMaxConnectionRetries(value: Double): Self = StObject.set(x, "maxConnectionRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionRetriesUndefined: Self = StObject.set(x, "maxConnectionRetries", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setStartingUrl(value: String): Self = StObject.set(x, "startingUrl", value.asInstanceOf[js.Any])
      
      inline def setStartingUrlUndefined: Self = StObject.set(x, "startingUrl", js.undefined)
      
      inline def setUserDataDir(value: String | Boolean): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
      
      inline def setUserDataDirUndefined: Self = StObject.set(x, "userDataDir", js.undefined)
    }
  }
}
