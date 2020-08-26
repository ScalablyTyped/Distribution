package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeThemePermissionsRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the theme that you're describing.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the theme that you want to describe permissions for.
    */
  var ThemeId: RestrictiveResourceId = js.native
}

object DescribeThemePermissionsRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, ThemeId: RestrictiveResourceId): DescribeThemePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThemePermissionsRequest]
  }
  @scala.inline
  implicit class DescribeThemePermissionsRequestOps[Self <: DescribeThemePermissionsRequest] (val x: Self) extends AnyVal {
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
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = this.set("ThemeId", value.asInstanceOf[js.Any])
  }
  
}

