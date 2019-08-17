package typings.atAwsDashSdkClientDashKmsDashBrowser.typesUnderscoreAliasListEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AliasListEntry extends js.Object {
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

object _AliasListEntry {
  @scala.inline
  def apply(AliasArn: String = null, AliasName: String = null, TargetKeyId: String = null): _AliasListEntry = {
    val __obj = js.Dynamic.literal()
    if (AliasArn != null) __obj.updateDynamic("AliasArn")(AliasArn)
    if (AliasName != null) __obj.updateDynamic("AliasName")(AliasName)
    if (TargetKeyId != null) __obj.updateDynamic("TargetKeyId")(TargetKeyId)
    __obj.asInstanceOf[_AliasListEntry]
  }
}

