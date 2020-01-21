package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceErrorInfo extends js.Object {
  /**
    * Error message.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * Error type.
    */
  var Type: js.UndefOr[DataSourceErrorInfoType] = js.native
}

object DataSourceErrorInfo {
  @scala.inline
  def apply(Message: String = null, Type: DataSourceErrorInfoType = null): DataSourceErrorInfo = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceErrorInfo]
  }
}

