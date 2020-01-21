package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactLocation extends js.Object {
  /**
    * The Amazon S3 bucket that contains the artifact.
    */
  var s3Location: js.UndefOr[S3ArtifactLocation] = js.native
  /**
    * The type of artifact in the location.
    */
  var `type`: js.UndefOr[ArtifactLocationType] = js.native
}

object ArtifactLocation {
  @scala.inline
  def apply(s3Location: S3ArtifactLocation = null, `type`: ArtifactLocationType = null): ArtifactLocation = {
    val __obj = js.Dynamic.literal()
    if (s3Location != null) __obj.updateDynamic("s3Location")(s3Location.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactLocation]
  }
}

