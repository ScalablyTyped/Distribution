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
  def apply(
    applicationName: ApplicationName = null,
    errorMessage: ErrorMessage = null,
    revisions: RevisionInfoList = null
  ): BatchGetApplicationRevisionsOutput = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (revisions != null) __obj.updateDynamic("revisions")(revisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetApplicationRevisionsOutput]
  }
}

