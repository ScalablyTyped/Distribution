package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignConfig extends js.Object {
  
  /**
    * A string to string map specifying the inference hyperparameters you wish to use for hyperparameter optimization. See customizing-solution-config-hpo.
    */
  var itemExplorationConfig: js.UndefOr[HyperParameters] = js.native
}
object CampaignConfig {
  
  @scala.inline
  def apply(): CampaignConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignConfig]
  }
  
  @scala.inline
  implicit class CampaignConfigOps[Self <: CampaignConfig] (val x: Self) extends AnyVal {
    
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
    def setItemExplorationConfig(value: HyperParameters): Self = this.set("itemExplorationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemExplorationConfig: Self = this.set("itemExplorationConfig", js.undefined)
  }
}
