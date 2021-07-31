package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalUserTask
  extends StObject
     with GlobalTask {
  
  var implementation: String
  
  var renderings: Rendering
}
object GlobalUserTask {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    implementation: String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    name: String,
    renderings: Rendering,
    resources: ResourceRole,
    supportedInterfaceRef: Interface
  ): GlobalUserTask = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], ioBinding = ioBinding.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renderings = renderings.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], supportedInterfaceRef = supportedInterfaceRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalUserTask]
  }
  
  @scala.inline
  implicit class GlobalUserTaskMutableBuilder[Self <: GlobalUserTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImplementation(value: String): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderings(value: Rendering): Self = StObject.set(x, "renderings", value.asInstanceOf[js.Any])
  }
}
