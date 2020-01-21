package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCuratedEnvironmentImagesOutput extends js.Object {
  /**
    * Information about supported platforms for Docker images that are managed by AWS CodeBuild.
    */
  var platforms: js.UndefOr[EnvironmentPlatforms] = js.native
}

object ListCuratedEnvironmentImagesOutput {
  @scala.inline
  def apply(platforms: EnvironmentPlatforms = null): ListCuratedEnvironmentImagesOutput = {
    val __obj = js.Dynamic.literal()
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCuratedEnvironmentImagesOutput]
  }
}

