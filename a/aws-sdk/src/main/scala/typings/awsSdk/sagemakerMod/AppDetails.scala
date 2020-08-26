package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppDetails extends js.Object {
  /**
    * The name of the app.
    */
  var AppName: js.UndefOr[typings.awsSdk.sagemakerMod.AppName] = js.native
  /**
    * The type of app.
    */
  var AppType: js.UndefOr[typings.awsSdk.sagemakerMod.AppType] = js.native
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[typings.awsSdk.sagemakerMod.CreationTime] = js.native
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typings.awsSdk.sagemakerMod.DomainId] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[AppStatus] = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typings.awsSdk.sagemakerMod.UserProfileName] = js.native
}

object AppDetails {
  @scala.inline
  def apply(): AppDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppDetails]
  }
  @scala.inline
  implicit class AppDetailsOps[Self <: AppDetails] (val x: Self) extends AnyVal {
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
    def deleteAppName: Self = this.set("AppName", js.undefined)
    @scala.inline
    def setAppType(value: AppType): Self = this.set("AppType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppType: Self = this.set("AppType", js.undefined)
    @scala.inline
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainId: Self = this.set("DomainId", js.undefined)
    @scala.inline
    def setStatus(value: AppStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = this.set("UserProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProfileName: Self = this.set("UserProfileName", js.undefined)
  }
  
}

