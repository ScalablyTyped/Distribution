package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnabledServicePrincipal extends js.Object {
  
  /**
    * The date that the service principal was enabled for integration with AWS Organizations.
    */
  var DateEnabled: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the service principal. This is typically in the form of a URL, such as:  servicename.amazonaws.com.
    */
  var ServicePrincipal: js.UndefOr[typings.awsSdk.organizationsMod.ServicePrincipal] = js.native
}
object EnabledServicePrincipal {
  
  @scala.inline
  def apply(): EnabledServicePrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnabledServicePrincipal]
  }
  
  @scala.inline
  implicit class EnabledServicePrincipalOps[Self <: EnabledServicePrincipal] (val x: Self) extends AnyVal {
    
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
    def setDateEnabled(value: Timestamp): Self = this.set("DateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateEnabled: Self = this.set("DateEnabled", js.undefined)
    
    @scala.inline
    def setServicePrincipal(value: ServicePrincipal): Self = this.set("ServicePrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePrincipal: Self = this.set("ServicePrincipal", js.undefined)
  }
}
