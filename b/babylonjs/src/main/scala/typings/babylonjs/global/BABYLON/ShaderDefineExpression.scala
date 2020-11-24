package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShaderDefineExpression")
@js.native
class ShaderDefineExpression ()
  extends typings.babylonjs.BABYLON.ShaderDefineExpression
/* static members */
@JSGlobal("BABYLON.ShaderDefineExpression")
@js.native
object ShaderDefineExpression extends js.Object {
  
  var _OperatorPriority: js.Any = js.native
  
  var _Stack: js.Any = js.native
  
  def infixToPostfix(infix: String): js.Array[String] = js.native
  
  def postfixToInfix(postfix: js.Array[String]): String = js.native
}
