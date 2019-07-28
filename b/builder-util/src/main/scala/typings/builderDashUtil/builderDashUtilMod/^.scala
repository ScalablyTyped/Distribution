package typings.builderDashUtil.builderDashUtilMod

import typings.builderDashUtil.builderDashUtilStrings.Empty
import typings.builderDashUtil.outLogMod.Logger
import typings.debug.debugMod.Debugger
import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.node.childUnderscoreProcessMod.ExecFileOptions
import typings.node.childUnderscoreProcessMod.SpawnOptions
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val debug: Debugger = js.native
  val debug7z: Debugger = js.native
  val log: Logger = js.native
  def addValue[K, T](map: Map[K, js.Array[T]], key: K, value: T): Unit = js.native
  def archFromString(name: String): typings.builderDashUtil.outArchMod.Arch = js.native
  def asArray[T](): js.Array[T] = js.native
  def asArray[T](v: T): js.Array[T] = js.native
  def asArray[T](v: js.Array[T]): js.Array[T] = js.native
  def copyFile(src: String, dest: String): js.Promise[_] = js.native
  def copyFile(src: String, dest: String, isEnsureDir: Boolean): js.Promise[_] = js.native
  def deepAssign[T](target: T, objects: js.Any*): T = js.native
  def doSpawn(command: String, args: js.Array[String]): ChildProcess = js.native
  def doSpawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  def doSpawn(command: String, args: js.Array[String], options: SpawnOptions, extraOptions: ExtraSpawnOptions): ChildProcess = js.native
  def exec(file: String): js.Promise[String] = js.native
  def exec(file: String, args: js.Array[String]): js.Promise[String] = js.native
  def exec(file: String, args: js.Array[String], options: ExecFileOptions): js.Promise[String] = js.native
  def exec(file: String, args: js.Array[String], options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
  def exec(file: String, args: Null, options: ExecFileOptions): js.Promise[String] = js.native
  def exec(file: String, args: Null, options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
  def executeAppBuilder(args: js.Array[String]): js.Promise[String] = js.native
  def executeAppBuilder(args: js.Array[String], childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit]): js.Promise[String] = js.native
  def executeAppBuilder(
    args: js.Array[String],
    childProcessConsumer: js.Function1[/* childProcess */ ChildProcess, Unit],
    extraOptions: ExecFileOptions
  ): js.Promise[String] = js.native
  def getArchCliNames(): js.Array[String] = js.native
  def getArchSuffix(arch: typings.builderDashUtil.outArchMod.Arch): String = js.native
  def getPlatformIconFileName(value: js.UndefOr[scala.Nothing], isMac: Boolean): js.UndefOr[String | Null] = js.native
  def getPlatformIconFileName(value: String, isMac: Boolean): js.UndefOr[String | Null] = js.native
  def getPlatformIconFileName(value: Null, isMac: Boolean): js.UndefOr[String | Null] = js.native
  def isEmptyOrSpaces(): Boolean = js.native
  def isEmptyOrSpaces(s: String): Boolean = js.native
  def isEnvTrue(): Boolean = js.native
  def isEnvTrue(value: String): Boolean = js.native
  def isPullRequest(): js.UndefOr[Boolean | Empty] = js.native
  def isTokenCharValid(token: String): Boolean = js.native
  def removePassword(input: String): String = js.native
  def replaceDefault(inList: js.UndefOr[scala.Nothing], defaultList: js.Array[String]): js.Array[String] = js.native
  def replaceDefault(inList: js.Array[String], defaultList: js.Array[String]): js.Array[String] = js.native
  def replaceDefault(inList: Null, defaultList: js.Array[String]): js.Array[String] = js.native
  def safeStringifyJson(data: js.Any): String = js.native
  def safeStringifyJson(data: js.Any, skippedNames: Set[String]): String = js.native
  def serializeToYaml(`object`: js.Object): String = js.native
  def serializeToYaml(`object`: js.Object, skipInvalid: Boolean): String = js.native
  def serializeToYaml(`object`: js.Object, skipInvalid: Boolean, noRefs: Boolean): String = js.native
  def spawn(command: String): js.Promise[_] = js.native
  def spawn(command: String, args: js.Array[String]): js.Promise[_] = js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptions): js.Promise[_] = js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptions, extraOptions: ExtraSpawnOptions): js.Promise[_] = js.native
  def spawn(command: String, args: Null, options: SpawnOptions): js.Promise[_] = js.native
  def spawn(command: String, args: Null, options: SpawnOptions, extraOptions: ExtraSpawnOptions): js.Promise[_] = js.native
  def spawnAndWrite(command: String, args: js.Array[String], data: String): js.Promise[_] = js.native
  def spawnAndWrite(command: String, args: js.Array[String], data: String, options: SpawnOptions): js.Promise[_] = js.native
  def toLinuxArchString(arch: typings.builderDashUtil.outArchMod.Arch): String = js.native
  def toLinuxArchString(arch: typings.builderDashUtil.outArchMod.Arch, isSnap: Boolean): String = js.native
  def use[T, R](value: T, task: js.Function1[/* it */ T, R]): R | Null = js.native
  def use[T, R](value: Null, task: js.Function1[/* it */ T, R]): R | Null = js.native
}

