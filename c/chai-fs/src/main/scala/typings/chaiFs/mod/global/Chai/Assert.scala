package typings.chaiFs.mod.global.Chai

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assert extends js.Object {
  // Basename
  def basename(path: String, name: String): Unit = js.native
  def basename(path: String, name: String, msg: String): Unit = js.native
  // directory().with.contents([...])
  def contents(array: js.Array[_]): Unit = js.native
  def contents(array: js.Array[_], msg: String): Unit = js.native
  // Directory
  def directory(): Unit = js.native
  def directory(msg: String): Unit = js.native
  def directoryContent(path: String, array: js.Array[_]): Unit = js.native
  def directoryContent(path: String, array: js.Array[_], msg: String): Unit = js.native
  def directoryDeepContent(path: String, array: js.Array[_]): Unit = js.native
  def directoryDeepContent(path: String, array: js.Array[_], msg: String): Unit = js.native
  def directoryDeepEqual(path: String, otherPath: String): Unit = js.native
  def directoryDeepEqual(path: String, otherPath: String, msg: String): Unit = js.native
  def directoryDeepFiles(path: String, array: js.Array[_]): Unit = js.native
  def directoryDeepFiles(path: String, array: js.Array[_], msg: String): Unit = js.native
  def directoryDeepSubDirs(path: String, array: js.Array[_]): Unit = js.native
  def directoryDeepSubDirs(path: String, array: js.Array[_], msg: String): Unit = js.native
  // directory().and.equal(otherPath)
  def directoryEqual(path: String, otherPath: String): Unit = js.native
  def directoryEqual(path: String, otherPath: String, msg: String): Unit = js.native
  def directoryFiles(path: String, array: js.Array[_]): Unit = js.native
  def directoryFiles(path: String, array: js.Array[_], msg: String): Unit = js.native
  def directoryInclude(path: String, array: js.Array[_]): Unit = js.native
  def directoryInclude(path: String, array: js.Array[_], msg: String): Unit = js.native
  def directoryIncludeFiles(path: String, array: js.Array[_]): Unit = js.native
  def directoryIncludeFiles(path: String, array: js.Array[_], msg: String): Unit = js.native
  def directoryIncludeSubDirs(path: String, array: js.Array[_]): Unit = js.native
  def directoryIncludeSubDirs(path: String, array: js.Array[_], msg: String): Unit = js.native
  def directorySubDirs(path: String, array: js.Array[_]): Unit = js.native
  def directorySubDirs(path: String, array: js.Array[_], msg: String): Unit = js.native
  // Dirname
  def dirname(path: String): Unit = js.native
  def dirname(path: String, name: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
  def dirname(path: String, name: String): Unit = js.native
  def dirname(path: String, name: String, msg: String): Unit = js.native
  // Еxtname
  def extname(path: String, name: String): Unit = js.native
  def extname(path: String, name: String, msg: String): Unit = js.native
  // file
  def file(): Unit = js.native
  def file(msg: String): Unit = js.native
  // file().with.content(str)
  def fileContent(path: String, data: js.Any): Unit = js.native
  def fileContent(path: String, data: js.Any, msg: String): Unit = js.native
  // file().with.contents.that.match(/xyz/)
  def fileContentMatch(path: String, regExp: RegExp): Unit = js.native
  def fileContentMatch(path: String, regExp: RegExp, msg: String): Unit = js.native
  // file().and.equal(otherPath)
  def fileEqual(path: String, otherPath: String): Unit = js.native
  def fileEqual(path: String, otherPath: String, msg: String): Unit = js.native
  // directory().with.files([...])
  def files(array: js.Array[_]): Unit = js.native
  def files(array: js.Array[_], msg: String): Unit = js.native
  def isDirectory(path: String): Unit = js.native
  def isDirectory(path: String, msg: String): Unit = js.native
  // directory().and.empty
  def isEmptyDirectory(path: String): Unit = js.native
  def isEmptyDirectory(path: String, msg: String): Unit = js.native
  // file().and.empty
  def isEmptyFile(path: String): Unit = js.native
  def isEmptyFile(path: String, msg: String): Unit = js.native
  def isFile(path: String): Unit = js.native
  def isFile(path: String, msg: String): Unit = js.native
  // file().with.json
  def jsonFile(path: String): Unit = js.native
  def jsonFile(path: String, msg: String): Unit = js.native
  // file().using.json.schema(obj)
  def jsonSchemaFile(path: String, schema: js.Any): Unit = js.native
  def jsonSchemaFile(path: String, schema: js.Any, msg: String): Unit = js.native
  def notBasename(path: String, name: String): Unit = js.native
  def notBasename(path: String, name: String, msg: String): Unit = js.native
  def notDirectoryContent(path: String, array: js.Array[_]): Unit = js.native
  def notDirectoryContent(path: String, array: js.Array[_], msg: String): Unit = js.native
  def notDirectoryDeepContent(path: String, array: js.Array[_]): Unit = js.native
  def notDirectoryDeepContent(path: String, array: js.Array[_], msg: String): Unit = js.native
  def notDirectoryDeepEqual(path: String, otherPath: String): Unit = js.native
  def notDirectoryDeepEqual(path: String, otherPath: String, msg: String): Unit = js.native
  def notDirectoryDeepFiles(path: String, array: js.Array[_]): Unit = js.native
  def notDirectoryDeepFiles(path: String, array: js.Array[_], msg: String): Unit = js.native
  def notDirectoryDeepSubDirs(path: String, array: js.Array[_]): Unit = js.native
  def notDirectoryDeepSubDirs(path: String, array: js.Array[_], msg: String): Unit = js.native
  def notDirectoryEqual(path: String, otherPath: String): Unit = js.native
  def notDirectoryEqual(path: String, otherPath: String, msg: String): Unit = js.native
  def notDirectoryFiles(path: String, array: js.Array[_]): Unit = js.native
  def notDirectoryFiles(path: String, array: js.Array[_], msg: String): Unit = js.native
  def notDirectoryInclude(path: String, array: js.Array[_]): Unit = js.native
  def notDirectoryInclude(path: String, array: js.Array[_], msg: String): Unit = js.native
  def notDirectoryIncludeFiles(path: String, array: js.Array[_]): Unit = js.native
  def notDirectoryIncludeFiles(path: String, array: js.Array[_], msg: String): Unit = js.native
  def notDirectoryIncludeSubDirs(path: String, array: js.Array[_]): Unit = js.native
  def notDirectoryIncludeSubDirs(path: String, array: js.Array[_], msg: String): Unit = js.native
  def notDirectorySubDirs(path: String, array: js.Array[_]): Unit = js.native
  def notDirectorySubDirs(path: String, array: js.Array[_], msg: String): Unit = js.native
  def notDirname(path: String, name: String): Unit = js.native
  def notDirname(path: String, name: String, msg: String): Unit = js.native
  def notExtname(path: String, name: String): Unit = js.native
  def notExtname(path: String, name: String, msg: String): Unit = js.native
  def notFileContent(path: String, data: js.Any): Unit = js.native
  def notFileContent(path: String, data: js.Any, msg: String): Unit = js.native
  def notFileContentMatch(path: String, regExp: RegExp): Unit = js.native
  def notFileContentMatch(path: String, regExp: RegExp, msg: String): Unit = js.native
  def notFileEqual(path: String, otherPath: String): Unit = js.native
  def notFileEqual(path: String, otherPath: String, msg: String): Unit = js.native
  def notIsDirectory(path: String): Unit = js.native
  def notIsDirectory(path: String, msg: String): Unit = js.native
  def notIsEmptyDirectory(path: String): Unit = js.native
  def notIsEmptyDirectory(path: String, msg: String): Unit = js.native
  def notIsEmptyFile(path: String): Unit = js.native
  def notIsEmptyFile(path: String, msg: String): Unit = js.native
  def notIsFile(path: String): Unit = js.native
  def notIsFile(path: String, msg: String): Unit = js.native
  def notJsonFile(path: String): Unit = js.native
  def notJsonFile(path: String, msg: String): Unit = js.native
  def notJsonSchemaFile(path: String, schema: js.Any): Unit = js.native
  def notJsonSchemaFile(path: String, schema: js.Any, msg: String): Unit = js.native
  def notPathExists(path: String): Unit = js.native
  def notPathExists(path: String, msg: String): Unit = js.native
  // Path
  def path(): Unit = js.native
  def path(msg: String): Unit = js.native
  def pathExists(path: String): Unit = js.native
  def pathExists(path: String, msg: String): Unit = js.native
  def schema(obj: js.Object): Unit = js.native
  // directory().with.subDirs([...])
  def subDirs(array: js.Array[_]): Unit = js.native
  def subDirs(array: js.Array[_], msg: String): Unit = js.native
}

