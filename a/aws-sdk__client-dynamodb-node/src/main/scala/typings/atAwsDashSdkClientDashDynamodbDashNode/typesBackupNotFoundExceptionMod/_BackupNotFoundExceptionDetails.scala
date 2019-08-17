package typings.atAwsDashSdkClientDashDynamodbDashNode.typesBackupNotFoundExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _BackupNotFoundExceptionDetails extends js.Object {
  /**
    * _ErrorMessage shape
    */
  var message: js.UndefOr[String] = js.undefined
}

object _BackupNotFoundExceptionDetails {
  @scala.inline
  def apply(message: String = null): _BackupNotFoundExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[_BackupNotFoundExceptionDetails]
  }
}

