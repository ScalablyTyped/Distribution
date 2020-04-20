package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetVariableRequest extends js.Object {
  /**
    * The list of variable names to get.
    */
  var names: NameList = js.native
}

object BatchGetVariableRequest {
  @scala.inline
  def apply(names: NameList): BatchGetVariableRequest = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetVariableRequest]
  }
}

