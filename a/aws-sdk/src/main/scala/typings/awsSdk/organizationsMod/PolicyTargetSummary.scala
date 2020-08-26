package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyTargetSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the policy target. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[GenericArn] = js.native
  /**
    * The friendly name of the policy target. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[TargetName] = js.native
  /**
    * The unique identifier (ID) of the policy target. The regex pattern for a target ID string requires one of the following:   Root: A string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Account: A string that consists of exactly 12 digits.   Organizational unit (OU): A string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.native
  /**
    * The type of the policy target.
    */
  var Type: js.UndefOr[TargetType] = js.native
}

object PolicyTargetSummary {
  @scala.inline
  def apply(): PolicyTargetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTargetSummary]
  }
  @scala.inline
  implicit class PolicyTargetSummaryOps[Self <: PolicyTargetSummary] (val x: Self) extends AnyVal {
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
    def setArn(value: GenericArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setName(value: TargetName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setTargetId(value: PolicyTargetId): Self = this.set("TargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("TargetId", js.undefined)
    @scala.inline
    def setType(value: TargetType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

