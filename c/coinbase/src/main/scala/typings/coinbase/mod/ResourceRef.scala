package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRef extends StObject {
  
  var id: String = js.native
  
  var resource: ResourceType = js.native
  
  var resource_path: String = js.native
}
object ResourceRef {
  
  @scala.inline
  def apply(id: String, resource: ResourceType, resource_path: String): ResourceRef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resource_path = resource_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRef]
  }
  
  @scala.inline
  implicit class ResourceRefMutableBuilder[Self <: ResourceRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: ResourceType): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource_path(value: String): Self = StObject.set(x, "resource_path", value.asInstanceOf[js.Any])
  }
}
