package typings.builderUtil

import typings.builderUtil.archMod.Arch
import typings.builderUtil.builderUtilStrings._empty
import typings.builderUtil.logMod.Logger
import typings.builderUtilRuntime.mod.CancellationToken
import typings.debug.mod.Debugger
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ExecFileOptions
import typings.node.childProcessMod.SpawnOptions
import typings.std.Error
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("builder-util", "Arch")
  @js.native
  object Arch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.builderUtil.archMod.Arch with Double] = js.native
    
    /* 3 */ val arm64: typings.builderUtil.archMod.Arch.arm64 with Double = js.native
    
    /* 2 */ val armv7l: typings.builderUtil.archMod.Arch.armv7l with Double = js.native
    
    /* 0 */ val ia32: typings.builderUtil.archMod.Arch.ia32 with Double = js.native
    
    /* 1 */ val x64: typings.builderUtil.archMod.Arch.x64 with Double = js.native
  }
  
  @JSImport("builder-util", "AsyncTaskManager")
  @js.native
  class AsyncTaskManager protected ()
    extends typings.builderUtil.asyncTaskManagerMod.AsyncTaskManager {
    def this(cancellationToken: CancellationToken) = this()
  }
  
  @JSImport("builder-util", "DebugLogger")
  @js.native
  class DebugLogger ()
    extends typings.builderUtil.debugLoggerMod.DebugLogger {
    def this(isEnabled: Boolean) = this()
  }
  
  @JSImport("builder-util", "ExecError")
  @js.native
  class ExecError protected () extends Error {
    def this(command: String, exitCode: Double, out: String, errorOut: String) = this()
    def this(command: String, exitCode: Double, out: String, errorOut: String, code: String) = this()
    
    var alreadyLogged: Boolean = js.native
    
    val exitCode: Double = js.native
  }
  
  @JSImport("builder-util", "InvalidConfigurationError")
  @js.native
  class InvalidConfigurationError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
  }
  
  @JSImport("builder-util", "TmpDir")
  @js.native
  class TmpDir ()
    extends typings.tempFile.mod.TmpDir {
    def this(debugName: String) = this()
  }
  
  @JSImport("builder-util", "addValue")
  @js.native
  def addValue[K, T](map: Map[K, js.Array[T]], key: K, value: T): Unit = js.native
  
  @JSImport("builder-util", "archFromString")
  @js.native
  def archFromString(name: String): Arch = js.native
  
  @JSImport("builder-util", "asArray")
  @js.native
  def asArray[T](): js.Array[T] = js.native
  @JSImport("builder-util", "asArray")
  @js.native
  def asArray[T](v: T): js.Array[T] = js.native
  @JSImport("builder-util", "asArray")
  @js.native
  def asArray[T](v: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("builder-util", "copyFile")
  @js.native
  def copyFile(src: String, dest: String): js.Promise[_] = js.native
  @JSImport("builder-util", "copyFile")
  @js.native
  def copyFile(src: String, dest: String, isEnsureDir: Boolean): js.Promise[_] = js.native
  
  @JSImport("builder-util", "debug")
  @js.native
  val debug: Debugger = js.native
  
  @JSImport("builder-util", "debug7z")
  @js.native
  val debug7z: Debugger = js.native
  
  @JSImport("builder-util", "deepAssign")
  @js.native
  def deepAssign[T](target: T, objects: js.Any*): T = js.native
  
  @JSImport("builder-util", "doSpawn")
  @js.native
  def doSpawn(command: String, args: js.Array[String]): ChildProcess = js.native
  @JSImport("builder-util", "doSpawn")
  @js.native
  def doSpawn(
    command: String,
    args: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    extraOptions: ExtraSpawnOptions
  ): ChildProcess = js.native
  @JSImport("builder-util", "doSpawn")
  @js.native
  def doSpawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  @JSImport("builder-util", "doSpawn")
  @js.native
  def doSpawn(command: String, args: js.Array[String], options: SpawnOptions, extraOptions: ExtraSpawnOptions): ChildProcess = js.native
  
  @JSImport("builder-util", "exec")
  @js.native
  def exec(file: String): js.Promise[String] = js.native
  @JSImport("builder-util", "exec")
  @js.native
  def exec(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    isLogOutIfDebug: Boolean
  ): js.Promise[String] = js.native
  @JSImport("builder-util", "exec")
  @js.native
  def exec(file: String, args: js.UndefOr[scala.Nothing], options: ExecFileOptions): js.Promise[String] = js.native
  @JSImport("builder-util", "exec")
  @js.native
  def exec(file: String, args: js.UndefOr[scala.Nothing], options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
  @JSImport("builder-util", "exec")
  @js.native
  def exec(file: String, args: js.Array[String]): js.Promise[String] = js.native
  @JSImport("builder-util", "exec")
  @js.native
  def exec(file: String, args: js.Array[String], options: js.UndefOr[scala.Nothing], isLogOutIfDebug: Boolean): js.Promise[String] = js.native
  @JSImport("builder-util", "exec")
  @js.native
  def exec(file: String, args: js.Array[String], options: ExecFileOptions): js.Promise[String] = js.native
  @JSImport("builder-util", "exec")
  @js.native
  def exec(file: String, args: js.Array[String], options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
  @JSImport("builder-util", "exec")
  @js.native
  def exec(file: String, args: Null, options: js.UndefOr[scala.Nothing], isLogOutIfDebug: Boolean): js.Promise[String] = js.native
  @JSImport("builder-util", "exec")
  @js.native
  def exec(file: String, args: Null, options: ExecFileOptions): js.Promise[String] = js.native
  @JSImport("builder-util", "exec")
  @js.native
  def exec(file: String, args: Null, options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
  
  @JSImport("builder-util", "executeAppBuilder")
  @js.native
  def executeAppBuilder(args: js.Array[String]): js.Promise[String] = js.native
  @JSImport("builder-util", "executeAppBuilder")
  @js.native
  def executeAppBuilder(
    args: js.Array[String],
    childProcessConsumer: js.UndefOr[scala.Nothing],
    extraOptions: js.UndefOr[scala.Nothing],
    maxRetries: Double
  ): js.Promise[String] = js.native
  @JSImport("builder-util", "executeAppBuilder")
  @js.native
  def executeAppBuilder(
    args: js.Array[String],
    childProcessConsumer: js.UndefOr[scala.Nothing],
    extraOptions: SpawnOptions
  ): js.Promise[String] = js.native
  @JSImport("builder-util", "executeAppBuilder")
  @js.native
  def executeAppBuilder(
    args: js.Array[String],
    childProcessConsumer: js.UndefOr[scala.Nothing],
    extraOptions: SpawnOptions,
    maxRetries: Double
  ): js.Promise[String] = js.native
  @JSImport("builder-util", "executeAppBuilder")
  @js.native
  def executeAppBuilder(args: js.Array[String], childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit]): js.Promise[String] = js.native
  @JSImport("builder-util", "executeAppBuilder")
  @js.native
  def executeAppBuilder(
    args: js.Array[String],
    childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit],
    extraOptions: js.UndefOr[scala.Nothing],
    maxRetries: Double
  ): js.Promise[String] = js.native
  @JSImport("builder-util", "executeAppBuilder")
  @js.native
  def executeAppBuilder(
    args: js.Array[String],
    childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit],
    extraOptions: SpawnOptions
  ): js.Promise[String] = js.native
  @JSImport("builder-util", "executeAppBuilder")
  @js.native
  def executeAppBuilder(
    args: js.Array[String],
    childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit],
    extraOptions: SpawnOptions,
    maxRetries: Double
  ): js.Promise[String] = js.native
  
  @JSImport("builder-util", "getArchCliNames")
  @js.native
  def getArchCliNames(): js.Array[String] = js.native
  
  @JSImport("builder-util", "getArchSuffix")
  @js.native
  def getArchSuffix(arch: Arch): String = js.native
  
  @JSImport("builder-util", "getPlatformIconFileName")
  @js.native
  def getPlatformIconFileName(value: js.UndefOr[scala.Nothing], isMac: Boolean): js.UndefOr[String | Null] = js.native
  @JSImport("builder-util", "getPlatformIconFileName")
  @js.native
  def getPlatformIconFileName(value: String, isMac: Boolean): js.UndefOr[String | Null] = js.native
  @JSImport("builder-util", "getPlatformIconFileName")
  @js.native
  def getPlatformIconFileName(value: Null, isMac: Boolean): js.UndefOr[String | Null] = js.native
  
  @JSImport("builder-util", "isEmptyOrSpaces")
  @js.native
  def isEmptyOrSpaces(): Boolean = js.native
  @JSImport("builder-util", "isEmptyOrSpaces")
  @js.native
  def isEmptyOrSpaces(s: String): Boolean = js.native
  
  @JSImport("builder-util", "isEnvTrue")
  @js.native
  def isEnvTrue(): Boolean = js.native
  @JSImport("builder-util", "isEnvTrue")
  @js.native
  def isEnvTrue(value: String): Boolean = js.native
  
  @JSImport("builder-util", "isPullRequest")
  @js.native
  def isPullRequest(): js.UndefOr[Boolean | _empty] = js.native
  
  @JSImport("builder-util", "isTokenCharValid")
  @js.native
  def isTokenCharValid(token: String): Boolean = js.native
  
  @JSImport("builder-util", "log")
  @js.native
  val log: Logger = js.native
  
  @JSImport("builder-util", "removePassword")
  @js.native
  def removePassword(input: String): String = js.native
  
  @JSImport("builder-util", "replaceDefault")
  @js.native
  def replaceDefault(inList: js.UndefOr[scala.Nothing], defaultList: js.Array[String]): js.Array[String] = js.native
  @JSImport("builder-util", "replaceDefault")
  @js.native
  def replaceDefault(inList: js.Array[String], defaultList: js.Array[String]): js.Array[String] = js.native
  @JSImport("builder-util", "replaceDefault")
  @js.native
  def replaceDefault(inList: Null, defaultList: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("builder-util", "safeStringifyJson")
  @js.native
  def safeStringifyJson(data: js.Any): String = js.native
  @JSImport("builder-util", "safeStringifyJson")
  @js.native
  def safeStringifyJson(data: js.Any, skippedNames: Set[String]): String = js.native
  
  @JSImport("builder-util", "serializeToYaml")
  @js.native
  def serializeToYaml(`object`: js.Any): String = js.native
  @JSImport("builder-util", "serializeToYaml")
  @js.native
  def serializeToYaml(`object`: js.Any, skipInvalid: js.UndefOr[scala.Nothing], noRefs: Boolean): String = js.native
  @JSImport("builder-util", "serializeToYaml")
  @js.native
  def serializeToYaml(`object`: js.Any, skipInvalid: Boolean): String = js.native
  @JSImport("builder-util", "serializeToYaml")
  @js.native
  def serializeToYaml(`object`: js.Any, skipInvalid: Boolean, noRefs: Boolean): String = js.native
  
  @JSImport("builder-util", "spawn")
  @js.native
  def spawn(command: String): js.Promise[_] = js.native
  @JSImport("builder-util", "spawn")
  @js.native
  def spawn(
    command: String,
    args: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    extraOptions: ExtraSpawnOptions
  ): js.Promise[_] = js.native
  @JSImport("builder-util", "spawn")
  @js.native
  def spawn(command: String, args: js.UndefOr[scala.Nothing], options: SpawnOptions): js.Promise[_] = js.native
  @JSImport("builder-util", "spawn")
  @js.native
  def spawn(
    command: String,
    args: js.UndefOr[scala.Nothing],
    options: SpawnOptions,
    extraOptions: ExtraSpawnOptions
  ): js.Promise[_] = js.native
  @JSImport("builder-util", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String]): js.Promise[_] = js.native
  @JSImport("builder-util", "spawn")
  @js.native
  def spawn(
    command: String,
    args: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    extraOptions: ExtraSpawnOptions
  ): js.Promise[_] = js.native
  @JSImport("builder-util", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptions): js.Promise[_] = js.native
  @JSImport("builder-util", "spawn")
  @js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptions, extraOptions: ExtraSpawnOptions): js.Promise[_] = js.native
  @JSImport("builder-util", "spawn")
  @js.native
  def spawn(command: String, args: Null, options: js.UndefOr[scala.Nothing], extraOptions: ExtraSpawnOptions): js.Promise[_] = js.native
  @JSImport("builder-util", "spawn")
  @js.native
  def spawn(command: String, args: Null, options: SpawnOptions): js.Promise[_] = js.native
  @JSImport("builder-util", "spawn")
  @js.native
  def spawn(command: String, args: Null, options: SpawnOptions, extraOptions: ExtraSpawnOptions): js.Promise[_] = js.native
  
  @JSImport("builder-util", "spawnAndWrite")
  @js.native
  def spawnAndWrite(command: String, args: js.Array[String], data: String): js.Promise[_] = js.native
  @JSImport("builder-util", "spawnAndWrite")
  @js.native
  def spawnAndWrite(command: String, args: js.Array[String], data: String, options: SpawnOptions): js.Promise[_] = js.native
  
  @JSImport("builder-util", "toLinuxArchString")
  @js.native
  def toLinuxArchString(arch: Arch, targetName: String): String = js.native
  
  @JSImport("builder-util", "use")
  @js.native
  def use[T, R](value: T, task: js.Function1[/* it */ T, R]): R | Null = js.native
  @JSImport("builder-util", "use")
  @js.native
  def use[T, R](value: Null, task: js.Function1[/* it */ T, R]): R | Null = js.native
  
  @js.native
  trait ExtraSpawnOptions extends StObject {
    
    var isPipeInput: js.UndefOr[Boolean] = js.native
  }
  object ExtraSpawnOptions {
    
    @scala.inline
    def apply(): ExtraSpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtraSpawnOptions]
    }
    
    @scala.inline
    implicit class ExtraSpawnOptionsMutableBuilder[Self <: ExtraSpawnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsPipeInput(value: Boolean): Self = StObject.set(x, "isPipeInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPipeInputUndefined: Self = StObject.set(x, "isPipeInput", js.undefined)
    }
  }
}
