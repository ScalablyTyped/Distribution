package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledInstancesPrivateIpAddressConfig extends js.Object {
  
  /**
    * Indicates whether this is a primary IPv4 address. Otherwise, this is a secondary IPv4 address.
    */
  var Primary: js.UndefOr[Boolean] = js.native
  
  /**
    * The IPv4 address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}
object ScheduledInstancesPrivateIpAddressConfig {
  
  @scala.inline
  def apply(): ScheduledInstancesPrivateIpAddressConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesPrivateIpAddressConfig]
  }
  
  @scala.inline
  implicit class ScheduledInstancesPrivateIpAddressConfigOps[Self <: ScheduledInstancesPrivateIpAddressConfig] (val x: Self) extends AnyVal {
    
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
    def setPrimary(value: Boolean): Self = this.set("Primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("Primary", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
  }
}
