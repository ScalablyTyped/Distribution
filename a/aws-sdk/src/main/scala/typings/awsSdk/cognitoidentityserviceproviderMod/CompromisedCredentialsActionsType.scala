package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompromisedCredentialsActionsType extends js.Object {
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
}

