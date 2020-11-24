package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceRef extends js.Object {
  
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
  implicit class ResourceRefOps[Self <: ResourceRef] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: ResourceType): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource_path(value: String): Self = this.set("resource_path", value.asInstanceOf[js.Any])
  }
}
