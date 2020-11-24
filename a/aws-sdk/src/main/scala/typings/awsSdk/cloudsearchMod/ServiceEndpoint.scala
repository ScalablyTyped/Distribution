package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceEndpoint extends js.Object {
  
  var Endpoint: js.UndefOr[ServiceUrl] = js.native
}
object ServiceEndpoint {
  
  @scala.inline
  def apply(): ServiceEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceEndpoint]
  }
  
  @scala.inline
  implicit class ServiceEndpointOps[Self <: ServiceEndpoint] (val x: Self) extends AnyVal {
    
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
    def setEndpoint(value: ServiceUrl): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
  }
}
