package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompromisedCredentialsRiskConfigurationType extends js.Object {
  
  /**
    * The compromised credentials risk configuration actions.
    */
  var Actions: CompromisedCredentialsActionsType = js.native
  
  /**
    * Perform the action for these events. The default is to perform all events if no event filter is specified.
    */
  var EventFilter: js.UndefOr[EventFiltersType] = js.native
}
object CompromisedCredentialsRiskConfigurationType {
  
  @scala.inline
  def apply(Actions: CompromisedCredentialsActionsType): CompromisedCredentialsRiskConfigurationType = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompromisedCredentialsRiskConfigurationType]
  }
  
  @scala.inline
  implicit class CompromisedCredentialsRiskConfigurationTypeOps[Self <: CompromisedCredentialsRiskConfigurationType] (val x: Self) extends AnyVal {
    
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
    def setActions(value: CompromisedCredentialsActionsType): Self = this.set("Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFilterVarargs(value: EventFilterType*): Self = this.set("EventFilter", js.Array(value :_*))
    
    @scala.inline
    def setEventFilter(value: EventFiltersType): Self = this.set("EventFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventFilter: Self = this.set("EventFilter", js.undefined)
  }
}
