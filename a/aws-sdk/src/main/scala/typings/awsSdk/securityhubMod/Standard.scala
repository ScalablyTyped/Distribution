package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Standard extends js.Object {
  /**
    * A description of the standard.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  /**
    * Whether the standard is enabled by default. When Security Hub is enabled from the console, if a standard is enabled by default, the check box for that standard is selected by default. When Security Hub is enabled using the EnableSecurityHub API operation, the standard is enabled by default unless EnableDefaultStandards is set to false.
    */
  var EnabledByDefault: js.UndefOr[Boolean] = js.native
  /**
    * The name of the standard.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ARN of a standard.
    */
  var StandardsArn: js.UndefOr[NonEmptyString] = js.native
}

object Standard {
  @scala.inline
  def apply(): Standard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Standard]
  }
  @scala.inline
  implicit class StandardOps[Self <: Standard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEnabledByDefault(value: Boolean): Self = this.set("EnabledByDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledByDefault: Self = this.set("EnabledByDefault", js.undefined)
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setStandardsArn(value: NonEmptyString): Self = this.set("StandardsArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardsArn: Self = this.set("StandardsArn", js.undefined)
  }
  
}

