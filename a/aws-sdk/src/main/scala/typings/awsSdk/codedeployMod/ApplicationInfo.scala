package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationInfo extends js.Object {
  /**
    * The application ID.
    */
  var applicationId: js.UndefOr[ApplicationId] = js.native
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * The destination platform type for deployment of the application (Lambda or Server).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.native
  /**
    * The time at which the application was created.
    */
  var createTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name for a connection to a GitHub account.
    */
  var gitHubAccountName: js.UndefOr[GitHubAccountTokenName] = js.native
  /**
    * True if the user has authenticated with GitHub for the specified application. Otherwise, false.
    */
  var linkedToGitHub: js.UndefOr[Boolean] = js.native
}

object ApplicationInfo {
  @scala.inline
  def apply(
    applicationId: ApplicationId = null,
    applicationName: ApplicationName = null,
    computePlatform: ComputePlatform = null,
    createTime: Timestamp = null,
    gitHubAccountName: GitHubAccountTokenName = null,
    linkedToGitHub: js.UndefOr[scala.Boolean] = js.undefined
  ): ApplicationInfo = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (gitHubAccountName != null) __obj.updateDynamic("gitHubAccountName")(gitHubAccountName.asInstanceOf[js.Any])
    if (!js.isUndefined(linkedToGitHub)) __obj.updateDynamic("linkedToGitHub")(linkedToGitHub.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationInfo]
  }
}

