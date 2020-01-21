package typings.awsSdkClientKmsBrowser.typesAliasListEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasListEntry extends js.Object {
  /**
    * <p>String that contains the key ARN.</p>
    */
  var AliasArn: js.UndefOr[String] = js.undefined
  /**
    * <p>String that contains the alias.</p>
    */
  var AliasName: js.UndefOr[String] = js.undefined
  /**
    * <p>String that contains the key identifier referred to by the alias.</p>
    */
  var TargetKeyId: js.UndefOr[String] = js.undefined
}

object AliasListEntry {
  @scala.inline
  def apply(AliasArn: String = null, AliasName: String = null, TargetKeyId: String = null): AliasListEntry = {
    val __obj = js.Dynamic.literal()
    if (AliasArn != null) __obj.updateDynamic("AliasArn")(AliasArn.asInstanceOf[js.Any])
    if (AliasName != null) __obj.updateDynamic("AliasName")(AliasName.asInstanceOf[js.Any])
    if (TargetKeyId != null) __obj.updateDynamic("TargetKeyId")(TargetKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasListEntry]
  }
}

