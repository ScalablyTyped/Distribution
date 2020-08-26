package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateThemeAliasRequest extends js.Object {
  /**
    * The name of the theme alias that you want to update.
    */
  var AliasName: typings.awsSdk.quicksightMod.AliasName = js.native
  /**
    * The ID of the AWS account that contains the theme alias that you're updating.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the theme.
    */
  var ThemeId: RestrictiveResourceId = js.native
  /**
    * The version number of the theme that the alias should reference.
    */
  var ThemeVersionNumber: VersionNumber = js.native
}

object UpdateThemeAliasRequest {
  @scala.inline
  def apply(
    AliasName: AliasName,
    AwsAccountId: AwsAccountId,
    ThemeId: RestrictiveResourceId,
    ThemeVersionNumber: VersionNumber
  ): UpdateThemeAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any], ThemeVersionNumber = ThemeVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThemeAliasRequest]
  }
  @scala.inline
  implicit class UpdateThemeAliasRequestOps[Self <: UpdateThemeAliasRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAliasName(value: AliasName): Self = this.set("AliasName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = this.set("ThemeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemeVersionNumber(value: VersionNumber): Self = this.set("ThemeVersionNumber", value.asInstanceOf[js.Any])
  }
  
}

