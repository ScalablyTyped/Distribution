package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableAddOnRequest extends js.Object {
  
  /**
    * The add-on type to disable.
    */
  var addOnType: AddOnType = js.native
  
  /**
    * The name of the source resource for which to disable the add-on.
    */
  var resourceName: ResourceName = js.native
}
object DisableAddOnRequest {
  
  @scala.inline
  def apply(addOnType: AddOnType, resourceName: ResourceName): DisableAddOnRequest = {
    val __obj = js.Dynamic.literal(addOnType = addOnType.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableAddOnRequest]
  }
  
  @scala.inline
  implicit class DisableAddOnRequestOps[Self <: DisableAddOnRequest] (val x: Self) extends AnyVal {
    
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
    def setAddOnType(value: AddOnType): Self = this.set("addOnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = this.set("resourceName", value.asInstanceOf[js.Any])
  }
}
