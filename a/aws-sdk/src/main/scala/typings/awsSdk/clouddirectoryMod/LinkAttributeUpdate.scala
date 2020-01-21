package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkAttributeUpdate extends js.Object {
  /**
    * The action to perform as part of the attribute update.
    */
  var AttributeAction: js.UndefOr[LinkAttributeAction] = js.native
  /**
    * The key of the attribute being updated.
    */
  var AttributeKey: js.UndefOr[typings.awsSdk.clouddirectoryMod.AttributeKey] = js.native
}

object LinkAttributeUpdate {
  @scala.inline
  def apply(AttributeAction: LinkAttributeAction = null, AttributeKey: AttributeKey = null): LinkAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    if (AttributeAction != null) __obj.updateDynamic("AttributeAction")(AttributeAction.asInstanceOf[js.Any])
    if (AttributeKey != null) __obj.updateDynamic("AttributeKey")(AttributeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkAttributeUpdate]
  }
}

