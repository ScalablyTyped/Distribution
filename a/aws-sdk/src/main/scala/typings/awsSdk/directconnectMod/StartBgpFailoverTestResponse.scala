package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartBgpFailoverTestResponse extends js.Object {
  
  /**
    * Information about the virtual interface failover test.
    */
  var virtualInterfaceTest: js.UndefOr[VirtualInterfaceTestHistory] = js.native
}
object StartBgpFailoverTestResponse {
  
  @scala.inline
  def apply(): StartBgpFailoverTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBgpFailoverTestResponse]
  }
  
  @scala.inline
  implicit class StartBgpFailoverTestResponseOps[Self <: StartBgpFailoverTestResponse] (val x: Self) extends AnyVal {
    
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
    def setVirtualInterfaceTest(value: VirtualInterfaceTestHistory): Self = this.set("virtualInterfaceTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualInterfaceTest: Self = this.set("virtualInterfaceTest", js.undefined)
  }
}
