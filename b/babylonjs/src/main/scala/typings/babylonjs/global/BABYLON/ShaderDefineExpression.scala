package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShaderDefineExpression")
@js.native
class ShaderDefineExpression ()
  extends StObject
     with typings.babylonjs.BABYLON.ShaderDefineExpression {
  
  /* CompleteClass */
  override def isTrue(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean = js.native
}
/* static members */
object ShaderDefineExpression {
  
  @JSGlobal("BABYLON.ShaderDefineExpression")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.ShaderDefineExpression._OperatorPriority")
  @js.native
  def _OperatorPriority: js.Any = js.native
  inline def _OperatorPriority_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_OperatorPriority")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.ShaderDefineExpression._Stack")
  @js.native
  def _Stack: js.Any = js.native
  inline def _Stack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Stack")(x.asInstanceOf[js.Any])
  
  inline def infixToPostfix(infix: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("infixToPostfix")(infix.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def postfixToInfix(postfix: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("postfixToInfix")(postfix.asInstanceOf[js.Any]).asInstanceOf[String]
}
