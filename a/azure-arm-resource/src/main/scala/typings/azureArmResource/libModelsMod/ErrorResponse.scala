package typings.azureArmResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResponse extends js.Object {
  /**
    * Error code.
    */
  var errorCode: js.UndefOr[String] = js.undefined
  /**
    * Error message indicating why the operation failed.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  /**
    * Http status code.
    */
  var httpStatus: js.UndefOr[String] = js.undefined
}

object ErrorResponse {
  @scala.inline
  def apply(errorCode: String = null, errorMessage: String = null, httpStatus: String = null): ErrorResponse = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (httpStatus != null) __obj.updateDynamic("httpStatus")(httpStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
}

