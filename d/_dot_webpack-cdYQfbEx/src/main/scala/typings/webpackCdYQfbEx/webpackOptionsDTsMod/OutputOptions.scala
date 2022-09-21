package typings.webpackCdYQfbEx.webpackOptionsDTsMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpackCdYQfbEx.anon.Amd
import typings.webpackCdYQfbEx.webpackCdYQfbExBooleans.`false`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`amd-require`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`commonjs-module`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`this`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`use-credentials`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`var`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.amd
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.anonymous
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.assign
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.commonjs
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.commonjs2
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.global
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.jsonp
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.module
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.self
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.system
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.textSlashjavascript
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.umd
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.umd2
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputOptions extends StObject {
  
  /**
  	 * Add a comment in the UMD wrapper.
  	 */
  var auxiliaryComment: js.UndefOr[String | Amd] = js.undefined
  
  /**
  	 * The callback function name used by webpack for loading of chunks in WebWorkers.
  	 */
  var chunkCallbackName: js.UndefOr[String] = js.undefined
  
  /**
  	 * The filename of non-entry chunks as relative path inside the `output.path` directory.
  	 */
  var chunkFilename: js.UndefOr[String] = js.undefined
  
  /**
  	 * Number of milliseconds before chunk request expires
  	 */
  var chunkLoadTimeout: js.UndefOr[Double] = js.undefined
  
  /**
  	 * This option enables cross-origin loading of chunks.
  	 */
  var crossOriginLoading: js.UndefOr[`false` | anonymous | `use-credentials`] = js.undefined
  
  /**
  	 * Similar to `output.devtoolModuleFilenameTemplate`, but used in the case of duplicate module identifiers.
  	 */
  var devtoolFallbackModuleFilenameTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  /**
  	 * Enable line to line mapped mode for all/specified modules. Line to line mapped mode uses a simple SourceMap where each line of the generated source is mapped to the same line of the original source. It’s a performance optimization. Only use it if your performance need to be better and you are sure that input lines match which generated lines.
  	 */
  var devtoolLineToLine: js.UndefOr[Boolean | StringDictionary[Any]] = js.undefined
  
  /**
  	 * Filename template string of function for the sources array in a generated SourceMap.
  	 */
  var devtoolModuleFilenameTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  /**
  	 * Module namespace to use when interpolating filename template string for the sources array in a generated SourceMap. Defaults to `output.library` if not set. It's useful for avoiding runtime collisions in sourcemaps from multiple webpack projects built as libraries.
  	 */
  var devtoolNamespace: js.UndefOr[String] = js.undefined
  
  /**
  	 * Specifies the name of each output file on disk. You must **not** specify an absolute path here! The `output.path` option determines the location on disk the files are written to, filename is used solely for naming the individual files.
  	 */
  var filename: js.UndefOr[String | js.Function] = js.undefined
  
  /**
  	 * Use the future version of asset emitting logic, which allows freeing memory of assets after emitting. It could break plugins which assume that assets are still readable after emitting. Will be the new default in the next major version.
  	 */
  var futureEmitAssets: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * An expression which is used to address the global object/scope in runtime code
  	 */
  var globalObject: js.UndefOr[String] = js.undefined
  
  /**
  	 * Digest type used for the hash
  	 */
  var hashDigest: js.UndefOr[String] = js.undefined
  
  /**
  	 * Number of chars which are used for the hash
  	 */
  var hashDigestLength: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Algorithm used for generation the hash (see node.js crypto package)
  	 */
  var hashFunction: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_createHash.HashConstructor */ Any)
  ] = js.undefined
  
  /**
  	 * Any string which is added to the hash to salt it
  	 */
  var hashSalt: js.UndefOr[String] = js.undefined
  
  /**
  	 * The filename of the Hot Update Chunks. They are inside the output.path directory.
  	 */
  var hotUpdateChunkFilename: js.UndefOr[String] = js.undefined
  
  /**
  	 * The JSONP function used by webpack for async loading of hot update chunks.
  	 */
  var hotUpdateFunction: js.UndefOr[String] = js.undefined
  
  /**
  	 * The filename of the Hot Update Main File. It is inside the `output.path` directory.
  	 */
  var hotUpdateMainFilename: js.UndefOr[String | js.Function] = js.undefined
  
  /**
  	 * The JSONP function used by webpack for async loading of chunks.
  	 */
  var jsonpFunction: js.UndefOr[String] = js.undefined
  
  /**
  	 * This option enables loading async chunks via a custom script type, such as script type="module"
  	 */
  var jsonpScriptType: js.UndefOr[`false` | textSlashjavascript | module] = js.undefined
  
  /**
  	 * If set, export the bundle as library. `output.library` is the name.
  	 */
  var library: js.UndefOr[String | js.Array[String] | LibraryCustomUmdObject] = js.undefined
  
  /**
  	 * Specify which export should be exposed as library
  	 */
  var libraryExport: js.UndefOr[String | ArrayOfStringValues] = js.undefined
  
  /**
  	 * Type of library
  	 */
  var libraryTarget: js.UndefOr[
    `var` | assign | `this` | window | self | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
  ] = js.undefined
  
  /**
  	 * The output directory as **absolute path** (required).
  	 */
  var path: js.UndefOr[String] = js.undefined
  
  /**
  	 * Include comments with information about the modules.
  	 */
  var pathinfo: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The `publicPath` specifies the public URL address of the output files when referenced in a browser.
  	 */
  var publicPath: js.UndefOr[String | js.Function] = js.undefined
  
  /**
  	 * The filename of the SourceMaps for the JavaScript files. They are inside the `output.path` directory.
  	 */
  var sourceMapFilename: js.UndefOr[String] = js.undefined
  
  /**
  	 * Prefixes every line of the source in the bundle with this string.
  	 */
  var sourcePrefix: js.UndefOr[String] = js.undefined
  
  /**
  	 * Handles exceptions in module loading correctly at a performance cost.
  	 */
  var strictModuleExceptionHandling: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * If `output.libraryTarget` is set to umd and `output.library` is set, setting this to true will name the AMD module.
  	 */
  var umdNamedDefine: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * The filename of WebAssembly modules as relative path inside the `output.path` directory.
  	 */
  var webassemblyModuleFilename: js.UndefOr[String] = js.undefined
}
object OutputOptions {
  
