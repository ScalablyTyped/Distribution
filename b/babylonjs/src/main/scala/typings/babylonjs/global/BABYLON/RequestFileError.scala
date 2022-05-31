package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RequestFileError")
@js.native
class RequestFileError protected ()
  extends StObject
     with typings.babylonjs.BABYLON.RequestFileError {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param request defines the optional web request
    */
  def this(message: String, request: typings.babylonjs.BABYLON.WebRequest) = this()
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var request: typings.babylonjs.BABYLON.WebRequest = js.native
}
