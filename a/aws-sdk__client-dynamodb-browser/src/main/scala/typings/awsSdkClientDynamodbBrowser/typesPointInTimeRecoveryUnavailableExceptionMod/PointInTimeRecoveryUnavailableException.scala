package typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryUnavailableExceptionMod

import typings.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointInTimeRecoveryUnavailableException
  extends ServiceException[PointInTimeRecoveryUnavailableExceptionDetails]
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_PointInTimeRecoveryUnavailableException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.PointInTimeRecoveryUnavailableException = js.native
}

object PointInTimeRecoveryUnavailableException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PointInTimeRecoveryUnavailableExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.PointInTimeRecoveryUnavailableException
  ): PointInTimeRecoveryUnavailableException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoveryUnavailableException]
  }
  @scala.inline
  implicit class PointInTimeRecoveryUnavailableExceptionOps[Self <: PointInTimeRecoveryUnavailableException] (val x: Self) extends AnyVal {
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
      value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.PointInTimeRecoveryUnavailableException
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

