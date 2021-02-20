package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends BaseElement {
  
  var name: String = js.native
  
  var resourceParameters: js.Array[ResourceParameter] = js.native
}
object Resource {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    name: String,
    resourceParameters: js.Array[ResourceParameter]
  ): Resource = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceParameters = resourceParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceParameters(value: js.Array[ResourceParameter]): Self = StObject.set(x, "resourceParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceParametersVarargs(value: ResourceParameter*): Self = StObject.set(x, "resourceParameters", js.Array(value :_*))
  }
}
