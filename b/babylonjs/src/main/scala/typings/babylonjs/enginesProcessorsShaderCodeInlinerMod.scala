package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesProcessorsShaderCodeInlinerMod {
  
  @JSImport("babylonjs/Engines/Processors/shaderCodeInliner", "ShaderCodeInliner")
  @js.native
  open class ShaderCodeInliner protected () extends StObject {
    /**
      * Initializes the inliner
      * @param sourceCode shader code source to inline
      * @param numMaxIterations maximum number of iterations (used to detect recursive calls)
      */
    def this(sourceCode: String) = this()
    def this(sourceCode: String, numMaxIterations: Double) = this()
    
    /* private */ var _collectFunctions: Any = js.native
    
    /* private */ var _functionDescr: Any = js.native
    
    /* private */ var _numMaxIterations: Any = js.native
    
    /* private */ var _processInlining: Any = js.native
    
    /* private */ var _replaceFunctionCallsByCode: Any = js.native
    
    /* private */ var _replaceNames: Any = js.native
    
    /* private */ var _sourceCode: Any = js.native
    
    /** Gets the code after the inlining process */
    def code: String = js.native
    
    /** Gets or sets the debug mode */
    var debug: Boolean = js.native
    
    /** Gets or sets the token used to mark the functions to inline */
    var inlineToken: String = js.native
    
    /**
      * Start the processing of the shader code
      */
    def processCode(): Unit = js.native
  }
  /* static members */
  object ShaderCodeInliner {
    
    @JSImport("babylonjs/Engines/Processors/shaderCodeInliner", "ShaderCodeInliner._RegexpFindFunctionNameAndType")
    @js.native
    val _RegexpFindFunctionNameAndType: Any = js.native
  }
}
