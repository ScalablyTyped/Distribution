package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CorrelationSubscription
  extends StObject
     with BaseElement {
  
  var correlationKeyRef: CorrelationKey
  
  var correlationPropertyBinding: js.Array[CorrelationKey]
}
object CorrelationSubscription {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationKeyRef: CorrelationKey,
    correlationPropertyBinding: js.Array[CorrelationKey],
    id: String
  ): CorrelationSubscription = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationKeyRef = correlationKeyRef.asInstanceOf[js.Any], correlationPropertyBinding = correlationPropertyBinding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorrelationSubscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CorrelationSubscription] (val x: Self) extends AnyVal {
    
    inline def setCorrelationKeyRef(value: CorrelationKey): Self = StObject.set(x, "correlationKeyRef", value.asInstanceOf[js.Any])
    
    inline def setCorrelationPropertyBinding(value: js.Array[CorrelationKey]): Self = StObject.set(x, "correlationPropertyBinding", value.asInstanceOf[js.Any])
    
    inline def setCorrelationPropertyBindingVarargs(value: CorrelationKey*): Self = StObject.set(x, "correlationPropertyBinding", js.Array(value*))
  }
}
