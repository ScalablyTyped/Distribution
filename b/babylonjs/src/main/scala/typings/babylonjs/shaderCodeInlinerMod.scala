package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderCodeInlinerMod {
  
  @JSImport("babylonjs/Engines/Processors/shaderCodeInliner", "ShaderCodeInliner")
  @js.native
  class ShaderCodeInliner protected () extends StObject {
    /**
      * Initializes the inliner
      * @param sourceCode shader code source to inline
      * @param numMaxIterations maximum number of iterations (used to detect recursive calls)
      */
    def this(sourceCode: String) = this()
    def this(sourceCode: String, numMaxIterations: Double) = this()
    
    /* private */ var _collectFunctions: js.Any = js.native
    
    /* private */ var _escapeRegExp: js.Any = js.native
    
    /* private */ var _extractBetweenMarkers: js.Any = js.native
    
    /* private */ var _findBackward: js.Any = js.native
    
    /* private */ var _functionDescr: js.Any = js.native
    
    /* private */ var _numMaxIterations: js.Any = js.native
    
    /* private */ var _processInlining: js.Any = js.native
    
    /* private */ var _removeComments: js.Any = js.native
    
    /* private */ var _replaceFunctionCallsByCode: js.Any = js.native
    
    /* private */ var _replaceNames: js.Any = js.native
    
    /* private */ var _skipWhitespaces: js.Any = js.native
    
    /* private */ var _sourceCode: js.Any = js.native
    
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
    val _RegexpFindFunctionNameAndType: js.Any = js.native
  }
}
