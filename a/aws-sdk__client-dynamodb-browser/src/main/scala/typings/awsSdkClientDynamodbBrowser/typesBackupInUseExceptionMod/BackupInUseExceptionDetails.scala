package typings.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupInUseExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object BackupInUseExceptionDetails {
  @scala.inline
  def apply(message: String = null): BackupInUseExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupInUseExceptionDetails]
  }
}

