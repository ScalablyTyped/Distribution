package typings.chaiDashFs.chaiDashFsMod._Global_.Chai

import typings.chai.Chai.NumericComparison
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion
  extends LanguageChains
     with NumericComparison
     with TypeComparison {
  // Basename
  def basename(): Assertion = js.native
  def basename(path: String): Assertion = js.native
  def basename(path: String, name: String): Assertion = js.native
  def basename(path: String, name: String, msg: String): Assertion = js.native
  // file().with.content(str)
  def content(data: js.Any): Assertion = js.native
  def content(data: js.Any, msg: String): Assertion = js.native
  // directory().with.contents([...])
  def contents(array: js.Array[_]): Assertion = js.native
  def contents(array: js.Array[_], msg: String): Assertion = js.native
  def directoryContent(path: String, array: js.Array[_]): Assertion = js.native
  def directoryContent(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def directoryDeepContent(path: String, array: js.Array[_]): Assertion = js.native
  def directoryDeepContent(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def directoryDeepEqual(path: String, otherPath: String): Assertion = js.native
  def directoryDeepEqual(path: String, otherPath: String, msg: String): Assertion = js.native
  def directoryDeepFiles(path: String, array: js.Array[_]): Assertion = js.native
  def directoryDeepFiles(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def directoryDeepSubDirs(path: String, array: js.Array[_]): Assertion = js.native
  def directoryDeepSubDirs(path: String, array: js.Array[_], msg: String): Assertion = js.native
  // directory().and.equal(otherPath)
  def directoryEqual(path: String, otherPath: String): Assertion = js.native
  def directoryEqual(path: String, otherPath: String, msg: String): Assertion = js.native
  def directoryFiles(path: String, array: js.Array[_]): Assertion = js.native
  def directoryFiles(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def directoryInclude(path: String, array: js.Array[_]): Assertion = js.native
  def directoryInclude(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def directoryIncludeFiles(path: String, array: js.Array[_]): Assertion = js.native
  def directoryIncludeFiles(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def directoryIncludeSubDirs(path: String, array: js.Array[_]): Assertion = js.native
  def directoryIncludeSubDirs(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def directorySubDirs(path: String, array: js.Array[_]): Assertion = js.native
  def directorySubDirs(path: String, array: js.Array[_], msg: String): Assertion = js.native
  // Dirname
  def dirname(name: String): Assertion = js.native
  def dirname(name: String, msg: String): Assertion = js.native
  // Еxtname
  def extname(path: String): Assertion = js.native
  def extname(path: String, name: String): Assertion = js.native
  def extname(path: String, name: String, msg: String): Assertion = js.native
  def fileContent(path: String, data: js.Any): Assertion = js.native
  def fileContent(path: String, data: js.Any, msg: String): Assertion = js.native
  // file().with.contents.that.match(/xyz/)
  def fileContentMatch(path: String, regExp: RegExp): Assertion = js.native
  def fileContentMatch(path: String, regExp: RegExp, msg: String): Assertion = js.native
  // file().and.equal(otherPath)
  def fileEqual(path: String, otherPath: String): Assertion = js.native
  def fileEqual(path: String, otherPath: String, msg: String): Assertion = js.native
  // directory().with.files([...])
  def files(array: js.Array[_]): Assertion = js.native
  def files(array: js.Array[_], msg: String): Assertion = js.native
  // Directory
  def isDirectory(path: String): Assertion = js.native
  def isDirectory(path: String, msg: String): Assertion = js.native
  // directory().and.empty
  def isEmptyDirectory(path: String): Assertion = js.native
  def isEmptyDirectory(path: String, msg: String): Assertion = js.native
  // file().and.empty
  def isEmptyFile(path: String): Assertion = js.native
  def isEmptyFile(path: String, msg: String): Assertion = js.native
  // file
  def isFile(path: String): Assertion = js.native
  def isFile(path: String, msg: String): Assertion = js.native
  // file().with.json
  def jsonFile(path: String): Assertion = js.native
  def jsonFile(path: String, msg: String): Assertion = js.native
  // file().using.json.schema(obj)
  def jsonSchemaFile(path: String, schema: js.Any): Assertion = js.native
  def jsonSchemaFile(path: String, schema: js.Any, msg: String): Assertion = js.native
  def notBasename(path: String, name: String): Assertion = js.native
  def notBasename(path: String, name: String, msg: String): Assertion = js.native
  def notDirectoryContent(path: String, array: js.Array[_]): Assertion = js.native
  def notDirectoryContent(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def notDirectoryDeepContent(path: String, array: js.Array[_]): Assertion = js.native
  def notDirectoryDeepContent(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def notDirectoryDeepEqual(path: String, otherPath: String): Assertion = js.native
  def notDirectoryDeepEqual(path: String, otherPath: String, msg: String): Assertion = js.native
  def notDirectoryDeepFiles(path: String, array: js.Array[_]): Assertion = js.native
  def notDirectoryDeepFiles(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def notDirectoryDeepSubDirs(path: String, array: js.Array[_]): Assertion = js.native
  def notDirectoryDeepSubDirs(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def notDirectoryEqual(path: String, otherPath: String): Assertion = js.native
  def notDirectoryEqual(path: String, otherPath: String, msg: String): Assertion = js.native
  def notDirectoryFiles(path: String, array: js.Array[_]): Assertion = js.native
  def notDirectoryFiles(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def notDirectoryInclude(path: String, array: js.Array[_]): Assertion = js.native
  def notDirectoryInclude(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def notDirectoryIncludeFiles(path: String, array: js.Array[_]): Assertion = js.native
  def notDirectoryIncludeFiles(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def notDirectoryIncludeSubDirs(path: String, array: js.Array[_]): Assertion = js.native
  def notDirectoryIncludeSubDirs(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def notDirectorySubDirs(path: String, array: js.Array[_]): Assertion = js.native
  def notDirectorySubDirs(path: String, array: js.Array[_], msg: String): Assertion = js.native
  def notDirname(path: String, name: String): Assertion = js.native
  def notDirname(path: String, name: String, msg: String): Assertion = js.native
  def notExtname(path: String, name: String): Assertion = js.native
  def notExtname(path: String, name: String, msg: String): Assertion = js.native
  def notFileContent(path: String, data: js.Any): Assertion = js.native
  def notFileContent(path: String, data: js.Any, msg: String): Assertion = js.native
  def notFileContentMatch(path: String, regExp: RegExp): Assertion = js.native
  def notFileContentMatch(path: String, regExp: RegExp, msg: String): Assertion = js.native
  def notFileEqual(path: String, otherPath: String): Assertion = js.native
  def notFileEqual(path: String, otherPath: String, msg: String): Assertion = js.native
  def notIsDirectory(path: String): Assertion = js.native
  def notIsDirectory(path: String, msg: String): Assertion = js.native
  def notIsEmptyDirectory(path: String): Assertion = js.native
  def notIsEmptyDirectory(path: String, msg: String): Assertion = js.native
  def notIsEmptyFile(path: String): Assertion = js.native
  def notIsEmptyFile(path: String, msg: String): Assertion = js.native
  def notIsFile(path: String): Assertion = js.native
  def notIsFile(path: String, msg: String): Assertion = js.native
  def notJsonFile(path: String): Assertion = js.native
  def notJsonFile(path: String, msg: String): Assertion = js.native
  def notJsonSchemaFile(path: String, schema: js.Any): Assertion = js.native
  def notJsonSchemaFile(path: String, schema: js.Any, msg: String): Assertion = js.native
  def notPathExists(path: String): Assertion = js.native
  def notPathExists(path: String, msg: String): Assertion = js.native
  // Path
  def pathExists(path: String): Assertion = js.native
  def pathExists(path: String, msg: String): Assertion = js.native
  def schema(obj: js.Object): Assertion = js.native
  // directory().with.subDirs([...])
  def subDirs(array: js.Array[_]): Assertion = js.native
  def subDirs(array: js.Array[_], msg: String): Assertion = js.native
}

