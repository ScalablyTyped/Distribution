package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBuildOutput extends js.Object {
  /**
    * Information about the build to be run.
    */
  var build: js.UndefOr[Build] = js.native
}

object StartBuildOutput {
  @scala.inline
  def apply(build: Build = null): StartBuildOutput = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBuildOutput]
  }
}

