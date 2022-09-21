package typings.webpackCdYQfbEx

import typings.webpackCdYQfbEx.anon.Include
import typings.webpackCdYQfbEx.webpackCdYQfbExBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMapDevToolPluginDTsMod {
  
  type Rule = js.RegExp | String
  
  type Rules = js.Array[Rule] | Rule
  
  trait SourceMapDevToolPluginOptions extends StObject {
    
    /**
    	 * Appends the given value to the original asset. Usually the #sourceMappingURL comment. [url] is replaced with a URL to the source map file. false disables the appending
    	 */
    var append: js.UndefOr[`false` | Null | String] = js.undefined
    
    /**
    	 * Indicates whether column mappings should be used (defaults to true)
    	 */
    var columns: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Exclude modules that match the given value from source map generation
    	 */
    var exclude: js.UndefOr[Rules] = js.undefined
    
    /**
    	 * Generator string or function to create identifiers of modules for the 'sources' array in the SourceMap used only if 'moduleFilenameTemplate' would result in a conflict
    	 */
    var fallbackModuleFilenameTemplate: js.UndefOr[js.Function | String] = js.undefined
    
    /**
    	 * Path prefix to which the [file] placeholder is relative to
    	 */
    var fileContext: js.UndefOr[String] = js.undefined
    
    /**
    	 * Defines the output filename of the SourceMap (will be inlined if no value is provided)
    	 */
    var filename: js.UndefOr[`false` | Null | String] = js.undefined
    
    /**
    	 * Include source maps for module paths that match the given value
    	 */
    var include: js.UndefOr[Rules] = js.undefined
    
    /**
    	 * (deprecated) try to map original files line to line to generated files
    	 */
    var lineToLine: js.UndefOr[Boolean | Include] = js.undefined
    
    /**
    	 * Indicates whether SourceMaps from loaders should be used (defaults to true)
    	 */
    var module: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Generator string or function to create identifiers of modules for the 'sources' array in the SourceMap
    	 */
    var moduleFilenameTemplate: js.UndefOr[js.Function | String] = js.undefined
    
    /**
    	 * Namespace prefix to allow multiple webpack roots in the devtools
    	 */
    var namespace: js.UndefOr[String] = js.undefined
    
    /**
    	 * Omit the 'sourceContents' array from the SourceMap
    	 */
    var noSources: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * Provide a custom public path for the SourceMapping comment
    	 */
    var publicPath: js.UndefOr[String] = js.undefined
    
    /**
    	 * Provide a custom value for the 'sourceRoot' property in the SourceMap
    	 */
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    /**
    	 * Include source maps for modules based on their extension (defaults to .js and .css)
    	 */
    var test: js.UndefOr[Rules] = js.undefined
  }
  object SourceMapDevToolPluginOptions {
    
    inline def apply(): SourceMapDevToolPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceMapDevToolPluginOptions]
    }
    
    extension [Self <: SourceMapDevToolPluginOptions](x: Self) {
      
      inline def setAppend(value: `false` | String): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendNull: Self = StObject.set(x, "append", null)
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setColumns(value: Boolean): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setExclude(value: Rules): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: Rule*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setFallbackModuleFilenameTemplate(value: js.Function | String): Self = StObject.set(x, "fallbackModuleFilenameTemplate", value.asInstanceOf[js.Any])
      
      inline def setFallbackModuleFilenameTemplateUndefined: Self = StObject.set(x, "fallbackModuleFilenameTemplate", js.undefined)
      
      inline def setFileContext(value: String): Self = StObject.set(x, "fileContext", value.asInstanceOf[js.Any])
      
      inline def setFileContextUndefined: Self = StObject.set(x, "fileContext", js.undefined)
      
      inline def setFilename(value: `false` | String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setInclude(value: Rules): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: Rule*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setLineToLine(value: Boolean | Include): Self = StObject.set(x, "lineToLine", value.asInstanceOf[js.Any])
      
      inline def setLineToLineUndefined: Self = StObject.set(x, "lineToLine", js.undefined)
      
      inline def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleFilenameTemplate(value: js.Function | String): Self = StObject.set(x, "moduleFilenameTemplate", value.asInstanceOf[js.Any])
      
      inline def setModuleFilenameTemplateUndefined: Self = StObject.set(x, "moduleFilenameTemplate", js.undefined)
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setNoSources(value: Boolean): Self = StObject.set(x, "noSources", value.asInstanceOf[js.Any])
      
      inline def setNoSourcesUndefined: Self = StObject.set(x, "noSources", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setTest(value: Rules): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: Rule*): Self = StObject.set(x, "test", js.Array(value*))
    }
  }
}
