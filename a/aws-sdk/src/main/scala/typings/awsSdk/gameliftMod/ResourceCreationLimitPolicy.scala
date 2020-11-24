package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceCreationLimitPolicy extends js.Object {
  
  /**
    * The maximum number of game sessions that an individual can create during the policy period. 
    */
  var NewGameSessionsPerCreator: js.UndefOr[WholeNumber] = js.native
  
  /**
    * The time span used in evaluating the resource creation limit policy. 
    */
  var PolicyPeriodInMinutes: js.UndefOr[WholeNumber] = js.native
}
object ResourceCreationLimitPolicy {
  
  @scala.inline
  def apply(): ResourceCreationLimitPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceCreationLimitPolicy]
  }
  
  @scala.inline
  implicit class ResourceCreationLimitPolicyOps[Self <: ResourceCreationLimitPolicy] (val x: Self) extends AnyVal {
    
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
    def setNewGameSessionsPerCreator(value: WholeNumber): Self = this.set("NewGameSessionsPerCreator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewGameSessionsPerCreator: Self = this.set("NewGameSessionsPerCreator", js.undefined)
    
    @scala.inline
    def setPolicyPeriodInMinutes(value: WholeNumber): Self = this.set("PolicyPeriodInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyPeriodInMinutes: Self = this.set("PolicyPeriodInMinutes", js.undefined)
  }
}
