package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShaderCodeInliner")
@js.native
class ShaderCodeInliner protected ()
  extends typings.babylonjs.BABYLON.ShaderCodeInliner {
  /**
    * Initializes the inliner
    * @param sourceCode shader code source to inline
    * @param numMaxIterations maximum number of iterations (used to detect recursive calls)
    */
  def this(sourceCode: String) = this()
  def this(sourceCode: String, numMaxIterations: Double) = this()
}
/* static members */
@JSGlobal("BABYLON.ShaderCodeInliner")
@js.native
object ShaderCodeInliner extends js.Object {
  
  val _RegexpFindFunctionNameAndType: js.Any = js.native
}
