package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedLinkFacetAttributeUpdate extends js.Object {
  /**
    * The action to perform when updating the attribute.
    */
  var Action: UpdateActionType = js.native
  /**
    * The attribute to update.
    */
  var Attribute: TypedLinkAttributeDefinition = js.native
}

object TypedLinkFacetAttributeUpdate {
  @scala.inline
  def apply(Action: UpdateActionType, Attribute: TypedLinkAttributeDefinition): TypedLinkFacetAttributeUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Attribute = Attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkFacetAttributeUpdate]
  }
}

