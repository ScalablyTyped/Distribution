package typings.chaiFs

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chai.Chai.NumericComparison
import typings.chaiFs.mod.global.Chai.Assertion
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-fs", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  @js.native
  trait Object extends StObject {
    
    var should: Assertion = js.native
  }
  object Object {
    
    @scala.inline
    def apply(should: Assertion): Object = {
      val __obj = js.Dynamic.literal(should = should.asInstanceOf[js.Any])
      __obj.asInstanceOf[Object]
    }
    
    @scala.inline
    implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShould(value: Assertion): Self = StObject.set(x, "should", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
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
      
      @js.native
      trait Assertion
        extends LanguageChains
           with NumericComparison
           with TypeComparison {
        
        // Basename
        def basename(): Assertion = js.native
        def basename(path: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], msg: String): Assertion = js.native
        def basename(path: js.UndefOr[scala.Nothing], name: String): Assertion = js.native
        def basename(path: js.UndefOr[scala.Nothing], name: String, msg: String): Assertion = js.native
        def basename(path: String): Assertion = js.native
        def basename(path: String, name: js.UndefOr[scala.Nothing], msg: String): Assertion = js.native
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
        def extname(path: String, name: js.UndefOr[scala.Nothing], msg: String): Assertion = js.native
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
      
      @js.native
      trait Deep extends StObject {
        
        def contents(array: js.Array[_]): Assertion = js.native
        def contents(array: js.Array[_], msg: String): Assertion = js.native
        
        def files(array: js.Array[_]): Assertion = js.native
        def files(array: js.Array[_], msg: String): Assertion = js.native
        
        def subDirs(array: js.Array[_]): Assertion = js.native
        def subDirs(array: js.Array[_], msg: String): Assertion = js.native
      }
      
      @js.native
      trait Include extends StObject {
        
        def contents(array: js.Array[_]): Assertion = js.native
        def contents(array: js.Array[_], msg: String): Assertion = js.native
        
        def files(array: js.Array[_]): Assertion = js.native
        def files(array: js.Array[_], msg: String): Assertion = js.native
        
        def subDirs(array: js.Array[_]): Assertion = js.native
        def subDirs(array: js.Array[_], msg: String): Assertion = js.native
      }
      
      @js.native
      trait LanguageChains extends StObject {
        
        var json: Assertion = js.native
        
        var using: Assertion = js.native
      }
      object LanguageChains {
        
        @scala.inline
        def apply(json: Assertion, using: Assertion): LanguageChains = {
          val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any])
          __obj.asInstanceOf[LanguageChains]
        }
        
        @scala.inline
        implicit class LanguageChainsMutableBuilder[Self <: LanguageChains] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setJson(value: Assertion): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUsing(value: Assertion): Self = StObject.set(x, "using", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait TypeComparison extends StObject {
        
        def directory(): Assertion = js.native
        def directory(msg: String): Assertion = js.native
        
        def file(): Assertion = js.native
        def file(msg: String): Assertion = js.native
        
        def path(): Assertion = js.native
        def path(msg: String): Assertion = js.native
      }
    }
  }
}
