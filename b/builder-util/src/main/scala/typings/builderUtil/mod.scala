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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("builder-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("builder-util", "Arch")
  @js.native
  object Arch extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.builderUtil.archMod.Arch & Double] = js.native
    
    /* 3 */ val arm64: typings.builderUtil.archMod.Arch.arm64 & Double = js.native
    
    /* 2 */ val armv7l: typings.builderUtil.archMod.Arch.armv7l & Double = js.native
    
    /* 0 */ val ia32: typings.builderUtil.archMod.Arch.ia32 & Double = js.native
    
    /* 4 */ val universal: typings.builderUtil.archMod.Arch.universal & Double = js.native
    
    /* 1 */ val x64: typings.builderUtil.archMod.Arch.x64 & Double = js.native
  }
  
  @JSImport("builder-util", "AsyncTaskManager")
  @js.native
  open class AsyncTaskManager protected ()
    extends typings.builderUtil.asyncTaskManagerMod.AsyncTaskManager {
    def this(cancellationToken: CancellationToken) = this()
  }
  
  @JSImport("builder-util", "DebugLogger")
  @js.native
  open class DebugLogger ()
    extends typings.builderUtil.debugLoggerMod.DebugLogger {
    def this(isEnabled: Boolean) = this()
  }
  
  @JSImport("builder-util", "ExecError")
  @js.native
  open class ExecError protected ()
    extends StObject
       with Error {
    def this(command: String, exitCode: Double, out: String, errorOut: String) = this()
    def this(command: String, exitCode: Double, out: String, errorOut: String, code: String) = this()
    
    var alreadyLogged: Boolean = js.native
    
    val exitCode: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("builder-util", "InvalidConfigurationError")
  @js.native
  open class InvalidConfigurationError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("builder-util", "TmpDir")
  @js.native
  open class TmpDir ()
    extends typings.tempFile.mod.TmpDir {
    def this(debugName: String) = this()
  }
  
  inline def addValue[K, T](map: Map[K, js.Array[T]], key: K, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addValue")(map.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def archFromString(name: String): Arch = ^.asInstanceOf[js.Dynamic].applyDynamic("archFromString")(name.asInstanceOf[js.Any]).asInstanceOf[Arch]
  
  inline def asArray[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")().asInstanceOf[js.Array[T]]
  inline def asArray[T](v: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def asArray[T](v: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("asArray")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def copyFile(src: String, dest: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def copyFile(src: String, dest: String, isEnsureDir: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], isEnsureDir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  @JSImport("builder-util", "debug")
  @js.native
  val debug: Debugger = js.native
  
  @JSImport("builder-util", "debug7z")
  @js.native
  val debug7z: Debugger = js.native
  
  inline def deepAssign[T](target: T, objects: Any*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepAssign")(scala.List(target.asInstanceOf[js.Any]).`++`(objects.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
  
  inline def defaultArchFromString(): Arch = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultArchFromString")().asInstanceOf[Arch]
  inline def defaultArchFromString(name: String): Arch = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultArchFromString")(name.asInstanceOf[js.Any]).asInstanceOf[Arch]
  
  inline def doSpawn(command: String, args: js.Array[String]): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("doSpawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def doSpawn(command: String, args: js.Array[String], options: Unit, extraOptions: ExtraSpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("doSpawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def doSpawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("doSpawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def doSpawn(command: String, args: js.Array[String], options: SpawnOptions, extraOptions: ExtraSpawnOptions): ChildProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("doSpawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  inline def exec(file: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def exec(file: String, args: js.Array[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def exec(file: String, args: js.Array[String], options: Unit, isLogOutIfDebug: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isLogOutIfDebug.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def exec(file: String, args: js.Array[String], options: ExecFileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def exec(file: String, args: js.Array[String], options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isLogOutIfDebug.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def exec(file: String, args: Null, options: Unit, isLogOutIfDebug: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isLogOutIfDebug.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def exec(file: String, args: Null, options: ExecFileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def exec(file: String, args: Null, options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isLogOutIfDebug.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def exec(file: String, args: Unit, options: Unit, isLogOutIfDebug: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isLogOutIfDebug.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def exec(file: String, args: Unit, options: ExecFileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def exec(file: String, args: Unit, options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(file.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isLogOutIfDebug.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def executeAppBuilder(args: js.Array[String]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeAppBuilder")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def executeAppBuilder(args: js.Array[String], childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAppBuilder")(args.asInstanceOf[js.Any], childProcessConsumer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def executeAppBuilder(
    args: js.Array[String],
    childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit],
    extraOptions: Unit,
    maxRetries: Double
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAppBuilder")(args.asInstanceOf[js.Any], childProcessConsumer.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def executeAppBuilder(
    args: js.Array[String],
    childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit],
    extraOptions: SpawnOptions
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAppBuilder")(args.asInstanceOf[js.Any], childProcessConsumer.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def executeAppBuilder(
    args: js.Array[String],
    childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit],
    extraOptions: SpawnOptions,
    maxRetries: Double
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAppBuilder")(args.asInstanceOf[js.Any], childProcessConsumer.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def executeAppBuilder(args: js.Array[String], childProcessConsumer: Unit, extraOptions: Unit, maxRetries: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAppBuilder")(args.asInstanceOf[js.Any], childProcessConsumer.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def executeAppBuilder(args: js.Array[String], childProcessConsumer: Unit, extraOptions: SpawnOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAppBuilder")(args.asInstanceOf[js.Any], childProcessConsumer.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def executeAppBuilder(args: js.Array[String], childProcessConsumer: Unit, extraOptions: SpawnOptions, maxRetries: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAppBuilder")(args.asInstanceOf[js.Any], childProcessConsumer.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def exists(file: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def getArchCliNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getArchCliNames")().asInstanceOf[js.Array[String]]
  
  inline def getArchSuffix(arch: Arch): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getArchSuffix")(arch.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getArchSuffix(arch: Arch, defaultArch: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getArchSuffix")(arch.asInstanceOf[js.Any], defaultArch.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPlatformIconFileName(value: String, isMac: Boolean): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlatformIconFileName")(value.asInstanceOf[js.Any], isMac.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
  inline def getPlatformIconFileName(value: Null, isMac: Boolean): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlatformIconFileName")(value.asInstanceOf[js.Any], isMac.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
  inline def getPlatformIconFileName(value: Unit, isMac: Boolean): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlatformIconFileName")(value.asInstanceOf[js.Any], isMac.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
  
  inline def isEmptyOrSpaces(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyOrSpaces")().asInstanceOf[Boolean]
  inline def isEmptyOrSpaces(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyOrSpaces")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEnvTrue(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnvTrue")().asInstanceOf[Boolean]
  inline def isEnvTrue(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnvTrue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPullRequest(): js.UndefOr[Boolean | _empty] = ^.asInstanceOf[js.Dynamic].applyDynamic("isPullRequest")().asInstanceOf[js.UndefOr[Boolean | _empty]]
  
  inline def isTokenCharValid(token: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenCharValid")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("builder-util", "log")
  @js.native
  val log: Logger = js.native
  
  inline def removePassword(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removePassword")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def replaceDefault(inList: js.Array[String], defaultList: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceDefault")(inList.asInstanceOf[js.Any], defaultList.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def replaceDefault(inList: Null, defaultList: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceDefault")(inList.asInstanceOf[js.Any], defaultList.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def replaceDefault(inList: Unit, defaultList: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceDefault")(inList.asInstanceOf[js.Any], defaultList.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def retry[T](task: js.Function0[js.Promise[T]], retriesLeft: Double, interval: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(task.asInstanceOf[js.Any], retriesLeft.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def safeStringifyJson(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeStringifyJson")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def safeStringifyJson(data: Any, skippedNames: Set[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeStringifyJson")(data.asInstanceOf[js.Any], skippedNames.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serializeToYaml(`object`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeToYaml")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serializeToYaml(`object`: Any, skipInvalid: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeToYaml")(`object`.asInstanceOf[js.Any], skipInvalid.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def serializeToYaml(`object`: Any, skipInvalid: Boolean, noRefs: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeToYaml")(`object`.asInstanceOf[js.Any], skipInvalid.asInstanceOf[js.Any], noRefs.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def serializeToYaml(`object`: Any, skipInvalid: Unit, noRefs: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeToYaml")(`object`.asInstanceOf[js.Any], skipInvalid.asInstanceOf[js.Any], noRefs.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def spawn(command: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def spawn(command: String, args: js.Array[String]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def spawn(command: String, args: js.Array[String], options: Unit, extraOptions: ExtraSpawnOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def spawn(command: String, args: js.Array[String], options: SpawnOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def spawn(command: String, args: js.Array[String], options: SpawnOptions, extraOptions: ExtraSpawnOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def spawn(command: String, args: Null, options: Unit, extraOptions: ExtraSpawnOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def spawn(command: String, args: Null, options: SpawnOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def spawn(command: String, args: Null, options: SpawnOptions, extraOptions: ExtraSpawnOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def spawn(command: String, args: Unit, options: Unit, extraOptions: ExtraSpawnOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def spawn(command: String, args: Unit, options: SpawnOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def spawn(command: String, args: Unit, options: SpawnOptions, extraOptions: ExtraSpawnOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def spawnAndWrite(command: String, args: js.Array[String], data: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnAndWrite")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def spawnAndWrite(command: String, args: js.Array[String], data: String, options: SpawnOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnAndWrite")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def toLinuxArchString(arch: Arch, targetName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toLinuxArchString")(arch.asInstanceOf[js.Any], targetName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def use[T, R](value: T, task: js.Function1[/* value */ T, R]): R | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(value.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[R | Null]
  inline def use[T, R](value: Nullish, task: js.Function1[/* value */ T, R]): R | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(value.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[R | Null]
  
  trait ExtraSpawnOptions extends StObject {
    
    var isPipeInput: js.UndefOr[Boolean] = js.undefined
  }
  object ExtraSpawnOptions {
    
    inline def apply(): ExtraSpawnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtraSpawnOptions]
    }
    
    extension [Self <: ExtraSpawnOptions](x: Self) {
      
      inline def setIsPipeInput(value: Boolean): Self = StObject.set(x, "isPipeInput", value.asInstanceOf[js.Any])
      
      inline def setIsPipeInputUndefined: Self = StObject.set(x, "isPipeInput", js.undefined)
    }
  }
  
  type Nullish = js.UndefOr[Null]
}
