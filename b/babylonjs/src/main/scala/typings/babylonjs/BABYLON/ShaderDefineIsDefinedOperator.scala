package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderDefineIsDefinedOperator extends ShaderDefineExpression {
  
  var define: String = js.native
  
  var not: Boolean = js.native
}
object ShaderDefineIsDefinedOperator {
  
  @scala.inline
  def apply(
    define: String,
    isTrue: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    not: Boolean
  ): ShaderDefineIsDefinedOperator = {
    val __obj = js.Dynamic.literal(define = define.asInstanceOf[js.Any], isTrue = js.Any.fromFunction1(isTrue), not = not.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDefineIsDefinedOperator]
  }
  
  @scala.inline
  implicit class ShaderDefineIsDefinedOperatorMutableBuilder[Self <: ShaderDefineIsDefinedOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefine(value: String): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNot(value: Boolean): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
  }
}
