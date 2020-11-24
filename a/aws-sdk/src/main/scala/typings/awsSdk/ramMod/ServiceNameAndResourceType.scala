package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceNameAndResourceType extends js.Object {
  
  /**
    * The shareable resource types.
    */
  var resourceType: js.UndefOr[String] = js.native
  
  /**
    * The name of the AWS services to which the resources belong.
    */
  var serviceName: js.UndefOr[String] = js.native
}
object ServiceNameAndResourceType {
  
  @scala.inline
  def apply(): ServiceNameAndResourceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceNameAndResourceType]
  }
  
  @scala.inline
  implicit class ServiceNameAndResourceTypeOps[Self <: ServiceNameAndResourceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
}
