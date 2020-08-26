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
  def apply(): ApplicationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationInfo]
  }
  @scala.inline
  implicit class ApplicationInfoOps[Self <: ApplicationInfo] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: ApplicationId): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    @scala.inline
    def setComputePlatform(value: ComputePlatform): Self = this.set("computePlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputePlatform: Self = this.set("computePlatform", js.undefined)
    @scala.inline
    def setCreateTime(value: Timestamp): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setGitHubAccountName(value: GitHubAccountTokenName): Self = this.set("gitHubAccountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitHubAccountName: Self = this.set("gitHubAccountName", js.undefined)
    @scala.inline
    def setLinkedToGitHub(value: Boolean): Self = this.set("linkedToGitHub", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedToGitHub: Self = this.set("linkedToGitHub", js.undefined)
  }
  
}

