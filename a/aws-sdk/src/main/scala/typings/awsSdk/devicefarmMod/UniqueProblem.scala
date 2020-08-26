package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniqueProblem extends js.Object {
  /**
    * A message about the unique problems' result.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * Information about the problems.
    */
  var problems: js.UndefOr[Problems] = js.native
}

object UniqueProblem {
  @scala.inline
  def apply(): UniqueProblem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueProblem]
  }
  @scala.inline
  implicit class UniqueProblemOps[Self <: UniqueProblem] (val x: Self) extends AnyVal {
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
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setProblemsVarargs(value: Problem*): Self = this.set("problems", js.Array(value :_*))
    @scala.inline
    def setProblems(value: Problems): Self = this.set("problems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProblems: Self = this.set("problems", js.undefined)
  }
  
}

