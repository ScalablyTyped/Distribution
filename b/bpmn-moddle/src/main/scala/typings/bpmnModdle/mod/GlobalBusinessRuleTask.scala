package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalBusinessRuleTask extends GlobalTask {
  
  var implementation: String = js.native
}
object GlobalBusinessRuleTask {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    implementation: String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    name: String,
    resources: ResourceRole,
    supportedInterfaceRef: Interface
  ): GlobalBusinessRuleTask = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], ioBinding = ioBinding.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], supportedInterfaceRef = supportedInterfaceRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalBusinessRuleTask]
  }
  
  @scala.inline
  implicit class GlobalBusinessRuleTaskMutableBuilder[Self <: GlobalBusinessRuleTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImplementation(value: String): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
  }
}
