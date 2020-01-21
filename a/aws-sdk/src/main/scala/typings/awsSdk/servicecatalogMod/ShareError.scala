package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareError extends js.Object {
  /**
    * List of accounts impacted by the error.
    */
  var Accounts: js.UndefOr[Namespaces] = js.native
  /**
    * Error type that happened when processing the operation.
    */
  var Error: js.UndefOr[typings.awsSdk.servicecatalogMod.Error] = js.native
  /**
    * Information about the error.
    */
  var Message: js.UndefOr[typings.awsSdk.servicecatalogMod.Message] = js.native
}

object ShareError {
  @scala.inline
  def apply(Accounts: Namespaces = null, Error: Error = null, Message: Message = null): ShareError = {
    val __obj = js.Dynamic.literal()
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts.asInstanceOf[js.Any])
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareError]
  }
}

