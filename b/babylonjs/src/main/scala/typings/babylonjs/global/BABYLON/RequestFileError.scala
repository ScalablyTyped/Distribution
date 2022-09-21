package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ErrorCodesType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RequestFileError")
@js.native
open class RequestFileError protected ()
  extends StObject
     with typings.babylonjs.BABYLON.RequestFileError {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param request defines the optional web request
    */
  def this(message: String, request: typings.babylonjs.BABYLON.WebRequest) = this()
  
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
  
  /* CompleteClass */
  var request: typings.babylonjs.BABYLON.WebRequest = js.native
}
