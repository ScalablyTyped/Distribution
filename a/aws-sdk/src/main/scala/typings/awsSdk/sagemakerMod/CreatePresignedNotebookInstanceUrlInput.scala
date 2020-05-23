package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresignedNotebookInstanceUrlInput extends js.Object {
  /**
    * The name of the notebook instance.
    */
  var NotebookInstanceName: typings.awsSdk.sagemakerMod.NotebookInstanceName = js.native
  /**
    * The duration of the session, in seconds. The default is 12 hours.
    */
  var SessionExpirationDurationInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.SessionExpirationDurationInSeconds] = js.native
}

object CreatePresignedNotebookInstanceUrlInput {
  @scala.inline
  def apply(
    NotebookInstanceName: NotebookInstanceName,
    SessionExpirationDurationInSeconds: js.UndefOr[SessionExpirationDurationInSeconds] = js.undefined
  ): CreatePresignedNotebookInstanceUrlInput = {
    val __obj = js.Dynamic.literal(NotebookInstanceName = NotebookInstanceName.asInstanceOf[js.Any])
    if (!js.isUndefined(SessionExpirationDurationInSeconds)) __obj.updateDynamic("SessionExpirationDurationInSeconds")(SessionExpirationDurationInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedNotebookInstanceUrlInput]
  }
}

