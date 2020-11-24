package typings.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CorrelationSubscription extends BaseElement {
  
  var correlationKeyRef: CorrelationKey = js.native
  
  var correlationPropertyBinding: js.Array[CorrelationKey] = js.native
}
object CorrelationSubscription {
  
  @scala.inline
  def apply(
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
  implicit class CorrelationSubscriptionOps[Self <: CorrelationSubscription] (val x: Self) extends AnyVal {
    
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
    def setCorrelationKeyRef(value: CorrelationKey): Self = this.set("correlationKeyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationPropertyBindingVarargs(value: CorrelationKey*): Self = this.set("correlationPropertyBinding", js.Array(value :_*))
    
    @scala.inline
    def setCorrelationPropertyBinding(value: js.Array[CorrelationKey]): Self = this.set("correlationPropertyBinding", value.asInstanceOf[js.Any])
  }
}
