package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteBuildsOutput extends js.Object {
  /**
    * The IDs of the builds that were successfully deleted.
    */
  var buildsDeleted: js.UndefOr[BuildIds] = js.native
  /**
    * Information about any builds that could not be successfully deleted.
    */
  var buildsNotDeleted: js.UndefOr[BuildsNotDeleted] = js.native
}

object BatchDeleteBuildsOutput {
  @scala.inline
  def apply(buildsDeleted: BuildIds = null, buildsNotDeleted: BuildsNotDeleted = null): BatchDeleteBuildsOutput = {
    val __obj = js.Dynamic.literal()
    if (buildsDeleted != null) __obj.updateDynamic("buildsDeleted")(buildsDeleted.asInstanceOf[js.Any])
    if (buildsNotDeleted != null) __obj.updateDynamic("buildsNotDeleted")(buildsNotDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteBuildsOutput]
  }
}

