package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DhcpOptions extends js.Object {
  
  /**
    * One or more DHCP options in the set.
    */
  var DhcpConfigurations: js.UndefOr[DhcpConfigurationList] = js.native
  
  /**
    * The ID of the set of DHCP options.
    */
  var DhcpOptionsId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS account that owns the DHCP options set.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * Any tags assigned to the DHCP options set.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object DhcpOptions {
  
  @scala.inline
  def apply(): DhcpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DhcpOptions]
  }
  
  @scala.inline
  implicit class DhcpOptionsOps[Self <: DhcpOptions] (val x: Self) extends AnyVal {
    
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
    def setDhcpConfigurationsVarargs(value: DhcpConfiguration*): Self = this.set("DhcpConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDhcpConfigurations(value: DhcpConfigurationList): Self = this.set("DhcpConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDhcpConfigurations: Self = this.set("DhcpConfigurations", js.undefined)
    
    @scala.inline
    def setDhcpOptionsId(value: String): Self = this.set("DhcpOptionsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDhcpOptionsId: Self = this.set("DhcpOptionsId", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