  inline def apply(): OutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputOptions]
  }
  
  extension [Self <: OutputOptions](x: Self) {
    
    inline def setAuxiliaryComment(value: String | Amd): Self = StObject.set(x, "auxiliaryComment", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryCommentUndefined: Self = StObject.set(x, "auxiliaryComment", js.undefined)
    
    inline def setChunkCallbackName(value: String): Self = StObject.set(x, "chunkCallbackName", value.asInstanceOf[js.Any])
    
    inline def setChunkCallbackNameUndefined: Self = StObject.set(x, "chunkCallbackName", js.undefined)
    
    inline def setChunkFilename(value: String): Self = StObject.set(x, "chunkFilename", value.asInstanceOf[js.Any])
    
    inline def setChunkFilenameUndefined: Self = StObject.set(x, "chunkFilename", js.undefined)
    
    inline def setChunkLoadTimeout(value: Double): Self = StObject.set(x, "chunkLoadTimeout", value.asInstanceOf[js.Any])
    
    inline def setChunkLoadTimeoutUndefined: Self = StObject.set(x, "chunkLoadTimeout", js.undefined)
    
    inline def setCrossOriginLoading(value: `false` | anonymous | `use-credentials`): Self = StObject.set(x, "crossOriginLoading", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginLoadingUndefined: Self = StObject.set(x, "crossOriginLoading", js.undefined)
    
    inline def setDevtoolFallbackModuleFilenameTemplate(value: String | js.Function): Self = StObject.set(x, "devtoolFallbackModuleFilenameTemplate", value.asInstanceOf[js.Any])
    
    inline def setDevtoolFallbackModuleFilenameTemplateUndefined: Self = StObject.set(x, "devtoolFallbackModuleFilenameTemplate", js.undefined)
    
    inline def setDevtoolLineToLine(value: Boolean | StringDictionary[Any]): Self = StObject.set(x, "devtoolLineToLine", value.asInstanceOf[js.Any])
    
    inline def setDevtoolLineToLineUndefined: Self = StObject.set(x, "devtoolLineToLine", js.undefined)
    
    inline def setDevtoolModuleFilenameTemplate(value: String | js.Function): Self = StObject.set(x, "devtoolModuleFilenameTemplate", value.asInstanceOf[js.Any])
    
    inline def setDevtoolModuleFilenameTemplateUndefined: Self = StObject.set(x, "devtoolModuleFilenameTemplate", js.undefined)
    
    inline def setDevtoolNamespace(value: String): Self = StObject.set(x, "devtoolNamespace", value.asInstanceOf[js.Any])
    
    inline def setDevtoolNamespaceUndefined: Self = StObject.set(x, "devtoolNamespace", js.undefined)
    
    inline def setFilename(value: String | js.Function): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setFutureEmitAssets(value: Boolean): Self = StObject.set(x, "futureEmitAssets", value.asInstanceOf[js.Any])
    
    inline def setFutureEmitAssetsUndefined: Self = StObject.set(x, "futureEmitAssets", js.undefined)
    
    inline def setGlobalObject(value: String): Self = StObject.set(x, "globalObject", value.asInstanceOf[js.Any])
    
    inline def setGlobalObjectUndefined: Self = StObject.set(x, "globalObject", js.undefined)
    
    inline def setHashDigest(value: String): Self = StObject.set(x, "hashDigest", value.asInstanceOf[js.Any])
    
    inline def setHashDigestLength(value: Double): Self = StObject.set(x, "hashDigestLength", value.asInstanceOf[js.Any])
    
    inline def setHashDigestLengthUndefined: Self = StObject.set(x, "hashDigestLength", js.undefined)
    
    inline def setHashDigestUndefined: Self = StObject.set(x, "hashDigest", js.undefined)
    
    inline def setHashFunction(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_createHash.HashConstructor */ Any)
    ): Self = StObject.set(x, "hashFunction", value.asInstanceOf[js.Any])
    
    inline def setHashFunctionUndefined: Self = StObject.set(x, "hashFunction", js.undefined)
    
    inline def setHashSalt(value: String): Self = StObject.set(x, "hashSalt", value.asInstanceOf[js.Any])
    
    inline def setHashSaltUndefined: Self = StObject.set(x, "hashSalt", js.undefined)
    
    inline def setHotUpdateChunkFilename(value: String): Self = StObject.set(x, "hotUpdateChunkFilename", value.asInstanceOf[js.Any])
    
    inline def setHotUpdateChunkFilenameUndefined: Self = StObject.set(x, "hotUpdateChunkFilename", js.undefined)
    
    inline def setHotUpdateFunction(value: String): Self = StObject.set(x, "hotUpdateFunction", value.asInstanceOf[js.Any])
    
    inline def setHotUpdateFunctionUndefined: Self = StObject.set(x, "hotUpdateFunction", js.undefined)
    
    inline def setHotUpdateMainFilename(value: String | js.Function): Self = StObject.set(x, "hotUpdateMainFilename", value.asInstanceOf[js.Any])
    
    inline def setHotUpdateMainFilenameUndefined: Self = StObject.set(x, "hotUpdateMainFilename", js.undefined)
    
    inline def setJsonpFunction(value: String): Self = StObject.set(x, "jsonpFunction", value.asInstanceOf[js.Any])
    
    inline def setJsonpFunctionUndefined: Self = StObject.set(x, "jsonpFunction", js.undefined)
    
    inline def setJsonpScriptType(value: `false` | textSlashjavascript | module): Self = StObject.set(x, "jsonpScriptType", value.asInstanceOf[js.Any])
    
    inline def setJsonpScriptTypeUndefined: Self = StObject.set(x, "jsonpScriptType", js.undefined)
    
    inline def setLibrary(value: String | js.Array[String] | LibraryCustomUmdObject): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLibraryExport(value: String | ArrayOfStringValues): Self = StObject.set(x, "libraryExport", value.asInstanceOf[js.Any])
    
    inline def setLibraryExportUndefined: Self = StObject.set(x, "libraryExport", js.undefined)
    
    inline def setLibraryExportVarargs(value: String*): Self = StObject.set(x, "libraryExport", js.Array(value*))
    
    inline def setLibraryTarget(
      value: `var` | assign | `this` | window | self | global | commonjs | commonjs2 | `commonjs-module` | amd | `amd-require` | umd | umd2 | jsonp | system
    ): Self = StObject.set(x, "libraryTarget", value.asInstanceOf[js.Any])
    
    inline def setLibraryTargetUndefined: Self = StObject.set(x, "libraryTarget", js.undefined)
    
    inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    inline def setLibraryVarargs(value: String*): Self = StObject.set(x, "library", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathinfo(value: Boolean): Self = StObject.set(x, "pathinfo", value.asInstanceOf[js.Any])
    
    inline def setPathinfoUndefined: Self = StObject.set(x, "pathinfo", js.undefined)
    
    inline def setPublicPath(value: String | js.Function): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    
    inline def setSourceMapFilename(value: String): Self = StObject.set(x, "sourceMapFilename", value.asInstanceOf[js.Any])
    
    inline def setSourceMapFilenameUndefined: Self = StObject.set(x, "sourceMapFilename", js.undefined)
    
    inline def setSourcePrefix(value: String): Self = StObject.set(x, "sourcePrefix", value.asInstanceOf[js.Any])
    
    inline def setSourcePrefixUndefined: Self = StObject.set(x, "sourcePrefix", js.undefined)
    
    inline def setStrictModuleExceptionHandling(value: Boolean): Self = StObject.set(x, "strictModuleExceptionHandling", value.asInstanceOf[js.Any])
    
    inline def setStrictModuleExceptionHandlingUndefined: Self = StObject.set(x, "strictModuleExceptionHandling", js.undefined)
    
    inline def setUmdNamedDefine(value: Boolean): Self = StObject.set(x, "umdNamedDefine", value.asInstanceOf[js.Any])
    
    inline def setUmdNamedDefineUndefined: Self = StObject.set(x, "umdNamedDefine", js.undefined)
    
    inline def setWebassemblyModuleFilename(value: String): Self = StObject.set(x, "webassemblyModuleFilename", value.asInstanceOf[js.Any])
    
    inline def setWebassemblyModuleFilenameUndefined: Self = StObject.set(x, "webassemblyModuleFilename", js.undefined)
  }
}
