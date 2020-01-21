package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVariablesResult extends js.Object {
  /**
    * The next page token to be used in subsequent requests. 
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The names of the variables returned. 
    */
  var variables: js.UndefOr[VariableList] = js.native
}

object GetVariablesResult {
  @scala.inline
  def apply(nextToken: String = null, variables: VariableList = null): GetVariablesResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVariablesResult]
  }
}

