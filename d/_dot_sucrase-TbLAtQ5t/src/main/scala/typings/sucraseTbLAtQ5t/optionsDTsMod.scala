package typings.sucraseTbLAtQ5t

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/Options.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateOptions(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
      * Opts out ES syntax transformations, like optional chaining, nullish coalescing, numeric
      * separators, etc.
      */
    var disableESTransforms: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, replicate the import behavior Babel 5 and babel-plugin-add-module-exports.
      */
    var enableLegacyBabel5ModuleInterop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, replicate the import behavior of TypeScript's esModuleInterop: false.
      */
    var enableLegacyTypeScriptModuleInterop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * File path to use in error messages, React display names, and source maps.
      */
    var filePath: js.UndefOr[String] = js.undefined
    
    /**
      * If specified, function name to use in place of React.Fragment when compiling JSX.
      */
    var jsxFragmentPragma: js.UndefOr[String] = js.undefined
    
    /**
      * If specified, function name to use in place of React.createClass when compiling JSX.
      */
    var jsxPragma: js.UndefOr[String] = js.undefined
    
    /**
      * If specified, omit any development-specific code in the output.
      */
    var production: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If specified, we also return a RawSourceMap object alongside the code. Currently, source maps
      * simply map each line to the original line without any mappings within lines, since Sucrase
      * preserves line numbers. filePath must be specified if this option is enabled.
      */
    var sourceMapOptions: js.UndefOr[SourceMapOptions] = js.undefined
    
    var transforms: js.Array[Transform]
  }
  object Options {
    
    inline def apply(transforms: js.Array[Transform]): Options = {
      val __obj = js.Dynamic.literal(transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDisableESTransforms(value: Boolean): Self = StObject.set(x, "disableESTransforms", value.asInstanceOf[js.Any])
      
      inline def setDisableESTransformsUndefined: Self = StObject.set(x, "disableESTransforms", js.undefined)
      
      inline def setEnableLegacyBabel5ModuleInterop(value: Boolean): Self = StObject.set(x, "enableLegacyBabel5ModuleInterop", value.asInstanceOf[js.Any])
      
      inline def setEnableLegacyBabel5ModuleInteropUndefined: Self = StObject.set(x, "enableLegacyBabel5ModuleInterop", js.undefined)
      
      inline def setEnableLegacyTypeScriptModuleInterop(value: Boolean): Self = StObject.set(x, "enableLegacyTypeScriptModuleInterop", value.asInstanceOf[js.Any])
      
      inline def setEnableLegacyTypeScriptModuleInteropUndefined: Self = StObject.set(x, "enableLegacyTypeScriptModuleInterop", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setJsxFragmentPragma(value: String): Self = StObject.set(x, "jsxFragmentPragma", value.asInstanceOf[js.Any])
      
      inline def setJsxFragmentPragmaUndefined: Self = StObject.set(x, "jsxFragmentPragma", js.undefined)
      
      inline def setJsxPragma(value: String): Self = StObject.set(x, "jsxPragma", value.asInstanceOf[js.Any])
      
      inline def setJsxPragmaUndefined: Self = StObject.set(x, "jsxPragma", js.undefined)
      
      inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      inline def setSourceMapOptions(value: SourceMapOptions): Self = StObject.set(x, "sourceMapOptions", value.asInstanceOf[js.Any])
      
      inline def setSourceMapOptionsUndefined: Self = StObject.set(x, "sourceMapOptions", js.undefined)
      
      inline def setTransforms(value: js.Array[Transform]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsVarargs(value: Transform*): Self = StObject.set(x, "transforms", js.Array(value*))
    }
  }
  
  trait SourceMapOptions extends StObject {
    
    /**
      * The name to use in the "file" field of the source map. This should be the name of the compiled
      * file.
      */
    var compiledFilename: String
  }
  object SourceMapOptions {
    
    inline def apply(compiledFilename: String): SourceMapOptions = {
      val __obj = js.Dynamic.literal(compiledFilename = compiledFilename.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapOptions]
    }
    
    extension [Self <: SourceMapOptions](x: Self) {
      
      inline def setCompiledFilename(value: String): Self = StObject.set(x, "compiledFilename", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.jsx
    - typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.typescript
    - typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.flow
    - typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.imports
    - typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.`react-hot-loader`
    - typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.jest
  */
  trait Transform extends StObject
  object Transform {
    
    inline def flow: typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.flow = "flow".asInstanceOf[typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.flow]
    
    inline def imports: typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.imports = "imports".asInstanceOf[typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.imports]
    
    inline def jest: typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.jest = "jest".asInstanceOf[typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.jest]
    
    inline def jsx: typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.jsx = "jsx".asInstanceOf[typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.jsx]
    
    inline def `react-hot-loader`: typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.`react-hot-loader` = "react-hot-loader".asInstanceOf[typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.`react-hot-loader`]
    
    inline def typescript: typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.typescript = "typescript".asInstanceOf[typings.sucraseTbLAtQ5t.sucraseTbLAtQ5tStrings.typescript]
  }
}
