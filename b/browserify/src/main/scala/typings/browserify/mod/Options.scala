package typings.browserify.mod

import org.scalablytyped.runtime.StringDictionary
import typings.insertModuleGlobals.mod.VarsOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options pertaining to a Browserify instance.
  */
@js.native
trait Options extends CustomOptions {
  
  // sets the list of built-ins to use, which by default is set in lib/builtins.js in this distribution.
  var builtins: js.UndefOr[js.Array[String] | StringDictionary[String] | Boolean] = js.native
  
  // set if external modules should be bundled. Defaults to true.
  var bundleExternal: js.UndefOr[Boolean] = js.native
  
  // sets the algorithm used to parse out the common paths. Use false to turn this off, otherwise it uses the commondir module.
  var commondir: js.UndefOr[Boolean] = js.native
  
  // When true, add a source map inline to the end of the bundle. This makes debugging easier because you can see all the original files if you are in a modern enough browser.
  var debug: js.UndefOr[Boolean] = js.native
  
  // When true, scan all files for process, global, __filename, and __dirname, defining as necessary.
  // With this option npm modules are more likely to work but bundling takes longer. Default true.
  var detectGlobals: js.UndefOr[Boolean] = js.native
  
  // String, file object, or array of those types (they may be mixed) specifying entry file(s).
  var entries: js.UndefOr[InputFile | js.Array[InputFile]] = js.native
  
  // an array of optional extra extensions for the module lookup machinery to use when the extension has not been specified.
  // By default Browserify considers only .js and .json files in such cases.
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  // defaults to 'require' in expose mode but you can use another name.
  var externalRequireName: js.UndefOr[String] = js.native
  
  // disables converting module ids into numerical indexes. This is useful for preserving the original paths that a bundle was generated with.
  var fullPaths: js.UndefOr[Boolean] = js.native
  
  // will be passed to insert-module-globals as the opts.vars parameter.
  var insertGlobalVars: js.UndefOr[VarsOption] = js.native
  
  // When true, always insert process, global, __filename, and __dirname without analyzing the AST for faster builds but larger output bundles. Default false.
  var insertGlobals: js.UndefOr[Boolean] = js.native
  
  // an array which will skip all require() and global parsing for each file in the array.
  // Use this for giant libs like jquery or threejs that don't have any requires or node-style globals but take forever to parse.
  var noParse: js.UndefOr[js.Array[String]] = js.native
  
  // an array of directories that Browserify searches when looking for modules which are not referenced using relative path.
  // Can be absolute or relative to basedir. Equivalent of setting NODE_PATH environmental variable when calling Browserify command.
  var paths: js.UndefOr[js.Array[String]] = js.native
  
  // When a non-empty string, a standalone module is created with that name and a umd wrapper.
  // You can use namespaces in the standalone global export using a . in the string name as a separator, for example 'A.B.C'.
  // The global export will be sanitized and camel cased.
  var standalone: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuiltinsVarargs(value: String*): Self = this.set("builtins", js.Array(value :_*))
    
    @scala.inline
    def setBuiltins(value: js.Array[String] | StringDictionary[String] | Boolean): Self = this.set("builtins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltins: Self = this.set("builtins", js.undefined)
    
    @scala.inline
    def setBundleExternal(value: Boolean): Self = this.set("bundleExternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleExternal: Self = this.set("bundleExternal", js.undefined)
    
    @scala.inline
    def setCommondir(value: Boolean): Self = this.set("commondir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommondir: Self = this.set("commondir", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDetectGlobals(value: Boolean): Self = this.set("detectGlobals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectGlobals: Self = this.set("detectGlobals", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: InputFile*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: InputFile | js.Array[InputFile]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setExternalRequireName(value: String): Self = this.set("externalRequireName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalRequireName: Self = this.set("externalRequireName", js.undefined)
    
    @scala.inline
    def setFullPaths(value: Boolean): Self = this.set("fullPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullPaths: Self = this.set("fullPaths", js.undefined)
    
    @scala.inline
    def setInsertGlobalVars(value: VarsOption): Self = this.set("insertGlobalVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertGlobalVars: Self = this.set("insertGlobalVars", js.undefined)
    
    @scala.inline
    def setInsertGlobals(value: Boolean): Self = this.set("insertGlobals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertGlobals: Self = this.set("insertGlobals", js.undefined)
    
    @scala.inline
    def setNoParseVarargs(value: String*): Self = this.set("noParse", js.Array(value :_*))
    
    @scala.inline
    def setNoParse(value: js.Array[String]): Self = this.set("noParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoParse: Self = this.set("noParse", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setStandalone(value: String): Self = this.set("standalone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandalone: Self = this.set("standalone", js.undefined)
  }
}
