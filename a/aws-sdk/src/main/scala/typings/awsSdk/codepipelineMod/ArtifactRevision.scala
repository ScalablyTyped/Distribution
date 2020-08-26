package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactRevision extends js.Object {
  /**
    * The date and time when the most recent revision of the artifact was created, in timestamp format.
    */
  var created: js.UndefOr[Timestamp] = js.native
  /**
    * The name of an artifact. This name might be system-generated, such as "MyApp", or defined by the user when an action is created.
    */
  var name: js.UndefOr[ArtifactName] = js.native
  /**
    * An additional identifier for a revision, such as a commit date or, for artifacts stored in Amazon S3 buckets, the ETag value.
    */
  var revisionChangeIdentifier: js.UndefOr[RevisionChangeIdentifier] = js.native
  /**
    * The revision ID of the artifact.
    */
  var revisionId: js.UndefOr[Revision] = js.native
  /**
    * Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit repositories, the commit message. For Amazon S3 buckets or actions, the user-provided content of a codepipeline-artifact-revision-summary key specified in the object metadata.
    */
  var revisionSummary: js.UndefOr[RevisionSummary] = js.native
  /**
    * The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories, the commit ID is linked to a commit details page.
    */
  var revisionUrl: js.UndefOr[Url] = js.native
}

object ArtifactRevision {
  @scala.inline
  def apply(): ArtifactRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactRevision]
  }
  @scala.inline
  implicit class ArtifactRevisionOps[Self <: ArtifactRevision] (val x: Self) extends AnyVal {
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
    def setCreated(value: Timestamp): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setName(value: ArtifactName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRevisionChangeIdentifier(value: RevisionChangeIdentifier): Self = this.set("revisionChangeIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionChangeIdentifier: Self = this.set("revisionChangeIdentifier", js.undefined)
    @scala.inline
    def setRevisionId(value: Revision): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    @scala.inline
    def setRevisionSummary(value: RevisionSummary): Self = this.set("revisionSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionSummary: Self = this.set("revisionSummary", js.undefined)
    @scala.inline
    def setRevisionUrl(value: Url): Self = this.set("revisionUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionUrl: Self = this.set("revisionUrl", js.undefined)
  }
  
}

