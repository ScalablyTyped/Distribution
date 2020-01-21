package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentPlatform extends js.Object {
  /**
    * The list of programming languages that are available for the specified platform.
    */
  var languages: js.UndefOr[EnvironmentLanguages] = js.native
  /**
    * The platform's name.
    */
  var platform: js.UndefOr[PlatformType] = js.native
}

object EnvironmentPlatform {
  @scala.inline
  def apply(languages: EnvironmentLanguages = null, platform: PlatformType = null): EnvironmentPlatform = {
    val __obj = js.Dynamic.literal()
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentPlatform]
  }
}

