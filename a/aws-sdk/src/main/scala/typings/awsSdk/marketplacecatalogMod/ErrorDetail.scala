package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetail extends js.Object {
  /**
    * The error code that identifies the type of error.
    */
  var ErrorCode: js.UndefOr[StringValue] = js.native
  /**
    * The message for the error.
    */
  var ErrorMessage: js.UndefOr[StringValue] = js.native
}

object ErrorDetail {
  @scala.inline
  def apply(ErrorCode: StringValue = null, ErrorMessage: StringValue = null): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetail]
  }
}

