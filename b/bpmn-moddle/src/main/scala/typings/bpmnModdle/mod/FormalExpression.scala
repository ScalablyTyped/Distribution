package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormalExpression
  extends StObject
     with Expression {
  
  var evaluatesToTypeRef: ItemDefinition
  
  var language: String
}
object FormalExpression {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    body: String,
    evaluatesToTypeRef: ItemDefinition,
    id: String,
    language: String
  ): FormalExpression = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], evaluatesToTypeRef = evaluatesToTypeRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormalExpression]
  }
  
  @scala.inline
  implicit class FormalExpressionMutableBuilder[Self <: FormalExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluatesToTypeRef(value: ItemDefinition): Self = StObject.set(x, "evaluatesToTypeRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
