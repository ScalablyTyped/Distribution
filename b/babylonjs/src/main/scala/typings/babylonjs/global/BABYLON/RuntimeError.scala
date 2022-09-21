package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ErrorCodesType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RuntimeError")
@js.native
open class RuntimeError protected ()
  extends StObject
     with typings.babylonjs.BABYLON.RuntimeError {
  /**
    * Creates a new RuntimeError
    * @param message defines the message of the error
    * @param errorCode the error code
    * @param innerError the error that caused the outer error
    */
  def this(message: String, errorCode: ErrorCodesType) = this()
  def this(message: String, errorCode: ErrorCodesType, innerError: js.Error) = this()
  
  /**
    * The error code
    */
  /* CompleteClass */
  var errorCode: ErrorCodesType = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
