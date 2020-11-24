package typings.babylonjs.BABYLON

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
  implicit class ShaderDefineIsDefinedOperatorOps[Self <: ShaderDefineIsDefinedOperator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefine(value: String): Self = this.set("define", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNot(value: Boolean): Self = this.set("not", value.asInstanceOf[js.Any])
  }
}
