package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceRole
  extends StObject
     with BaseElement {
  
  var ResourceParameterBindings: js.Array[ResourceParameterBinding]
  
  var name: String
  
  var resourceAssignmentExpression: ResourceAssignmentExpression
  
  var resourceRef: Resource
}
object ResourceRole {
  
  inline def apply(
    $parent: TypeDerived,
    $type: ElementType,
    ResourceParameterBindings: js.Array[ResourceParameterBinding],
    id: String,
    name: String,
    resourceAssignmentExpression: ResourceAssignmentExpression,
    resourceRef: Resource
  ): ResourceRole = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], ResourceParameterBindings = ResourceParameterBindings.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceAssignmentExpression = resourceAssignmentExpression.asInstanceOf[js.Any], resourceRef = resourceRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceRole] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResourceAssignmentExpression(value: ResourceAssignmentExpression): Self = StObject.set(x, "resourceAssignmentExpression", value.asInstanceOf[js.Any])
    
    inline def setResourceParameterBindings(value: js.Array[ResourceParameterBinding]): Self = StObject.set(x, "ResourceParameterBindings", value.asInstanceOf[js.Any])
    
    inline def setResourceParameterBindingsVarargs(value: ResourceParameterBinding*): Self = StObject.set(x, "ResourceParameterBindings", js.Array(value*))
    
    inline def setResourceRef(value: Resource): Self = StObject.set(x, "resourceRef", value.asInstanceOf[js.Any])
  }
}
