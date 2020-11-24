package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HsmConfiguration extends js.Object {
  
  /**
    * A text description of the HSM configuration.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The name of the Amazon Redshift HSM configuration.
    */
  var HsmConfigurationIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The IP address that the Amazon Redshift cluster must use to access the HSM.
    */
  var HsmIpAddress: js.UndefOr[String] = js.native
  
  /**
    * The name of the partition in the HSM where the Amazon Redshift clusters will store their database encryption keys.
    */
  var HsmPartitionName: js.UndefOr[String] = js.native
  
  /**
    * The list of tags for the HSM configuration.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object HsmConfiguration {
  
  @scala.inline
  def apply(): HsmConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmConfiguration]
  }
  
  @scala.inline
  implicit class HsmConfigurationOps[Self <: HsmConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setHsmConfigurationIdentifier(value: String): Self = this.set("HsmConfigurationIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmConfigurationIdentifier: Self = this.set("HsmConfigurationIdentifier", js.undefined)
    
    @scala.inline
    def setHsmIpAddress(value: String): Self = this.set("HsmIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmIpAddress: Self = this.set("HsmIpAddress", js.undefined)
    
    @scala.inline
    def setHsmPartitionName(value: String): Self = this.set("HsmPartitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmPartitionName: Self = this.set("HsmPartitionName", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
