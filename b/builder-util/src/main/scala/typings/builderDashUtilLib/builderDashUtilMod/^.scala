package typings
package builderDashUtilLib.builderDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val debug: debugLib.debugMod.Debugger = js.native
  val debug7z: debugLib.debugMod.Debugger = js.native
  val log: builderDashUtilLib.outLogMod.Logger = js.native
  def addValue[K, T](map: stdLib.Map[K, js.Array[T]], key: K, value: T): scala.Unit = js.native
  def archFromString(name: java.lang.String): builderDashUtilLib.outArchMod.Arch = js.native
  def asArray[T](): js.Array[T] = js.native
  def asArray[T](v: T): js.Array[T] = js.native
  def asArray[T](v: js.Array[T]): js.Array[T] = js.native
  def copyFile(src: java.lang.String, dest: java.lang.String): js.Promise[_] = js.native
  def copyFile(src: java.lang.String, dest: java.lang.String, isEnsureDir: scala.Boolean): js.Promise[_] = js.native
  def deepAssign[T](target: T, objects: js.Any*): T = js.native
  def doSpawn(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def doSpawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def doSpawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions,
    extraOptions: ExtraSpawnOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(file: java.lang.String): js.Promise[java.lang.String] = js.native
  def exec(file: java.lang.String, args: js.Array[java.lang.String]): js.Promise[java.lang.String] = js.native
  def exec(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): js.Promise[java.lang.String] = js.native
  def exec(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    isLogOutIfDebug: scala.Boolean
  ): js.Promise[java.lang.String] = js.native
  def exec(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): js.Promise[java.lang.String] = js.native
  def exec(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    isLogOutIfDebug: scala.Boolean
  ): js.Promise[java.lang.String] = js.native
  def executeAppBuilder(args: js.Array[java.lang.String]): js.Promise[java.lang.String] = js.native
  def executeAppBuilder(
    args: js.Array[java.lang.String],
    childProcessConsumer: js.Function1[/* childProcess */ nodeLib.childUnderscoreProcessMod.ChildProcess, scala.Unit]
  ): js.Promise[java.lang.String] = js.native
  def executeAppBuilder(
    args: js.Array[java.lang.String],
    childProcessConsumer: js.Function1[/* childProcess */ nodeLib.childUnderscoreProcessMod.ChildProcess, scala.Unit],
    extraOptions: nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): js.Promise[java.lang.String] = js.native
  def getArchCliNames(): js.Array[java.lang.String] = js.native
  def getArchSuffix(arch: builderDashUtilLib.outArchMod.Arch): java.lang.String = js.native
  def getPlatformIconFileName(value: java.lang.String, isMac: scala.Boolean): js.UndefOr[java.lang.String | scala.Null] = js.native
  def getPlatformIconFileName(value: js.UndefOr[scala.Nothing], isMac: scala.Boolean): js.UndefOr[java.lang.String | scala.Null] = js.native
  def getPlatformIconFileName(value: scala.Null, isMac: scala.Boolean): js.UndefOr[java.lang.String | scala.Null] = js.native
  def isEmptyOrSpaces(): scala.Boolean = js.native
  def isEmptyOrSpaces(s: java.lang.String): scala.Boolean = js.native
  def isEnvTrue(): scala.Boolean = js.native
  def isEnvTrue(value: java.lang.String): scala.Boolean = js.native
  def isPullRequest(): js.UndefOr[scala.Boolean | builderDashUtilLib.builderDashUtilLibStrings.Empty] = js.native
  def isTokenCharValid(token: java.lang.String): scala.Boolean = js.native
  def removePassword(input: java.lang.String): java.lang.String = js.native
  def replaceDefault(inList: js.Array[java.lang.String], defaultList: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def replaceDefault(inList: js.UndefOr[scala.Nothing], defaultList: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def replaceDefault(inList: scala.Null, defaultList: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def safeStringifyJson(data: js.Any): java.lang.String = js.native
  def safeStringifyJson(data: js.Any, skippedNames: stdLib.Set[java.lang.String]): java.lang.String = js.native
  def serializeToYaml(`object`: js.Object): java.lang.String = js.native
  def serializeToYaml(`object`: js.Object, skipInvalid: scala.Boolean): java.lang.String = js.native
  def serializeToYaml(`object`: js.Object, skipInvalid: scala.Boolean, noRefs: scala.Boolean): java.lang.String = js.native
  def spawn(command: java.lang.String): js.Promise[_] = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): js.Promise[_] = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions
  ): js.Promise[_] = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions,
    extraOptions: ExtraSpawnOptions
  ): js.Promise[_] = js.native
  def spawn(
    command: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions
  ): js.Promise[_] = js.native
  def spawn(
    command: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions,
    extraOptions: ExtraSpawnOptions
  ): js.Promise[_] = js.native
  def spawnAndWrite(command: java.lang.String, args: js.Array[java.lang.String], data: java.lang.String): js.Promise[_] = js.native
  def spawnAndWrite(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    data: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions
  ): js.Promise[_] = js.native
  def toLinuxArchString(arch: builderDashUtilLib.outArchMod.Arch): java.lang.String = js.native
  def use[T, R](value: T, task: js.Function1[/* it */ T, R]): R | scala.Null = js.native
  def use[T, R](value: scala.Null, task: js.Function1[/* it */ T, R]): R | scala.Null = js.native
}

