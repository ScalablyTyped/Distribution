package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleUpdate extends js.Object {
  /**
    * Specify INSERT to add a Predicate to a Rule. Use DELETE to remove a Predicate from a Rule.
    */
  var Action: ChangeAction = js.native
  /**
    * The ID of the Predicate (such as an IPSet) that you want to add to a Rule.
    */
  var Predicate: typings.awsSdk.wafMod.Predicate = js.native
}

object RuleUpdate {
  @scala.inline
  def apply(Action: ChangeAction, Predicate: Predicate): RuleUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Predicate = Predicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleUpdate]
  }
  @scala.inline
  implicit class RuleUpdateOps[Self <: RuleUpdate] (val x: Self) extends AnyVal {
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
    def setPredicate(value: Predicate): Self = this.set("Predicate", value.asInstanceOf[js.Any])
  }
  
}

