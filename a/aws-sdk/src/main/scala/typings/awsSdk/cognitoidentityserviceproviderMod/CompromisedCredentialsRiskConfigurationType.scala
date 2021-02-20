package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompromisedCredentialsRiskConfigurationType extends StObject {
  
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
  implicit class CompromisedCredentialsRiskConfigurationTypeMutableBuilder[Self <: CompromisedCredentialsRiskConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: CompromisedCredentialsActionsType): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFilter(value: EventFiltersType): Self = StObject.set(x, "EventFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFilterUndefined: Self = StObject.set(x, "EventFilter", js.undefined)
    
    @scala.inline
    def setEventFilterVarargs(value: EventFilterType*): Self = StObject.set(x, "EventFilter", js.Array(value :_*))
  }
}
