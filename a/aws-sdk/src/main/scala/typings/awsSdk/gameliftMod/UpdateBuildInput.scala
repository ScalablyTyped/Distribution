package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBuildInput extends js.Object {
  /**
    * A unique identifier for a build to update. You can use either the build ID or ARN value. 
    */
  var BuildId: typings.awsSdk.gameliftMod.BuildId = js.native
  /**
    * A descriptive label that is associated with a build. Build names do not need to be unique. 
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Version information that is associated with a build or script. Version strings do not need to be unique.
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.native
}

object UpdateBuildInput {
  @scala.inline
  def apply(BuildId: BuildId, Name: NonZeroAndMaxString = null, Version: NonZeroAndMaxString = null): UpdateBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBuildInput]
  }
}

