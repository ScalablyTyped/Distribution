package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListScriptsOutput extends js.Object {
  /**
    * A token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    * A set of properties describing the requested script.
    */
  var Scripts: js.UndefOr[ScriptList] = js.native
}

object ListScriptsOutput {
  @scala.inline
  def apply(): ListScriptsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScriptsOutput]
  }
  @scala.inline
  implicit class ListScriptsOutputOps[Self <: ListScriptsOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NonEmptyString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setScriptsVarargs(value: Script*): Self = this.set("Scripts", js.Array(value :_*))
    @scala.inline
    def setScripts(value: ScriptList): Self = this.set("Scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScripts: Self = this.set("Scripts", js.undefined)
  }
  
}

