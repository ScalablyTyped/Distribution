package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDistributionConfigurationRequest extends js.Object {
  
  /**
    *  The idempotency token of the distribution configuration. 
    */
  var clientToken: ClientToken = js.native
  
  /**
    *  The description of the distribution configuration. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  The distributions of the distribution configuration. 
    */
  var distributions: DistributionList = js.native
  
  /**
    *  The name of the distribution configuration. 
    */
  var name: ResourceName = js.native
  
  /**
    *  The tags of the distribution configuration. 
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateDistributionConfigurationRequest {
  
  @scala.inline
  def apply(clientToken: ClientToken, distributions: DistributionList, name: ResourceName): CreateDistributionConfigurationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], distributions = distributions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDistributionConfigurationRequest]
  }
  
  @scala.inline
  implicit class CreateDistributionConfigurationRequestOps[Self <: CreateDistributionConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionsVarargs(value: Distribution*): Self = this.set("distributions", js.Array(value :_*))
    
    @scala.inline
    def setDistributions(value: DistributionList): Self = this.set("distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
