package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactDetails extends js.Object {
  /**
    * The maximum number of artifacts allowed for the action type.
    */
  var maximumCount: MaximumArtifactCount = js.native
  /**
    * The minimum number of artifacts allowed for the action type.
    */
  var minimumCount: MinimumArtifactCount = js.native
}

object ArtifactDetails {
  @scala.inline
  def apply(maximumCount: MaximumArtifactCount, minimumCount: MinimumArtifactCount): ArtifactDetails = {
    val __obj = js.Dynamic.literal(maximumCount = maximumCount.asInstanceOf[js.Any], minimumCount = minimumCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArtifactDetails]
  }
}

