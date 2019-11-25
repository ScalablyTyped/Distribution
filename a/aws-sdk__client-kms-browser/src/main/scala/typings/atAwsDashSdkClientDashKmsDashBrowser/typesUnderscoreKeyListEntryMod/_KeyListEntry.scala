package typings.atAwsDashSdkClientDashKmsDashBrowser.typesUnderscoreKeyListEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _KeyListEntry extends js.Object {
  /**
    * <p>ARN of the key.</p>
    */
  var KeyArn: js.UndefOr[String] = js.undefined
  /**
    * <p>Unique identifier of the key.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
}

object _KeyListEntry {
  @scala.inline
  def apply(KeyArn: String = null, KeyId: String = null): _KeyListEntry = {
    val __obj = js.Dynamic.literal()
    if (KeyArn != null) __obj.updateDynamic("KeyArn")(KeyArn.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeyListEntry]
  }
}

