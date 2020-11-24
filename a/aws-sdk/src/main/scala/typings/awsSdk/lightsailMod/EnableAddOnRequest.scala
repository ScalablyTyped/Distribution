package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableAddOnRequest extends js.Object {
  
  /**
    * An array of strings representing the add-on to enable or modify.
    */
  var addOnRequest: AddOnRequest = js.native
  
  /**
    * The name of the source resource for which to enable or modify the add-on.
    */
  var resourceName: ResourceName = js.native
}
object EnableAddOnRequest {
  
  @scala.inline
  def apply(addOnRequest: AddOnRequest, resourceName: ResourceName): EnableAddOnRequest = {
    val __obj = js.Dynamic.literal(addOnRequest = addOnRequest.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableAddOnRequest]
  }
  
  @scala.inline
  implicit class EnableAddOnRequestOps[Self <: EnableAddOnRequest] (val x: Self) extends AnyVal {
    
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
    def setAddOnRequest(value: AddOnRequest): Self = this.set("addOnRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = this.set("resourceName", value.asInstanceOf[js.Any])
  }
}
