package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedArtifact extends js.Object {
  /**
    * The identifier of the artifact.
    */
  var identifier: js.UndefOr[String] = js.native
  /**
    * The location of the artifact.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Specifies the type of artifact.
    */
  var `type`: js.UndefOr[ArtifactsType] = js.native
}

object ResolvedArtifact {
  @scala.inline
  def apply(): ResolvedArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedArtifact]
  }
  @scala.inline
  implicit class ResolvedArtifactOps[Self <: ResolvedArtifact] (val x: Self) extends AnyVal {
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
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setType(value: ArtifactsType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

