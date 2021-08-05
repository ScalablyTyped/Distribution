package typings.breeze.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expression extends StObject {
  
  var expression: RegExp
  
  var messageTemplate: js.UndefOr[String] = js.undefined
}
object Expression {
  
  inline def apply(expression: RegExp): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  
  extension [Self <: Expression](x: Self) {
    
    inline def setExpression(value: RegExp): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
    
    inline def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
  }
}
