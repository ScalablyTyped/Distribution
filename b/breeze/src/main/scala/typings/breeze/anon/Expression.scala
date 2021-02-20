package typings.breeze.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expression extends StObject {
  
  var expression: RegExp = js.native
  
  var messageTemplate: js.UndefOr[String] = js.native
}
object Expression {
  
  @scala.inline
  def apply(expression: RegExp): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  
  @scala.inline
  implicit class ExpressionMutableBuilder[Self <: Expression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: RegExp): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
  }
}
