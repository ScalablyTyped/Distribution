package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectivityInfo extends js.Object {
  
  /**
    * The endpoint for the Greengrass core. Can be an IP address or DNS.
    */
  var HostAddress: js.UndefOr[string] = js.native
  
  /**
    * The ID of the connectivity information.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * Metadata for this endpoint.
    */
  var Metadata: js.UndefOr[string] = js.native
  
  /**
    * The port of the Greengrass core. Usually 8883.
    */
  var PortNumber: js.UndefOr[integer] = js.native
}
object ConnectivityInfo {
  
  @scala.inline
  def apply(): ConnectivityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectivityInfo]
  }
  
  @scala.inline
  implicit class ConnectivityInfoOps[Self <: ConnectivityInfo] (val x: Self) extends AnyVal {
    
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
    def setHostAddress(value: string): Self = this.set("HostAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostAddress: Self = this.set("HostAddress", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setMetadata(value: string): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    
    @scala.inline
    def setPortNumber(value: integer): Self = this.set("PortNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortNumber: Self = this.set("PortNumber", js.undefined)
  }
}
