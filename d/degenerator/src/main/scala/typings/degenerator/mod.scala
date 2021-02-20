package typings.degenerator

import typings.node.vmMod.Context
import typings.node.vmMod.RunningScriptOptions
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("degenerator", JSImport.Namespace)
  @js.native
  def apply(code: String, _names: DegeneratorNames): String = js.native
  @JSImport("degenerator", JSImport.Namespace)
  @js.native
  def apply(code: String, _names: DegeneratorNames, hasOutput: DegeneratorOptions): String = js.native
  
  @JSImport("degenerator", "compile")
  @js.native
  def compile[T /* <: js.Function */](code: String, returnName: String, names: DegeneratorNames): T = js.native
  @JSImport("degenerator", "compile")
  @js.native
  def compile[T /* <: js.Function */](code: String, returnName: String, names: DegeneratorNames, options: CompileOptions): T = js.native
  
  @JSImport("degenerator", "supportsAsync")
  @js.native
  val supportsAsync: Boolean = js.native
  
  @js.native
  trait CompileOptions
    extends RunningScriptOptions
       with DegeneratorOptions {
    
    var sandbox: js.UndefOr[Context] = js.native
  }
  object CompileOptions {
    
    @scala.inline
    def apply(): CompileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompileOptions]
    }
    
    @scala.inline
    implicit class CompileOptionsMutableBuilder[Self <: CompileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSandbox(value: Context): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    }
  }
  
  type DegeneratorName = String | RegExp
  
  type DegeneratorNames = js.Array[DegeneratorName]
  
  @js.native
  trait DegeneratorOptions extends StObject {
    
    var output: js.UndefOr[DegeneratorOutput] = js.native
  }
  object DegeneratorOptions {
    
    @scala.inline
    def apply(): DegeneratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DegeneratorOptions]
    }
    
    @scala.inline
    implicit class DegeneratorOptionsMutableBuilder[Self <: DegeneratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutput(value: DegeneratorOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.degenerator.degeneratorStrings.async
    - typings.degenerator.degeneratorStrings.generator
  */
  trait DegeneratorOutput extends StObject
  object DegeneratorOutput {
    
    @scala.inline
    def async: typings.degenerator.degeneratorStrings.async = "async".asInstanceOf[typings.degenerator.degeneratorStrings.async]
    
    @scala.inline
    def generator: typings.degenerator.degeneratorStrings.generator = "generator".asInstanceOf[typings.degenerator.degeneratorStrings.generator]
  }
}
