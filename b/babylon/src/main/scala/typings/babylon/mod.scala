package typings.babylon

import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.File_
import typings.babylon.babylonStrings.module
import typings.babylon.babylonStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("babylon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(code: String): File_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[File_]
  inline def parse(code: String, opts: BabylonOptions): File_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[File_]
  
  inline def parseExpression(input: String): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(input.asInstanceOf[js.Any]).asInstanceOf[Expression]
  inline def parseExpression(input: String, options: BabylonOptions): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  trait BabylonOptions extends StObject {
    
    /**
      * By default, import and export declarations can only appear at a program's top level.
      * Setting this option to true allows them anywhere where a statement is allowed.
      */
    var allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, a return statement at the top level raises an error. Set this to true to accept such code.
      */
    var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined
    
    var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array containing the plugins that you want to enable.
      */
    var plugins: js.UndefOr[js.Array[PluginName]] = js.undefined
    
    /**
      * Correlate output AST nodes with their source filename. Useful when
      * generating code and source maps from the ASTs of multiple input files.
      */
    var sourceFilename: js.UndefOr[String] = js.undefined
    
    /**
      * Indicate the mode the code should be parsed in. Can be either "script" or "module".
      */
    var sourceType: js.UndefOr[script | module] = js.undefined
  }
  object BabylonOptions {
    
    inline def apply(): BabylonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BabylonOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BabylonOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowImportExportEverywhere(value: Boolean): Self = StObject.set(x, "allowImportExportEverywhere", value.asInstanceOf[js.Any])
      
      inline def setAllowImportExportEverywhereUndefined: Self = StObject.set(x, "allowImportExportEverywhere", js.undefined)
      
      inline def setAllowReturnOutsideFunction(value: Boolean): Self = StObject.set(x, "allowReturnOutsideFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowReturnOutsideFunctionUndefined: Self = StObject.set(x, "allowReturnOutsideFunction", js.undefined)
      
      inline def setAllowSuperOutsideMethod(value: Boolean): Self = StObject.set(x, "allowSuperOutsideMethod", value.asInstanceOf[js.Any])
      
      inline def setAllowSuperOutsideMethodUndefined: Self = StObject.set(x, "allowSuperOutsideMethod", js.undefined)
      
      inline def setPlugins(value: js.Array[PluginName]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: PluginName*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
      
      inline def setSourceFilenameUndefined: Self = StObject.set(x, "sourceFilename", js.undefined)
      
      inline def setSourceType(value: script | module): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babylon.babylonStrings.estree
    - typings.babylon.babylonStrings.jsx
    - typings.babylon.babylonStrings.flow
    - typings.babylon.babylonStrings.typescript
    - typings.babylon.babylonStrings.classConstructorCall
    - typings.babylon.babylonStrings.doExpressions
    - typings.babylon.babylonStrings.objectRestSpread
    - typings.babylon.babylonStrings.decorators
    - typings.babylon.babylonStrings.classProperties
    - typings.babylon.babylonStrings.exportExtensions
    - typings.babylon.babylonStrings.asyncGenerators
    - typings.babylon.babylonStrings.functionBind
    - typings.babylon.babylonStrings.functionSent
    - typings.babylon.babylonStrings.dynamicImport
  */
  trait PluginName extends StObject
  object PluginName {
    
    inline def asyncGenerators: typings.babylon.babylonStrings.asyncGenerators = "asyncGenerators".asInstanceOf[typings.babylon.babylonStrings.asyncGenerators]
    
    inline def classConstructorCall: typings.babylon.babylonStrings.classConstructorCall = "classConstructorCall".asInstanceOf[typings.babylon.babylonStrings.classConstructorCall]
    
    inline def classProperties: typings.babylon.babylonStrings.classProperties = "classProperties".asInstanceOf[typings.babylon.babylonStrings.classProperties]
    
    inline def decorators: typings.babylon.babylonStrings.decorators = "decorators".asInstanceOf[typings.babylon.babylonStrings.decorators]
    
    inline def doExpressions: typings.babylon.babylonStrings.doExpressions = "doExpressions".asInstanceOf[typings.babylon.babylonStrings.doExpressions]
    
    inline def dynamicImport: typings.babylon.babylonStrings.dynamicImport = "dynamicImport".asInstanceOf[typings.babylon.babylonStrings.dynamicImport]
    
    inline def estree: typings.babylon.babylonStrings.estree = "estree".asInstanceOf[typings.babylon.babylonStrings.estree]
    
    inline def exportExtensions: typings.babylon.babylonStrings.exportExtensions = "exportExtensions".asInstanceOf[typings.babylon.babylonStrings.exportExtensions]
    
    inline def flow: typings.babylon.babylonStrings.flow = "flow".asInstanceOf[typings.babylon.babylonStrings.flow]
    
    inline def functionBind: typings.babylon.babylonStrings.functionBind = "functionBind".asInstanceOf[typings.babylon.babylonStrings.functionBind]
    
    inline def functionSent: typings.babylon.babylonStrings.functionSent = "functionSent".asInstanceOf[typings.babylon.babylonStrings.functionSent]
    
    inline def jsx: typings.babylon.babylonStrings.jsx = "jsx".asInstanceOf[typings.babylon.babylonStrings.jsx]
    
    inline def objectRestSpread: typings.babylon.babylonStrings.objectRestSpread = "objectRestSpread".asInstanceOf[typings.babylon.babylonStrings.objectRestSpread]
    
    inline def typescript: typings.babylon.babylonStrings.typescript = "typescript".asInstanceOf[typings.babylon.babylonStrings.typescript]
  }
}
