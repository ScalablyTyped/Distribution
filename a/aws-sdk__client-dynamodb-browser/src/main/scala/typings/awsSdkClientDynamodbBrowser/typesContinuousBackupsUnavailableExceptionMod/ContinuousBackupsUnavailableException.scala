package typings.awsSdkClientDynamodbBrowser.typesContinuousBackupsUnavailableExceptionMod

import typings.awsSdkClientDynamodbBrowser.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.updateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousBackupsUnavailableException
  extends ServiceException[ContinuousBackupsUnavailableExceptionDetails]
     with CreateBackupExceptionsUnion
     with UpdateContinuousBackupsExceptionsUnion {
  @JSName("name")
  var name_ContinuousBackupsUnavailableException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ContinuousBackupsUnavailableException = js.native
}

object ContinuousBackupsUnavailableException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ContinuousBackupsUnavailableExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ContinuousBackupsUnavailableException
  ): ContinuousBackupsUnavailableException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousBackupsUnavailableException]
  }
  @scala.inline
  implicit class ContinuousBackupsUnavailableExceptionOps[Self <: ContinuousBackupsUnavailableException] (val x: Self) extends AnyVal {
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
    def setName(
      value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ContinuousBackupsUnavailableException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

