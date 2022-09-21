package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderCodeInliner extends StObject {
  
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
