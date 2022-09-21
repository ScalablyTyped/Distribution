package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ErrorCodesType
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.LoadFileError")
@js.native
open class LoadFileError protected ()
  extends StObject
     with typings.babylonjs.BABYLON.LoadFileError {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param object defines the optional web request
    */
  def this(message: String) = this()
  def this(message: String, `object`: typings.babylonjs.BABYLON.WebRequest) = this()
  def this(message: String, `object`: File) = this()
  
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
