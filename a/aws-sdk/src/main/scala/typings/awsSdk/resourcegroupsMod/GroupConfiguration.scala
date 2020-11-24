package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupConfiguration extends js.Object {
  
  /**
    * The configuration currently associated with the group and in effect.
    */
  var Configuration: js.UndefOr[GroupConfigurationList] = js.native
  
  /**
    * If present, the reason why a request to update the group configuration failed.
    */
  var FailureReason: js.UndefOr[GroupConfigurationFailureReason] = js.native
  
  /**
    * If present, the new configuration that is in the process of being applied to the group.
    */
  var ProposedConfiguration: js.UndefOr[GroupConfigurationList] = js.native
  
  /**
    * The current status of an attempt to update the group configuration.
    */
  var Status: js.UndefOr[GroupConfigurationStatus] = js.native
}
object GroupConfiguration {
  
  @scala.inline
  def apply(): GroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupConfiguration]
  }
  
  @scala.inline
  implicit class GroupConfigurationOps[Self <: GroupConfiguration] (val x: Self) extends AnyVal {
    
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
    def setConfigurationVarargs(value: GroupConfigurationItem*): Self = this.set("Configuration", js.Array(value :_*))
    
    @scala.inline
    def setConfiguration(value: GroupConfigurationList): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    
    @scala.inline
    def setFailureReason(value: GroupConfigurationFailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    
    @scala.inline
    def setProposedConfigurationVarargs(value: GroupConfigurationItem*): Self = this.set("ProposedConfiguration", js.Array(value :_*))
    
    @scala.inline
    def setProposedConfiguration(value: GroupConfigurationList): Self = this.set("ProposedConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposedConfiguration: Self = this.set("ProposedConfiguration", js.undefined)
    
    @scala.inline
    def setStatus(value: GroupConfigurationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
