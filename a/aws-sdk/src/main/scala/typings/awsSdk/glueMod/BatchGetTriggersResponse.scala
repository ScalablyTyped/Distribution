package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetTriggersResponse extends js.Object {
  /**
    * A list of trigger definitions.
    */
  var Triggers: js.UndefOr[TriggerList] = js.native
  /**
    * A list of names of triggers not found.
    */
  var TriggersNotFound: js.UndefOr[TriggerNameList] = js.native
}

object BatchGetTriggersResponse {
  @scala.inline
  def apply(): BatchGetTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetTriggersResponse]
  }
  @scala.inline
  implicit class BatchGetTriggersResponseOps[Self <: BatchGetTriggersResponse] (val x: Self) extends AnyVal {
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
    def setTriggersVarargs(value: Trigger*): Self = this.set("Triggers", js.Array(value :_*))
    @scala.inline
    def setTriggers(value: TriggerList): Self = this.set("Triggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggers: Self = this.set("Triggers", js.undefined)
    @scala.inline
    def setTriggersNotFoundVarargs(value: NameString*): Self = this.set("TriggersNotFound", js.Array(value :_*))
    @scala.inline
    def setTriggersNotFound(value: TriggerNameList): Self = this.set("TriggersNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggersNotFound: Self = this.set("TriggersNotFound", js.undefined)
  }
  
}

