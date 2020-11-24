package typings.azureMobileServicesClient.Microsoft.WindowsAzure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsAzureStatic extends js.Object {
  
  var MobileServiceClient: typings.azureMobileServicesClient.Microsoft.WindowsAzure.MobileServiceClient = js.native
}
object WindowsAzureStatic {
  
  @scala.inline
  def apply(MobileServiceClient: MobileServiceClient): WindowsAzureStatic = {
    val __obj = js.Dynamic.literal(MobileServiceClient = MobileServiceClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsAzureStatic]
  }
  
  @scala.inline
  implicit class WindowsAzureStaticOps[Self <: WindowsAzureStatic] (val x: Self) extends AnyVal {
    
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
    def setMobileServiceClient(value: MobileServiceClient): Self = this.set("MobileServiceClient", value.asInstanceOf[js.Any])
  }
}
