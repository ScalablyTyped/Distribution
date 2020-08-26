package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentArtifact extends js.Object {
  /**
    * The media type of the artifact, which indicates the type of data in the artifact file. The media type consists of a type and a subtype concatenated with a slash (/) character, for example, text/csv, image/jpeg, and s3/uri. The type specifies the category of the media. The subtype specifies the kind of data.
    */
  var MediaType: js.UndefOr[typings.awsSdk.sagemakerMod.MediaType] = js.native
  /**
    * The location of the artifact.
    */
  var Value: TrialComponentArtifactValue = js.native
}

object TrialComponentArtifact {
  @scala.inline
  def apply(Value: TrialComponentArtifactValue): TrialComponentArtifact = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentArtifact]
  }
  @scala.inline
  implicit class TrialComponentArtifactOps[Self <: TrialComponentArtifact] (val x: Self) extends AnyVal {
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
    def setValue(value: TrialComponentArtifactValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: MediaType): Self = this.set("MediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("MediaType", js.undefined)
  }
  
}

