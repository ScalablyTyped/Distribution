package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GeneratedExpression. */
@js.native
trait IGeneratedExpression extends js.Object {
  
  /** GeneratedExpression parameterTypeNames */
  var parameterTypeNames: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** GeneratedExpression text */
  var text: js.UndefOr[String | Null] = js.native
}
object IGeneratedExpression {
  
  @scala.inline
  def apply(): IGeneratedExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeneratedExpression]
  }
  
  @scala.inline
  implicit class IGeneratedExpressionOps[Self <: IGeneratedExpression] (val x: Self) extends AnyVal {
    
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
    def setParameterTypeNamesVarargs(value: String*): Self = this.set("parameterTypeNames", js.Array(value :_*))
    
    @scala.inline
    def setParameterTypeNames(value: js.Array[String]): Self = this.set("parameterTypeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterTypeNames: Self = this.set("parameterTypeNames", js.undefined)
    
    @scala.inline
    def setParameterTypeNamesNull: Self = this.set("parameterTypeNames", null)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
}
