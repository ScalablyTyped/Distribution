package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ErrorCodesType
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ReadFileError")
@js.native
open class ReadFileError protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ReadFileError {
  /**
    * Creates a new ReadFileError
    * @param message defines the message of the error
    * @param file defines the optional file
    */
  def this(message: String, file: File) = this()
  
  /**
    * The error code
    */
  /* CompleteClass */
  var errorCode: ErrorCodesType = js.native
  
  /* CompleteClass */
  var file: File = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
