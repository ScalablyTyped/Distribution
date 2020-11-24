package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberFabricLogPublishingConfiguration extends js.Object {
  
  /**
    * Configuration properties for logging events associated with a member's Certificate Authority (CA). CA logs help you determine when a member in your account joins the network, or when new peers register with a member CA.
    */
  var CaLogs: js.UndefOr[LogConfigurations] = js.native
}
object MemberFabricLogPublishingConfiguration {
  
  @scala.inline
  def apply(): MemberFabricLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberFabricLogPublishingConfiguration]
  }
  
  @scala.inline
  implicit class MemberFabricLogPublishingConfigurationOps[Self <: MemberFabricLogPublishingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCaLogs(value: LogConfigurations): Self = this.set("CaLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaLogs: Self = this.set("CaLogs", js.undefined)
  }
}
