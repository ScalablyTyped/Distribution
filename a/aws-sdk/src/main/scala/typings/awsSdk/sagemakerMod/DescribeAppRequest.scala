package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAppRequest extends js.Object {
  /**
    * The name of the app.
    */
  var AppName: typings.awsSdk.sagemakerMod.AppName = js.native
  /**
    * The type of app.
    */
  var AppType: typings.awsSdk.sagemakerMod.AppType = js.native
  /**
    * The domain ID.
    */
  var DomainId: typings.awsSdk.sagemakerMod.DomainId = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: typings.awsSdk.sagemakerMod.UserProfileName = js.native
}

object DescribeAppRequest {
  @scala.inline
  def apply(AppName: AppName, AppType: AppType, DomainId: DomainId, UserProfileName: UserProfileName): DescribeAppRequest = {
    val __obj = js.Dynamic.literal(AppName = AppName.asInstanceOf[js.Any], AppType = AppType.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppRequest]
  }
  @scala.inline
  implicit class DescribeAppRequestOps[Self <: DescribeAppRequest] (val x: Self) extends AnyVal {
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
    def setAppName(value: AppName): Self = this.set("AppName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppType(value: AppType): Self = this.set("AppType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = this.set("UserProfileName", value.asInstanceOf[js.Any])
  }
  
}

