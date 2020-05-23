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
  def apply(
    Description: NonEmptyString = null,
    EnabledByDefault: js.UndefOr[Boolean] = js.undefined,
    Name: NonEmptyString = null,
    StandardsArn: NonEmptyString = null
  ): Standard = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(EnabledByDefault)) __obj.updateDynamic("EnabledByDefault")(EnabledByDefault.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (StandardsArn != null) __obj.updateDynamic("StandardsArn")(StandardsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standard]
  }
}

