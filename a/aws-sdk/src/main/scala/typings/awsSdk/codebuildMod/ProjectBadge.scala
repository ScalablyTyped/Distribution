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
  def apply(badgeEnabled: js.UndefOr[scala.Boolean] = js.undefined, badgeRequestUrl: String = null): ProjectBadge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(badgeEnabled)) __obj.updateDynamic("badgeEnabled")(badgeEnabled.asInstanceOf[js.Any])
    if (badgeRequestUrl != null) __obj.updateDynamic("badgeRequestUrl")(badgeRequestUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectBadge]
  }
}

