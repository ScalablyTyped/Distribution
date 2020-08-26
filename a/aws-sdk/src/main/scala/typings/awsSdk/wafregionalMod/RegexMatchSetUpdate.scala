package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexMatchSetUpdate extends js.Object {
  /**
    * Specifies whether to insert or delete a RegexMatchTuple.
    */
  var Action: ChangeAction = js.native
  /**
    * Information about the part of a web request that you want AWS WAF to inspect and the identifier of the regular expression (regex) pattern that you want AWS WAF to search for. If you specify DELETE for the value of Action, the RegexMatchTuple values must exactly match the values in the RegexMatchTuple that you want to delete from the RegexMatchSet.
    */
  var RegexMatchTuple: typings.awsSdk.wafregionalMod.RegexMatchTuple = js.native
}

object RegexMatchSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, RegexMatchTuple: RegexMatchTuple): RegexMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], RegexMatchTuple = RegexMatchTuple.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexMatchSetUpdate]
  }
  @scala.inline
  implicit class RegexMatchSetUpdateOps[Self <: RegexMatchSetUpdate] (val x: Self) extends AnyVal {
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
    def setAction(value: ChangeAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegexMatchTuple(value: RegexMatchTuple): Self = this.set("RegexMatchTuple", value.asInstanceOf[js.Any])
  }
  
}

