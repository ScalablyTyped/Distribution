package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactLocation extends js.Object {
  /**
    * The S3 bucket that contains the artifact.
    */
  var s3Location: js.UndefOr[S3ArtifactLocation] = js.native
  /**
    * The type of artifact in the location.
    */
  var `type`: js.UndefOr[ArtifactLocationType] = js.native
}

object ArtifactLocation {
  @scala.inline
  def apply(): ArtifactLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactLocation]
  }
  @scala.inline
  implicit class ArtifactLocationOps[Self <: ArtifactLocation] (val x: Self) extends AnyVal {
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
    def setS3Location(value: S3ArtifactLocation): Self = this.set("s3Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Location: Self = this.set("s3Location", js.undefined)
    @scala.inline
    def setType(value: ArtifactLocationType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

