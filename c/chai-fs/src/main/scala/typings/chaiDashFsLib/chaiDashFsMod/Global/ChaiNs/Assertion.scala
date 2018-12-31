package typings
package chaiDashFsLib.chaiDashFsMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion
  extends LanguageChains
     with chaiLib.ChaiNs.NumericComparison
     with TypeComparison {
  // Basename
  def basename(): Assertion = js.native
  def basename(path: java.lang.String): Assertion = js.native
  def basename(path: java.lang.String, name: java.lang.String): Assertion = js.native
  def basename(path: java.lang.String, name: java.lang.String, msg: java.lang.String): Assertion = js.native
  // file().with.content(str)
  def content(data: js.Any): Assertion = js.native
  def content(data: js.Any, msg: java.lang.String): Assertion = js.native
  // directory().with.contents([...])
  def contents(array: js.Array[_]): Assertion = js.native
  def contents(array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def directoryContent(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def directoryContent(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def directoryDeepContent(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def directoryDeepContent(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def directoryDeepEqual(path: java.lang.String, otherPath: java.lang.String): Assertion = js.native
  def directoryDeepEqual(path: java.lang.String, otherPath: java.lang.String, msg: java.lang.String): Assertion = js.native
  def directoryDeepFiles(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def directoryDeepFiles(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def directoryDeepSubDirs(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def directoryDeepSubDirs(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  // directory().and.equal(otherPath)
  def directoryEqual(path: java.lang.String, otherPath: java.lang.String): Assertion = js.native
  def directoryEqual(path: java.lang.String, otherPath: java.lang.String, msg: java.lang.String): Assertion = js.native
  def directoryFiles(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def directoryFiles(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def directoryInclude(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def directoryInclude(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def directoryIncludeFiles(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def directoryIncludeFiles(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def directoryIncludeSubDirs(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def directoryIncludeSubDirs(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def directorySubDirs(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def directorySubDirs(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  // Dirname
  def dirname(name: java.lang.String): Assertion = js.native
  def dirname(name: java.lang.String, msg: java.lang.String): Assertion = js.native
  // Еxtname
  def extname(path: java.lang.String): Assertion = js.native
  def extname(path: java.lang.String, name: java.lang.String): Assertion = js.native
  def extname(path: java.lang.String, name: java.lang.String, msg: java.lang.String): Assertion = js.native
  def fileContent(path: java.lang.String, data: js.Any): Assertion = js.native
  def fileContent(path: java.lang.String, data: js.Any, msg: java.lang.String): Assertion = js.native
  // file().with.contents.that.match(/xyz/)
  def fileContentMatch(path: java.lang.String, regExp: stdLib.RegExp): Assertion = js.native
  def fileContentMatch(path: java.lang.String, regExp: stdLib.RegExp, msg: java.lang.String): Assertion = js.native
  // file().and.equal(otherPath)
  def fileEqual(path: java.lang.String, otherPath: java.lang.String): Assertion = js.native
  def fileEqual(path: java.lang.String, otherPath: java.lang.String, msg: java.lang.String): Assertion = js.native
  // directory().with.files([...])
  def files(array: js.Array[_]): Assertion = js.native
  def files(array: js.Array[_], msg: java.lang.String): Assertion = js.native
  // Directory
  def isDirectory(path: java.lang.String): Assertion = js.native
  def isDirectory(path: java.lang.String, msg: java.lang.String): Assertion = js.native
  // directory().and.empty
  def isEmptyDirectory(path: java.lang.String): Assertion = js.native
  def isEmptyDirectory(path: java.lang.String, msg: java.lang.String): Assertion = js.native
  // file().and.empty
  def isEmptyFile(path: java.lang.String): Assertion = js.native
  def isEmptyFile(path: java.lang.String, msg: java.lang.String): Assertion = js.native
  // file
  def isFile(path: java.lang.String): Assertion = js.native
  def isFile(path: java.lang.String, msg: java.lang.String): Assertion = js.native
  // file().with.json
  def jsonFile(path: java.lang.String): Assertion = js.native
  def jsonFile(path: java.lang.String, msg: java.lang.String): Assertion = js.native
  // file().using.json.schema(obj)
  def jsonSchemaFile(path: java.lang.String, schema: js.Any): Assertion = js.native
  def jsonSchemaFile(path: java.lang.String, schema: js.Any, msg: java.lang.String): Assertion = js.native
  def notBasename(path: java.lang.String, name: java.lang.String): Assertion = js.native
  def notBasename(path: java.lang.String, name: java.lang.String, msg: java.lang.String): Assertion = js.native
  def notDirectoryContent(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def notDirectoryContent(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def notDirectoryDeepContent(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def notDirectoryDeepContent(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def notDirectoryDeepEqual(path: java.lang.String, otherPath: java.lang.String): Assertion = js.native
  def notDirectoryDeepEqual(path: java.lang.String, otherPath: java.lang.String, msg: java.lang.String): Assertion = js.native
  def notDirectoryDeepFiles(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def notDirectoryDeepFiles(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def notDirectoryDeepSubDirs(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def notDirectoryDeepSubDirs(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def notDirectoryEqual(path: java.lang.String, otherPath: java.lang.String): Assertion = js.native
  def notDirectoryEqual(path: java.lang.String, otherPath: java.lang.String, msg: java.lang.String): Assertion = js.native
  def notDirectoryFiles(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def notDirectoryFiles(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def notDirectoryInclude(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def notDirectoryInclude(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def notDirectoryIncludeFiles(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def notDirectoryIncludeFiles(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def notDirectoryIncludeSubDirs(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def notDirectoryIncludeSubDirs(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def notDirectorySubDirs(path: java.lang.String, array: js.Array[_]): Assertion = js.native
  def notDirectorySubDirs(path: java.lang.String, array: js.Array[_], msg: java.lang.String): Assertion = js.native
  def notDirname(path: java.lang.String, name: java.lang.String): Assertion = js.native
  def notDirname(path: java.lang.String, name: java.lang.String, msg: java.lang.String): Assertion = js.native
  def notExtname(path: java.lang.String, name: java.lang.String): Assertion = js.native
  def notExtname(path: java.lang.String, name: java.lang.String, msg: java.lang.String): Assertion = js.native
  def notFileContent(path: java.lang.String, data: js.Any): Assertion = js.native
  def notFileContent(path: java.lang.String, data: js.Any, msg: java.lang.String): Assertion = js.native
  def notFileContentMatch(path: java.lang.String, regExp: stdLib.RegExp): Assertion = js.native
  def notFileContentMatch(path: java.lang.String, regExp: stdLib.RegExp, msg: java.lang.String): Assertion = js.native
  def notFileEqual(path: java.lang.String, otherPath: java.lang.String): Assertion = js.native
  def notFileEqual(path: java.lang.String, otherPath: java.lang.String, msg: java.lang.String): Assertion = js.native
  def notIsDirectory(path: java.lang.String): Assertion = js.native
  def notIsDirectory(path: java.lang.String, msg: java.lang.String): Assertion = js.native
  def notIsEmptyDirectory(path: java.lang.String): Assertion = js.native
  def notIsEmptyDirectory(path: java.lang.String, msg: java.lang.String): Assertion = js.native
  def notIsEmptyFile(path: java.lang.String): Assertion = js.native
  def notIsEmptyFile(path: java.lang.String, msg: java.lang.String): Assertion = js.native
  def notIsFile(path: java.lang.String): Assertion = js.native
  def notIsFile(path: java.lang.String, msg: java.lang.String): Assertion = js.native
  def notJsonFile(path: java.lang.String): Assertion = js.native
  def notJsonFile(path: java.lang.String, msg: java.lang.String): Assertion = js.native
  def notJsonSchemaFile(path: java.lang.String, schema: js.Any): Assertion = js.native
  def notJsonSchemaFile(path: java.lang.String, schema: js.Any, msg: java.lang.String): Assertion = js.native
  def notPathExists(path: java.lang.String): Assertion = js.native
  def notPathExists(path: java.lang.String, msg: java.lang.String): Assertion = js.native
  // Path
  def pathExists(path: java.lang.String): Assertion = js.native
  def pathExists(path: java.lang.String, msg: java.lang.String): Assertion = js.native
  def schema(obj: js.Object): Assertion = js.native
  // directory().with.subDirs([...])
  def subDirs(array: js.Array[_]): Assertion = js.native
  def subDirs(array: js.Array[_], msg: java.lang.String): Assertion = js.native
}

