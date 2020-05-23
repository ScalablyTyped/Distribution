package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetVariableError extends js.Object {
  /**
    * The error code. 
    */
  var code: js.UndefOr[integer] = js.native
  /**
    * The error message.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The error name. 
    */
  var name: js.UndefOr[String] = js.native
}

object BatchGetVariableError {
  @scala.inline
  def apply(code: js.UndefOr[integer] = js.undefined, message: String = null, name: String = null): BatchGetVariableError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetVariableError]
  }
}

