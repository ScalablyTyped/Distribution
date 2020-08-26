package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectBadge extends js.Object {
  /**
    * Set this to true to generate a publicly accessible URL for your project's build badge.
    */
  var badgeEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The publicly-accessible URL through which you can access the build badge for your project.  The publicly accessible URL through which you can access the build badge for your project. 
    */
  var badgeRequestUrl: js.UndefOr[String] = js.native
}

object ProjectBadge {
  @scala.inline
  def apply(): ProjectBadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectBadge]
  }
  @scala.inline
  implicit class ProjectBadgeOps[Self <: ProjectBadge] (val x: Self) extends AnyVal {
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
    def setBadgeEnabled(value: Boolean): Self = this.set("badgeEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeEnabled: Self = this.set("badgeEnabled", js.undefined)
    @scala.inline
    def setBadgeRequestUrl(value: String): Self = this.set("badgeRequestUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeRequestUrl: Self = this.set("badgeRequestUrl", js.undefined)
  }
  
}

