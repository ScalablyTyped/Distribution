package typings.chromeLauncher.chromeLauncherMod

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chrome-launcher/dist/chrome-launcher", "Launcher")
@js.native
class Launcher () extends js.Object {
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
/* static members */
@JSImport("chrome-launcher/dist/chrome-launcher", "Launcher")
@js.native
object Launcher extends js.Object {
  
  def defaultFlags(): js.Array[String] = js.native
  
  /** Returns the highest priority chrome installation. */
  def getFirstInstallation(): js.UndefOr[String] = js.native
  
  /** Returns all available chrome installations in decreasing priority order. */
  def getInstallations(): js.Array[String] = js.native
}
