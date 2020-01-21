package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectAttributeUpdate extends js.Object {
  /**
    * The action to perform as part of the attribute update.
    */
  var ObjectAttributeAction: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectAttributeAction] = js.native
  /**
    * The key of the attribute being updated.
    */
  var ObjectAttributeKey: js.UndefOr[AttributeKey] = js.native
}

object ObjectAttributeUpdate {
  @scala.inline
  def apply(ObjectAttributeAction: ObjectAttributeAction = null, ObjectAttributeKey: AttributeKey = null): ObjectAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    if (ObjectAttributeAction != null) __obj.updateDynamic("ObjectAttributeAction")(ObjectAttributeAction.asInstanceOf[js.Any])
    if (ObjectAttributeKey != null) __obj.updateDynamic("ObjectAttributeKey")(ObjectAttributeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectAttributeUpdate]
  }
}

