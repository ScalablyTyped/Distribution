package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompromisedCredentialsActionsType extends StObject {
  
  /**
    * The event action.
    */
  var EventAction: CompromisedCredentialsEventActionType = js.native
}
object CompromisedCredentialsActionsType {
  
  @scala.inline
  def apply(EventAction: CompromisedCredentialsEventActionType): CompromisedCredentialsActionsType = {
    val __obj = js.Dynamic.literal(EventAction = EventAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompromisedCredentialsActionsType]
  }
  
  @scala.inline
  implicit class CompromisedCredentialsActionsTypeMutableBuilder[Self <: CompromisedCredentialsActionsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventAction(value: CompromisedCredentialsEventActionType): Self = StObject.set(x, "EventAction", value.asInstanceOf[js.Any])
  }
}
