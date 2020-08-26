package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetApplicationRevisionsOutput extends js.Object {
  /**
    * The name of the application that corresponds to the revisions.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * Information about errors that might have occurred during the API call.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  /**
    * Additional information about the revisions, including the type and location.
    */
  var revisions: js.UndefOr[RevisionInfoList] = js.native
}

object BatchGetApplicationRevisionsOutput {
  @scala.inline
  def apply(): BatchGetApplicationRevisionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetApplicationRevisionsOutput]
  }
  @scala.inline
  implicit class BatchGetApplicationRevisionsOutputOps[Self <: BatchGetApplicationRevisionsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setRevisionsVarargs(value: RevisionInfo*): Self = this.set("revisions", js.Array(value :_*))
    @scala.inline
    def setRevisions(value: RevisionInfoList): Self = this.set("revisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisions: Self = this.set("revisions", js.undefined)
  }
  
}

