package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateAlias extends js.Object {
  /**
    * The display name of the template alias.
    */
  var AliasName: js.UndefOr[typings.awsSdk.quicksightMod.AliasName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the template alias.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The version number of the template alias.
    */
  var TemplateVersionNumber: js.UndefOr[VersionNumber] = js.native
}

object TemplateAlias {
  @scala.inline
  def apply(
    AliasName: AliasName = null,
    Arn: Arn = null,
    TemplateVersionNumber: js.UndefOr[VersionNumber] = js.undefined
  ): TemplateAlias = {
    val __obj = js.Dynamic.literal()
    if (AliasName != null) __obj.updateDynamic("AliasName")(AliasName.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (!js.isUndefined(TemplateVersionNumber)) __obj.updateDynamic("TemplateVersionNumber")(TemplateVersionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateAlias]
  }
}

