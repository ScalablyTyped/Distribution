package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignConfig extends StObject {
  
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
  implicit class CampaignConfigMutableBuilder[Self <: CampaignConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemExplorationConfig(value: HyperParameters): Self = StObject.set(x, "itemExplorationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemExplorationConfigUndefined: Self = StObject.set(x, "itemExplorationConfig", js.undefined)
  }
}
