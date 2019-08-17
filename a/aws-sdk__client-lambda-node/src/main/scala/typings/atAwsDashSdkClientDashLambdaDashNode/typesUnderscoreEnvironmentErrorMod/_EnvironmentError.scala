package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreEnvironmentErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EnvironmentError extends js.Object {
  /**
    * <p>The error code.</p>
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  /**
    * <p>The error message.</p>
    */
  var Message: js.UndefOr[String] = js.undefined
}

object _EnvironmentError {
  @scala.inline
  def apply(ErrorCode: String = null, Message: String = null): _EnvironmentError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[_EnvironmentError]
  }
}

