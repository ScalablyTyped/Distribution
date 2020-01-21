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
  def apply(
    AppName: AppName = null,
    AppType: AppType = null,
    CreationTime: CreationTime = null,
    DomainId: DomainId = null,
    Status: AppStatus = null,
    UserProfileName: UserProfileName = null
  ): AppDetails = {
    val __obj = js.Dynamic.literal()
    if (AppName != null) __obj.updateDynamic("AppName")(AppName.asInstanceOf[js.Any])
    if (AppType != null) __obj.updateDynamic("AppType")(AppType.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DomainId != null) __obj.updateDynamic("DomainId")(DomainId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserProfileName != null) __obj.updateDynamic("UserProfileName")(UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppDetails]
  }
}

