package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserDefinedFunctionResponse extends js.Object {
  /**
    * The requested function definition.
    */
  var UserDefinedFunction: js.UndefOr[typings.awsSdk.glueMod.UserDefinedFunction] = js.native
}

object GetUserDefinedFunctionResponse {
  @scala.inline
  def apply(UserDefinedFunction: UserDefinedFunction = null): GetUserDefinedFunctionResponse = {
    val __obj = js.Dynamic.literal()
    if (UserDefinedFunction != null) __obj.updateDynamic("UserDefinedFunction")(UserDefinedFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserDefinedFunctionResponse]
  }
}

