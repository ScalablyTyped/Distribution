package typings.degenerator

import typings.node.vmMod.Context
import typings.node.vmMod.RunningScriptOptions
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Compiles sync JavaScript code into JavaScript with async Functions.
    *
    * @param {String} code JavaScript string to convert
    * @param {Array} names Array of function names to add `await` operators to
    * @return {String} Converted JavaScript string with async/await injected
    * @api public
    */
  inline def apply(code: String, _names: DegeneratorNames): String = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], _names.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(code: String, _names: DegeneratorNames, hasOutput: DegeneratorOptions): String = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], _names.asInstanceOf[js.Any], hasOutput.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("degenerator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile[T /* <: js.Function */](code: String, returnName: String, names: DegeneratorNames): T = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(code.asInstanceOf[js.Any], returnName.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def compile[T /* <: js.Function */](code: String, returnName: String, names: DegeneratorNames, options: CompileOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(code.asInstanceOf[js.Any], returnName.asInstanceOf[js.Any], names.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("degenerator", "supportsAsync")
  @js.native
  val supportsAsync: Boolean = js.native
  
  trait CompileOptions
    extends StObject
       with DegeneratorOptions
       with RunningScriptOptions {
    
    var sandbox: js.UndefOr[Context] = js.undefined
  }
  object CompileOptions {
    
    inline def apply(): CompileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompileOptions]
    }
    
    extension [Self <: CompileOptions](x: Self) {
      
      inline def setSandbox(value: Context): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    }
  }
  
  type DegeneratorName = String | RegExp
  
  type DegeneratorNames = js.Array[DegeneratorName]
  
  trait DegeneratorOptions extends StObject {
    
    var output: js.UndefOr[DegeneratorOutput] = js.undefined
  }
  object DegeneratorOptions {
    
    inline def apply(): DegeneratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DegeneratorOptions]
    }
    
    extension [Self <: DegeneratorOptions](x: Self) {
      
      inline def setOutput(value: DegeneratorOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.degenerator.degeneratorStrings.async
    - typings.degenerator.degeneratorStrings.generator
  */
  trait DegeneratorOutput extends StObject
  object DegeneratorOutput {
    
    inline def async: typings.degenerator.degeneratorStrings.async = "async".asInstanceOf[typings.degenerator.degeneratorStrings.async]
    
    inline def generator: typings.degenerator.degeneratorStrings.generator = "generator".asInstanceOf[typings.degenerator.degeneratorStrings.generator]
  }
}
