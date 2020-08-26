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
  def apply(): GetVariablesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVariablesResult]
  }
  @scala.inline
  implicit class GetVariablesResultOps[Self <: GetVariablesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setVariablesVarargs(value: Variable*): Self = this.set("variables", js.Array(value :_*))
    @scala.inline
    def setVariables(value: VariableList): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

