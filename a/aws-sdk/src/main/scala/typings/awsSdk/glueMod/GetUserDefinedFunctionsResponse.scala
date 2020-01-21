package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserDefinedFunctionsResponse extends js.Object {
  /**
    * A continuation token, if the list of functions returned does not include the last requested function.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A list of requested function definitions.
    */
  var UserDefinedFunctions: js.UndefOr[UserDefinedFunctionList] = js.native
}

object GetUserDefinedFunctionsResponse {
  @scala.inline
  def apply(NextToken: Token = null, UserDefinedFunctions: UserDefinedFunctionList = null): GetUserDefinedFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (UserDefinedFunctions != null) __obj.updateDynamic("UserDefinedFunctions")(UserDefinedFunctions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserDefinedFunctionsResponse]
  }
}

