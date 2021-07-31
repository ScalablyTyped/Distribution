package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorrelationKey
  extends StObject
     with BaseElement {
  
  var correlationPropertyRef: CorrelationProperty
  
  var name: String
}
object CorrelationKey {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationPropertyRef: CorrelationProperty,
    id: String,
    name: String
  ): CorrelationKey = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationPropertyRef = correlationPropertyRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationKey]
  }
  
  @scala.inline
  implicit class CorrelationKeyMutableBuilder[Self <: CorrelationKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrelationPropertyRef(value: CorrelationProperty): Self = StObject.set(x, "correlationPropertyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
