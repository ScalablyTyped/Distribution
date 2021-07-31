package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorrelationPropertyRetrievalExpression
  extends StObject
     with BaseElement {
  
  var messagePath: FormalExpression
  
  var messageRef: Message
}
object CorrelationPropertyRetrievalExpression {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    messagePath: FormalExpression,
    messageRef: Message
  ): CorrelationPropertyRetrievalExpression = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], messagePath = messagePath.asInstanceOf[js.Any], messageRef = messageRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationPropertyRetrievalExpression]
  }
  
  @scala.inline
  implicit class CorrelationPropertyRetrievalExpressionMutableBuilder[Self <: CorrelationPropertyRetrievalExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessagePath(value: FormalExpression): Self = StObject.set(x, "messagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageRef(value: Message): Self = StObject.set(x, "messageRef", value.asInstanceOf[js.Any])
  }
}
