package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShaderDefineExpression")
@js.native
class ShaderDefineExpression ()
  extends typings.babylonjs.BABYLON.ShaderDefineExpression
/* static members */
object ShaderDefineExpression {
  
  @JSGlobal("BABYLON.ShaderDefineExpression")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.ShaderDefineExpression._OperatorPriority")
  @js.native
  def _OperatorPriority: js.Any = js.native
  @scala.inline
  def _OperatorPriority_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OperatorPriority")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.ShaderDefineExpression._Stack")
  @js.native
  def _Stack: js.Any = js.native
  @scala.inline
  def _Stack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Stack")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.ShaderDefineExpression.infixToPostfix")
  @js.native
  def infixToPostfix(infix: String): js.Array[String] = js.native
  
  @JSGlobal("BABYLON.ShaderDefineExpression.postfixToInfix")
  @js.native
  def postfixToInfix(postfix: js.Array[String]): String = js.native
}
