package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCommandsResult extends js.Object {
  /**
    * (Optional) The list of commands requested by the user. 
    */
  var Commands: js.UndefOr[CommandList] = js.native
  /**
    * (Optional) The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object ListCommandsResult {
  @scala.inline
  def apply(): ListCommandsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCommandsResult]
  }
  @scala.inline
  implicit class ListCommandsResultOps[Self <: ListCommandsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommandsVarargs(value: Command*): Self = this.set("Commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: CommandList): Self = this.set("Commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("Commands", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

