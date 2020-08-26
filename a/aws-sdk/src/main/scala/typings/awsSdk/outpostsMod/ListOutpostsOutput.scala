package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOutpostsOutput extends js.Object {
  var NextToken: js.UndefOr[Token] = js.native
  var Outposts: js.UndefOr[outpostListDefinition] = js.native
}

object ListOutpostsOutput {
  @scala.inline
  def apply(): ListOutpostsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutpostsOutput]
  }
  @scala.inline
  implicit class ListOutpostsOutputOps[Self <: ListOutpostsOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setOutpostsVarargs(value: Outpost*): Self = this.set("Outposts", js.Array(value :_*))
    @scala.inline
    def setOutposts(value: outpostListDefinition): Self = this.set("Outposts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutposts: Self = this.set("Outposts", js.undefined)
  }
  
}

