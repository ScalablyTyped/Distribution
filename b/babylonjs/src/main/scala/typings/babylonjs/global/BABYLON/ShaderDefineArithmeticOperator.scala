package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShaderDefineArithmeticOperator")
@js.native
class ShaderDefineArithmeticOperator protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ShaderDefineArithmeticOperator {
  def this(define: String, operand: String, testValue: String) = this()
  
  /* CompleteClass */
  var define: String = js.native
  
  /* CompleteClass */
  override def isTrue(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean = js.native
  
  /* CompleteClass */
  var operand: String = js.native
  
  /* CompleteClass */
  var testValue: String = js.native
}
